/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import artifact.ArtifactAsset;
import artifact.Property;
import base.ModelElement;
import gsn.Context;

public class ContextPropertyDialog extends ModelElementPropertyDialog {

	protected boolean is_public = false;
	protected Button is_public_button;
	
	public ContextPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
 		return "Edit the properties for Context: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
		createCitationGroup(control);
		createImplementationGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Context context = (Context) modelElement;
		is_public = context.isIsPublic();
		uninstantiated = context.isUninstantiated();
		
		createIsPublicCheckButton(groupContent);
		createUninstantiatedCheckButton(groupContent);
	}
	
	private void createIsPublicCheckButton(Composite container) {
		is_public_button = new Button(container, SWT.CHECK);
		is_public_button.setSelection(is_public);
		is_public_button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					is_public = true;
				}
				else {
					is_public = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(is_public);
			}
		});
		createLabel(container, "Public");
	}
	
	public boolean getIsPublic() {
		return is_public;
	}
	
	@Override
	protected String getCitationString() {
		return "Artifact";
	}

	@Override
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return comparison instanceof ArtifactAsset && !(comparison instanceof Property);
	}
}
