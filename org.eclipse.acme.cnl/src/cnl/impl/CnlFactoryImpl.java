/**
 */
package cnl.impl;

import cnl.AfterDateExpression;
import cnl.AndExpression;
import cnl.ArithmeticExpression;
import cnl.ArithmeticOperations;
import cnl.BeforeDateExpression;
import cnl.BooleanValue;
import cnl.CNLRule;
import cnl.CnlFactory;
import cnl.CnlPackage;
import cnl.ComparisonExpression;
import cnl.ConstrainedNaturalLanguageRules;
import cnl.DateExpression;
import cnl.DateValue;
import cnl.DecimalValue;
import cnl.EOLExpressionRule;
import cnl.ElementScope;
import cnl.EmptyValue;
import cnl.EnumTypeExpression;
import cnl.EnumValue;
import cnl.Enumerations;
import cnl.EqualityExpression;
import cnl.ExistanceValue;
import cnl.Feature;
import cnl.FeatureValue;
import cnl.GPLRule;
import cnl.GTEExpression;
import cnl.GreaterThanExpression;
import cnl.IfandonlyifExpression;
import cnl.ImpliesExpression;
import cnl.IntegerValue;
import cnl.LTEExpression;
import cnl.LessThanExpression;
import cnl.LogicalExpression;
import cnl.MatchScopedRule;
import cnl.MatchingRule;
import cnl.NegatedEqualityExpression;
import cnl.NumericAggregation;
import cnl.NumericAverage;
import cnl.NumericMaximum;
import cnl.NumericMinimum;
import cnl.NumericSummation;
import cnl.OnorafterDateExpression;
import cnl.OnorbeforeDateExpression;
import cnl.OrExpression;
import cnl.PrimitiveTypeExpression;
import cnl.PrimitiveTypes;
import cnl.Rule;
import cnl.ScopedRules;
import cnl.StringValue;
import cnl.Type;
import cnl.Types;
import cnl.UniquenessCheck;
import cnl.ValidationRules;
import cnl.ValueContainment;
import cnl.XorExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CnlFactoryImpl extends EFactoryImpl implements CnlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CnlFactory init() {
		try {
			CnlFactory theCnlFactory = (CnlFactory)EPackage.Registry.INSTANCE.getEFactory(CnlPackage.eNS_URI);
			if (theCnlFactory != null) {
				return theCnlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CnlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CnlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES: return createConstrainedNaturalLanguageRules();
			case CnlPackage.VALIDATION_RULES: return createValidationRules();
			case CnlPackage.SCOPED_RULES: return createScopedRules();
			case CnlPackage.MATCH_SCOPED_RULE: return createMatchScopedRule();
			case CnlPackage.MATCHING_RULE: return createMatchingRule();
			case CnlPackage.ELEMENT_SCOPE: return createElementScope();
			case CnlPackage.RULE: return createRule();
			case CnlPackage.CNL_RULE: return createCNLRule();
			case CnlPackage.GPL_RULE: return createGPLRule();
			case CnlPackage.EOL_EXPRESSION_RULE: return createEOLExpressionRule();
			case CnlPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
			case CnlPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
			case CnlPackage.NEGATED_EQUALITY_EXPRESSION: return createNegatedEqualityExpression();
			case CnlPackage.GREATER_THAN_EXPRESSION: return createGreaterThanExpression();
			case CnlPackage.LESS_THAN_EXPRESSION: return createLessThanExpression();
			case CnlPackage.GTE_EXPRESSION: return createGTEExpression();
			case CnlPackage.LTE_EXPRESSION: return createLTEExpression();
			case CnlPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
			case CnlPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
			case CnlPackage.IMPLIES_EXPRESSION: return createImpliesExpression();
			case CnlPackage.OR_EXPRESSION: return createOrExpression();
			case CnlPackage.XOR_EXPRESSION: return createXorExpression();
			case CnlPackage.AND_EXPRESSION: return createAndExpression();
			case CnlPackage.IFANDONLYIF_EXPRESSION: return createIfandonlyifExpression();
			case CnlPackage.DATE_EXPRESSION: return createDateExpression();
			case CnlPackage.BEFORE_DATE_EXPRESSION: return createBeforeDateExpression();
			case CnlPackage.AFTER_DATE_EXPRESSION: return createAfterDateExpression();
			case CnlPackage.ONORBEFORE_DATE_EXPRESSION: return createOnorbeforeDateExpression();
			case CnlPackage.ONORAFTER_DATE_EXPRESSION: return createOnorafterDateExpression();
			case CnlPackage.FEATURE_VALUE: return createFeatureValue();
			case CnlPackage.PRIMITIVE_TYPE_EXPRESSION: return createPrimitiveTypeExpression();
			case CnlPackage.ENUM_TYPE_EXPRESSION: return createEnumTypeExpression();
			case CnlPackage.NUMERIC_AGGREGATION: return createNumericAggregation();
			case CnlPackage.NUMERIC_SUMMATION: return createNumericSummation();
			case CnlPackage.NUMERIC_AVERAGE: return createNumericAverage();
			case CnlPackage.NUMERIC_MAXIMUM: return createNumericMaximum();
			case CnlPackage.NUMERIC_MINIMUM: return createNumericMinimum();
			case CnlPackage.VALUE_CONTAINMENT: return createValueContainment();
			case CnlPackage.UNIQUENESS_CHECK: return createUniquenessCheck();
			case CnlPackage.STRING_VALUE: return createStringValue();
			case CnlPackage.ENUM_VALUE: return createEnumValue();
			case CnlPackage.BOOLEAN_VALUE: return createBooleanValue();
			case CnlPackage.INTEGER_VALUE: return createIntegerValue();
			case CnlPackage.DECIMAL_VALUE: return createDecimalValue();
			case CnlPackage.DATE_VALUE: return createDateValue();
			case CnlPackage.EMPTY_VALUE: return createEmptyValue();
			case CnlPackage.EXISTANCE_VALUE: return createExistanceValue();
			case CnlPackage.ENUMERATIONS: return createEnumerations();
			case CnlPackage.TYPES: return createTypes();
			case CnlPackage.ENUM: return createEnum();
			case CnlPackage.TYPE: return createType();
			case CnlPackage.FEATURE: return createFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CnlPackage.ARITHMETIC_OPERATIONS:
				return createArithmeticOperationsFromString(eDataType, initialValue);
			case CnlPackage.PRIMITIVE_TYPES:
				return createPrimitiveTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CnlPackage.ARITHMETIC_OPERATIONS:
				return convertArithmeticOperationsToString(eDataType, instanceValue);
			case CnlPackage.PRIMITIVE_TYPES:
				return convertPrimitiveTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstrainedNaturalLanguageRules createConstrainedNaturalLanguageRules() {
		ConstrainedNaturalLanguageRulesImpl constrainedNaturalLanguageRules = new ConstrainedNaturalLanguageRulesImpl();
		return constrainedNaturalLanguageRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationRules createValidationRules() {
		ValidationRulesImpl validationRules = new ValidationRulesImpl();
		return validationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopedRules createScopedRules() {
		ScopedRulesImpl scopedRules = new ScopedRulesImpl();
		return scopedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchScopedRule createMatchScopedRule() {
		MatchScopedRuleImpl matchScopedRule = new MatchScopedRuleImpl();
		return matchScopedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchingRule createMatchingRule() {
		MatchingRuleImpl matchingRule = new MatchingRuleImpl();
		return matchingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementScope createElementScope() {
		ElementScopeImpl elementScope = new ElementScopeImpl();
		return elementScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CNLRule createCNLRule() {
		CNLRuleImpl cnlRule = new CNLRuleImpl();
		return cnlRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPLRule createGPLRule() {
		GPLRuleImpl gplRule = new GPLRuleImpl();
		return gplRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOLExpressionRule createEOLExpressionRule() {
		EOLExpressionRuleImpl eolExpressionRule = new EOLExpressionRuleImpl();
		return eolExpressionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonExpression createComparisonExpression() {
		ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
		return comparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualityExpression createEqualityExpression() {
		EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
		return equalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegatedEqualityExpression createNegatedEqualityExpression() {
		NegatedEqualityExpressionImpl negatedEqualityExpression = new NegatedEqualityExpressionImpl();
		return negatedEqualityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThanExpression createGreaterThanExpression() {
		GreaterThanExpressionImpl greaterThanExpression = new GreaterThanExpressionImpl();
		return greaterThanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessThanExpression createLessThanExpression() {
		LessThanExpressionImpl lessThanExpression = new LessThanExpressionImpl();
		return lessThanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GTEExpression createGTEExpression() {
		GTEExpressionImpl gteExpression = new GTEExpressionImpl();
		return gteExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTEExpression createLTEExpression() {
		LTEExpressionImpl lteExpression = new LTEExpressionImpl();
		return lteExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpliesExpression createImpliesExpression() {
		ImpliesExpressionImpl impliesExpression = new ImpliesExpressionImpl();
		return impliesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XorExpression createXorExpression() {
		XorExpressionImpl xorExpression = new XorExpressionImpl();
		return xorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfandonlyifExpression createIfandonlyifExpression() {
		IfandonlyifExpressionImpl ifandonlyifExpression = new IfandonlyifExpressionImpl();
		return ifandonlyifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateExpression createDateExpression() {
		DateExpressionImpl dateExpression = new DateExpressionImpl();
		return dateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeforeDateExpression createBeforeDateExpression() {
		BeforeDateExpressionImpl beforeDateExpression = new BeforeDateExpressionImpl();
		return beforeDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AfterDateExpression createAfterDateExpression() {
		AfterDateExpressionImpl afterDateExpression = new AfterDateExpressionImpl();
		return afterDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnorbeforeDateExpression createOnorbeforeDateExpression() {
		OnorbeforeDateExpressionImpl onorbeforeDateExpression = new OnorbeforeDateExpressionImpl();
		return onorbeforeDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnorafterDateExpression createOnorafterDateExpression() {
		OnorafterDateExpressionImpl onorafterDateExpression = new OnorafterDateExpressionImpl();
		return onorafterDateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValue createFeatureValue() {
		FeatureValueImpl featureValue = new FeatureValueImpl();
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeExpression createPrimitiveTypeExpression() {
		PrimitiveTypeExpressionImpl primitiveTypeExpression = new PrimitiveTypeExpressionImpl();
		return primitiveTypeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumTypeExpression createEnumTypeExpression() {
		EnumTypeExpressionImpl enumTypeExpression = new EnumTypeExpressionImpl();
		return enumTypeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericAggregation createNumericAggregation() {
		NumericAggregationImpl numericAggregation = new NumericAggregationImpl();
		return numericAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericSummation createNumericSummation() {
		NumericSummationImpl numericSummation = new NumericSummationImpl();
		return numericSummation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericAverage createNumericAverage() {
		NumericAverageImpl numericAverage = new NumericAverageImpl();
		return numericAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericMaximum createNumericMaximum() {
		NumericMaximumImpl numericMaximum = new NumericMaximumImpl();
		return numericMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericMinimum createNumericMinimum() {
		NumericMinimumImpl numericMinimum = new NumericMinimumImpl();
		return numericMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueContainment createValueContainment() {
		ValueContainmentImpl valueContainment = new ValueContainmentImpl();
		return valueContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniquenessCheck createUniquenessCheck() {
		UniquenessCheckImpl uniquenessCheck = new UniquenessCheckImpl();
		return uniquenessCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalValue createDecimalValue() {
		DecimalValueImpl decimalValue = new DecimalValueImpl();
		return decimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateValue createDateValue() {
		DateValueImpl dateValue = new DateValueImpl();
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyValue createEmptyValue() {
		EmptyValueImpl emptyValue = new EmptyValueImpl();
		return emptyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistanceValue createExistanceValue() {
		ExistanceValueImpl existanceValue = new ExistanceValueImpl();
		return existanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerations createEnumerations() {
		EnumerationsImpl enumerations = new EnumerationsImpl();
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public cnl.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperations createArithmeticOperationsFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperations result = ArithmeticOperations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes createPrimitiveTypesFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypes result = PrimitiveTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnlPackage getCnlPackage() {
		return (CnlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CnlPackage getPackage() {
		return CnlPackage.eINSTANCE;
	}

} //CnlFactoryImpl
