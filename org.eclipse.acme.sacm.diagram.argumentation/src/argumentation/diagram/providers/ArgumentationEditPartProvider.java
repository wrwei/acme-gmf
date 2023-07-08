/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.ArgumentationEditPartFactory;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentationEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ArgumentationEditPartProvider() {
		super(new ArgumentationEditPartFactory(), ArgumentationVisualIDRegistry.TYPED_INSTANCE,
				ArgumentPackageCanvasEditPart.MODEL_ID);
	}

}
