package com.rm2pt.req.generator.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.PlatformUI;

import com.rm2pt.req.metamodel.req.RequirementModel;
import com.rm2pt.req.metamodel.req.UseCaseModel;
import com.rm2pt.req.metamodel.req.DomainModel;



public class GenerateGraphicModel {
	public boolean performGenerate(IProject project, URI dmUri, String graphicModel, String reqmodel) { 
		
		createGraphicModel(project, dmUri, graphicModel, reqmodel);
		return true;
	}
	private void createGraphicModel(IProject project, URI textualModelURI, String graphicModel, String reqmodel) {
		IRunnableWithProgress op = monitor -> {
			try {
				// graphicModel:  *.aird
				URI representationsURI = URI.createPlatformResourceURI(project.getFullPath().append("ReqModel/" + graphicModel).toString(), true);
				//create graphic model file
				SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(representationsURI, monitor);
				sessionCreationOperation.execute();
				
				//get session and add semantic model
				Session session = sessionCreationOperation.getCreatedSession();
				TransactionalEditingDomain transdomain = session.getTransactionalEditingDomain();
				CommandStack stack = transdomain.getCommandStack();
				stack.execute(new AddSemanticResourceCommand(session, textualModelURI, monitor));  //TODO:这里用到textualModelURI
				session.save(monitor);
				
				//find and add viewpoint
				Set<Viewpoint> availableViewpoints = ViewpointSelection.getViewpoints("req"); //TODO: 这里应该是填文件后缀
				if (availableViewpoints.isEmpty()) 
					throw new Exception("Could not found viewpoint for ReqModel");
				Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
				for (Viewpoint p : availableViewpoints)
					viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, p));
				
				ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
			
				@SuppressWarnings("restriction")
				RecordingCommand command = new ChangeViewpointSelectionCommand(session, callback, viewpoints, new HashSet<Viewpoint>(), true, monitor);
				stack.execute(command);
				
				Resource rs = session.getSemanticResources().stream().findAny().get();
				EList<EObject> rsList = rs.getContents();
				ArrayList<EObject> delList = new ArrayList<>();
				RequirementModel rm = null;
				
				for (EObject p : rsList) {
					if (p.eClass().getName().equals("RequirementModel")) {
						rm = (RequirementModel) p;
						break;
					}
				}
				
				// get Use Case Diagram 
				UseCaseModel uc = rm.getUseCaseModel();
				DomainModel dm = rm.getDomainModel();
				//create a class diagram
				System.out.println(uc.toString());
				Collection<RepresentationDescription> descriptions1 = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), uc);
				if (descriptions1.isEmpty())
					throw new Exception("Could not found representation description for Use Case diagram");
				RepresentationDescription description1 = descriptions1.iterator().next();
				
				CreateRepresentationCommand createViewCommand1 = new CreateRepresentationCommand(session, description1, uc, reqmodel + " Use Case Diagram", monitor);
				stack.execute(createViewCommand1);
				
				SessionManager.INSTANCE.notifyRepresentationCreated(session);
				
				// open editor
				Collection<DRepresentation> representations1 = DialectManager.INSTANCE.getRepresentations(description1, session);
				DRepresentation myDiagramRepresentation1 = representations1.iterator().next();
				
				DialectUIManager dialectUIManager1 = DialectUIManager.INSTANCE;
				dialectUIManager1.openEditor(session, myDiagramRepresentation1, monitor);
				
				//get Class Diagram
				Collection<RepresentationDescription> descriptions2 = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), dm);
				if (descriptions2.isEmpty())
					throw new Exception("Could not found representation description for class diagram");
				RepresentationDescription description2 = descriptions2.iterator().next();
			
				CreateRepresentationCommand createViewCommand2 = new CreateRepresentationCommand(session, description2, dm, reqmodel + " Class Diagram", monitor);
				stack.execute(createViewCommand2);
				
				SessionManager.INSTANCE.notifyRepresentationCreated(session);
				
				// open editor
				Collection<DRepresentation> representations2 = DialectManager.INSTANCE.getRepresentations(description2, session);
				DRepresentation myDiagramRepresentation2 = representations2.iterator().next();
				
				DialectUIManager dialectUIManager2 = DialectUIManager.INSTANCE;
				dialectUIManager2.openEditor(session, myDiagramRepresentation2, monitor);
				
				//save session and refresh workspace
				session.save(monitor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		try {
			ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			progressMonitorDialog.run(true, false, op);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

