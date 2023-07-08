/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package assuranceCase.diagram.parsers;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

import acme.diagram.util.ModelElementFeatureUtil;

/**
 * @generated
 */
public class ArgumentPackageBindingDescriptionLabelParser implements IParser {
	/**
	* @generated
	*/
	public ArgumentPackageBindingDescriptionLabelParser() {
	}

	/**
	* @generated
	*/
	public String getPrintString(IAdaptable element, int flags) {
		return evaluatePrintExpression((EObject) element.getAdapter(EObject.class));
	}

	/**
	* @generated
	*/
	public boolean isAffectingEvent(Object event, int flags) {
		// XXX Any event is recognized as important, unless there's a way to extract this information from expression itself.
		// TODO analyze expressions (e.g. using OCL parser) to find out structural features in use  
		return true;
	}

	/**
	* @generated
	*/
	public String getEditString(IAdaptable element, int flags) {
		return getPrintString(element, flags);
	}

	/**
	* @generated
	*/
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		return ParserEditStatus.EDITABLE_STATUS;
	}

	/**
	* @generated
	*/
	public ICommand getParseCommand(IAdaptable element, final String newString, int flags) {
		final EObject target = (EObject) element.getAdapter(EObject.class);
		if (!validateValues(target, newString)) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(target);
		if (editingDomain == null) {
			return UnexecutableCommand.INSTANCE;
		}
		IFile affectedFile = WorkspaceSynchronizer.getFile(target.eResource());
		return new AbstractTransactionalCommand(editingDomain, "Set Values", //$NON-NLS-1$
				affectedFile == null ? null : Collections.singletonList(affectedFile)) {
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				return new CommandResult(updateValues(target, newString));
			}
		};
	}

	/**
	* @generated
	*/
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean validateValues(EObject target, String newString) {
		// TODO implement as needed
		return true;
	}

	/**
	* @generated NOT
	*/
	private IStatus updateValues(EObject target, String newString) throws ExecutionException {
		ModelElementFeatureUtil.setDescription(target, newString);
		return new Status(IStatus.OK, "acme.assurancecase.diagram", "OK");
	}

	/**
	* @generated NOT
	*/
	private String evaluatePrintExpression(EObject self) {
		return ModelElementFeatureUtil.getDescription(self);
	}

}
