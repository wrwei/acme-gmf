/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.TypeExpression#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getTypeExpression()
 * @model abstract="true"
 * @generated
 */
public interface TypeExpression extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureValue)
	 * @see cnl.CnlPackage#getTypeExpression_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureValue getFeature();

	/**
	 * Sets the value of the '{@link cnl.TypeExpression#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureValue value);

} // TypeExpression
