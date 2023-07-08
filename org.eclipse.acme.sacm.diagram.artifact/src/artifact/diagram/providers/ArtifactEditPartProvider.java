/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import artifact.diagram.edit.parts.ArtifactEditPartFactory;
import artifact.diagram.edit.parts.ArtifactPackageCanvasEditPart;
import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ArtifactEditPartProvider() {
		super(new ArtifactEditPartFactory(), ArtifactVisualIDRegistry.TYPED_INSTANCE,
				ArtifactPackageCanvasEditPart.MODEL_ID);
	}

}
