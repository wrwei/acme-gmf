/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.dialog;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import base.ModelElement;

public class ParticipantPropertyDialog extends ACMEAbstractArtefactDialog {

	public ParticipantPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Participant: " + getName();
	}

	@Override
	protected void createCustomGroups(Composite control) {
		// TODO Auto-generated method stub
		
	}
}
