/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.dialog;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import artifact.Artifact;
import artifact.Artifact_Package;
import base.ModelElement;

public class ArtifactPropertyDialog extends ACMEAbstractArtefactDialog {

	protected Label versionLabel;
	protected Text versionText;

	
	protected Label time_label;
	protected Text time_text;
	protected Button time_button;
	protected String time_string;
	
	public ArtifactPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Artefact: " + getName();
	}

	@Override
	protected void createCustomGroups(Composite control) {
		createTimeGroup(control);
		createReferenceGroup(control);
		createImplementationGroup(control);
	}
	
	protected void createTimeGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Times", 3);

		time_label = new Label(groupContent, SWT.NONE);
		GridData time_label_data = new GridData(SWT.FILL);
		time_label_data.widthHint = LABEL_WIDTH;
		time_label.setLayoutData(time_label_data);
		time_label.setText("Date: ");

		time_text = new Text(groupContent, SWT.BORDER);
		time_text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		time_text.setBackground(ColorConstants.white);
		time_text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
			}
		});

		Artifact artifact = (Artifact) modelElement;
		if (artifact.getDate() != null) {
			Date date = artifact.getDate();
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
			time_text.setText(format.format(date));
		}

		time_button = new Button(groupContent, SWT.NONE);
		GridData time_button_data = new GridData(SWT.FILL);
		time_button_data.widthHint = BUTTON_WIDTH;
		time_button.setLayoutData(time_button_data);

		time_button.setText("Select...");
		time_button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Shell shell = new Shell(getShell(), SWT.DIALOG_TRIM);
				shell.setLayout(new GridLayout(1, false));
				DateTime calendar = new DateTime(shell, SWT.CALENDAR);
				DateTime time = new DateTime(shell, SWT.TIME);
				new Label(shell, SWT.NONE);
				new Label(shell, SWT.NONE);
				Button ok = new Button(shell, SWT.PUSH);
				ok.setText("OK");
				ok.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
				ok.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						@SuppressWarnings("deprecation")
						Date date = new Date(calendar.getYear()-1900, calendar.getMonth(), calendar.getDay(), time.getHours(), time.getMinutes(), time.getSeconds());
//						artifact.setDate(date);
						ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
								artifact, 
								Artifact_Package.eINSTANCE.getArtifact_Date(), 
								date);
						SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
						time_text.setText(format.format(date));
						shell.close();
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});
				shell.pack();
				shell.open();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
}
