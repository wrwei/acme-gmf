/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.common.diagram.dialog;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import acme.argumentation.diagram.dialog.ArgumentReasoningDialog;
import acme.argumentation.diagram.dialog.ArtifactReferenceDialog;
import acme.argumentation.diagram.dialog.AssertedContextDialog;
import acme.argumentation.diagram.dialog.AssertedEvidenceDialog;
import acme.argumentation.diagram.dialog.AssertedInferenceDialog;
import acme.argumentation.diagram.dialog.ClaimDialog;
import acme.artifact.diagram.dialog.ACMEAbstractArtefactDialog;
import acme.artifact.diagram.dialog.ActivityPropertyDialog;
import acme.artifact.diagram.dialog.ArtifactPropertyDialog;
import acme.artifact.diagram.dialog.EventPropertyDialog;
import acme.artifact.diagram.dialog.ParticipantPropertyDialog;
import acme.artifact.diagram.dialog.PropertyPropertyDialog;
import acme.artifact.diagram.dialog.ResourcePropertyDialog;
import acme.artifact.diagram.dialog.TechniquePropertyDialog;
import acme.assurancecase.diagram.dialog.ArgumentPackageBindingPropertyDialog;
import acme.assurancecase.diagram.dialog.ArgumentPackageInterfacePropertyDialog;
import acme.assurancecase.diagram.dialog.ArgumentPackagePropertyDialog;
import acme.assurancecase.diagram.dialog.ArtifactPackageBindingPropertyDialog;
import acme.assurancecase.diagram.dialog.ArtifactPackageInterfacePropertyDialog;
import acme.assurancecase.diagram.dialog.ArtifactPackagePropertyDialog;
import acme.assurancecase.diagram.dialog.AssuranceCasePackageBindingPropertyDialog;
import acme.assurancecase.diagram.dialog.AssuranceCasePackageInterfacePropertyDialog;
import acme.assurancecase.diagram.dialog.AssuranceCasePackagePropertyDialog;
import acme.assurancecase.diagram.dialog.ContractModulePropertyDialog;
import acme.assurancecase.diagram.dialog.ModulePropertyDialog;
import acme.assurancecase.diagram.dialog.TerminologyPackagePropertyDialog;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.gsn.diagram.dialog.AssertedRelationshipPropertyDialog;
import acme.gsn.diagram.dialog.AssumptionPropertyDialog;
import acme.gsn.diagram.dialog.AwayContextPropertyDialog;
import acme.gsn.diagram.dialog.AwayGoalPropertyDialog;
import acme.gsn.diagram.dialog.AwaySolutionPropertyDialog;
import acme.gsn.diagram.dialog.ChoiceNodePropertyDialog;
import acme.gsn.diagram.dialog.ContextPropertyDialog;
import acme.gsn.diagram.dialog.ContractModuleReferencePropertyDialog;
import acme.gsn.diagram.dialog.GoalPropertyDialog;
import acme.gsn.diagram.dialog.JustificationPropertyDialog;
import acme.gsn.diagram.dialog.ModuleReferencePropertyDialog;
import acme.gsn.diagram.dialog.SolutionPropertyDialog;
import acme.gsn.diagram.dialog.StrategyPropertyDialog;
import acme.terminology.diagram.dialog.CategoryPropertyDialog;
import acme.terminology.diagram.dialog.ExpressionPropertyDialog;
import acme.terminology.diagram.dialog.TermPropertyDialog;
import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentPackageInterface;
import argumentation.ArgumentReasoning;
import argumentation.Argumentation_Package;
import argumentation.ArtifactReference;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import artifact.Activity;
import artifact.Artifact;
import artifact.ArtifactAsset;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import artifact.Event;
import artifact.Participant;
import artifact.Property;
import artifact.Resource;
import artifact.Technique;
import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageBinding;
import assuranceCase.AssuranceCasePackageInterface;
import base.Base_Package;
import base.ModelElement;
import gsn.Assumption;
import gsn.AwayContext;
import gsn.AwayGoal;
import gsn.AwaySolution;
import gsn.ChoiceNode;
import gsn.Context;
import gsn.ContractModule;
import gsn.ContractModuleReference;
import gsn.Goal;
import gsn.Gsn_Package;
import gsn.InContextOf;
import gsn.Justification;
import gsn.Module;
import gsn.ModuleReference;
import gsn.Solution;
import gsn.Strategy;
import gsn.SupportedBy;
import terminology.Category;
import terminology.Expression;
import terminology.Term;
import terminology.TerminologyPackage;
import terminology.Terminology_Package;


