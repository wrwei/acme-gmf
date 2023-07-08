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
import org.eclipse.emf.ecore.EObject;
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
import argumentation.diagram.edit.parts.AssertedEvidenceEditPart;
import argumentation.diagram.edit.parts.AssertedInferenceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;
import argumentation.diagram.providers.ArgumentationElementTypes;

public class ProvideReasoningHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				ShapeNodeEditPart assertedRelationshipNode = null;
				ArgumentPackageCanvasEditPart argumentPackageCanvasEditPart = null;
				if (element instanceof AssertedRelationshipTargetEditPart) {
					AssertedRelationshipTargetEditPart editPart = (AssertedRelationshipTargetEditPart) element;
					assertedRelationshipNode = (ShapeNodeEditPart) editPart.getSource();

				}
				else if (element instanceof AssertedRelationshipSourceEditPart) {
					AssertedRelationshipSourceEditPart editPart = (AssertedRelationshipSourceEditPart) element;
					assertedRelationshipNode = (ShapeNodeEditPart) editPart.getSource();
				}
				else if (element instanceof AssertedInferenceEditPart) {
					AssertedInferenceEditPart editPart = (AssertedInferenceEditPart) element;
					assertedRelationshipNode = editPart;
				}
				else if (element instanceof AssertedEvidenceEditPart) {
					AssertedEvidenceEditPart editPart = (AssertedEvidenceEditPart) element;
					assertedRelationshipNode = editPart;
				}
				argumentPackageCanvasEditPart = (ArgumentPackageCanvasEditPart) assertedRelationshipNode.getParent();
				provideReasoning(argumentPackageCanvasEditPart,  assertedRelationshipNode);
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
	
	private void provideReasoning(ArgumentPackageCanvasEditPart canvasEditPart, ShapeNodeEditPart target) {
		CompoundCommand cc = new CompoundCommand();
		
		IElementType reasoningType = ArgumentationElementTypes.ArgumentReasoning_2207;
		CreateViewRequest createReasoningViewRequest = CreateViewRequestFactory.getCreateShapeRequest(reasoningType, ArgumentationDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

//		Point point = target.getFigure().getBounds().getBottom().getCopy();
//		target.getFigure().translateToAbsolute(point);
//		
//		int edgeCount = target.getNotationView().getTargetEdges().size();
//		
//		int offset = (edgeCount * 50);
//		createInferenceViewRequest.setLocation(point.getTranslated(offset, 100));
		
		Command createReasoningCommand = canvasEditPart.getCommand(createReasoningViewRequest);
		cc.add(createReasoningCommand);
		
		IAdaptable reasoningAdapter = (IAdaptable) ((List)createReasoningViewRequest.getNewObject()).get(0);

		
		CreateConnectionViewAndElementRequest targetEdgeRequest = new CreateConnectionViewAndElementRequest(ArgumentationElementTypes.AssertedRelationshipReasoning_4204, ((IHintedType) ArgumentationElementTypes.AssertedRelationshipReasoning_4204).getSemanticHint(),
				target.getDiagramPreferencesHint());
		
		ICommand createTargetEdgeCommand = new DeferredCreateConnectionViewAndElementCommand(targetEdgeRequest, 
				new EObjectAdapter((EObject)target.getModel()),
				reasoningAdapter,
				target.getViewer());
		
		cc.add(new ICommandProxy(createTargetEdgeCommand));
		
		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
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
