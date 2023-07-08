/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.DateExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link cnl.DateExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getDateExpression()
 * @model
 * @generated
 */
public interface DateExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(BaseExpression)
	 * @see cnl.CnlPackage#getDateExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseExpression getLhs();

	/**
	 * Sets the value of the '{@link cnl.DateExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(BaseExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(BaseExpression)
	 * @see cnl.CnlPackage#getDateExpression_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseExpression getRhs();

	/**
	 * Sets the value of the '{@link cnl.DateExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(BaseExpression value);

} // DateExpression
