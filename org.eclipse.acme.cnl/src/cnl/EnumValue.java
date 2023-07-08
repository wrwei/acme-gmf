/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.EnumValue#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link cnl.EnumValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see #setEnumeration(cnl.Enum)
	 * @see cnl.CnlPackage#getEnumValue_Enumeration()
	 * @model required="true"
	 * @generated
	 */
	cnl.Enum getEnumeration();

	/**
	 * Sets the value of the '{@link cnl.EnumValue#getEnumeration <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(cnl.Enum value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see cnl.CnlPackage#getEnumValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link cnl.EnumValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EnumValue
