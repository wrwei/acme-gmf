package acme.gsn.diagram.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ModelElement;

public class AddMarkerDialog extends ModelElementPropertyDialog{

	private Text script_text = null;
	private String script_string = "";
	public AddMarkerDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Add Error Marker";
	}
	
	@Override
	protected void createGroups(Composite control) {
		createRunScriptGroup(control);
	}

	protected void createRunScriptGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Run Script", 2);
		
		//name label
		Label implementationConstraintLabel = new Label(groupContent, SWT.NONE);
		GridData impl_constraint_label_data = new GridData(SWT.FILL);
		impl_constraint_label_data.widthHint = LABEL_WIDTH;
		implementationConstraintLabel.setLayoutData(impl_constraint_label_data);

		implementationConstraintLabel.setText("Message:");
		
		//set layout for name text
		script_text = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData script_text_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		script_text_data.heightHint = IMPL_FIELD_HEIGHT;
		

		script_text.setLayoutData(script_text_data);
		script_text.setText(getImplementationConstraint(0));
		script_text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				script_string = script_text.getText();
			}
		});
		
		groupContent.layout();
		groupContent.pack();
		
//		implementaionGroup = groupContent;
	}
	
	public String getScript_string() {
		return script_string;
	}
	
	@Override
	protected void saveInput() {
		
	}
}
