package com.rm2pt.req.generator.handlers;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.dom4j.Document;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.rm2pt.req.metamodel.req.DomainModel;
import com.rm2pt.req.metamodel.req.RequirementModel;
import com.rm2pt.req.metamodel.req.UseCaseModel;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import src.main.java.SolutionToXMI.parseToXMI;



public class GeneratorHandler extends AbstractHandler{
	private boolean stopFlag = false;
	private boolean start = false;
    private Document document;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
        var shell = HandlerUtil.getActiveShell(event);
        MyInfoWizard javafxproject = new MyInfoWizard();
        WizardDialog dialog = new WizardDialog(shell, javafxproject);
    	dialog.open();
    	start = true;
		IRunnableWithProgress op = monitor -> {
			try {   
				IProject project = null;
				URI textualModelURI = null;
				Object firstElement = null;
				ISelection selection = HandlerUtil.getCurrentSelection(event);
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					//Get .remodel file
					firstElement = structuredSelection.getFirstElement();
					if (firstElement instanceof IFile) {
						// generate .xmi from .remodel, still requirements, return URI of .xmi
							project = ((IFile) firstElement).getProject();
							IFolder folder = project.getFolder("ReqModel");
							if (!folder.exists())
								folder.create(true, true, null);
				            
							IFile modelFile = project.getFile("RequirementsModel/" + ((IFile)firstElement).getName());
				            System.out.println("path is =======================" + modelFile.getLocation().toFile().toString());

			                stopFlag = false;
			                new Thread() {
			                    public void run() {
			                    	try {
			                    		while(!start);
										document = parseToXMI.createXml(modelFile.getLocation().toFile().toString());
										stopFlag = true;
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									};
			                    }
			                }.start();
			                monitor.beginTask("正在执行中......", 150);
	                        int i = 0;
	                        while (true) {
	                            // 监听是否单击了进度框的“取消”按钮，stopFlag则是监听后台任务是否停止
	                            if (stopFlag) {
	                                break;// 中断处理
	                            }
	                            // i到30后清零。并将进度条重新来过
	                            if ((++i) == 150) {
	                                i = 0;
	                                monitor.beginTask("正在执行中......", 150);
	                            }
	                            // 进度条每前进一步体息一会，不用太长或太短，时间可任意设。
	                            try {
	                                Thread.sleep(1000);
	                            } catch (Throwable t) {}
	                            monitor.worked(1);// 进度条前进一步
	                        }
	                        monitor.done();// 进度条前进到完成
							String nameOftheGeneratedFile = ((IFile)firstElement).getName().replace(".remodel", ".req");
				            // 6、生成xml文件
				            IFile file = project.getFile("ReqModel/" + nameOftheGeneratedFile);
				            //InputStream input = new BufferedInputStream(new ByteArrayInputStream(document.asXML().getBytes("UTF-8")));
//				            if (!file.exists())
//				            	file.create(input, true, null);
//				            else
//				            	file.setContents(input, true, true, null);
		
							textualModelURI = URI.createPlatformResourceURI(project.getFullPath().append("ReqModel/" + nameOftheGeneratedFile).toString(), true);
//							GenerateGraphicModel generateGraphicModel = new GenerateGraphicModel();
//							generateGraphicModel.performGenerate(((IFile) firstElement).getProject(), reqUri, ((IFile)firstElement).getName().replace(".remodel", ".aird"), ((IFile )firstElement).getName().replace(".remodel", ""));
					}
				} else if (selection instanceof TextSelection) {
					IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
					IFile file = activeEditor.getEditorInput().<IFile>getAdapter(IFile.class);
					System.out.println(file);
				}
				// graphicModel:  *.aird
				String graphicModel = ((IFile)firstElement).getName().replace(".remodel", ".aird");
				String reqmodel =  ((IFile )firstElement).getName().replace(".remodel", "");
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
		return null;
	}
}
