/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.edit.parts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.acme.evaluation.framework.ValidationCentre;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
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
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import acme.execution.util.UtilityMethods;
import argumentation.ArgumentPackage;
import artifact.Artifact;
import base.ArtifactElement;
import base.ModelElement;
import gsn.diagram.edit.policies.GsnCanonicalEditPolicy;
import gsn.diagram.edit.policies.GsnItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;
import gsn.diagram.part.ValidateAction;
import gsn.diagram.providers.GsnMarkerNavigationProvider;

/**
 * @generated
 */
public class GsnEditPart extends DiagramEditPart {

	protected int problem_count = 0;
	
	/*
	class HawkChangeListencer implements PropertyChangeListener {
		
		@Override
		public void propertyChange(PropertyChangeEvent arg0) {
			hawkMessageCentre.reset();
			smoke_eval();
			
		}
	}
	
	protected HawkChangeListencer listener;
	protected HawkMessageCentre hawkMessageCentre;
	*/
	/**
	* @generated
	*/
	public final static String MODEL_ID = "Gsn"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1003;

	/**
	* @generated
	*/
	public GsnEditPart(View view) {
		super(view);
//		hawkMessageCentre = HawkMessageCentre.getInstance();
//		listener = new HawkChangeListencer();
//		hawkMessageCentre.addPropertyChangeListener(listener);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GsnItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new GsnCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(GsnVisualIDRegistry.TYPED_INSTANCE));
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
	
	protected void smoke_eval() {

//		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		
//		IEditorPart editor = workbenchPage.getActiveEditor();
		IEditorPart editor = ((DiagramEditDomain)getDiagramEditDomain()).getEditorPart();
		IEditorInput input = editor.getEditorInput();
		URIEditorInput editorInput = (URIEditorInput) input;
		URI uri = editorInput.getURI();
		URI resolvedFile = CommonPlugin.resolve(uri.trimFragment());
		
		Path path = new Path(resolvedFile.devicePath());
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IFile file = workspace.getRoot().getFileForLocation(path);
		
		ValidationCentre validationCentre = ValidationCentre.getInstance();
		

		

		View view = (View) getModel(); 
		IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
		if (target != null) {
			GsnMarkerNavigationProvider.deleteMarkers(target);
		}
		
		GsnEditPart part = this;

		ModelElement modelElement = (ModelElement) resolveSemanticElement();
		
		//clear errors
		validationCentre.clear(modelElement);
		
		ArgumentPackage argumentPackage = (ArgumentPackage) modelElement;
		
		HashMap<ModelElement, String> map = new HashMap<>();
		

		for(ModelElement m: argumentPackage.getArgumentationElement()) {
			ArtifactElement cited = getCitedArtifactElement(m);
			validationCentre.removeError(cited);
			if (cited != null) {
				if (cited instanceof Artifact) {
					String result = "";
					Artifact artifact = (Artifact) cited;
					try {
						UtilityMethods.setCurrent_selection(file);
						String constraint = getImplementationConstraint(artifact, 0);
						if (constraint.equals("Isabelle")) {
							result = "true";
						}
						else {
							result = UtilityMethods.executeQuery(artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent(), constraint);	
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (!Boolean.valueOf(result)) {
						map.put(m, "Model evaluation failed, cited element " + cited.getName().getContent() + " failed to pass its Implementation Constraint.");
						map.put(cited, "Evaluation failed");
					}
				}
			}
		}
		
		problem_count = map.keySet().size();
		for(ModelElement m: map.keySet()) {
			
			String message = map.get(m);

			int severity = 0;
			severity = Diagnostic.ERROR;
			
			BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(modelElement);
			BasicDiagnostic diag = null;
			if (m.eContainer().equals(argumentPackage)) {
				diag = new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.gsn", 0, "" + message, new Object[] {m});
			}
			else {
				diag = new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.artifact", 0, "" + message, new Object[] {m});
			}
			diagnostic.add(diag);
			
			if (m.eContainer().equals(argumentPackage)) {
    			ValidateAction.createMarkers(file, diagnostic, part);
			}
			else {
			}
			
			validationCentre.addError(m, message, diagnostic, file);
		}
	}
	
	private ArtifactElement getCitedArtifactElement(ModelElement modelElement) {
		ModelElement cited = (ModelElement) modelElement.getCitedElement();
		if (cited == null) {
			return (ArtifactElement) cited;
		}
		while (cited.getCitedElement() != null) {
			cited = (ModelElement) cited.getCitedElement();
		}
		return (ArtifactElement) cited;
	}
	
	protected String getImplementationConstraint(ModelElement modelElement, int index) {
		return modelElement.getImplementationConstraint().get(index).getContent().getValue().get(0).getContent();
	}
	
}
