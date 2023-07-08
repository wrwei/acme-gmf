/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentationNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4206;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ArgumentationNavigatorItem) {
			ArgumentationNavigatorItem item = (ArgumentationNavigatorItem) element;
			return ArgumentationVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
