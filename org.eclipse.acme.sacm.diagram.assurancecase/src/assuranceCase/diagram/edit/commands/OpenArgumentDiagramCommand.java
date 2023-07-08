/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package assuranceCase.diagram.edit.commands;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin;
import assuranceCase.diagram.part.AssurancecaseDiagramEditorUtil;
import assuranceCase.diagram.part.Messages;
import base.ModelElement;

public class OpenArgumentDiagramCommand extends AbstractTransactionalCommand {

	/**
	* @generated
	*/
	private final HintedDiagramLinkStyle diagramFacet;

	/**
	* @generated
	*/
	public OpenArgumentDiagramCommand(HintedDiagramLinkStyle linkStyle) {
		// editing domain is taken for original diagram, 
		// if we open diagram from another file, we should use another editing domain
		super(EditingDomainUtil.getEditingDomain(), Messages.CommandName_OpenDiagram, null);
		diagramFacet = linkStyle;
	}

	// FIXME canExecute if  !(readOnly && getDiagramToOpen == null), i.e. open works on ro diagrams only when there's associated diagram already

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		try {
			Diagram diagram = getDiagramToOpen();
			if (diagram == null) {
				diagram = intializeNewDiagram();
			}
			URI uri = EcoreUtil.getURI(diagram);
			EObject eObject = ((View) diagramFacet.eContainer()).getElement();
			ModelElement modelElement = null;
			if (eObject instanceof ModelElement) {
				modelElement = (ModelElement) eObject;
			}
			String editorName = modelElement == null? uri.lastSegment() + '#' + diagram.eResource().getContents().indexOf(diagram) : ModelElementFeatureUtil.getName(modelElement);
			IEditorInput editorInput = new URIEditorInput(uri, editorName);
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			page.openEditor(editorInput, getEditorID());
			return CommandResult.newOKCommandResult();
		} catch (Exception ex) {
			throw new ExecutionException("Can't open diagram", ex);
		}
	}

	/**
	* @generated
	*/
	protected Diagram getDiagramToOpen() {
		return diagramFacet.getDiagramLink();
	}

	/**
	* @generated
	*/
	protected Diagram intializeNewDiagram() throws ExecutionException {
		Diagram d = ViewService.createDiagram(getDiagramDomainElement(), getDiagramKind(), getPreferencesHint());
		if (d == null) {
			throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind");
		}
		diagramFacet.setDiagramLink(d);
		assert diagramFacet.eResource() != null;
		diagramFacet.eResource().getContents().add(d);
		EObject container = diagramFacet.eContainer();
		while (container instanceof View) {
			((View) container).persist();
			container = container.eContainer();
		}
		try {
			new WorkspaceModifyOperation() {
				protected void execute(IProgressMonitor monitor)
						throws CoreException, InvocationTargetException, InterruptedException {
					try {
						for (Iterator<?> it = diagramFacet.eResource().getResourceSet().getResources().iterator(); it
								.hasNext();) {
							Resource nextResource = (Resource) it.next();
							if (nextResource.isLoaded() && !getEditingDomain().isReadOnly(nextResource)) {
								nextResource.save(AssurancecaseDiagramEditorUtil.getSaveOptions());
							}
						}
					} catch (IOException ex) {
						throw new InvocationTargetException(ex, "Save operation failed");
					}
				}
			}.run(null);
		} catch (InvocationTargetException e) {
			throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind", e);
		} catch (InterruptedException e) {
			throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind", e);
		}
		return d;
	}

	/**
	* @generated
	*/
	protected EObject getDiagramDomainElement() {
		// use same element as associated with EP
		return ((View) diagramFacet.eContainer()).getElement();
	}

	/**
	* @generated
	*/
	protected PreferencesHint getPreferencesHint() {
		// XXX prefhint from target diagram's editor?
		return AssurancecaseDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	* @generated
	*/
	protected String getDiagramKind() {
		return "Argumentation";
	}

	/**
	* @generated
	*/
	protected String getEditorID() {
		return "argumentation.diagram.part.ArgumentationDiagramEditorID";
	}
}
