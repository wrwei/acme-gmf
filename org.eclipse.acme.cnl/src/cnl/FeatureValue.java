/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link cnl.FeatureValue#getScope <em>Scope</em>}</li>
 *   <li>{@link cnl.FeatureValue#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getFeatureValue()
 * @model
 * @generated
 */
public interface FeatureValue extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see cnl.CnlPackage#getFeatureValue_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link cnl.FeatureValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(ElementScope)
	 * @see cnl.CnlPackage#getFeatureValue_Scope()
	 * @model containment="true"
	 * @generated
	 */
	ElementScope getScope();

	/**
	 * Sets the value of the '{@link cnl.FeatureValue#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ElementScope value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see cnl.CnlPackage#getFeatureValue_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link cnl.FeatureValue#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

} // FeatureValue
