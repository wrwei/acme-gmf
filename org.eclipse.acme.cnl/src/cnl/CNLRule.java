/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CNL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.CNLRule#getAstRoot <em>Ast Root</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getCNLRule()
 * @model
 * @generated
 */
public interface CNLRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Ast Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cnl.Expression#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast Root</em>' containment reference.
	 * @see #setAstRoot(Expression)
	 * @see cnl.CnlPackage#getCNLRule_AstRoot()
	 * @see cnl.Expression#getRule
	 * @model opposite="rule" containment="true" required="true"
	 * @generated
	 */
	Expression getAstRoot();

	/**
	 * Sets the value of the '{@link cnl.CNLRule#getAstRoot <em>Ast Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast Root</em>' containment reference.
	 * @see #getAstRoot()
	 * @generated
	 */
	void setAstRoot(Expression value);

} // CNLRule
