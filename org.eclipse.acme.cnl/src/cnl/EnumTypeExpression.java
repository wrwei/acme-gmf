/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.EnumTypeExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getEnumTypeExpression()
 * @model
 * @generated
 */
public interface EnumTypeExpression extends TypeExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(cnl.Enum)
	 * @see cnl.CnlPackage#getEnumTypeExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	cnl.Enum getType();

	/**
	 * Sets the value of the '{@link cnl.EnumTypeExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(cnl.Enum value);

} // EnumTypeExpression
