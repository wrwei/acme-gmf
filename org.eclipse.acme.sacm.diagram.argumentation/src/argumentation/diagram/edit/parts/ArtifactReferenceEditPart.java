/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.argumentation.diagram.figure.ArtifactReferenceShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArtifactReference;
import argumentation.diagram.edit.policies.ArtifactReferenceItemSemanticEditPolicy;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;
import base.ModelElement;

/**
 * @generated
 */
public class ArtifactReferenceEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2206;

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
	public ArtifactReferenceEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArtifactReferenceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new ArtifactReferenceFigure();
	}

	/**
	* @generated
	*/
	public ArtifactReferenceFigure getPrimaryShape() {
		return (ArtifactReferenceFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel11EditPart) {
			((WrappingLabel11EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArtifactRefName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel12EditPart) {
			((WrappingLabel12EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArtifactRefDesc());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel11EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel12EditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ArgumentationVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ArtifactReferenceFigure extends ArtifactReferenceShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArtifactRefName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureArtifactRefDesc;

		/**
		 * @generated NOT
		 */
		public ArtifactReferenceFigure() {
			this.setArtifactReference((ArtifactReference) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ARTIFACT_REFERENCE_DIMENSION);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureArtifactRefName = new WrappingLabel();

			ArtifactReference artifactReference = (ArtifactReference) resolveSemanticElement();

			fFigureArtifactRefName.setText(ModelElementFeatureUtil.getName(artifactReference));

			fFigureArtifactRefName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureArtifactRefName.getText(), fFigureArtifactRefName.getFont());

			this.add(fFigureArtifactRefName, new Rectangle(5, 5, nameDimension.width, nameDimension.height));

			fFigureArtifactRefDesc = new WrappingLabel();

			fFigureArtifactRefDesc.setText(ModelElementFeatureUtil.getDescription(artifactReference));

			fFigureArtifactRefDesc.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureArtifactRefDesc.getText(),
					fFigureArtifactRefDesc.getFont(), DimensionUtil.ARTIFACT_REFERENCE_DIMENSION.width - 10);

			this.add(fFigureArtifactRefDesc,
					new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArtifactRefName() {
			return fFigureArtifactRefName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArtifactRefDesc() {
			return fFigureArtifactRefDesc;
		}

	}
	
	@Override
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			DialogHelper.handleElement(getEditingDomain(), (ModelElement) resolveSemanticElement());
			adjustLabelPositions();
			redrawShape();
		}
		super.performRequest(request);
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new ConstrainedResizeShapeEditPolicy(this);
	}
	
	private void adjustLabelPositions()
	{
		ArtifactReference goal = (ArtifactReference) resolveSemanticElement();

		Rectangle bounds = getFigure().getBounds().getCopy();
		if (bounds.height == 0 && bounds.width == 0) {
			bounds.height = DimensionUtil.ARTIFACT_REFERENCE_DIMENSION.height;
			bounds.width = DimensionUtil.ARTIFACT_REFERENCE_DIMENSION.width;
		} 
		
		WrappingLabel nameLabel = getPrimaryShape().getFigureArtifactRefName();
		nameLabel.setText(ModelElementFeatureUtil.getName(goal));
		Dimension nameDimension = DimensionUtil.getTextSize(nameLabel.getText(), nameLabel.getFont());
		getPrimaryShape().getLayoutManager().setConstraint(nameLabel, new Rectangle(5, 5, nameDimension.width, nameDimension.height));
		
		
		WrappingLabel descriptionLabel = getPrimaryShape().getFigureArtifactRefDesc();
		descriptionLabel.setText(ModelElementFeatureUtil.getDescription(goal));
		Dimension descriptionDimension = DimensionUtil.getTextSize(descriptionLabel.getText(),
				descriptionLabel.getFont(), bounds.width - 5);
		getPrimaryShape().getLayoutManager().setConstraint(descriptionLabel,
				new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
	}
	
	private void redrawShape() {
		Rectangle rectangle = DimensionUtil.getConstraints((ModelElement) resolveSemanticElement(),
				getFigure().getBounds());
		getFigure().invalidate();
		getFigure().repaint();
		getFigure().getParent().setConstraint(getFigure(), rectangle);
	}

}
