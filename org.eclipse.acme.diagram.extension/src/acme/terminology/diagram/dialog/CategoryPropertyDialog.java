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

import base.ModelElement;

public class CategoryPropertyDialog extends ACMEAbstractTerminologyDialog {

	public CategoryPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected void createCustomGroups(Composite control) {
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Category: " + getName();
	}

}
