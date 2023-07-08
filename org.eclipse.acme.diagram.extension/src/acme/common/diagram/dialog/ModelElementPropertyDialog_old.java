/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.common.diagram.dialog;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IPath;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
//import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
//import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
//
//import com.google.inject.Injector;

import acme.diagram.util.BrowseModelElementListener;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import acme.diagram.util.NavigationManager;
import acme.execution.util.UtilityMethods;
import argumentation.ArgumentPackage;
import artifact.Artifact;
import artifact.ArtifactPackage;
import assuranceCase.AssuranceCasePackage;
import base.Base_Factory;
import base.Base_Package;
import base.ExpressionLangString;
import base.ImplementationConstraint;
import base.ModelElement;
import gsn.Gsn_Package;
import terminology.Term;
import terminology.TerminologyPackage;

public abstract class ModelElementPropertyDialog_old extends TitleAreaDialog {
	
	
	protected EditingDomain editingDomain = EditingDomainUtil.getEditingDomain();
	
	protected TabFolder desc_tabFolder = null;
	
	//constraint label width
	protected final int LABEL_WIDTH = 80;
	//Description field height
	protected final int DESC_FIELD_HEIGHT = 70;
	
	protected final int DESC_FIELD_WIDTH = 380;
	
	//Implementation Constraint Field Height
	protected final int IMPL_FIELD_HEIGHT = 70;
	protected final int OTHER_BUTTON_WIDTH_HINT = 55;
	protected final int QUERY_BUTTON_WIDTH_HINT = 50;
	protected final int QUERY_BUTTON_HEIGHT_HINT = 70;
	
	//name, description and implementaiton constraint text fields
	protected Text name_text;
	protected Text description_language_text;
	protected Text implementation_constraint_text;
	protected Text query_result_text;
	
	//strings to hold name, description and impl constraint
	protected String query_result_string = "";
	
	protected Button run_query_button;
	protected Button clear_query_result_button;
	
	//uninstantiated
	protected boolean uninstantiated = false;
	protected Button uninstantiated_checkbox;

	//is abstract and is citation
	protected boolean isAbstract = false;
	protected boolean isCitation = false;

	//citation label and citation text field
	protected Label citation_label;
	protected Text citation_text;
	
	//cite button, remove button, goto button for citations.
	protected Button citation_button;
	protected Button citation_remove_button;
	protected Button citation_goto_button;
	
	//model element for the dialog
	protected ModelElement modelElement;
	
	//group for implementation
	protected Composite implementaionGroup;
	
	protected TreeViewer validationTreeViewer = null;
	ArrayList<ImplementationConstraint> validation_content = new ArrayList<ImplementationConstraint>();
	private ValidationTreeAdapter adapter;

	
	//abstract method for sub classes to override
	protected abstract String getTitleString();

	//constructor
	public ModelElementPropertyDialog_old(Shell parentShell, ModelElement modelElement) {
		super(parentShell);
		//check if model element is null
		if (modelElement != null) {
			this.modelElement = modelElement;
			adapter = new ValidationTreeAdapter();
			modelElement.eAdapters().add(adapter);
		}
	}
	
	@Override
	public boolean close() {
		modelElement.eAdapters().remove(adapter);
		return super.close();
	}
	
	@Override
	public void create() {
		super.create();
		setTitle(getTitleString()); 
	}

	//dialog area is the base of the entire dialog
	@Override
	protected Control createDialogArea(Composite parent) {
		
		//super Composite to contain everything
		Composite superControl = (Composite) super.createDialogArea(parent);
		this.setTitle(getTitleString());
		
		//create a new composite with grid layout, 1 column
	    Composite control = new Composite(superControl, SWT.FILL);
		control.setLayout(new GridLayout(1,true));
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = 600;
		control.setLayoutData(data);
		
		//create sub-groups in the control
		createGroups(control);
		control.layout();
		control.pack();

		return control;
	}
	
	//utility method to create group containers
	protected static Composite createGroupContainer(Composite parent, String text, int columns) {
		//create a group
		final Group group = new Group(parent, SWT.FILL);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText(text);
		group.setLayout(new GridLayout(1,false));
		
		//create composite for group content
		final Composite groupContent = new Composite(group, SWT.FILL);
		groupContent.setLayout(new GridLayout(columns, false));
		groupContent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return groupContent;
	}

	protected void createGroups(Composite control) {
		createIdentityGroup(control);
		createDescriptionGroup(control);
	}
	
