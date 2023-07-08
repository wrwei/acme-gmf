/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4104;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem item = (ArtifactNavigatorItem) element;
			return ArtifactVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
