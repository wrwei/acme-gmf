/**
 */
package cnl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Scoped Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.MatchScopedRule#getMatches <em>Matches</em>}</li>
 *   <li>{@link cnl.MatchScopedRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getMatchScopedRule()
 * @model
 * @generated
 */
public interface MatchScopedRule extends ValidationRules {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link cnl.MatchingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see cnl.CnlPackage#getMatchScopedRule_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchingRule> getMatches();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see cnl.CnlPackage#getMatchScopedRule_Rule()
	 * @model containment="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link cnl.MatchScopedRule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // MatchScopedRule
