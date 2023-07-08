/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.dialog;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import artifact.ArtifactAsset;
import artifact.Property;
import base.Base_Package;
import base.ModelElement;

public abstract class ACMEAbstractArtefactDialog extends ModelElementPropertyDialog {

	private Combo model_type_combo;
	protected static int BUTTON_WIDTH = 60;
	protected Label model_label;
	protected Label metamodel_label;
	protected Text model_path_text;
	protected Text metamodel_path_text;
	protected Button model_browse_button;
	protected Button metamodel_browse_button;
	protected String model_path_string;
	protected String metamodel_path_string;
	protected int model_type;
	
	public ACMEAbstractArtefactDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
		ArtifactAsset artifactAsset = (ArtifactAsset) modelElement;
		if (!(modelElement instanceof Property)) {
			model_path_string = artifactAsset.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent();
			metamodel_path_string = artifactAsset.getArtifactProperty().get(0).getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
			if (artifactAsset.getArtifactProperty().get(0).getImplementationConstraint().size() < 2) {
				model_type = 0;
			}
			else {
				model_type = Integer.valueOf(artifactAsset.getArtifactProperty().get(0).getImplementationConstraint().get(1).getContent().getValue().get(0).getContent());	
			}
		}
	}
	
	protected abstract void createCustomGroups(Composite control);

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		//descriptionText.setBackground(ColorConstants.white);
		createCustomGroups(control);
//		if (!(modelElement instanceof Property)) {
//			createReferenceGroup(control);
//		}
	}

	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 3);
		ArtifactAsset artifactAsset = (ArtifactAsset) modelElement;
		
		final Label typeLabel = new Label(groupContent, SWT.NONE);
		typeLabel.setText("Model Type: ");
		
		
		
		model_type_combo = new Combo(groupContent, SWT.READ_ONLY|SWT.DROP_DOWN);
		model_type_combo.add("EMF Model");
		model_type_combo.add("Excel Spreadsheet");
		model_type_combo.add("Other");
		Property property = artifactAsset.getArtifactProperty().get(0);
		if (property.getImplementationConstraint().size() < 2) {
			ModelElementFeatureUtil.createImplementationConstraint(property, "0");
			model_type_combo.select(0);
			model_type = 0;
		}
		else {
			model_type = Integer.valueOf(property.getImplementationConstraint().get(1).getContent().getValue().get(0).getContent());
			model_type_combo.select(model_type);
		}
		
		model_type_combo.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent arg0) {
				// TODO Auto-generated method stub
				model_type = model_type_combo.getSelectionIndex();
				ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
						property.getImplementationConstraint().get(1).getContent().getValue().get(0),
						Base_Package.eINSTANCE.getLangString_Content(), 
						model_type+"");
			}
		});
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		model_type_combo.setLayoutData(gridData);
		
		

		//model label
		model_label = new Label(groupContent, SWT.NONE);
		GridData model_label_data = new GridData(SWT.FILL);
		model_label_data.widthHint = LABEL_WIDTH;
		model_label.setLayoutData(model_label_data);
		model_label.setText("Document: ");
	
		//model path data
		GridData modelPathData = new GridData(GridData.FILL_HORIZONTAL);
		model_path_text = new Text(groupContent, SWT.BORDER);
		model_path_text.setText(model_path_string);
		model_path_text.setLayoutData(modelPathData);
		model_path_text.setBackground(ColorConstants.white);
		model_path_text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				model_path_string = model_path_text.getText();
			}
		});
		
		//do not the the code below because property is a separate element now
