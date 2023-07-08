/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.ArithmeticExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link cnl.ArithmeticExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link cnl.ArithmeticExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see cnl.CnlPackage#getArithmeticExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link cnl.ArithmeticExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see cnl.CnlPackage#getArithmeticExpression_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link cnl.ArithmeticExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cnl.ArithmeticOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cnl.ArithmeticOperations
	 * @see #setType(ArithmeticOperations)
	 * @see cnl.CnlPackage#getArithmeticExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperations getType();

	/**
	 * Sets the value of the '{@link cnl.ArithmeticExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cnl.ArithmeticOperations
	 * @see #getType()
	 * @generated
	 */
	void setType(ArithmeticOperations value);

} // ArithmeticExpression
