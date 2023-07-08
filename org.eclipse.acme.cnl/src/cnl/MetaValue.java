/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.MetaValue#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getMetaValue()
 * @model abstract="true"
 * @generated
 */
public interface MetaValue extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cnl.CnlPackage#getMetaValue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cnl.MetaValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MetaValue
