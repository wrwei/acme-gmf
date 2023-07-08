/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniqueness Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.UniquenessCheck#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getUniquenessCheck()
 * @model
 * @generated
 */
public interface UniquenessCheck extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.FeatureValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see cnl.CnlPackage#getUniquenessCheck_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FeatureValue> getFeatures();

} // UniquenessCheck
