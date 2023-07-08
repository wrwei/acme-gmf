/**
 */
package cnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.Expression#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cnl.CNLRule#getAstRoot <em>Ast Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(CNLRule)
	 * @see cnl.CnlPackage#getExpression_Rule()
	 * @see cnl.CNLRule#getAstRoot
	 * @model opposite="astRoot" transient="false"
	 * @generated
	 */
	CNLRule getRule();

	/**
	 * Sets the value of the '{@link cnl.Expression#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(CNLRule value);

} // Expression