	protected void createIdentityGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Identification", 2);
		
		//name label and its grid data
		Label nameLabel = new Label(groupContent, SWT.NONE);
		GridData name_label_data = new GridData(SWT.FILL);
		name_label_data.widthHint = LABEL_WIDTH;
		nameLabel.setLayoutData(name_label_data);
		nameLabel.setText("Name:");
		
		//set layout for name text
		name_text = new Text(groupContent, SWT.BORDER);
		name_text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		name_text.setText(getName());
		
		groupContent.layout();
		groupContent.pack();
	}
	
	protected void createDescriptionGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Description", 3);
		
		//description label
		Label descriptionLabel = new Label(groupContent, SWT.NONE);
		GridData description_label_data = new GridData(SWT.FILL);
		description_label_data.widthHint = LABEL_WIDTH;
		descriptionLabel.setLayoutData(description_label_data);
		descriptionLabel.setText("Description:");
		

		desc_tabFolder = new TabFolder(groupContent, SWT.NONE);
		GridData tab_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		tab_data.heightHint = 50;
		tab_data.widthHint = DESC_FIELD_WIDTH;
		desc_tabFolder.setLayoutData(tab_data);
		
		desc_tabFolder.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = desc_tabFolder.getSelectionIndex();
				if (description_language_text!= null) {
					description_language_text.setText(getDescriptionLanguage(index));
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		
		ArrayList<TabItem> desc_list = new ArrayList<TabItem>();
		for(int i = 0; i < getDescriptionSize(); i++) {
			
			TabItem item = new TabItem(desc_tabFolder, SWT.BORDER);
			
			Text t = new Text(desc_tabFolder, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
			GridData t_data = new GridData(SWT.FILL, SWT.FILL, true, true);
			t_data.heightHint = DESC_FIELD_HEIGHT;
			t.setLayoutData(t_data);
			t.setText(getDescription(i));
			item.setText("Desc " + i);
			
			item.setControl(t);
			desc_list.add(item);
		}
		
		Composite composite = new Composite(groupContent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		GridData composite_data = new GridData(SWT.FILL, SWT.NONE, true, false);
		composite_data.verticalIndent = 25;
		composite_data.heightHint = 50;
		composite_data.widthHint = 60;
		composite.setLayoutData(composite_data);

		Button add_button = new Button(composite, SWT.PUSH);
		GridData add_button_data = new GridData(SWT.FILL);
		add_button_data.heightHint = 25;
		add_button_data.widthHint = 60;
		add_button_data.verticalIndent = 20;
		add_button.setLayoutData(add_button_data);
		
		add_button.setText("Add");
		add_button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				TabItem item = new TabItem(desc_tabFolder, SWT.NONE);
				GridData tab_data = new GridData(SWT.FILL, SWT.FILL, true, true);
				tab_data.heightHint = 50;
				tab_data.widthHint = DESC_FIELD_WIDTH;
				desc_tabFolder.setLayoutData(tab_data);
				
				Text t = new Text(desc_tabFolder, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
				GridData t_data = new GridData(SWT.FILL, SWT.FILL, true, true);
				t_data.heightHint = DESC_FIELD_HEIGHT;
				t.setLayoutData(t_data);
				t.setText("<...>");
				item.setText("Desc " + getDescriptionSize());
				
				item.setControl(t);
				desc_list.add(item);
				addDescription();
				description_language_text.setText(getDescriptionLanguage(getDescriptionSize()-1));
				desc_tabFolder.setSelection(getDescriptionSize()-1);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		add_button.setEnabled(enableDescriptionButtons());
		
		Button remove_button = new Button(composite, SWT.PUSH);
		GridData remove_button_data = new GridData(SWT.FILL);
		remove_button_data.heightHint = 25;
		remove_button_data.widthHint = 60;
		remove_button.setLayoutData(remove_button_data);

		remove_button.setText("Remove");

		remove_button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (getDescriptionSize() > 1) {
					int index = desc_tabFolder.getSelectionIndex();
					removeDescription(index);
					for(TabItem item: desc_tabFolder.getSelection())
					{
						item.dispose();
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		remove_button.setEnabled(enableDescriptionButtons());
		
		//description label
		Label language_label = new Label(groupContent, SWT.NONE);
		GridData language_label_data = new GridData(SWT.FILL);
		language_label_data.widthHint = LABEL_WIDTH;
		language_label.setLayoutData(language_label_data);
		language_label.setText("Language:");
		
		//set layout for name text
		description_language_text = new Text(groupContent, SWT.BORDER);
		GridData lang_text_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		lang_text_data.widthHint = 380;
		description_language_text.setLayoutData(lang_text_data);
		description_language_text.setText(getDescriptionLanguage(desc_tabFolder.getSelectionIndex()));
		
		Composite palceHolder = new Composite(groupContent, SWT.NONE);
		palceHolder.setLayout(new GridLayout(1, false));
		GridData placeHolderData = new GridData(SWT.FILL, SWT.FILL, true, true);
		placeHolderData.widthHint = 60;
		palceHolder.setLayoutData(placeHolderData);

		groupContent.layout();
		groupContent.pack();
	}

	protected void createLabel(Composite container, String name)
	{
		Label label = new Label(container, SWT.NONE);
		label.setText(name);
		GridData nameData = new GridData();
		nameData.grabExcessHorizontalSpace = true;
		nameData.horizontalAlignment = GridData.FILL;
	}
	
	//creates the uninstantiated check button
	protected void createUninstantiatedCheckButton(Composite container) {
		//create button and add selection listener
		uninstantiated_checkbox = new Button(container, SWT.CHECK);
		uninstantiated_checkbox.setSelection(uninstantiated);
		uninstantiated_checkbox.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					uninstantiated = true;
				}
				else {
					uninstantiated = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(uninstantiated);
			}
		});
		createLabel(container, "Uninstantiated");
	}
	
	//utility method for sub classes
	protected void createIsAbstractGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		isAbstract = modelElement.isIsAbstract();
		isCitation = modelElement.isIsCitation();
		
		createIsPublicCheckButton(groupContent);
		groupContent.layout();
		groupContent.pack();
	}
	
	//utility method for sub classes
	private void createIsPublicCheckButton(Composite container) {
		final Button isAbstractButton = new Button(container, SWT.CHECK);
		isAbstractButton.setSelection(isAbstract);
		isAbstractButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isAbstract = true;
				}
				else {
					isAbstract = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isAbstract);
			}
		});
		createLabel(container, "Abstract");
	}
	

	protected String getCitationGroupName() {
		return "Citation";
	}
	
	protected void citationSelectionChangedAction(String selection, ModelElement citedElement) {
		
	}
	protected void createCitationGroup(Composite container) {
		//create group content
		final Composite groupContent = createGroupContainer(container, getCitationGroupName(), 5);

		//citation label
		citation_label = new Label(groupContent, SWT.NONE);
		GridData citationLabel_data = new GridData(SWT.FILL);
		citationLabel_data.widthHint = LABEL_WIDTH;
		citation_label.setLayoutData(citationLabel_data);
		citation_label.setText(getCitationString() + ": ");

		//citation text
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		citation_text = new Text(groupContent, SWT.BORDER);
		citation_text.setLayoutData(filePathData);
		citation_text.setEditable(false);
		citation_text.setBackground(ColorConstants.white);
		
		ModelElement _modelElement = modelElement;
		if (_modelElement.getCitedElement() != null) {
			ModelElement citedElement = (ModelElement) _modelElement.getCitedElement();
			if (citedElement instanceof ArgumentPackage ||
					citedElement instanceof TerminologyPackage ||
					citedElement instanceof ArtifactPackage ||
					citedElement instanceof AssuranceCasePackage) {
				String citedName = ModelElementFeatureUtil.getName(citedElement);
				citation_text.setText(citedName);
			}
			else {
				String packageName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingPackage(citedElement));
				String citedName = ModelElementFeatureUtil.getName(citedElement);
				citation_text.setText(packageName + "-" + citedName);
			}
		}

		
		citation_button = new Button(groupContent, SWT.NONE);
		GridData citation_button_data = new GridData(SWT.FILL);
		citation_button_data.widthHint = OTHER_BUTTON_WIDTH_HINT;
		citation_button.setLayoutData(citation_button_data);

		citation_button.setText("Cite...");
		citation_button.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			HashMap<String, ModelElement> map = new HashMap<String, ModelElement>();
			
			@Override
			public void selectionChanged(String selection) {
				ModelElement citedElement = map.get(selection);
				if (citedElement != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							_modelElement, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							citedElement);
					citation_text.setText(selection);
					citationSelectionChangedAction(selection, citedElement);
				}
			}
			
			@Override
			public String getTitle() {
				return "Cite another " + getCitationString();
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ModelElement element = modelElement;
				
				ModelElement rooElement = ModelElementUtil.getRootElement(element);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof ModelElement) {
						if (isFeasible(modelElement, (ModelElement) next)) {
							String result = ModelElementUtil.getIntrinsicID((ModelElement) next);
							map.put(result, (ModelElement) next);
							ret.add(result);
						}
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select " + getCitationString() + " to be cited";
			}
		});
		
		citation_remove_button = new Button(groupContent, SWT.NONE);
		GridData citation_remove_button_data = new GridData(SWT.FILL);
		citation_remove_button_data.widthHint = OTHER_BUTTON_WIDTH_HINT;
		citation_remove_button.setLayoutData(citation_remove_button_data);
		citation_remove_button.setText("Remove");
		citation_remove_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				if (modelElement.getCitedElement() != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							modelElement, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							null);
					citation_text.setText("");
				}
			}
		});
		
		citation_goto_button = new Button(groupContent, SWT.NONE);
		GridData citation_goto_button_data = new GridData(SWT.FILL);
		citation_goto_button_data.widthHint = OTHER_BUTTON_WIDTH_HINT;
		citation_goto_button.setLayoutData(citation_goto_button_data);
		citation_goto_button.setText("Go to");
		citation_goto_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) _modelElement.getCitedElement();
				if (citedElement != null) {
					boolean success = NavigationManager.navigateToEditor(citedElement);
					if (success) {
						getShell().close();
					}
				}
			}
		});
	}
	
	/*
	protected void createImplementationGroup(Composite parent) {
		
		String constraint = "";
		CNLResourceProvider xtextResourceProvider = new CNLResourceProvider(constraint);
		CnlActivator activator = CnlActivator.getInstance();
		Injector injector = activator.getInjector(CnlActivator.ORG_ECLIPSE_ACME_ACMECNL);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor editor = factory.newEditor(xtextResourceProvider).withParent(parent);
		
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Implementation Constraints", 3);
		
		//name label
		Label implementationConstraintLabel = new Label(groupContent, SWT.NONE);
		GridData impl_constraint_label_data = new GridData(SWT.FILL);
		impl_constraint_label_data.widthHint = LABEL_WIDTH;
		implementationConstraintLabel.setLayoutData(impl_constraint_label_data);

		implementationConstraintLabel.setText("Constraint:");
		
		//set layout for name text
		implementation_constraint_text = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData implementation_constraint_text_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		implementation_constraint_text_data.heightHint = IMPL_FIELD_HEIGHT;
		

		implementation_constraint_text.setLayoutData(implementation_constraint_text_data);
		implementation_constraint_text.setText(getImplementationConstraint(0));

		run_query_button = new Button(groupContent, SWT.NONE);
		GridData run_query_button_data = new GridData(SWT.FILL);
		run_query_button_data.heightHint = QUERY_BUTTON_HEIGHT_HINT;
		run_query_button_data.widthHint = QUERY_BUTTON_HEIGHT_HINT;
		run_query_button.setLayoutData(run_query_button_data);
		run_query_button.setText("Query");
		run_query_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				query_result_text.setText("Validation, please wait...");

				String result = "Problems occured during validation, check console for more details.";

				if (modelElement.getCitedElement() == null) {
					if (modelElement instanceof Term) {
						Term term = (Term) modelElement;
						try {
							result = UtilityMethods.executeQuery(term.getExternalReference(), getImplementationConstraint(0));
						} catch (Exception e) {
							e.printStackTrace();
						}
						query_result_text.setText(result);
					}
					else if (modelElement instanceof Artifact) {
						Artifact artifact = (Artifact) modelElement;
						try {
//							result = UtilityMethods.executeQuery(artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent(), getImplementationConstraint(0));
							String doc_path = artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent();
							String metadata_path = artifact.getArtifactProperty().get(0).getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
							if (metadata_path != null && !metadata_path.equals("")) {
								result = UtilityMethods.executeQuery(doc_path, metadata_path, implementation_constraint_text.getText());	
							}
							else {
								result = UtilityMethods.executeQuery(doc_path, implementation_constraint_text.getText());
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						query_result_text.setText(result);
						if (!Boolean.valueOf(result)) {
							query_result_text.setForeground(ColorConstants.red);
						}
						else {
							query_result_text.setForeground(ColorConstants.green);
						}
					}
					else {
						query_result_text.setText("Cite a Resource in an ArtifactPackage (which in turn points to a model) in order to run queries.");	
					}
				} else {
					try {
						result = UtilityMethods.executeQuery(modelElement.getCitedElement(), getImplementationConstraint(0));
					} catch (Exception e) {
						e.printStackTrace();
					}
					query_result_text.setText(result);
				}
			}
		});
		
		
		Label query_result_label = new Label(groupContent, SWT.NONE);
		GridData query_result_label_data = new GridData(SWT.FILL);
		query_result_label_data.widthHint = LABEL_WIDTH;
		query_result_label.setLayoutData(query_result_label_data);

		query_result_label.setText("Query Result:");
		
		
		//set layout for name text
		query_result_text = new Text(groupContent, SWT.MULTI|SWT.WRAP | SWT.V_SCROLL);
		query_result_text.setEditable(false);
		query_result_text.setBackground(ColorConstants.white);
		GridData query_result_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		query_result_data.heightHint = IMPL_FIELD_HEIGHT;
		
		query_result_text.setLayoutData(implementation_constraint_text_data);
		query_result_text.setText("Query Results");
		query_result_text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				query_result_string = query_result_text.getText();
			}
		});
		
		clear_query_result_button = new Button(groupContent, SWT.NONE);
		GridData clear_query_result_button_data = new GridData(SWT.FILL);
		clear_query_result_button_data.heightHint = QUERY_BUTTON_HEIGHT_HINT;
		clear_query_result_button_data.widthHint = QUERY_BUTTON_HEIGHT_HINT;
		clear_query_result_button.setLayoutData(clear_query_result_button_data);

		clear_query_result_button.setText("Clear");
		clear_query_result_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				query_result_text.setText("");
			}
		});
		
		groupContent.layout();
		groupContent.pack();
		
		implementaionGroup = groupContent;
		
	}
	*/
	
	/*
	protected void createImplementationGroup2(Composite parent) {
		
		String constraint = "";
		CNLResourceProvider xtextResourceProvider = new CNLResourceProvider(constraint);
		CnlActivator activator = CnlActivator.getInstance();
		Injector injector = activator.getInjector(CnlActivator.ORG_ECLIPSE_ACME_ACMECNL);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor editor = factory.newEditor(xtextResourceProvider).withParent(parent);
		
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Implementation Constraints", 3);
		
		//name label
		Label implementationConstraintLabel = new Label(groupContent, SWT.NONE);
		GridData impl_constraint_label_data = new GridData(SWT.FILL);
		impl_constraint_label_data.widthHint = LABEL_WIDTH;
		implementationConstraintLabel.setLayoutData(impl_constraint_label_data);

		implementationConstraintLabel.setText("Constraint:");
		
		//set layout for name text
		implementation_constraint_text = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData implementation_constraint_text_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		implementation_constraint_text_data.heightHint = IMPL_FIELD_HEIGHT;
		

		implementation_constraint_text.setLayoutData(implementation_constraint_text_data);
		implementation_constraint_text.setText(getImplementationConstraint(0));

		run_query_button = new Button(groupContent, SWT.NONE);
		GridData run_query_button_data = new GridData(SWT.FILL);
		run_query_button_data.heightHint = QUERY_BUTTON_HEIGHT_HINT;
		run_query_button_data.widthHint = QUERY_BUTTON_HEIGHT_HINT;
		run_query_button.setLayoutData(run_query_button_data);
		run_query_button.setText("Query");
		run_query_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				query_result_text.setText("Validation, please wait...");

				String result = "Problems occured during validation, check console for more details.";

				if (modelElement.getCitedElement() == null) {
					if (modelElement instanceof Term) {
						Term term = (Term) modelElement;
						try {
							result = UtilityMethods.executeQuery(term.getExternalReference(), getImplementationConstraint(0));
						} catch (Exception e) {
							e.printStackTrace();
						}
						query_result_text.setText(result);
					}
					else if (modelElement instanceof Artifact) {
						Artifact artifact = (Artifact) modelElement;
						try {
//							result = UtilityMethods.executeQuery(artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent(), getImplementationConstraint(0));
							String doc_path = artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent();
							String metadata_path = artifact.getArtifactProperty().get(0).getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
							if (metadata_path != null && !metadata_path.equals("")) {
								result = UtilityMethods.executeQuery(doc_path, metadata_path, implementation_constraint_text.getText());	
							}
							else {
								result = UtilityMethods.executeQuery(doc_path, implementation_constraint_text.getText());
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						query_result_text.setText(result);
						if (!Boolean.valueOf(result)) {
							query_result_text.setForeground(ColorConstants.red);
						}
						else {
							query_result_text.setForeground(ColorConstants.green);
						}
					}
					else {
						query_result_text.setText("Cite a Resource in an ArtifactPackage (which in turn points to a model) in order to run queries.");	
					}
				} else {
					try {
						result = UtilityMethods.executeQuery(modelElement.getCitedElement(), getImplementationConstraint(0));
					} catch (Exception e) {
						e.printStackTrace();
					}
					query_result_text.setText(result);
				}
			}
		});
		
		
		Label query_result_label = new Label(groupContent, SWT.NONE);
		GridData query_result_label_data = new GridData(SWT.FILL);
		query_result_label_data.widthHint = LABEL_WIDTH;
		query_result_label.setLayoutData(query_result_label_data);

		query_result_label.setText("Query Result:");
		
		
		//set layout for name text
		query_result_text = new Text(groupContent, SWT.MULTI|SWT.WRAP | SWT.V_SCROLL);
		query_result_text.setEditable(false);
		query_result_text.setBackground(ColorConstants.white);
		GridData query_result_data = new GridData(SWT.FILL, SWT.FILL, true, true);
		query_result_data.heightHint = IMPL_FIELD_HEIGHT;
		
		query_result_text.setLayoutData(implementation_constraint_text_data);
		query_result_text.setText("Query Results");
		query_result_text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				query_result_string = query_result_text.getText();
			}
		});
		
		clear_query_result_button = new Button(groupContent, SWT.NONE);
		GridData clear_query_result_button_data = new GridData(SWT.FILL);
		clear_query_result_button_data.heightHint = QUERY_BUTTON_HEIGHT_HINT;
		clear_query_result_button_data.widthHint = QUERY_BUTTON_HEIGHT_HINT;
		clear_query_result_button.setLayoutData(clear_query_result_button_data);

		clear_query_result_button.setText("Clear");
		clear_query_result_button.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				query_result_text.setText("");
			}
		});
		
		groupContent.layout();
		groupContent.pack();
		
		implementaionGroup = groupContent;
		
	}
	*/
	
	protected void createValidationGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Validation Rules", 3);
		
		//name label
		Label validation_constraints_label = new Label(groupContent, SWT.NONE);
		GridData impl_constraint_label_data = new GridData(SWT.FILL);
		impl_constraint_label_data.widthHint = LABEL_WIDTH;
		validation_constraints_label.setLayoutData(impl_constraint_label_data);

		validation_constraints_label.setText("Validation:");

