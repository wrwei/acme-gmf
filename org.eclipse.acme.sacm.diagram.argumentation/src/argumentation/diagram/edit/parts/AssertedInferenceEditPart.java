/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.argumentation.diagram.figure.AssertedInferenceShape;
import acme.argumentation.diagram.figure.ClaimShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import argumentation.Argumentation_Package;
import argumentation.AssertedInference;
import argumentation.Assertion;
import argumentation.Claim;
import argumentation.diagram.edit.policies.AssertedInferenceItemSemanticEditPolicy;
import base.ModelElement;

/**
 * @generated
 */
public class AssertedInferenceEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2208;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AssertedInferenceEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssertedInferenceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
	

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connEditPart) {
		return new ChopboxAnchor(getFigure());
	}
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());
	}
	
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connEditPart) {
		return new ChopboxAnchor(getFigure());
	}
	
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());
	}
	
	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicyEx();
	}
	
	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AssertedInferenceFigure();
	}

	/**
	* @generated
	*/
	public RectangleFigure getPrimaryShape() {
		return (RectangleFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	protected class AssertedInferenceFigure extends AssertedInferenceShape {
		
		public AssertedInferenceFigure() {
			this.setAssertedInference((AssertedInference) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ASSERTED_CONTEXT_DIMENSION);
			this.setMaximumSize(DimensionUtil.ASSERTED_CONTEXT_DIMENSION);
			this.setSize(DimensionUtil.ASSERTED_CONTEXT_DIMENSION);
//			Rectangle rect = claim.getFigure().getBounds();
//			this.setBounds(new Rectangle(rect.x + rect.width/2, rect.y + rect.height+30, 3, 3));
		}
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		boolean refresh = false;
		if (notification.getFeature().equals(Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration())) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Argumentation_Package.eINSTANCE.getAssertedRelationship_IsCounter())) {
			refresh = true;
		}
		if (refresh) {
			for (Object editPart: getSourceConnections()) {
				if (editPart instanceof GraphicalEditPart) {
					GraphicalEditPart temp = (GraphicalEditPart) editPart;
					temp.refresh();
				}
			}
			for (Object editPart: getTargetConnections()) {
				if (editPart instanceof GraphicalEditPart) {
					GraphicalEditPart temp = (GraphicalEditPart) editPart;
					temp.getFigure().invalidate();
					temp.getFigure().repaint();
				}
			}
		}

		super.handleNotificationEvent(notification);
	}
	
	
	@Override
	public void activate() {
		super.activate();
		
		AbstractEMFOperation emfOp = new AbstractEMFOperation(getEditingDomain(), "Location setting") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				// collect all asserted inferences into an arraylist
//				ArrayList<AssertedInferenceEditPart> list = (ArrayList<AssertedInferenceEditPart>) getAllAssertedInferences();
//				AssertedInference ai = (AssertedInference) resolveSemanticElement();
////				Bounds claimLoc = (Bounds) ((Node) getModel()).getLayoutConstraint();
//				getTarget().getPrimaryShape().getBounds().getCopy();
//				Bounds claimLoc = (Bounds) ((Node) getTarget().getModel()).getLayoutConstraint();
//				Dimension size = ((ClaimShape)getTarget().getPrimaryShape()).getMySize();
////				ClaimShape figure = ((ClaimShape)getTarget().getPrimaryShape());
//				for(int i = 0; i < list.size(); i++) {
//					Location lc = (Location) ((Node)list.get(i).getModel()).getLayoutConstraint();
//					lc.setX(claimLoc.getX() + size.width/2);
//					lc.setY(claimLoc.getY() + size.height + 100);
//				}
				return Status.OK_STATUS;
			}
		};
		IStatus status;
		try {
			status = OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
		} catch (ExecutionException e) {
			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Setting location failed", e);
		}
	}
	
	@Override
	public void performRequest(Request request) {
		// TODO Auto-generated method stub
		if (request.getType() == RequestConstants.REQ_OPEN) {
			DialogHelper.handleElement(getEditingDomain(), (ModelElement) resolveSemanticElement());
		}
		super.performRequest(request);
	}
	
//	public List<AssertedInferenceEditPart> getAllAssertedInferences() {
//		//get the current asserted inference
//		AssertedInference ai = (AssertedInference) resolveSemanticElement();
//		//get the sole target
//		Assertion target = (Assertion) ai.getTarget().get(0);
//		
//		//prepare return arraylist
//		ArrayList<AssertedInferenceEditPart> ret = new ArrayList<AssertedInferenceEditPart>();
//		for(Object part : getParent().getChildren()) {
//			if(part instanceof AssertedInferenceEditPart)
//			{
//				AssertedInferenceEditPart temp = (AssertedInferenceEditPart) part;
//				AssertedInference obj = (AssertedInference) temp.resolveSemanticElement();
//				if(obj.getTarget().contains(target)) {
//					ret.add(temp);
//				}
//			}
//		}
//		return ret;
//	}
	
//	private ClaimEditPart getTarget() {
//		AssertedInference inference = (AssertedInference) resolveSemanticElement();
//		Claim c = (Claim) inference.getTarget().get(0);
//		for(Object part: getParent().getChildren())
//		{
//			if(part instanceof ClaimEditPart)
//			{
//				ClaimEditPart p = (ClaimEditPart) part;
//				if(p.resolveSemanticElement().equals(c))
//				{
//					return p;
//				}
//			}
//		}
//		return null;
//	}
	
	
}
