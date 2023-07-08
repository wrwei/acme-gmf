/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import gsn.diagram.edit.commands.InContextOfCreateCommand;
import gsn.diagram.edit.commands.InContextOfReorientCommand;
import gsn.diagram.edit.commands.SupportedByCreateCommand;
import gsn.diagram.edit.commands.SupportedByReorientCommand;
import gsn.diagram.edit.parts.InContextOfEditPart;
import gsn.diagram.edit.parts.SupportedByEditPart;
import gsn.diagram.part.GsnVisualIDRegistry;
import gsn.diagram.providers.GsnElementTypes;

/**
 * @generated
 */
public class GoalItemSemanticEditPolicy extends GsnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GoalItemSemanticEditPolicy() {
		super(GsnElementTypes.Goal_2303);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GsnVisualIDRegistry.getVisualID(incomingLink) == SupportedByEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GsnVisualIDRegistry.getVisualID(incomingLink) == InContextOfEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GsnVisualIDRegistry.getVisualID(outgoingLink) == SupportedByEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GsnVisualIDRegistry.getVisualID(outgoingLink) == InContextOfEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GsnElementTypes.SupportedBy_4401 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GsnElementTypes.InContextOf_4402 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GsnElementTypes.SupportedBy_4401 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GsnElementTypes.InContextOf_4402 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SupportedByEditPart.VISUAL_ID:
			return getGEFWrapper(new SupportedByReorientCommand(req));
		case InContextOfEditPart.VISUAL_ID:
			return getGEFWrapper(new InContextOfReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
