/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import artifact.diagram.part.ArtifactDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	* @generated
	*/
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(ArtifactDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
}
