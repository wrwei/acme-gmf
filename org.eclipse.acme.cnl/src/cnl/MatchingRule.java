/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.MatchingRule#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link cnl.MatchingRule#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getMatchingRule()
 * @model
 * @generated
 */
public interface MatchingRule extends CNLRule {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see cnl.CnlPackage#getMatchingRule_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link cnl.MatchingRule#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(ElementScope)
	 * @see cnl.CnlPackage#getMatchingRule_Scope()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementScope getScope();

	/**
	 * Sets the value of the '{@link cnl.MatchingRule#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ElementScope value);

} // MatchingRule
