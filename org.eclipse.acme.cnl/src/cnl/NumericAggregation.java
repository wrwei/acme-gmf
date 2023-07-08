/**
 */
package cnl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.NumericAggregation#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getNumericAggregation()
 * @model
 * @generated
 */
public interface NumericAggregation extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureValue)
	 * @see cnl.CnlPackage#getNumericAggregation_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureValue getFeature();

	/**
	 * Sets the value of the '{@link cnl.NumericAggregation#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureValue value);

} // NumericAggregation
