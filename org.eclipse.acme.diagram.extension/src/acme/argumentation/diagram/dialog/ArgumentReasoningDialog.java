/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.argumentation.diagram.dialog;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import argumentation.ArgumentReasoning;
import base.ModelElement;

public class ArgumentReasoningDialog extends ModelElementPropertyDialog {

	protected Combo combo;
	protected int selectedIndex = -1;
	
	public ArgumentReasoningDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createIsAbstractGroup(control);
		createCitationGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for ArgumentReasoning: " + getName();
	}
	
	public int getSelectedIndex() {
		return selectedIndex;
	}

	@Override
	protected String getCitationString() {
		return "ArgumentReasoning";
	}

	@Override
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return comparison instanceof ArgumentReasoning && !modelElement.equals(comparison);
	}
}
