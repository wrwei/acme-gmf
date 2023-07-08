/**
 */
package cnl.util;

import cnl.AfterDateExpression;
import cnl.AndExpression;
import cnl.ArithmeticExpression;
import cnl.BaseExpression;
import cnl.BeforeDateExpression;
import cnl.BooleanValue;
import cnl.CNLRule;
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
import cnl.Expression;
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
import cnl.MetaData;
import cnl.MetaValue;
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
import cnl.Rule;
import cnl.ScopedRules;
import cnl.StringValue;
import cnl.Type;
import cnl.TypeExpression;
import cnl.Types;
import cnl.UniquenessCheck;
import cnl.ValidationRules;
import cnl.ValueContainment;
import cnl.XorExpression;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cnl.CnlPackage
 * @generated
 */
public class CnlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CnlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CnlSwitch() {
		if (modelPackage == null) {
			modelPackage = CnlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES: {
				ConstrainedNaturalLanguageRules constrainedNaturalLanguageRules = (ConstrainedNaturalLanguageRules)theEObject;
				T result = caseConstrainedNaturalLanguageRules(constrainedNaturalLanguageRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.VALIDATION_RULES: {
				ValidationRules validationRules = (ValidationRules)theEObject;
				T result = caseValidationRules(validationRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.SCOPED_RULES: {
				ScopedRules scopedRules = (ScopedRules)theEObject;
				T result = caseScopedRules(scopedRules);
				if (result == null) result = caseValidationRules(scopedRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.MATCH_SCOPED_RULE: {
				MatchScopedRule matchScopedRule = (MatchScopedRule)theEObject;
				T result = caseMatchScopedRule(matchScopedRule);
				if (result == null) result = caseValidationRules(matchScopedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.MATCHING_RULE: {
				MatchingRule matchingRule = (MatchingRule)theEObject;
				T result = caseMatchingRule(matchingRule);
				if (result == null) result = caseCNLRule(matchingRule);
				if (result == null) result = caseRule(matchingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ELEMENT_SCOPE: {
				ElementScope elementScope = (ElementScope)theEObject;
				T result = caseElementScope(elementScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.CNL_RULE: {
				CNLRule cnlRule = (CNLRule)theEObject;
				T result = caseCNLRule(cnlRule);
				if (result == null) result = caseRule(cnlRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.GPL_RULE: {
				GPLRule gplRule = (GPLRule)theEObject;
				T result = caseGPLRule(gplRule);
				if (result == null) result = caseRule(gplRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.EOL_EXPRESSION_RULE: {
				EOLExpressionRule eolExpressionRule = (EOLExpressionRule)theEObject;
				T result = caseEOLExpressionRule(eolExpressionRule);
				if (result == null) result = caseGPLRule(eolExpressionRule);
				if (result == null) result = caseRule(eolExpressionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.COMPARISON_EXPRESSION: {
				ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
				T result = caseComparisonExpression(comparisonExpression);
				if (result == null) result = caseExpression(comparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.EQUALITY_EXPRESSION: {
				EqualityExpression equalityExpression = (EqualityExpression)theEObject;
				T result = caseEqualityExpression(equalityExpression);
				if (result == null) result = caseComparisonExpression(equalityExpression);
				if (result == null) result = caseExpression(equalityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NEGATED_EQUALITY_EXPRESSION: {
				NegatedEqualityExpression negatedEqualityExpression = (NegatedEqualityExpression)theEObject;
				T result = caseNegatedEqualityExpression(negatedEqualityExpression);
				if (result == null) result = caseComparisonExpression(negatedEqualityExpression);
				if (result == null) result = caseExpression(negatedEqualityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.GREATER_THAN_EXPRESSION: {
				GreaterThanExpression greaterThanExpression = (GreaterThanExpression)theEObject;
				T result = caseGreaterThanExpression(greaterThanExpression);
				if (result == null) result = caseComparisonExpression(greaterThanExpression);
				if (result == null) result = caseExpression(greaterThanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.LESS_THAN_EXPRESSION: {
				LessThanExpression lessThanExpression = (LessThanExpression)theEObject;
				T result = caseLessThanExpression(lessThanExpression);
				if (result == null) result = caseComparisonExpression(lessThanExpression);
				if (result == null) result = caseExpression(lessThanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.GTE_EXPRESSION: {
				GTEExpression gteExpression = (GTEExpression)theEObject;
				T result = caseGTEExpression(gteExpression);
				if (result == null) result = caseComparisonExpression(gteExpression);
				if (result == null) result = caseExpression(gteExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.LTE_EXPRESSION: {
				LTEExpression lteExpression = (LTEExpression)theEObject;
				T result = caseLTEExpression(lteExpression);
				if (result == null) result = caseComparisonExpression(lteExpression);
				if (result == null) result = caseExpression(lteExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.IMPLIES_EXPRESSION: {
				ImpliesExpression impliesExpression = (ImpliesExpression)theEObject;
				T result = caseImpliesExpression(impliesExpression);
				if (result == null) result = caseLogicalExpression(impliesExpression);
				if (result == null) result = caseExpression(impliesExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.OR_EXPRESSION: {
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = caseLogicalExpression(orExpression);
				if (result == null) result = caseExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.XOR_EXPRESSION: {
				XorExpression xorExpression = (XorExpression)theEObject;
				T result = caseXorExpression(xorExpression);
				if (result == null) result = caseLogicalExpression(xorExpression);
				if (result == null) result = caseExpression(xorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseLogicalExpression(andExpression);
				if (result == null) result = caseExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.IFANDONLYIF_EXPRESSION: {
				IfandonlyifExpression ifandonlyifExpression = (IfandonlyifExpression)theEObject;
				T result = caseIfandonlyifExpression(ifandonlyifExpression);
				if (result == null) result = caseLogicalExpression(ifandonlyifExpression);
				if (result == null) result = caseExpression(ifandonlyifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.BASE_EXPRESSION: {
				BaseExpression baseExpression = (BaseExpression)theEObject;
				T result = caseBaseExpression(baseExpression);
				if (result == null) result = caseExpression(baseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.DATE_EXPRESSION: {
				DateExpression dateExpression = (DateExpression)theEObject;
				T result = caseDateExpression(dateExpression);
				if (result == null) result = caseExpression(dateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.BEFORE_DATE_EXPRESSION: {
				BeforeDateExpression beforeDateExpression = (BeforeDateExpression)theEObject;
				T result = caseBeforeDateExpression(beforeDateExpression);
				if (result == null) result = caseDateExpression(beforeDateExpression);
				if (result == null) result = caseExpression(beforeDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.AFTER_DATE_EXPRESSION: {
				AfterDateExpression afterDateExpression = (AfterDateExpression)theEObject;
				T result = caseAfterDateExpression(afterDateExpression);
				if (result == null) result = caseDateExpression(afterDateExpression);
				if (result == null) result = caseExpression(afterDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ONORBEFORE_DATE_EXPRESSION: {
				OnorbeforeDateExpression onorbeforeDateExpression = (OnorbeforeDateExpression)theEObject;
				T result = caseOnorbeforeDateExpression(onorbeforeDateExpression);
				if (result == null) result = caseDateExpression(onorbeforeDateExpression);
				if (result == null) result = caseExpression(onorbeforeDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ONORAFTER_DATE_EXPRESSION: {
				OnorafterDateExpression onorafterDateExpression = (OnorafterDateExpression)theEObject;
				T result = caseOnorafterDateExpression(onorafterDateExpression);
				if (result == null) result = caseDateExpression(onorafterDateExpression);
				if (result == null) result = caseExpression(onorafterDateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = caseBaseExpression(featureValue);
				if (result == null) result = caseExpression(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.TYPE_EXPRESSION: {
				TypeExpression typeExpression = (TypeExpression)theEObject;
				T result = caseTypeExpression(typeExpression);
				if (result == null) result = caseBaseExpression(typeExpression);
				if (result == null) result = caseExpression(typeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.PRIMITIVE_TYPE_EXPRESSION: {
				PrimitiveTypeExpression primitiveTypeExpression = (PrimitiveTypeExpression)theEObject;
				T result = casePrimitiveTypeExpression(primitiveTypeExpression);
				if (result == null) result = caseTypeExpression(primitiveTypeExpression);
				if (result == null) result = caseBaseExpression(primitiveTypeExpression);
				if (result == null) result = caseExpression(primitiveTypeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ENUM_TYPE_EXPRESSION: {
				EnumTypeExpression enumTypeExpression = (EnumTypeExpression)theEObject;
				T result = caseEnumTypeExpression(enumTypeExpression);
				if (result == null) result = caseTypeExpression(enumTypeExpression);
				if (result == null) result = caseBaseExpression(enumTypeExpression);
				if (result == null) result = caseExpression(enumTypeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NUMERIC_AGGREGATION: {
				NumericAggregation numericAggregation = (NumericAggregation)theEObject;
				T result = caseNumericAggregation(numericAggregation);
				if (result == null) result = caseBaseExpression(numericAggregation);
				if (result == null) result = caseExpression(numericAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NUMERIC_SUMMATION: {
				NumericSummation numericSummation = (NumericSummation)theEObject;
				T result = caseNumericSummation(numericSummation);
				if (result == null) result = caseNumericAggregation(numericSummation);
				if (result == null) result = caseBaseExpression(numericSummation);
				if (result == null) result = caseExpression(numericSummation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NUMERIC_AVERAGE: {
				NumericAverage numericAverage = (NumericAverage)theEObject;
				T result = caseNumericAverage(numericAverage);
				if (result == null) result = caseNumericAggregation(numericAverage);
				if (result == null) result = caseBaseExpression(numericAverage);
				if (result == null) result = caseExpression(numericAverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NUMERIC_MAXIMUM: {
				NumericMaximum numericMaximum = (NumericMaximum)theEObject;
				T result = caseNumericMaximum(numericMaximum);
				if (result == null) result = caseNumericAggregation(numericMaximum);
				if (result == null) result = caseBaseExpression(numericMaximum);
				if (result == null) result = caseExpression(numericMaximum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.NUMERIC_MINIMUM: {
				NumericMinimum numericMinimum = (NumericMinimum)theEObject;
				T result = caseNumericMinimum(numericMinimum);
				if (result == null) result = caseNumericAggregation(numericMinimum);
				if (result == null) result = caseBaseExpression(numericMinimum);
				if (result == null) result = caseExpression(numericMinimum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.VALUE_CONTAINMENT: {
				ValueContainment valueContainment = (ValueContainment)theEObject;
				T result = caseValueContainment(valueContainment);
				if (result == null) result = caseBaseExpression(valueContainment);
				if (result == null) result = caseExpression(valueContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.UNIQUENESS_CHECK: {
				UniquenessCheck uniquenessCheck = (UniquenessCheck)theEObject;
				T result = caseUniquenessCheck(uniquenessCheck);
				if (result == null) result = caseBaseExpression(uniquenessCheck);
				if (result == null) result = caseExpression(uniquenessCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseBaseExpression(stringValue);
				if (result == null) result = caseExpression(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseBaseExpression(enumValue);
				if (result == null) result = caseExpression(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseBaseExpression(booleanValue);
				if (result == null) result = caseExpression(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseBaseExpression(integerValue);
				if (result == null) result = caseExpression(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.DECIMAL_VALUE: {
				DecimalValue decimalValue = (DecimalValue)theEObject;
				T result = caseDecimalValue(decimalValue);
				if (result == null) result = caseBaseExpression(decimalValue);
				if (result == null) result = caseExpression(decimalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.DATE_VALUE: {
				DateValue dateValue = (DateValue)theEObject;
				T result = caseDateValue(dateValue);
				if (result == null) result = caseBaseExpression(dateValue);
				if (result == null) result = caseExpression(dateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.EMPTY_VALUE: {
				EmptyValue emptyValue = (EmptyValue)theEObject;
				T result = caseEmptyValue(emptyValue);
				if (result == null) result = caseBaseExpression(emptyValue);
				if (result == null) result = caseExpression(emptyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.EXISTANCE_VALUE: {
				ExistanceValue existanceValue = (ExistanceValue)theEObject;
				T result = caseExistanceValue(existanceValue);
				if (result == null) result = caseBaseExpression(existanceValue);
				if (result == null) result = caseExpression(existanceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.META_DATA: {
				MetaData metaData = (MetaData)theEObject;
				T result = caseMetaData(metaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.META_VALUE: {
				MetaValue metaValue = (MetaValue)theEObject;
				T result = caseMetaValue(metaValue);
				if (result == null) result = caseBaseExpression(metaValue);
				if (result == null) result = caseExpression(metaValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ENUMERATIONS: {
				Enumerations enumerations = (Enumerations)theEObject;
				T result = caseEnumerations(enumerations);
				if (result == null) result = caseMetaData(enumerations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.TYPES: {
				Types types = (Types)theEObject;
				T result = caseTypes(types);
				if (result == null) result = caseMetaData(types);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.ENUM: {
				cnl.Enum enum_ = (cnl.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseMetaValue(enum_);
				if (result == null) result = caseBaseExpression(enum_);
				if (result == null) result = caseExpression(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseMetaValue(type);
				if (result == null) result = caseBaseExpression(type);
				if (result == null) result = caseExpression(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CnlPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseMetaValue(feature);
				if (result == null) result = caseBaseExpression(feature);
				if (result == null) result = caseExpression(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Natural Language Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Natural Language Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedNaturalLanguageRules(ConstrainedNaturalLanguageRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationRules(ValidationRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedRules(ScopedRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Scoped Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Scoped Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchScopedRule(MatchScopedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingRule(MatchingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementScope(ElementScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CNL Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CNL Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCNLRule(CNLRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPL Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPL Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPLRule(GPLRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOL Expression Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOL Expression Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOLExpressionRule(EOLExpressionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonExpression(ComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityExpression(EqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedEqualityExpression(NegatedEqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanExpression(GreaterThanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanExpression(LessThanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTE Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTEExpression(GTEExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTE Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTEExpression(LTEExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesExpression(ImpliesExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXorExpression(XorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ifandonlyif Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ifandonlyif Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfandonlyifExpression(IfandonlyifExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseExpression(BaseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateExpression(DateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Before Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Before Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeforeDateExpression(BeforeDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterDateExpression(AfterDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onorbefore Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onorbefore Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnorbeforeDateExpression(OnorbeforeDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onorafter Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onorafter Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnorafterDateExpression(OnorafterDateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeExpression(TypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeExpression(PrimitiveTypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTypeExpression(EnumTypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericAggregation(NumericAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Summation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Summation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericSummation(NumericSummation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericAverage(NumericAverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericMaximum(NumericMaximum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericMinimum(NumericMinimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueContainment(ValueContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueness Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueness Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniquenessCheck(UniquenessCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalValue(DecimalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValue(DateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyValue(EmptyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistanceValue(ExistanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaData(MetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaValue(MetaValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerations(Enumerations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(cnl.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CnlSwitch
