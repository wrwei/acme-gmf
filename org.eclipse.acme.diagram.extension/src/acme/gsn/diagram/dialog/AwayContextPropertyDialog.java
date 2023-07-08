/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.dialog;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import base.ModelElement;
import gsn.AwayContext;
import gsn.Context;
import gsn.Gsn_Package;

public class AwayContextPropertyDialog extends ModelElementPropertyDialog {

	protected Label contextLabel;
	protected Text contextFullName;
	protected Button browseButton;
	protected Button goToButton;
	
	public AwayContextPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AwayContext: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		AwayContext awayContext = (AwayContext) modelElement;
		TabItem item = desc_tabFolder.getItems()[0];
		Text t = (Text) item.getControl();

		if (awayContext.getCitedElement() != null) {
			Context context = (Context) awayContext.getCitedElement();
			t.setText(context.getDescription().getContent().getValue().get(0).getContent());
		}
		else {
			t.setText("<...>");
		}
		t.setBackground(ColorConstants.white);
		t.setEditable(false);
		createFeaturesGroup(control);
		createCitationGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		AwayContext awayContext = (AwayContext) modelElement;
		uninstantiated = awayContext.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}
	
	@Override
	protected String getCitationGroupName() {
		return "Away Context";
	}
	
	@Override
	protected void citationSelectionChangedAction(String selection, ModelElement citedElement) {
		ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
				citedElement, 
				Gsn_Package.eINSTANCE.getContext_IsPublic(), 
				true);
		updateDescription();
	}
	
	@Override
	protected String getCitationString() {
		return "Context";
	}
	
	@Override
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return comparison instanceof Context && 
				!modelElement.eContainer().equals(comparison.eContainer());
	}
	
	
	public void updateDescription() {
		AwayContext awayContext = (AwayContext) modelElement;
		if (awayContext.getCitedElement() != null) {
			Context context = (Context) awayContext.getCitedElement();
			TabItem item = desc_tabFolder.getItems()[0];
			Text t = (Text) item.getControl();
			t.setText(context.getDescription().getContent().getValue().get(0).getContent());
			description_language_text.setText(context.getDescription().getContent().getValue().get(0).getLang());
		}
	}
	
	@Override
	protected Boolean enableDescriptionButtons() {
		return false;
	}
}
