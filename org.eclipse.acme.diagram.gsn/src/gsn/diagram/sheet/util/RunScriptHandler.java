package gsn.diagram.sheet.util;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import acme.gsn.diagram.dialog.RunScriptDialog;
import base.ModelElement;
import gsn.Goal;
import gsn.diagram.edit.parts.GoalEditPart;
import gsn.diagram.edit.parts.GsnEditPart;

public class RunScriptHandler implements IHandler {

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
			Object obj = structuredSelection.getFirstElement();
			if (obj instanceof GsnEditPart) {
				GsnEditPart editPart = (GsnEditPart) obj;
				try {
					String script_String = "";
					RunScriptDialog dialog = new RunScriptDialog(Display.getDefault().getActiveShell(), (ModelElement) editPart.resolveSemanticElement());
					dialog.create();
					if (dialog.open() == Window.OK) {
						script_String = dialog.getScript_string();
						String[] str = script_String.split("\\r?\\n");
						for(int i = 0; i < str.length; i++) 
						{
							String sub_str = str[i];
							String[] pair = sub_str.split(":");
							if (pair.length == 2) {
								if (pair[1].trim().equals("False")) {
									GoalEditPart goalEditPart = locateGoalEditPart(editPart, pair[0]);
									editPart.getEditingDomain().getCommandStack().execute(RemoveCommand.create(editPart.getEditingDomain(), goalEditPart.resolveSemanticElement()));
								}
							}
							
						}
//						if(str[0].equals("delete") && str.length == 2)
//						{
//							GoalEditPart goalEditPart = locateGoalEditPart(editPart, str[1]);
//							
//							editPart.getEditingDomain().getCommandStack().execute(RemoveCommand.create(editPart.getEditingDomain(), goalEditPart.resolveSemanticElement()));
//						}
						
//						UtilityMethods.executeQuery(editPart.resolveSemanticElement(), script_String, 
//								"http://omg.sacm/2.0/assurancecase",
//								"http://omg.sacm/2.0/argumentation",
//								"http://omg.sacm/2.0/artifact",
//								"http://omg.sacm/2.0/terminology",
//								"http://org.eclipse.acme/1.0/gsn");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//editPart.refresh();
			}
		}
		return null;
	}
	
	private GoalEditPart locateGoalEditPart(GsnEditPart gsnEditPart, String name)
	{
		for(Object editPart: gsnEditPart.getChildren())
		{
			if (editPart instanceof GoalEditPart) {
				Goal goal = (Goal) ((GoalEditPart)editPart).resolveSemanticElement();
				if(ModelElementFeatureUtil.getName(goal).equals(name))
				{
					return (GoalEditPart) editPart;
				}
			}
		}
		return null;
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

}
