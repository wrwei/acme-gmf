/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.GPLRule#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getGPLRule()
 * @model
 * @generated
 */
public interface GPLRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see cnl.CnlPackage#getGPLRule_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link cnl.GPLRule#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // GPLRule
