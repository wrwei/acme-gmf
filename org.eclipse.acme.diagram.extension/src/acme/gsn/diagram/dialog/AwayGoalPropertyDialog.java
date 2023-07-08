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
import gsn.AwayGoal;
import gsn.Goal;
import gsn.Gsn_Package;

public class AwayGoalPropertyDialog extends ModelElementPropertyDialog {

	protected Label goalLabel;
	protected Text goalFullName;
	protected Button browseButton;
	protected Button goToButton;

	
	public AwayGoalPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AwayGoal: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		AwayGoal awayGoal = (AwayGoal) modelElement;
		TabItem item = desc_tabFolder.getItems()[0];
		Text t = (Text) item.getControl();

		if (awayGoal.getCitedElement() != null) {
			Goal goal = (Goal) awayGoal.getCitedElement();
			t.setText(goal.getDescription().getContent().getValue().get(0).getContent());
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

		AwayGoal awayGoal = (AwayGoal) modelElement;
		uninstantiated = awayGoal.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}
	
	@Override
	protected String getCitationGroupName() {
		return "Away Goal";
	}
	
	@Override
	protected void citationSelectionChangedAction(String selection, ModelElement citedElement) {
		ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
				citedElement, 
				Gsn_Package.eINSTANCE.getGoal_IsPublic(), 
				true);
		updateDescription();
	}
	
	@Override
	protected String getCitationString() {
		return "Goal";
	}
	
	@Override
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return comparison instanceof Goal && 
				!modelElement.eContainer().equals(comparison.eContainer());
	}
	
	public void updateDescription() {
		AwayGoal awayGoal = (AwayGoal) modelElement;
		if (awayGoal.getCitedElement() != null) {
			Goal goal = (Goal) awayGoal.getCitedElement();
			TabItem item = desc_tabFolder.getItems()[0];
			Text t = (Text) item.getControl();
			t.setText(goal.getDescription().getContent().getValue().get(0).getContent());
			description_language_text.setText(goal.getDescription().getContent().getValue().get(0).getLang());
		}
	}
	
	@Override
	protected Boolean enableDescriptionButtons() {
		return false;
	}
}
