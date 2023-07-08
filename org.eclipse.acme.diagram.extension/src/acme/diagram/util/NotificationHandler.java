/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class NotificationHandler {

	private static NotificationHandler instance;
	
	protected TransactionalEditingDomain editingDomain;
	
	public static NotificationHandler getInstance() {
		if (instance == null) {
			instance = new NotificationHandler();
		}
		return instance;
	}
	
	public NotificationHandler() {
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("acme.diagram.EditingDomain");
	}
	
	

}
