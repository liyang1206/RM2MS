package com.rm2pt.req.generator.handlers;


import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DetailWizardPage extends WizardPage implements IWizardPage{

	private Text t1, t2;
	
	public DetailWizardPage() {
		super("提供信息");
		setTitle("提供信息");
		setDescription("提供遗传算法的初始条件");
	}
 
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		t1 = addLine(container, "iteration", "800");
		t2 = addLine(container, "population", "300");
	}
	
	Text addLine(Composite container, String key, String value) {
		
		Label labelName = new Label(container, SWT.NONE);
		labelName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		labelName.setText(key);
 
		var textName = new Text(container, SWT.BORDER);
		textName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (!textName.getText().isEmpty()) {
					setPageComplete(true);
				} else {
					setPageComplete(false);
				}
			}
		});
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textName.setText(value);
		
		return textName;
	}

	
	public void setT1(String t1) {
		this.t1.setText(t1);
	}
	
	public void setT2(String t2) {
		this.t2.setText(t2);
	}

	public Text getT1() {
		return t1;
	}

	public Text getT2() {
		return t2;
	}

	
}