//		if (!artifactAsset.getArtifactProperty().isEmpty()) {
//			Property property = artifactAsset.getArtifactProperty().get(0);
//			String filePath = property.getDescription().getContent().getValue().get(0).getContent();
//			uri.setText(filePath);
//		}
//		else {
//			Property property = Artifact_Factory.eINSTANCE.createProperty();
//			ModelElementFeatureUtil.createBasicFeature(property);
//			ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), artifactAsset, Artifact_Package.eINSTANCE.getArtifactAsset_ArtifactProperty(), property);
//		}
		
		//model browse button
		model_browse_button = new Button(groupContent, SWT.NONE);
		GridData browse_button_data = new GridData(SWT.FILL);
		browse_button_data.widthHint = BUTTON_WIDTH;
		model_browse_button.setLayoutData(browse_button_data);

		model_browse_button.setText("Browse...");
		model_browse_button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(model_browse_button.getShell());
				fileDialog.setText("Locate document");
				
				//set initial open path
				String proj_path = getProjectPath();
				fileDialog.setFilterPath(getProjectPath());
				
				//get project name
//				String projectName = getProjectName();
				
				//compute path
				String path = fileDialog.open();
				if (path != null) {
					System.out.println(fileDialog.getFilterPath());
					File f = new File(path);
					Path p = new Path(f.getAbsolutePath());
					int segmentCount = p.segmentCount();
					path = File.separator + p.segment(segmentCount-2) + File.separator + p.segment(segmentCount-1);
//					String[] str = p.toOSString().split(projectName);
//					String folder= str[1];
//					path = folder;
					
					//assign path to model
					model_path_text.setText(path);
					model_path_string = path;
					Property property = artifactAsset.getArtifactProperty().get(0);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							property.getDescription().getContent().getValue().get(0), 
							Base_Package.eINSTANCE.getLangString_Content(), 
							path);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		metamodel_label = new Label(groupContent, SWT.NONE);
		GridData metamodel_label_data = new GridData(SWT.FILL);
		metamodel_label_data.widthHint = LABEL_WIDTH;
		metamodel_label.setLayoutData(metamodel_label_data);
		metamodel_label.setText("Metadata: ");
	
		GridData metamodelPathData = new GridData(GridData.FILL_HORIZONTAL);
		metamodel_path_text = new Text(groupContent, SWT.BORDER);
		metamodel_path_text.setText(metamodel_path_string);
		metamodel_path_text.setLayoutData(metamodelPathData);
		metamodel_path_text.setBackground(ColorConstants.white);
		metamodel_path_text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				metamodel_path_string = metamodel_path_text.getText();
			}
		});
		
		metamodel_browse_button = new Button(groupContent, SWT.NONE);
		GridData browse_button_data2 = new GridData(SWT.FILL);
		browse_button_data2.widthHint = BUTTON_WIDTH;
		metamodel_browse_button.setLayoutData(browse_button_data2);

		metamodel_browse_button.setText("Browse...");
		metamodel_browse_button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(metamodel_browse_button.getShell());
				fileDialog.setText("Locate metadata");
				
//				String projectName = getProjectName();

				//compute path
				String path = fileDialog.open();
				if (path != null) {
					File f = new File(path);
					Path p = new Path(f.getAbsolutePath());
					int segmentCount = p.segmentCount();
					path = File.separator + p.segment(segmentCount-2) + File.separator + p.segment(segmentCount-1);

//					String[] str = p.toOSString().split(projectName);
//					String folder= str[1];
//					path = folder;
					
					//assign path to model
					metamodel_path_text.setText(path);
					metamodel_path_string = path;
					Property property = artifactAsset.getArtifactProperty().get(0);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
							property.getImplementationConstraint().get(0).getContent().getValue().get(0),
							Base_Package.eINSTANCE.getLangString_Content(), 
							path);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	public String get_model_path_string() {
		return model_path_string;
	}
	
	public String getMetamodel_path_string() {
		return metamodel_path_string;
	}
	
	public int getModel_type() {
		return model_type;
	}
	
	private String getProjectPath() {
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         return project.getFullPath().toOSString();
		      }
		   }
		   else {
			  return project.getFullPath().toOSString();
		   }
		}
		return null;
	}
	
	private String getProjectName() {
		String projectName = null;
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         projectName = project.getName();
		      }
		   }
		}
		return projectName;
	}
}