public class DialogHelper {

	public static void handleElement(EditingDomain editingDomain, ModelElement modelElement) {
		
		ModelElementPropertyDialog dialog = null;
		Shell shell = Display.getDefault().getActiveShell();
		if (modelElement instanceof AssuranceCasePackageInterface) {
			dialog = new AssuranceCasePackageInterfacePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof AssuranceCasePackageBinding) {
			dialog = new AssuranceCasePackageBindingPropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof AssuranceCasePackage) {
			dialog = new AssuranceCasePackagePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof Module) {
			dialog = new ModulePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ModuleReference) {
			handleModuleReference(editingDomain, (ModuleReference) modelElement);
		}
		else if (modelElement instanceof ContractModule) {
			dialog = new ContractModulePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ContractModuleReference) {
			handleContractModuleReference(editingDomain, (ContractModuleReference) modelElement);
		}
		else if (modelElement instanceof ArgumentPackageInterface) {
			dialog = new ArgumentPackageInterfacePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ArgumentPackageBinding) {
			dialog = new ArgumentPackageBindingPropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ArgumentPackage) {
			dialog = new ArgumentPackagePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ArtifactPackageInterface) {
			dialog = new ArtifactPackageInterfacePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ArtifactPackageBinding) {
			dialog = new ArtifactPackageBindingPropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof ArtifactPackage) {
			dialog = new ArtifactPackagePropertyDialog(shell, modelElement);
		}
		else if (modelElement instanceof Goal) {
			handleGoal(editingDomain, (Goal) modelElement);
		}
		else if (modelElement instanceof Strategy) {
			handleStrategy(editingDomain, (Strategy) modelElement);
		}
		else if (modelElement instanceof Solution) {
			handleSolution(editingDomain, (Solution) modelElement);
		}
		else if (modelElement instanceof Context) {
			handleContext(editingDomain, (Context) modelElement);
		}
		else if (modelElement instanceof Assumption) {
			handleAssumption(editingDomain, (Assumption) modelElement);
		}
		else if (modelElement instanceof Justification) {
			handleJustification(editingDomain, (Justification) modelElement);
		}
		else if (modelElement instanceof InContextOf) {
			handleInContextOf(editingDomain, (InContextOf) modelElement);
		}
		else if (modelElement instanceof SupportedBy) {
			handleSupportedBy(editingDomain, (SupportedBy) modelElement);
		}
		else if (modelElement instanceof AwayGoal) {
			handleAwayGoal(editingDomain, (AwayGoal) modelElement);
		}
		else if (modelElement instanceof AwayContext) {
			handleAwayContext(editingDomain, (AwayContext) modelElement);
		}
		else if (modelElement instanceof AwaySolution) {
			handleAwaySolution(editingDomain, (AwaySolution) modelElement);
		}
		else if (modelElement instanceof ChoiceNode) {
			handleChoice(editingDomain, (ChoiceNode) modelElement);
		}
		else if (modelElement instanceof ModuleReference) {
			handleModuleReference(editingDomain, (ModuleReference) modelElement);
		}
		else if (modelElement instanceof ContractModuleReference) {
			handleContractModuleReference(editingDomain, (ContractModuleReference) modelElement);
		}
		else if (modelElement instanceof Claim) {
			handleClaim(editingDomain, (Claim) modelElement);
		}
		else if (modelElement instanceof ArgumentReasoning) {
			handleArgumentReasoning(editingDomain, (ArgumentReasoning) modelElement);
		}
		else if (modelElement instanceof ArtifactReference) {
			handleArtifactReference(editingDomain, (ArtifactReference) modelElement);
		}
		else if (modelElement instanceof AssertedInference) {
			handleAssertedInference(editingDomain, (AssertedInference) modelElement);
		}
		else if (modelElement instanceof AssertedContext) {
			handleAssertedContext(editingDomain, (AssertedContext) modelElement);
		}
		else if (modelElement instanceof AssertedEvidence) {
			handleAssertedEvidence(editingDomain, (AssertedEvidence) modelElement);
		}
		else if (modelElement instanceof ArtifactAsset) {
			handleArtifactAsset(editingDomain, (ArtifactAsset) modelElement);
		}
		else if (modelElement instanceof TerminologyPackage) {
			handleTerminologyPackage(editingDomain, (TerminologyPackage) modelElement);
		}
		if (dialog != null) {
			dialog.create();
			if (dialog.open() == Window.OK) {
			}
		}
	}
	
//	private static void appendNameToCommand(EditingDomain editingDomain, CompoundCommand command, ModelElement modelElement, String name) {
//		command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, modelElement.getName(), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), name));
//	}
	
//	private static void appendDescriptionToCommand(EditingDomain editingDomain, CompoundCommand command, ModelElement modelElement, String description) {
//		command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, modelElement.getDescription().getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), description));
//	}
	
