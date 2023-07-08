/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.terminology.diagram.dialog;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.assurancecase.diagram.dialog.TerminologyPackagePropertyDialog;
import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ModelElement;

public abstract class ACMEAbstractTerminologyDialog extends ModelElementPropertyDialog {

	protected TerminologyPackagePropertyDialog terminologyPackagePropertyDialog;
	
	public ACMEAbstractTerminologyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}
	
	protected abstract void createCustomGroups(Composite control);

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		//descriptionText.setBackground(ColorConstants.white);
		createCustomGroups(control);
	}
	
	public void setTerminologyPackagePropertyDialog(TerminologyPackagePropertyDialog terminologyPackagePropertyDialog) {
		this.terminologyPackagePropertyDialog = terminologyPackagePropertyDialog;
	}
}