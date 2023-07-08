/**
 */
package log;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link log.SubLog#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see log.LogPackage#getSubLog()
 * @model
 * @generated
 */
public interface SubLog extends LogElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see log.LogPackage#getSubLog_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link log.SubLog#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // SubLog
