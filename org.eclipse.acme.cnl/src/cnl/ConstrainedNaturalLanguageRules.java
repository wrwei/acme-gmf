/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Natural Language Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.ConstrainedNaturalLanguageRules#getRules <em>Rules</em>}</li>
 *   <li>{@link cnl.ConstrainedNaturalLanguageRules#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getConstrainedNaturalLanguageRules()
 * @model
 * @generated
 */
public interface ConstrainedNaturalLanguageRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.ValidationRules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see cnl.CnlPackage#getConstrainedNaturalLanguageRules_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationRules> getRules();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see cnl.CnlPackage#getConstrainedNaturalLanguageRules_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getMetadata();

} // ConstrainedNaturalLanguageRules
