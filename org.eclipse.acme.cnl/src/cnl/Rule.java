/**
 */
package cnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link cnl.Rule#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link cnl.Rule#getScopedBy <em>Scoped By</em>}</li>
 *   <li>{@link cnl.Rule#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cnl.CnlPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cnl.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see cnl.CnlPackage#getRule_IsActive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link cnl.Rule#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Scoped By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cnl.ScopedRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped By</em>' container reference.
	 * @see #setScopedBy(ScopedRules)
	 * @see cnl.CnlPackage#getRule_ScopedBy()
	 * @see cnl.ScopedRules#getRules
	 * @model opposite="rules" transient="false"
	 * @generated
	 */
	ScopedRules getScopedBy();

	/**
	 * Sets the value of the '{@link cnl.Rule#getScopedBy <em>Scoped By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped By</em>' container reference.
	 * @see #getScopedBy()
	 * @generated
	 */
	void setScopedBy(ScopedRules value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see cnl.CnlPackage#getRule_Message()
	 * @model default=""
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link cnl.Rule#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Rule
