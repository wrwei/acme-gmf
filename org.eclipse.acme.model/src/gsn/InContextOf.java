/**
 */
package gsn;

import argumentation.AssertedContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Context Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.InContextOf#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link gsn.InContextOf#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link gsn.InContextOf#isIsChoice <em>Is Choice</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getInContextOf()
 * @model
 * @generated
 */
public interface InContextOf extends AssertedContext {
	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see #setIsMany(boolean)
	 * @see gsn.Gsn_Package#getInContextOf_IsMany()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link gsn.InContextOf#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see gsn.Gsn_Package#getInContextOf_IsOptional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link gsn.InContextOf#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Choice</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Choice</em>' attribute.
	 * @see #setIsChoice(boolean)
	 * @see gsn.Gsn_Package#getInContextOf_IsChoice()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsChoice();

	/**
	 * Sets the value of the '{@link gsn.InContextOf#isIsChoice <em>Is Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Choice</em>' attribute.
	 * @see #isIsChoice()
	 * @generated
	 */
	void setIsChoice(boolean value);

} // InContextOf
