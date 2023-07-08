/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.ScopedRules#getScope <em>Scope</em>}</li>
 *   <li>{@link cnl.ScopedRules#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getScopedRules()
 * @model
 * @generated
 */
public interface ScopedRules extends ValidationRules {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(ElementScope)
	 * @see cnl.CnlPackage#getScopedRules_Scope()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementScope getScope();

	/**
	 * Sets the value of the '{@link cnl.ScopedRules#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ElementScope value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.Rule}.
	 * It is bidirectional and its opposite is '{@link cnl.Rule#getScopedBy <em>Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see cnl.CnlPackage#getScopedRules_Rules()
	 * @see cnl.Rule#getScopedBy
	 * @model opposite="scopedBy" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // ScopedRules
