/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
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

import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;
import argumentation.diagram.providers.ArgumentationElementTypes;
import base.ModelElement;

public class SupportClaimHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof EditPart) {
					ClaimEditPart claimEditPart = (ClaimEditPart) element;
					ArgumentPackageCanvasEditPart argumentPackageCanvasEditPart = null;
					if (claimEditPart.getParent() != null) {
						argumentPackageCanvasEditPart = (ArgumentPackageCanvasEditPart) claimEditPart.getParent();
					}
//					Claim claim = (Claim) claimEditPart.resolveSemanticElement();
//					ArgumentPackage argumentPackage = (ArgumentPackage) claim.eContainer();
//					int count = 0;
//					AssertedInference temp = null;
//					for(ArgumentationElement ae: argumentPackage.getArgumentationElement()) {
//						if (ae instanceof AssertedInference) {
//							AssertedInference ai = (AssertedInference) ae;
//							if (ai.getTarget().contains(claim)) {
//								count++;
//								temp = ai;
//							}
//						}
//					}
					supportClaim(argumentPackageCanvasEditPart, claimEditPart);

//					if (count == 1 && temp != null) {
//						Claim newClaim = Argumentation_Factory.eINSTANCE.createClaim();
//						ModelElementFeatureUtil.createBasicFeature(newClaim);
//						TransactionalEditingDomain editingDomain;
//						editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
//						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), newClaim);
//						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, temp, Argumentation_Package.eINSTANCE.getAssertedRelationship_Source(), newClaim);
//					}
//					else {
//						
//						createClaim(argumentPackageCanvasEditPart);
//						createAssertedInference(argumentPackageCanvasEditPart);
						
//						Claim newClaim = Argumentation_Factory.eINSTANCE.createClaim();
//						
//						AssertedInference assertedInference = Argumentation_Factory.eINSTANCE.createAssertedInference();
//						
//						ModelElementFeatureUtil.createBasicFeature(newClaim);
//						ModelElementFeatureUtil.createBasicFeature(assertedInference);
//						
//						assertedInference.getSource().add(newClaim);
//						assertedInference.getTarget().add(claim);
//						
//						TransactionalEditingDomain editingDomain;
//						editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
//
//						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), newClaim);
//						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), assertedInference);
//					}
				}
			}
		}
		return null;
	}
	
//	private void supportClaimTwo(ArgumentPackageCanvasEditPart canvasEditPart, ClaimEditPart target) {
//		CompoundCommand cc = new CompoundCommand();
//		
//		
//		Point point = target.getFigure().getBounds().getBottom().getCopy();
//		target.getFigure().translateToAbsolute(point);
//		
////		int edgeCount = target.getNotationView().getSourceEdges().size();
//		
////		int offset = (edgeCount * 50) - 100;
//		
//		IElementType claimType = ArgumentationElementTypes.Claim_2205;
//		CreateViewRequest createClaimViewRequest = CreateViewRequestFactory.getCreateShapeRequest(claimType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
//		createClaimViewRequest.setLocation(point.getTranslated(-target.getFigure().getBounds().getCopy().width/2, 200));
//
//		Command createClaimCommand = canvasEditPart.getCommand(createClaimViewRequest);
//		cc.add(createClaimCommand);
//
//		IAdaptable claimViewAdapter = (IAdaptable) ((List)createClaimViewRequest.getNewObject()).get(0);
//
//		CreateConnectionViewAndElementRequest sourceEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipSource_4202, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipSource_4202).getSemanticHint(),
//				target.getDiagramPreferencesHint());
//		
//		ICommand createSourceEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(sourceEdgeRequest, 
//				inferenceAdapter,
//				claimViewAdapter, 
//				target.getViewer());
//		
//		cc.add(new ICommandProxy(createSourceEdgeCommand));
//
//		
//		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
//	}
	
//	private void createClaim(ArgumentPackageCanvasEditPart editPart) {
//		IElementType type = ArgumentationElementTypes.Claim_2205;
//		
//		CreateViewRequest createViewRequest = CreateViewRequestFactory.getCreateShapeRequest(type, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
//		createViewRequest.setLocation(new Point(10, 10));
//		Command createCommand = editPart.getCommand(createViewRequest);
//		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(createCommand);
//	}
//	
//	private void createAssertedInference(ArgumentPackageCanvasEditPart editPart) {
//		IElementType type = ArgumentationElementTypes.AssertedInference_2208;
//		
//		CreateViewRequest createViewRequest = CreateViewRequestFactory.getCreateShapeRequest(type, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
//		createViewRequest.setLocation(new Point(10, 10));
//		Command createCommand = editPart.getCommand(createViewRequest);
//		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(createCommand);
//	}
	
	private void supportClaim(ArgumentPackageCanvasEditPart canvasEditPart, ClaimEditPart target) {
		CompoundCommand cc = new CompoundCommand();
		
		IElementType inferenceType = ArgumentationElementTypes.AssertedInference_2208;
		CreateViewRequest createInferenceViewRequest = CreateViewRequestFactory.getCreateShapeRequest(inferenceType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		
//		Point point = target.getFigure().getBounds().getBottom().getCopy();
		Point point = target.getFigure().getBounds().getBottomLeft().getCopy();
		target.getFigure().translateToAbsolute(point);
		//target.getFigure().translateToAbsolute(point);
		
		int edgeCount = target.getNotationView().getTargetEdges().size();
		
		int halfwidth = target.getFigure().getBounds().width/2-9;
		int offset = halfwidth;
		if (edgeCount > 1) {
			offset = (edgeCount * halfwidth);
		}
		
		createInferenceViewRequest.setLocation(point.getTranslated(offset, 100));
		
		Command createInferenceCommand = canvasEditPart.getCommand(createInferenceViewRequest);
		cc.add(createInferenceCommand);
		
		IAdaptable inferenceAdapter = (IAdaptable) ((List)createInferenceViewRequest.getNewObject()).get(0);

		
		CreateConnectionViewAndElementRequest targetEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipTarget_4203, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipTarget_4203).getSemanticHint(),
				target.getDiagramPreferencesHint());
		
		ICommand createTargetEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(targetEdgeRequest, 
				inferenceAdapter,
				new EObjectAdapter((EObject)target.getModel()), 
				target.getViewer());
		
		cc.add(new ICommandProxy(createTargetEdgeCommand));
		
		
		IElementType claimType = ArgumentationElementTypes.Claim_2205;
		CreateViewRequest createClaimViewRequest = CreateViewRequestFactory.getCreateShapeRequest(claimType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		createClaimViewRequest.setLocation(point.getTranslated(-target.getFigure().getBounds().getCopy().width/2 + offset+9, 200));

		Command createClaimCommand = canvasEditPart.getCommand(createClaimViewRequest);
		cc.add(createClaimCommand);

		IAdaptable claimViewAdapter = (IAdaptable) ((List)createClaimViewRequest.getNewObject()).get(0);

		
		CreateConnectionViewAndElementRequest sourceEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipSource_4202, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipSource_4202).getSemanticHint(),
				target.getDiagramPreferencesHint());
		
		ICommand createSourceEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(sourceEdgeRequest, 
				inferenceAdapter,
				claimViewAdapter, 
				target.getViewer());
		
		cc.add(new ICommandProxy(createSourceEdgeCommand));

		
		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
	}
	

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}
	
	public ShapeNodeEditPart locateEditPart(List<ShapeNodeEditPart> list, ModelElement modelElemenet) {
		for(ShapeNodeEditPart part : list) {
			Object obj = part.resolveSemanticElement();
			if(obj.equals(modelElemenet))
			{
				return part;
			}
		}
		return null;
	}

}
