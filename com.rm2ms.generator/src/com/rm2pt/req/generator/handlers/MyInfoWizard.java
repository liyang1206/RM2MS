package com.rm2pt.req.generator.handlers;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class MyInfoWizard extends Wizard implements INewWizard{

	private DetailWizardPage detailPage;
	static public String iteration;
	static public String population;
	private ISelection selection;
	@Override
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		this.selection = selection;
	}
	@Override
	public boolean performFinish() {
		iteration = detailPage.getT1().getText();
		population = detailPage.getT2().getText();
		return true;
	}
	public void addPages() {
		detailPage = new DetailWizardPage();																					
		this.addPage(detailPage);
	}
	
	
}
