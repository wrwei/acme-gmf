/**
 */
package gsn;

import argumentation.ArtifactReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.Solution#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getSolution()
 * @model
 * @generated
 */
public interface Solution extends ArtifactReference {
	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see gsn.Gsn_Package#getSolution_IsPublic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link gsn.Solution#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

} // Solution
