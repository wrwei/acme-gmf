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

import acme.diagram.util.DimensionUtil;
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.AssertedContextEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;
import argumentation.diagram.providers.ArgumentationElementTypes;

public class ProvideAssumptionHandler implements IHandler {

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

				}
				else if (element instanceof AssertedRelationshipSourceEditPart) {
					AssertedRelationshipSourceEditPart editPart = (AssertedRelationshipSourceEditPart) element;
					assertionNode = (ShapeNodeEditPart) editPart.getSource();
				}
				else if (element instanceof ClaimEditPart) {
					ClaimEditPart editPart = (ClaimEditPart) element;
					assertionNode = editPart;
				}
				else if (element instanceof AssertedContextEditPart) {
					AssertedContextEditPart editPart = (AssertedContextEditPart) element;
					assertionNode = editPart;
				}
				argumentPackageCanvasEditPart = (ArgumentPackageCanvasEditPart) assertionNode.getParent();
				provideAssumption(argumentPackageCanvasEditPart, assertionNode);
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
	
	private void provideAssumption(ArgumentPackageCanvasEditPart canvasEditPart, ShapeNodeEditPart target) {
		CompoundCommand cc = new CompoundCommand();
		
		IElementType contextType = ArgumentationElementTypes.AssertedContext_2209;
		CreateViewRequest createContextViewRequest = CreateViewRequestFactory.getCreateShapeRequest(contextType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		
		Point point = target.getFigure().getBounds().getLeft().getCopy();
		target.getFigure().translateToAbsolute(point);
		
		int edgeCount = target.getNotationView().getTargetEdges().size();
		
		
		int offset_h = -100;
		int offset_v = -9;
		if (edgeCount > 0) {
			offset_v = -9 + ((edgeCount+1) * (20));
		}
		createContextViewRequest.setLocation(point.getTranslated(offset_h, offset_v));
		point = point.getTranslated(offset_h, offset_v);
		
		Command createContextCommand = canvasEditPart.getCommand(createContextViewRequest);
		cc.add(createContextCommand);
		
		IAdaptable contextAdapter = (IAdaptable) ((List)createContextViewRequest.getNewObject()).get(0);

		
		CreateConnectionViewAndElementRequest targetEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipTarget_4203, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipTarget_4203).getSemanticHint(),
				target.getDiagramPreferencesHint());
		
		ICommand createTargetEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(targetEdgeRequest, 
				contextAdapter,
				new EObjectAdapter((EObject)target.getModel()), 
				target.getViewer());
		
		cc.add(new ICommandProxy(createTargetEdgeCommand));
		
		
		IElementType claimType = ArgumentationElementTypes.Claim_2205;
		CreateViewRequest createClaimViewRequest = CreateViewRequestFactory.getCreateShapeRequest(claimType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		createClaimViewRequest.setLocation(point.getTranslated(-DimensionUtil.CLAIM_DIMENSION.width + offset_h, -DimensionUtil.CLAIM_DIMENSION.height/2+9));
		
		Command createClaimCommand = canvasEditPart.getCommand(createClaimViewRequest);
		cc.add(createClaimCommand);

		IAdaptable claimViewAdapter = (IAdaptable) ((List)createClaimViewRequest.getNewObject()).get(0);

		
		CreateConnectionViewAndElementRequest sourceEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipSource_4202, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipSource_4202).getSemanticHint(),
				target.getDiagramPreferencesHint());
		
		ICommand createSourceEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(sourceEdgeRequest, 
				contextAdapter,
				claimViewAdapter, 
				target.getViewer());
		
		cc.add(new ICommandProxy(createSourceEdgeCommand));
		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		ArrayList<Object> list = (ArrayList<Object>) canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().getReturnValues(createClaimCommand);
		CreateElementRequestAdapter adapter = (CreateElementRequestAdapter) list.get(0);
		Claim claim = (Claim) adapter.resolve();

		claim.setAssertionDeclaration(AssertionDeclaration.ASSUMED);
//		
//		TransactionalEditingDomain editingDomain;
//		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
//		ModelElementFeatureUtil.setFeatureTransactional(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSUMED);
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
