/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.providers;

import artifact.diagram.part.ArtifactDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ArtifactDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ArtifactDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
