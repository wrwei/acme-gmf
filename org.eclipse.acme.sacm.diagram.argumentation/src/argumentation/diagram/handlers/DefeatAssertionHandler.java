/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.Argumentation_Package;
import argumentation.AssertedRelationship;
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;
import argumentation.diagram.providers.ArgumentationElementTypes;

public class DefeatAssertionHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		
		//check selection state
		if (selection != null && selection instanceof IStructuredSelection) {
			//get selection
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			TransactionalEditingDomain editingDomain;
			editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");

			
			//for each selection
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				//get the selected element
				Object element = iterator.next();
				
				ShapeNodeEditPart assertionNode = null;
				ArgumentPackageCanvasEditPart argumentPackageCanvasEditPart = null;
				
				if (element instanceof AssertedRelationshipTargetEditPart) {
					AssertedRelationshipTargetEditPart editPart = (AssertedRelationshipTargetEditPart) element;
					assertionNode = (ShapeNodeEditPart) editPart.getSource();
					AssertedRelationship relationship = (AssertedRelationship) assertionNode.resolveSemanticElement();
					ModelElementFeatureUtil.setFeatureTransactional(editingDomain, relationship, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED);
				}
				else if (element instanceof AssertedRelationshipSourceEditPart) {
					AssertedRelationshipSourceEditPart editPart = (AssertedRelationshipSourceEditPart) element;
					assertionNode = (ShapeNodeEditPart) editPart.getSource();
				}
				else if (element instanceof ClaimEditPart) {
					ClaimEditPart editPart = (ClaimEditPart) element;
					assertionNode = editPart;
					Claim claim = (Claim) editPart.resolveSemanticElement();
					ModelElementFeatureUtil.setFeatureTransactional(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED);

				}
				argumentPackageCanvasEditPart = (ArgumentPackageCanvasEditPart) assertionNode.getParent();
//					ArgumentPackage argumentPackage = (ArgumentPackage) relationship.eContainer();
//					ArgumentReasoning reasoning = Argumentation_Factory.eINSTANCE.createArgumentReasoning();
//					ModelElementFeatureUtil.createBasicFeature(reasoning);
//					TransactionalEditingDomain editingDomain;
//					editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
//					ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), reasoning);
//					ModelElementFeatureUtil.setFeatureTransactional(editingDomain, relationship, Argumentation_Package.eINSTANCE.getAssertedRelationship_Reasoning(), reasoning);
			}
		}
		return null;
	}
	

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
