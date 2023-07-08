/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;

import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	* @generated
	*/
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(ArgumentationDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
}
