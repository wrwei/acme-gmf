/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.MetaData#getLegalValues <em>Legal Values</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getMetaData()
 * @model abstract="true"
 * @generated
 */
public interface MetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Legal Values</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.MetaValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Values</em>' containment reference list.
	 * @see cnl.CnlPackage#getMetaData_LegalValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaValue> getLegalValues();

} // MetaData
