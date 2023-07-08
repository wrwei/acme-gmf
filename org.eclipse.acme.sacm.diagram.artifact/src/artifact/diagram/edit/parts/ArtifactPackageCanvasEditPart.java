/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.edit.parts;

import java.util.Iterator;

import org.eclipse.acme.evaluation.framework.ValidationCentre;
import org.eclipse.acme.evaluation.framework.ValidationError;
import org.eclipse.acme.evaluation.framework.ValidationWarning;
import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import artifact.ArtifactPackage;
import artifact.diagram.edit.policies.ArtifactPackageCanonicalEditPolicy;
import artifact.diagram.edit.policies.ArtifactPackageItemSemanticEditPolicy;
import artifact.diagram.part.ArtifactVisualIDRegistry;
import artifact.diagram.part.ValidateAction;
import artifact.diagram.providers.ArtifactMarkerNavigationProvider;

/**
 * @generated
 */
public class ArtifactPackageCanvasEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "Artifact"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1002;

	/**
	* @generated
	*/
	public ArtifactPackageCanvasEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArtifactPackageItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ArtifactPackageCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ArtifactVisualIDRegistry.TYPED_INSTANCE));
		removeEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy() {

			@Override
			protected Command getCreateCommand(CreateRequest request) {
				CreateViewRequest req = (CreateViewRequest) request;
		        
		        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
		            .getEditingDomain();

				CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
		            editingDomain, DiagramUIMessages.AddCommand_Label);
		        @SuppressWarnings("rawtypes")
				Iterator iter = req.getViewDescriptors().iterator();

				final Rectangle BOUNDS = (Rectangle) getConstraintFor(request);
				BOUNDS.height = -1;
				BOUNDS.width = -1;


				while (iter.hasNext()) {
					CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor)iter.next(); 
					Rectangle rect = getBoundsOffest(req, BOUNDS,viewDescriptor);
					cc.compose(new SetBoundsCommand(editingDomain, 
						DiagramUIMessages.SetLocationCommand_Label_Resize,
						viewDescriptor,
						rect));
				}
				
				if( cc.reduce() == null )
					return null;

				return chainGuideAttachmentCommands( request,
					new ICommandProxy(cc.reduce()));
			}
			
		};
		return lep;
	}
	
	@Override
	protected void refreshVisuals() {
		addMarkers();
		super.refreshVisuals();
	}
	
	public void addMarkers() {
		
		View view = (View) getModel(); 
		IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
		if (target != null) {
			ArtifactMarkerNavigationProvider.deleteMarkers(target);
		}
		ValidationCentre validationCentre = ValidationCentre.getInstance();
		ArtifactPackage artifactPackage = (ArtifactPackage) resolveSemanticElement();
		for(ValidationWarning warning: validationCentre.getWarnings(artifactPackage)) {
			
		}
		for(ValidationError error: validationCentre.getErrors(artifactPackage)) {
			ValidateAction.createMarkers(error.getFile(), error.getDiagnostic(), this);
		}
	}
}