	private static void appendImplementationConstraintToCommand(EditingDomain editingDomain, CompoundCommand command, ModelElement modelElement, String implementation_constraint) {
		command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, modelElement.getImplementationConstraint().get(0).getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), implementation_constraint));
	}
	
	
	public static void handleClaim(EditingDomain editingDomain, Claim claim) {
		
		ClaimDialog dialog = new ClaimDialog(Display.getDefault().getActiveShell(), claim);
		dialog.create();
		if (dialog.open() == Window.OK) {
			boolean isAbstract = dialog.getIsAbstract();
			int index = dialog.getSelectedIndex();
			CompoundCommand command = new CompoundCommand();
			switch (index) {
			case 0:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSERTED));
				break;
			case 1:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.NEEDS_SUPPORT));
				break;
			case 2:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSUMED));
				break;
			case 3:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AXIOMATIC));
				break;
			case 4:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED));
				break;
			case 5:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AS_CITED));
				break;
			default:
				break;
			}
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, claim, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleArtifactReference(EditingDomain editingDomain, ArtifactReference artifactReference) {
		
		ArtifactReferenceDialog dialog = new ArtifactReferenceDialog(Display.getDefault().getActiveShell(), artifactReference);
		dialog.create();
		if (dialog.open() == Window.OK) {
			boolean isAbstract = dialog.getIsAbstract();

			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, artifactReference, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleArgumentReasoning(EditingDomain editingDomain, ArgumentReasoning reasoning) {
		
		ArgumentReasoningDialog dialog = new ArgumentReasoningDialog(Display.getDefault().getActiveShell(), reasoning);
		dialog.create();
		if (dialog.open() == Window.OK) {

			boolean isAbstract = dialog.getIsAbstract();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, reasoning, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleAssertedInference(EditingDomain editingDomain, AssertedInference assertedInference) {
		
		AssertedInferenceDialog dialog = new AssertedInferenceDialog(Display.getDefault().getActiveShell(), assertedInference);
		dialog.create();
		if (dialog.open() == Window.OK) {
			boolean isAbstract = dialog.getIsAbstract();
			int index = dialog.getSelectedIndex();
			CompoundCommand command = new CompoundCommand();
			switch (index) {
			case 0:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSERTED));
				break;
			case 1:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.NEEDS_SUPPORT));
				break;
			case 2:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSUMED));
				break;
			case 3:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AXIOMATIC));
				break;
			case 4:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED));
				break;
			case 5:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AS_CITED));
				break;
			default:
				break;
			}
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedInference, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}	
	
	public static void handleAssertedContext(EditingDomain editingDomain, AssertedContext assertedContext) {
		
		AssertedContextDialog dialog = new AssertedContextDialog(Display.getDefault().getActiveShell(), assertedContext);
		dialog.create();
		if (dialog.open() == Window.OK) {
			boolean isAbstract = dialog.getIsAbstract();
			int index = dialog.getSelectedIndex();
			CompoundCommand command = new CompoundCommand();
			switch (index) {
			case 0:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSERTED));
				break;
			case 1:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.NEEDS_SUPPORT));
				break;
			case 2:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSUMED));
				break;
			case 3:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AXIOMATIC));
				break;
			case 4:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED));
				break;
			case 5:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AS_CITED));
				break;
			default:
				break;
			}
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedContext, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}	
	
	public static void handleAssertedEvidence(EditingDomain editingDomain, AssertedEvidence assertedEvidence) {
		
		AssertedEvidenceDialog dialog = new AssertedEvidenceDialog(Display.getDefault().getActiveShell(), assertedEvidence);
		dialog.create();
		if (dialog.open() == Window.OK) {
			boolean isAbstract = dialog.getIsAbstract();
			int index = dialog.getSelectedIndex();
			CompoundCommand command = new CompoundCommand();
			switch (index) {
			case 0:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSERTED));
				break;
			case 1:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.NEEDS_SUPPORT));
				break;
			case 2:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.ASSUMED));
				break;
			case 3:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AXIOMATIC));
				break;
			case 4:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.DEFEATED));
				break;
			case 5:
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration(), AssertionDeclaration.AS_CITED));
				break;
			default:
				break;
			}
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assertedEvidence, Base_Package.eINSTANCE.getSACMElement_IsAbstract(), isAbstract));
			editingDomain.getCommandStack().execute(command);
		}
	}	
	
	
	
	public static void handleGoal(EditingDomain editingDomain, Goal goal) {
		boolean isPublic = goal.isIsPublic();
		boolean isUndeveloped = goal.isUndeveloped();
		boolean isUninstantiated = goal.isUninstantiated();
		boolean toBeSupported = goal.isToBeSupportedByContract();
		
		boolean _public = isPublic;
		boolean _undeveloped = isUndeveloped;
		boolean _uninstantiated = isUninstantiated;
		boolean _tobeSupported = toBeSupported;

		
		GoalPropertyDialog dialog = new GoalPropertyDialog(Display.getDefault().getActiveShell(), goal);
		dialog.create();
		if (dialog.open() == Window.OK) {
			_public = dialog.getIsPublic();
			_undeveloped = dialog.getUndeveloped();
			_uninstantiated = dialog.getUninstantiated();
			_tobeSupported = dialog.getToBeSupported();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, goal, Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("isPublic"), _public));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, goal, Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("undeveloped"), _undeveloped));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, goal, Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("uninstantiated"), _uninstantiated));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, goal, Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("toBeSupportedByContract"), _tobeSupported));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleStrategy(EditingDomain editingDomain, Strategy strategy) {
		boolean undeveloped = strategy.isUndeveloped();
		boolean uninstantiated = strategy.isUninstantiated();
		
		boolean _undeveloped = undeveloped;
		boolean _uninstantiated = uninstantiated;
		
		StrategyPropertyDialog dialog = new StrategyPropertyDialog(Display.getDefault().getActiveShell(), strategy);
		dialog.create();
		if (dialog.open() == Window.OK) {
			_undeveloped = dialog.getUndeveloped();
			_uninstantiated = dialog.getUninstantiated();

			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, strategy, Gsn_Package.eINSTANCE.getStrategy().getEStructuralFeature("undeveloped"), _undeveloped));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, strategy, Gsn_Package.eINSTANCE.getStrategy().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleSolution(EditingDomain editingDomain, Solution solution) {
		boolean isPublic = solution.isIsPublic();
		boolean isUninstantiated = solution.isUninstantiated();
		boolean _uninstantiated = isUninstantiated;
		boolean _public = isPublic;

		SolutionPropertyDialog dialog = new SolutionPropertyDialog(Display.getDefault().getActiveShell(), solution);
		dialog.create();
		if (dialog.open() == Window.OK) {
			_uninstantiated = dialog.getUninstantiated();
			_public = dialog.getIsPublic();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, solution, Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("isPublic"), _public));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, solution, Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleContext(EditingDomain editingDomain, Context context) {
		boolean isPublic = context.isIsPublic();
		boolean isUninstantiated = context.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		boolean _public = isPublic;

		
		ContextPropertyDialog dialog = new ContextPropertyDialog(Display.getDefault().getActiveShell(), context);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			_public = dialog.getIsPublic();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, context, Gsn_Package.eINSTANCE.getContext().getEStructuralFeature("isPublic"), _public));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, context, Gsn_Package.eINSTANCE.getContext().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleAssumption(EditingDomain editingDomain, Assumption assumption) {
		boolean isUninstantiated = assumption.isUninstantiated();
		boolean _uninstantiated = isUninstantiated;
		
		AssumptionPropertyDialog dialog = new AssumptionPropertyDialog(Display.getDefault().getActiveShell(), assumption);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, assumption, Gsn_Package.eINSTANCE.getAssumption().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleJustification(EditingDomain editingDomain, Justification justification) {
		boolean isUninstantiated = justification.isUninstantiated();
		boolean _uninstantiated = isUninstantiated;
		
		JustificationPropertyDialog dialog = new JustificationPropertyDialog(Display.getDefault().getActiveShell(), justification);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, justification, Gsn_Package.eINSTANCE.getJustification().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleSupportedBy(EditingDomain editingDomain, SupportedBy supportedBy) {
		AssertedRelationshipPropertyDialog dialog = new AssertedRelationshipPropertyDialog(Display.getDefault().getActiveShell(), supportedBy);
		dialog.create();
		if (dialog.open() == Window.OK) {

			//populate is many and is optional
			boolean isMany = dialog.getIsMany();
			boolean isOptional = dialog.getIsOptional();

			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, supportedBy, Gsn_Package.eINSTANCE.getSupportedBy_IsMany(), isMany));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, supportedBy, Gsn_Package.eINSTANCE.getSupportedBy_IsOptional(), isOptional));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleInContextOf(EditingDomain editingDomain, InContextOf inContextOf) {
		AssertedRelationshipPropertyDialog dialog = new AssertedRelationshipPropertyDialog(Display.getDefault().getActiveShell(), inContextOf);
		dialog.create();
		if (dialog.open() == Window.OK) {

			//populate is many and is optional
			boolean isMany = dialog.getIsMany();
			boolean isOptional = dialog.getIsOptional();
//			String manyExpression = dialog.getIsManyExpression();

			CompoundCommand command = new CompoundCommand();
//			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, inContextOf.getImplementationConstraint().get(0).getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), manyExpression));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, inContextOf, Gsn_Package.eINSTANCE.getInContextOf_IsMany(), isMany));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, inContextOf, Gsn_Package.eINSTANCE.getInContextOf_IsOptional(), isOptional));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleModuleReference(EditingDomain editingDomain, ModuleReference moduleReference) {
		boolean isUninstantiated = moduleReference.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		
		ModuleReferencePropertyDialog dialog = new ModuleReferencePropertyDialog(Display.getDefault().getActiveShell(), moduleReference);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain,  moduleReference, Gsn_Package.eINSTANCE.getAwayGoal().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleContractModuleReference(EditingDomain editingDomain, ContractModuleReference contractModuleReference) {
		boolean isUninstantiated = contractModuleReference.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		
		ContractModuleReferencePropertyDialog dialog = new ContractModuleReferencePropertyDialog(Display.getDefault().getActiveShell(), contractModuleReference);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain,  contractModuleReference, Gsn_Package.eINSTANCE.getAwayGoal().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleAwayGoal(EditingDomain editingDomain, AwayGoal awayGoal) {
		boolean isUninstantiated = awayGoal.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		
		AwayGoalPropertyDialog dialog = new AwayGoalPropertyDialog(Display.getDefault().getActiveShell(), awayGoal);
		dialog.setEditingDomain(editingDomain);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain,  awayGoal, Gsn_Package.eINSTANCE.getAwayGoal().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);

		}
	}

	public static void handleAwaySolution(EditingDomain editingDomain, AwaySolution awaySolution) {
		boolean isUninstantiated = awaySolution.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		
		AwaySolutionPropertyDialog dialog = new AwaySolutionPropertyDialog(Display.getDefault().getActiveShell(), awaySolution);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, awaySolution, Gsn_Package.eINSTANCE.getAwaySolution().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleAwayContext(EditingDomain editingDomain, AwayContext awayContext) {
		boolean isUninstantiated = awayContext.isUninstantiated();
		
		boolean _uninstantiated = isUninstantiated;
		
		AwayContextPropertyDialog dialog = new AwayContextPropertyDialog(Display.getDefault().getActiveShell(), awayContext);
		dialog.create();
		if (dialog.open() == Window.OK) {

			_uninstantiated = dialog.getUninstantiated();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, awayContext, Gsn_Package.eINSTANCE.getAwayContext().getEStructuralFeature("uninstantiated"), _uninstantiated));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleChoice(EditingDomain editingDomain, ChoiceNode choiceNode) {
		ChoiceNodePropertyDialog dialog = new ChoiceNodePropertyDialog(Display.getDefault().getActiveShell(), choiceNode);
		dialog.create();
		if (dialog.open() == Window.OK) {

			String nodeExpr = dialog.getNodeExpr();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, choiceNode.getImplementationConstraint().get(0).getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), nodeExpr));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static ACMEAbstractArtefactDialog handleArtifactAsset(EditingDomain editingDomain, ArtifactAsset artifactAsset) {
		ACMEAbstractArtefactDialog dialog = getDialog(artifactAsset);
		dialog.create();
		if (dialog.open() == Window.OK) {

			
			CompoundCommand command = new CompoundCommand();
			if (!(artifactAsset instanceof Property)) {
				String doc_path = dialog.get_model_path_string();
				String metadata_path = dialog.getMetamodel_path_string();
				int model_type = dialog.getModel_type(); 
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, artifactAsset.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), doc_path));
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, artifactAsset.getArtifactProperty().get(0).getImplementationConstraint().get(0).getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), metadata_path));
				command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, artifactAsset.getArtifactProperty().get(0).getImplementationConstraint().get(1).getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString().getEStructuralFeature("content"), model_type+""));
			}
			editingDomain.getCommandStack().execute(command);
		}
		return dialog;
	}
	
	public static ACMEAbstractArtefactDialog getDialog(ArtifactAsset artifactAsset) {
		Shell activeShell = Display.getDefault().getActiveShell();
		if (artifactAsset instanceof Activity) {
			return new ActivityPropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Artifact) {
			return new ArtifactPropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Event) {
			return new EventPropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Participant) {
			return new ParticipantPropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Property) {
			return new PropertyPropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Resource) {
			return new ResourcePropertyDialog(activeShell, artifactAsset);
		}
		else if (artifactAsset instanceof Technique) {
			return new TechniquePropertyDialog(activeShell, artifactAsset);
		}
		return null;
	}
	
	public static void handleExpression(Expression expression, TerminologyPackagePropertyDialog terminologyPackagePropertyDialog) {
		EditingDomain editingDomain = EditingDomainUtil.getEditingDomain();
		Shell activeShell = Display.getDefault().getActiveShell();
		ExpressionPropertyDialog dialog = new ExpressionPropertyDialog(activeShell, expression);
		dialog.setTerminologyPackagePropertyDialog(terminologyPackagePropertyDialog);
		dialog.create();
		if (dialog.open() == Window.OK) {

			String value = dialog.getValueString();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, expression, Terminology_Package.eINSTANCE.getExpression().getEStructuralFeature("value"), value));
			editingDomain.getCommandStack().execute(command);
		}
	}

	public static void handleTerm(Term term, TerminologyPackagePropertyDialog terminologyPackagePropertyDialog) {
		EditingDomain editingDomain = EditingDomainUtil.getEditingDomain();
		Shell activeShell = Display.getDefault().getActiveShell();
		TermPropertyDialog dialog = new TermPropertyDialog(activeShell, term);
		dialog.setTerminologyPackagePropertyDialog(terminologyPackagePropertyDialog);
		dialog.create();
		if (dialog.open() == Window.OK) {

			String value = dialog.getValueString();
			CompoundCommand command = new CompoundCommand();
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, term, Terminology_Package.eINSTANCE.getTerm().getEStructuralFeature("value"), value));
			command.append(ModelElementFeatureUtil.getSetCommand(editingDomain, term, Terminology_Package.eINSTANCE.getTerm_ExternalReference(), dialog.getExternalRefString()));
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static void handleCategory(Category category, TerminologyPackagePropertyDialog terminologyPackagePropertyDialog) {
		EditingDomain editingDomain = EditingDomainUtil.getEditingDomain();

		Shell activeShell = Display.getDefault().getActiveShell();
		CategoryPropertyDialog dialog = new CategoryPropertyDialog(activeShell, category);
		dialog.setTerminologyPackagePropertyDialog(terminologyPackagePropertyDialog);
		dialog.create();
		if (dialog.open() == Window.OK) {
		} 
	}
	
	public static void handleTerminologyPackage(EditingDomain editingDomain, TerminologyPackage terminologyPackage) {
		TerminologyPackagePropertyDialog dialog = new TerminologyPackagePropertyDialog(Display.getDefault().getActiveShell(), terminologyPackage);
		dialog.create();
		if (dialog.open() == Window.OK) {
		}
	}

}
