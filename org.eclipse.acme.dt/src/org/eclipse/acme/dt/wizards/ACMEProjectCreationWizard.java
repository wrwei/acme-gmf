package org.eclipse.acme.dt.wizards;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;

import org.eclipse.acme.dt.provider.ACMEModelEditPlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;

public class ACMEProjectCreationWizard extends Wizard implements INewWizard {
	protected IWorkbench workbench;
	protected IPath genModelProjectLocation;
	protected IPath genModelContainerPath;
	protected IProject project;
	protected String initialProjectName;
	protected IStructuredSelection selection;
	protected WizardNewProjectCreationPage newProjectCreationPage;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(ACMEModelEditPlugin.INSTANCE.getImage("full/wizban/NewEmptyEMFProject")));
		setWindowTitle(ACMEModelEditPlugin.INSTANCE.getString("_UI_NewEmptyProject_title"));
	}

	@Override
	public void addPages() {
		newProjectCreationPage = new WizardNewProjectCreationPage("NewProjectCreationPage") {
			@Override
			protected boolean validatePage() {
				if (super.validatePage()) {
					IPath locationPath = getLocationPath();
					genModelProjectLocation = Platform.getLocation().equals(locationPath) ? null : locationPath;
					IPath projectPath = getProjectHandle().getFullPath();
					genModelContainerPath = projectPath.append("src");
					return true;
				} else {
					return false;
				}
			}

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				createWorkingSetGroup((Composite) getControl(), selection,
						new String[] { "org.eclipse.jdt.ui.JavaWorkingSetPage", "org.eclipse.pde.ui.pluginWorkingSet",
								"org.eclipse.ui.resourceWorkingSetPage" });
			}
		};

		newProjectCreationPage.setInitialProjectName(initialProjectName);
		newProjectCreationPage.setTitle(ACMEModelEditPlugin.INSTANCE.getString("_UI_EmptyProject_title"));
		newProjectCreationPage.setDescription(ACMEModelEditPlugin.INSTANCE.getString("_UI_EmptyProject_description"));
		addPage(newProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor) {
				try {
					modifyWorkspace(progressMonitor);
				} catch (Exception exception) {
					ACMEModelEditPlugin.INSTANCE.log(exception);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (Exception exception) {
			ACMEModelEditPlugin.INSTANCE.log(exception);
			return false;
		}

		if (project != null) {
			IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(project);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
						IPath path = project.getFullPath();
//						System.out.println(path);
//						try {
//							HawkInstanceCreator hawkInstanceCreator = new HawkInstanceCreator(
//									project.getLocation().toString() + File.separator + "hawk",
//									project.getLocation().toString() + File.separator + "resource");
//							hawkInstanceCreator.init();
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
					}
				});
			}
		}

		return true;
	}

	public void modifyWorkspace(IProgressMonitor progressMonitor)
			throws CoreException, UnsupportedEncodingException, IOException {
		project = Generator.createEMFProject(new Path(genModelContainerPath.toString()), genModelProjectLocation,
				Collections.<IProject>emptyList(), progressMonitor,
				Generator.EMF_MODEL_PROJECT_STYLE | Generator.EMF_PLUGIN_PROJECT_STYLE);

		IWorkingSet[] workingSets = newProjectCreationPage.getSelectedWorkingSets();
		if (workingSets != null) {
			workbench.getWorkingSetManager().addToWorkingSets(project, workingSets);
		}

		CodeGenUtil.EclipseUtil.findOrCreateContainer(new Path("/" + genModelContainerPath.segment(0) + "/resource"),
				true, genModelProjectLocation, progressMonitor);

//		CodeGenUtil.EclipseUtil.findOrCreateContainer(new Path("/" + genModelContainerPath.segment(0) + "/hawk"), true,
//				genModelProjectLocation, progressMonitor);

		PrintStream manifest = new PrintStream(URIConverter.INSTANCE.createOutputStream(
				URI.createPlatformResourceURI("/" + genModelContainerPath.segment(0) + "/META-INF/MANIFEST.MF", true),
				null), false, "UTF-8");
		manifest.println("Manifest-Version: 1.0");
		manifest.println("Bundle-ManifestVersion: 2");
		manifest.print("Bundle-Name: ");
		manifest.println(genModelContainerPath.segment(0));
		manifest.print("Bundle-SymbolicName: ");
		manifest.print(CodeGenUtil.validPluginID(genModelContainerPath.segment(0)));
		manifest.println("; singleton:=true");
		manifest.println("Bundle-Version: 0.1.0.qualifier");
		manifest.print("Require-Bundle: ");
		String[] requiredBundles = getRequiredBundles();
		for (int i = 0, size = requiredBundles.length; i < size;) {
			manifest.print(requiredBundles[i]);
			if (++i == size) {
				manifest.println();
				break;
			} else {
				manifest.println(",");
				manifest.print(" ");
			}
		}
		manifest.close();
	}

	public void setInitialProjectName(String value) {
		initialProjectName = value;
	}

	protected String[] getRequiredBundles() {
		return new String[] { "org.eclipse.emf.ecore" };
	}
}