//		Composite tree_composite = new Composite(groupContent, SWT.BORDER);
//		tree_composite.setLayout(new GridLayout(1, false));
//		GridData tree_composite_data = new GridData(SWT.FILL, SWT.FILL, true, true);
//		tree_composite_data.heightHint = 120;
//		tree_composite_data.widthHint = 380;
//		tree_composite.setLayoutData(tree_composite_data);

		validationTreeViewer = new TreeViewer(groupContent, SWT.BORDER);

		validationTreeViewer.setContentProvider(new ValidationTreeContentProvider());
		validationTreeViewer.getTree().setHeaderVisible(true);
		validationTreeViewer.getTree().setLinesVisible(true);
		GridData treeViewLayout = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3);
		treeViewLayout.heightHint = 100;
		treeViewLayout.widthHint = 370;
		validationTreeViewer.getControl().setLayoutData(treeViewLayout);

		TreeViewerColumn viewerColumn0  = new TreeViewerColumn(validationTreeViewer, SWT.BORDER);
		viewerColumn0.getColumn().setWidth(200);
		viewerColumn0.getColumn().setText("Name");
		viewerColumn0.getColumn().setAlignment(SWT.LEFT);
		viewerColumn0.setLabelProvider(new DelegatingStyledCellLabelProvider(new ValidationNameLabelProvider()));
		
		TreeViewerColumn viewerColumn1  = new TreeViewerColumn(validationTreeViewer, SWT.BORDER);
		viewerColumn1.getColumn().setWidth(600);
		viewerColumn1.getColumn().setText("URI");
		viewerColumn1.setLabelProvider(new DelegatingStyledCellLabelProvider(new ValidationURILabelProvider()));

		fillContent();
		validationTreeViewer.setInput(validation_content);
		
		GridLayoutFactory.fillDefaults().generateLayout(parent);
		
		validationTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
				ImplementationConstraint constraint = (ImplementationConstraint) thisSelection.getFirstElement();
				File fileToOpen = new File(constraint.getContent().getValue().get(0).getContent());
				if (fileToOpen.exists() && fileToOpen.isFile()) {
				    IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
				    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				 
				    try {
				        IDE.openEditorOnFileStore( page, fileStore );
				        close();
				    } catch ( PartInitException e ) {
				        //Put your exception handler here if you wish to
				    }

				}
				
			}
		});
		
		Composite composite = new Composite(groupContent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		GridData composite_data = new GridData(SWT.FILL, SWT.NONE, true, false);
		composite_data.heightHint = 50;
		composite_data.widthHint = 60;
		composite.setLayoutData(composite_data);

		final Button add_button = new Button(composite, SWT.PUSH);
		GridData add_button_data = new GridData(SWT.FILL);
		add_button_data.heightHint = 25;
		add_button_data.widthHint = 60;
		add_button_data.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
		add_button.setLayoutData(add_button_data);
		add_button.setText("Load");
		add_button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor = workbenchPage.getActiveEditor();
				IEditorInput input = editor.getEditorInput();
				IPath file_path = ((FileEditorInput)input).getPath();
				file_path = file_path.removeLastSegments(1);
				
				FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell());
				fileDialog.setFilterPath(file_path.toOSString());
				fileDialog.setText("Locate validation file");
				String path = fileDialog.open();
				if (path != null) {
					
					
					if (file_path.isPrefixOf(new org.eclipse.core.runtime.Path(path))) {
						int size = modelElement.getImplementationConstraint().size();
						if (size >= 1) {
							ImplementationConstraint constraint = ModelElementFeatureUtil.getImplementationConstraint(modelElement, path);
							ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), modelElement, Base_Package.eINSTANCE.getModelElement_ImplementationConstraint(), constraint);
							fillContent();
						}
					}
					else {
						Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_ERROR | SWT.OK);
						diag.setMessage("Please load constraints that reside in your current project.");
						diag.open();

					}
				}
			}
		});

		final Button remove_button = new Button(composite, SWT.PUSH);
		GridData remove_button_data = new GridData(SWT.FILL);
		remove_button_data.heightHint = 25;
		remove_button_data.widthHint = 60;
		remove_button.setLayoutData(remove_button_data);
		remove_button.setText("Remove");
		remove_button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (validationTreeViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)validationTreeViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						ImplementationConstraint constraint = (ImplementationConstraint) it.next();
						ModelElementFeatureUtil.removeFeatureTransactional(EditingDomainUtil.getEditingDomain(), modelElement, Base_Package.eINSTANCE.getModelElement_ImplementationConstraint(), constraint);
					}
				}
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
	
	protected String getCitationString() {
		return "ModelElement";
	}
	protected boolean isFeasible(ModelElement modelElement, ModelElement comparison) {
		return false;
	}
	
	
	//set if is resizable
	@Override
	protected boolean isResizable() {
		return false;
	}
	
	//save input when ok is pressed
	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}
	
	//save input
	protected void saveInput() {
		//set name first
		setName(name_text.getText());
		
		//set descriptions iteratively
		for(int i=0; i < desc_tabFolder.getItems().length; i++) {
			Text t = (Text) desc_tabFolder.getItem(i).getControl();
			if (desc_tabFolder.getSelectionIndex() == i) {
				setDescription(i, description_language_text.getText(), t.getText());
			}
			else {
				setDescription(i, getDescriptionLanguage(i), t.getText());	
			}
		}
		
		if (implementation_constraint_text != null) {
			setImplementationConstraint(implementation_constraint_text.getText());
		}
//		name_string = name_text.getText();
//		description_string = description_text.getText();
//		if (implementation_constraint_text != null) {
//			implementation_constraint_string = implementation_constraint_text.getText();	
//		}
	}

	public ModelElement getModelElement() {
		return modelElement;
	}
	
	public void setModelElement(ModelElement modelElement) {
		this.modelElement = modelElement;
	}
	
	public boolean getUninstantiated() {
		return uninstantiated;
	}
	
	public boolean getIsAbstract() {
		return isAbstract;
	}
	
	protected String getName() {
		return modelElement.getName().getContent();	
	}
	
	protected void setName(String value) {
		ModelElementFeatureUtil.setFeatureTransactional(editingDomain, modelElement.getName(), Base_Package.eINSTANCE.getLangString_Content(), value);
	}
	
	protected int getDescriptionSize() {
		return modelElement.getDescription().getContent().getValue().size();	
	}
	
	protected String getDescription(int index) {
		return modelElement.getDescription().getContent().getValue().get(index).getContent();
	}
	
	protected String getCurrentDescription() {
		return modelElement.getDescription().getContent().getValue().get(desc_tabFolder.getSelectionIndex()).getContent();
	}
	
	protected void setDescription(int index, String lang, String value) {
		ModelElementFeatureUtil.setFeatureTransactional(editingDomain, modelElement.getDescription().getContent().getValue().get(index), Base_Package.eINSTANCE.getExpressionLangString().getEStructuralFeature("lang"), lang);
		ModelElementFeatureUtil.setFeatureTransactional(editingDomain, modelElement.getDescription().getContent().getValue().get(index), Base_Package.eINSTANCE.getExpressionLangString().getEStructuralFeature("content"), value);
	}
	
	protected void addDescription() {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;

		ExpressionLangString descriptionLangString = base_Factory.createExpressionLangString();
		
		descriptionLangString.setLang("English");
		descriptionLangString.setContent("<...>");
		
		ModelElementFeatureUtil.addFeatureTransactional(editingDomain, modelElement.getDescription().getContent(), Base_Package.eINSTANCE.getMultiLangString_Value(), descriptionLangString);
	}
	
	protected void removeDescription(int index) {
		ExpressionLangString descriptionLangString = (ExpressionLangString) modelElement.getDescription().getContent().getValue().get(index);
		ModelElementFeatureUtil.removeFeatureTransactional(editingDomain, modelElement.getDescription().getContent(), Base_Package.eINSTANCE.getMultiLangString_Value(), descriptionLangString);
	}
	
	protected String getDescriptionLanguage(int index) {
		return modelElement.getDescription().getContent().getValue().get(index).getLang();
	}
	
	protected int getImplementationConstraintSize() {
		return modelElement.getImplementationConstraint().size();
	}
	
	protected String getImplementationConstraint(int index) {
		return modelElement.getImplementationConstraint().get(index).getContent().getValue().get(0).getContent();
	}

	protected String getImplementationConstraintLanguage(int index) {
		return modelElement.getImplementationConstraint().get(index).getContent().getValue().get(0).getLang();
	}
	
	protected void setImplementationConstraint(String value) {
		ModelElementFeatureUtil.setFeatureTransactional(editingDomain, modelElement.getImplementationConstraint().get(0).getContent().getValue().get(0), Base_Package.eINSTANCE.getExpressionLangString().getEStructuralFeature("content"), value);
	}
	
	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}
	
	protected Boolean enableDescriptionButtons() {
		return true;
	}
	
	private class ValidationTreeContentProvider implements ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			fillContent();
		}
		
		@Override
		public Object[] getElements(Object inputElement) {
			@SuppressWarnings("unchecked")
			ArrayList<ImplementationConstraint> input = (ArrayList<ImplementationConstraint>) inputElement;
			return input.toArray();
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return null;
		}
	}
	
	private void fillContent() {
		validation_content.clear();
		for(int i = 1; i < modelElement.getImplementationConstraint().size(); i++) {
			validation_content.add(modelElement.getImplementationConstraint().get(i));
		}
	}
	
	private class ValidationNameLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			ImplementationConstraint constraint = (ImplementationConstraint) element;
			String path_string = constraint.getContent().getValue().get(0).getContent();
			Path path = Paths.get(path_string);
			styledString = new StyledString(path.getFileName().toString());
			return styledString;
		}
		
	}
	
	private class ValidationURILabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			ImplementationConstraint constraint = (ImplementationConstraint) element;
			String path_string = constraint.getContent().getValue().get(0).getContent();
			styledString = new StyledString(path_string);
			return styledString;

		}
	}
	
	private class ValidationTreeAdapter extends EContentAdapter {

		@Override
		public void notifyChanged(Notification notification) {
			fillContent();
			if (validationTreeViewer != null) {
				validationTreeViewer.refresh(true);
			}
		}

		@Override
		public Notifier getTarget() {
			return modelElement;
		}
	}
}
