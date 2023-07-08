/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package gsn.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;

import gsn.diagram.part.GsnDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	* @generated
	*/
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(GsnDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
}
