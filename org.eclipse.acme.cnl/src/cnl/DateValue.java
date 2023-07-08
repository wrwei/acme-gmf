/**
 */
package cnl;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cnl.DateValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see cnl.CnlPackage#getDateValue()
 * @model
 * @generated
 */
public interface DateValue extends BaseExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see cnl.CnlPackage#getDateValue_Value()
	 * @model required="true"
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link cnl.DateValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

} // DateValue
