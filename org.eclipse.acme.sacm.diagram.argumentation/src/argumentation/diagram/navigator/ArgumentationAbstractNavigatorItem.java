/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class ArgumentationAbstractNavigatorItem extends PlatformObject {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
			public String getContributorId() {
				return "org.eclipse.acme.sacm.diagram.argumentation"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof argumentation.diagram.navigator.ArgumentationAbstractNavigatorItem
						&& adapterType == ITabbedPropertySheetPageContributor.class) {
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, argumentation.diagram.navigator.ArgumentationAbstractNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private Object myParent;

	/**
	* @generated
	*/
	protected ArgumentationAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	* @generated
	*/
	public Object getParent() {
		return myParent;
	}

}
