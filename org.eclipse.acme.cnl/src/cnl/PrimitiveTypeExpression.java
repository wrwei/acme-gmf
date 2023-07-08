/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.PrimitiveTypeExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getPrimitiveTypeExpression()
 * @model
 * @generated
 */
public interface PrimitiveTypeExpression extends TypeExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cnl.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cnl.PrimitiveTypes
	 * @see #setType(PrimitiveTypes)
	 * @see cnl.CnlPackage#getPrimitiveTypeExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link cnl.PrimitiveTypeExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cnl.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

} // PrimitiveTypeExpression
