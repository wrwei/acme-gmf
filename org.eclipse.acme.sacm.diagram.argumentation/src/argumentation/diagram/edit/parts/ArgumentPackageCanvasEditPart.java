/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import argumentation.diagram.edit.policies.ArgumentPackageCanonicalEditPolicy;
import argumentation.diagram.edit.policies.ArgumentPackageCreationEditPolicy;
import argumentation.diagram.edit.policies.ArgumentPackageItemSemanticEditPolicy;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentPackageCanvasEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "Argumentation"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1001;

	/**
	* @generated
	*/
	public ArgumentPackageCanvasEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArgumentPackageItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ArgumentPackageCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new ArgumentPackageCreationEditPolicy(ArgumentationVisualIDRegistry.TYPED_INSTANCE));
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
	
}
