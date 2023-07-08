/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.Type#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getType()
 * @model
 * @generated
 */
public interface Type extends MetaValue {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see cnl.CnlPackage#getType_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Type
