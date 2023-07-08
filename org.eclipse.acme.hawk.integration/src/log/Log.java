/**
 */
package log;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link log.Log#getSublog <em>Sublog</em>}</li>
 * </ul>
 *
 * @see log.LogPackage#getLog()
 * @model
 * @generated
 */
public interface Log extends LogElement {
	/**
	 * Returns the value of the '<em><b>Sublog</b></em>' containment reference list.
	 * The list contents are of type {@link log.SubLog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublog</em>' containment reference list.
	 * @see log.LogPackage#getLog_Sublog()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubLog> getSublog();

} // Log
