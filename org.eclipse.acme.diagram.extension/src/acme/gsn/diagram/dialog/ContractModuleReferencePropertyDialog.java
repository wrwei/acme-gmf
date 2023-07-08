/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.dialog;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ModelElement;
import gsn.ContractModule;
import gsn.ContractModuleReference;

public class ContractModuleReferencePropertyDialog extends ModelElementPropertyDialog {

	
	public ContractModuleReferencePropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for ContractModuleReference: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
		createCitationGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		ContractModuleReference moduleReference = (ContractModuleReference) modelElement;
		uninstantiated = moduleReference.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}
	
	@Override
	protected String getCitationString() {
		return "Contract";
	}

	@Override
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return comparison instanceof ContractModule && !(modelElement.eContainer().equals(comparison));
	}

}
