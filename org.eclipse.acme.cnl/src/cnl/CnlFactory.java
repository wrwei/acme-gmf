/**
 */
package cnl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cnl.CnlPackage
 * @generated
 */
public interface CnlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CnlFactory eINSTANCE = cnl.impl.CnlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constrained Natural Language Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrained Natural Language Rules</em>'.
	 * @generated
	 */
	ConstrainedNaturalLanguageRules createConstrainedNaturalLanguageRules();

	/**
	 * Returns a new object of class '<em>Validation Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Rules</em>'.
	 * @generated
	 */
	ValidationRules createValidationRules();

	/**
	 * Returns a new object of class '<em>Scoped Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scoped Rules</em>'.
	 * @generated
	 */
	ScopedRules createScopedRules();

	/**
	 * Returns a new object of class '<em>Match Scoped Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Scoped Rule</em>'.
	 * @generated
	 */
	MatchScopedRule createMatchScopedRule();

	/**
	 * Returns a new object of class '<em>Matching Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Rule</em>'.
	 * @generated
	 */
	MatchingRule createMatchingRule();

	/**
	 * Returns a new object of class '<em>Element Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Scope</em>'.
	 * @generated
	 */
	ElementScope createElementScope();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>CNL Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CNL Rule</em>'.
	 * @generated
	 */
	CNLRule createCNLRule();

	/**
	 * Returns a new object of class '<em>GPL Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPL Rule</em>'.
	 * @generated
	 */
	GPLRule createGPLRule();

	/**
	 * Returns a new object of class '<em>EOL Expression Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOL Expression Rule</em>'.
	 * @generated
	 */
	EOLExpressionRule createEOLExpressionRule();

	/**
	 * Returns a new object of class '<em>Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Expression</em>'.
	 * @generated
	 */
	ComparisonExpression createComparisonExpression();

	/**
	 * Returns a new object of class '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Expression</em>'.
	 * @generated
	 */
	EqualityExpression createEqualityExpression();

	/**
	 * Returns a new object of class '<em>Negated Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negated Equality Expression</em>'.
	 * @generated
	 */
	NegatedEqualityExpression createNegatedEqualityExpression();

	/**
	 * Returns a new object of class '<em>Greater Than Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Expression</em>'.
	 * @generated
	 */
	GreaterThanExpression createGreaterThanExpression();

	/**
	 * Returns a new object of class '<em>Less Than Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Expression</em>'.
	 * @generated
	 */
	LessThanExpression createLessThanExpression();

	/**
	 * Returns a new object of class '<em>GTE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTE Expression</em>'.
	 * @generated
	 */
	GTEExpression createGTEExpression();

	/**
	 * Returns a new object of class '<em>LTE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTE Expression</em>'.
	 * @generated
	 */
	LTEExpression createLTEExpression();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression</em>'.
	 * @generated
	 */
	LogicalExpression createLogicalExpression();

	/**
	 * Returns a new object of class '<em>Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Expression</em>'.
	 * @generated
	 */
	ImpliesExpression createImpliesExpression();

	/**
	 * Returns a new object of class '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expression</em>'.
	 * @generated
	 */
	OrExpression createOrExpression();

	/**
	 * Returns a new object of class '<em>Xor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor Expression</em>'.
	 * @generated
	 */
	XorExpression createXorExpression();

	/**
	 * Returns a new object of class '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression</em>'.
	 * @generated
	 */
	AndExpression createAndExpression();

	/**
	 * Returns a new object of class '<em>Ifandonlyif Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ifandonlyif Expression</em>'.
	 * @generated
	 */
	IfandonlyifExpression createIfandonlyifExpression();

	/**
	 * Returns a new object of class '<em>Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Expression</em>'.
	 * @generated
	 */
	DateExpression createDateExpression();

	/**
	 * Returns a new object of class '<em>Before Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Before Date Expression</em>'.
	 * @generated
	 */
	BeforeDateExpression createBeforeDateExpression();

	/**
	 * Returns a new object of class '<em>After Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Date Expression</em>'.
	 * @generated
	 */
	AfterDateExpression createAfterDateExpression();

	/**
	 * Returns a new object of class '<em>Onorbefore Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onorbefore Date Expression</em>'.
	 * @generated
	 */
	OnorbeforeDateExpression createOnorbeforeDateExpression();

	/**
	 * Returns a new object of class '<em>Onorafter Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onorafter Date Expression</em>'.
	 * @generated
	 */
	OnorafterDateExpression createOnorafterDateExpression();

	/**
	 * Returns a new object of class '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value</em>'.
	 * @generated
	 */
	FeatureValue createFeatureValue();

	/**
	 * Returns a new object of class '<em>Primitive Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Expression</em>'.
	 * @generated
	 */
	PrimitiveTypeExpression createPrimitiveTypeExpression();

	/**
	 * Returns a new object of class '<em>Enum Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Type Expression</em>'.
	 * @generated
	 */
	EnumTypeExpression createEnumTypeExpression();

	/**
	 * Returns a new object of class '<em>Numeric Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Aggregation</em>'.
	 * @generated
	 */
	NumericAggregation createNumericAggregation();

	/**
	 * Returns a new object of class '<em>Numeric Summation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Summation</em>'.
	 * @generated
	 */
	NumericSummation createNumericSummation();

	/**
	 * Returns a new object of class '<em>Numeric Average</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Average</em>'.
	 * @generated
	 */
	NumericAverage createNumericAverage();

	/**
	 * Returns a new object of class '<em>Numeric Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Maximum</em>'.
	 * @generated
	 */
	NumericMaximum createNumericMaximum();

	/**
	 * Returns a new object of class '<em>Numeric Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Minimum</em>'.
	 * @generated
	 */
	NumericMinimum createNumericMinimum();

	/**
	 * Returns a new object of class '<em>Value Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Containment</em>'.
	 * @generated
	 */
	ValueContainment createValueContainment();

	/**
	 * Returns a new object of class '<em>Uniqueness Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniqueness Check</em>'.
	 * @generated
	 */
	UniquenessCheck createUniquenessCheck();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Decimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Value</em>'.
	 * @generated
	 */
	DecimalValue createDecimalValue();

	/**
	 * Returns a new object of class '<em>Date Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Value</em>'.
	 * @generated
	 */
	DateValue createDateValue();

	/**
	 * Returns a new object of class '<em>Empty Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Value</em>'.
	 * @generated
	 */
	EmptyValue createEmptyValue();

	/**
	 * Returns a new object of class '<em>Existance Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existance Value</em>'.
	 * @generated
	 */
	ExistanceValue createExistanceValue();

	/**
	 * Returns a new object of class '<em>Enumerations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerations</em>'.
	 * @generated
	 */
	Enumerations createEnumerations();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	Types createTypes();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CnlPackage getCnlPackage();

} //CnlFactory
