/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.ValueContainment#getFeature <em>Feature</em>}</li>
 *   <li>{@link cnl.ValueContainment#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getValueContainment()
 * @model
 * @generated
 */
public interface ValueContainment extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureValue)
	 * @see cnl.CnlPackage#getValueContainment_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureValue getFeature();

	/**
	 * Sets the value of the '{@link cnl.ValueContainment#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureValue value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.BaseExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see cnl.CnlPackage#getValueContainment_Collection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BaseExpression> getCollection();

} // ValueContainment
