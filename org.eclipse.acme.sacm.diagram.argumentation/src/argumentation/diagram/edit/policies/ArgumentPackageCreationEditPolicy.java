package argumentation.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

public class ArgumentPackageCreationEditPolicy extends CreationEditPolicyWithCustomReparent{

	public ArgumentPackageCreationEditPolicy(DiagramStructure diagramStructure) {
		super(diagramStructure);
	}
	
	@Override
	protected Command getCreateElementAndViewCommand(CreateViewAndElementRequest request) {
		return super.getCreateElementAndViewCommand(request);
	}

}
