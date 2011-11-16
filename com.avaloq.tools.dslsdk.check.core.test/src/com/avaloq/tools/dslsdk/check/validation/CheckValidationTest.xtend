package com.avaloq.tools.dslsdk.check.validation

import com.avaloq.tools.dslsdk.check.CheckUiInjectorProvider
import com.avaloq.tools.dslsdk.check.check.CheckCatalog
import com.avaloq.tools.dslsdk.check.core.test.AbstractCheckTestCase
import com.avaloq.tools.dslsdk.check.core.test.util.CheckModelUtil
import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage$Literals
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import com.avaloq.tools.dslsdk.check.validation.IssueCodes
import com.avaloq.tools.dslsdk.check.check.CheckPackage

/*
 * Tests for various check validations as implemented in the validation classes
 * <ul>
 * <li>com.avaloq.tools.dslsdk.check.validation.CheckJavaValidator
 * <li>com.avaloq.tools.dslsdk.check.validation.ClasspathBasedChecks
 * </ul>
 */
@InjectWith(typeof(CheckUiInjectorProvider))
@RunWith(typeof(XtextRunner))
class CheckValidationTest extends AbstractCheckTestCase {

  @Inject
  ValidationTestHelper helper

  @Inject
  ParseHelper<CheckCatalog> parser

  @Inject
  CheckModelUtil modelUtil

  /* Tests checkReturnExpressions(XReturnExpression) */
  @Test
  def void testReturnExpressions() {
    val model = parser.parse(modelUtil.modelWithGrammar + "def SomeDef for X { return null;")
    helper.assertError(model, XbasePackage$Literals::XRETURN_EXPRESSION, IssueCodes::RETURN_IN_IMPL)
  }

  /* Tests checkIssuedCheck(XIssueExpression) */
  @Test
  def void testIssuedCheck() {
    val model = parser.parse(modelUtil.modelWithGrammar + "def SomeDef for X { issue on")
    helper.assertError(model, CheckPackage$Literals::XISSUE_EXPRESSION, IssueCodes::ISSUED_CHECK)
  }

  /* Tests checkImplicitIssuedCheck(XIssueExpression) */
  @Test
  def void testImplicitIssuedCheck() {
    val model = parser.parse(modelUtil.modelWithCheck("A") + "for X { issue A")
    helper.assertWarning(model, CheckPackage$Literals::XISSUE_EXPRESSION, IssueCodes::IMPLICIT_ISSUED_CHECK)
    val model2 = parser.parse(modelUtil.modelWithCheck("A") + "for X { issue A")
    helper.assertWarning(model, CheckPackage$Literals::XISSUE_EXPRESSION, IssueCodes::IMPLICIT_ISSUED_CHECK)
  }

  /* Tests checkIncludedCatalogNotSupported(CheckCatalog) */
  @Test
  def void testIncludedCatalogNotSupported() {
    val model = parser.parse("package p catalog c for grammar g with SomeCat")
    helper.assertError(model, CheckPackage$Literals::CHECK_CATALOG, IssueCodes::UNSUPPORTED_INCLUDED_CATALOG)
  }

  /* Tests checkFileNamingConventions(CheckCatalog) */
  @Test
  def void testFileNamingConventions() {
    val model = parser.parse("package p catalog c  ")
    helper.assertError(model, CheckPackage$Literals::CHECK_CATALOG, IssueCodes::WRONG_FILE)
    helper.assertError(model, CheckPackage$Literals::CHECK_CATALOG, IssueCodes::WRONG_PACKAGE)
  }

  /* Tests checkPackageName(CheckCatalog). All given package names are valid. */
  @Test
  def void testPackageNameIsValid() {
    helper.assertNoError(parser.parse("package p "), IssueCodes::INVALID_PACKAGE_NAME)
    helper.assertNoError(parser.parse("package p.q.r "), IssueCodes::INVALID_PACKAGE_NAME)
  }

  /* Tests checkPackageName(CheckCatalog). All given package names are invalid. */
  @Test
  def void testPackageNameIsInvalid() {
    // Cannot check package names such as '.p' or 'p..q' because they will cause a parsing error preventing the Java
    // check from being executed
    helper.assertError(parser.parse("package P.p.P. "), CheckPackage$Literals::CHECK_CATALOG, IssueCodes::INVALID_PACKAGE_NAME)
    helper.assertError(parser.parse("package P.package.P. "), CheckPackage$Literals::CHECK_CATALOG, IssueCodes::INVALID_PACKAGE_NAME)
  }

  /* Tests checkContextTypeIsUnique(Check) */
  @Test
  @Ignore("Tests do not work because of scoping issues at run-time")
  def void testContextTypeIsUnique() {
    // should fail
    var contexts = Lists::newArrayList("for C c {issue}", "for C d {issue}")
    var model = parser.parse(modelUtil.modelWithContexts(contexts))
    helper.assertError(model, CheckPackage$Literals::CONTEXT, IssueCodes::CONTEXT_TYPES_NOT_UNIQUE)

    // should fail
    contexts = Lists::newArrayList("for C c {issue}", "for D d {issue}", "for C e {issue}")
    model = parser.parse(modelUtil.modelWithContexts(contexts))
    helper.assertError(model, CheckPackage$Literals::CONTEXT, IssueCodes::CONTEXT_TYPES_NOT_UNIQUE)

    // should not fail
    contexts = Lists::newArrayList("for org.eclipse.emf.ecore.EObject e {issue}", "for E e {issue}")
    model = parser.parse(modelUtil.modelWithContexts(contexts))
    helper.assertNoError(model, IssueCodes::CONTEXT_TYPES_NOT_UNIQUE)
  }

  /* Tests checkCircularDependency(CheckCatalog) */
  @Test
  def void testCatalogMayNotIncludeItself() {
    val model = parser.parse("package p catalog c for grammar g with c ")
    helper.assertError(model, CheckPackage$Literals::CHECK_CATALOG, IssueCodes::INCLUDED_CATALOGS_WITH_CIRCULAR_DEPENDENCIES)
  }

  /* Tests checkGuardsFirstInBlockExpression(Context) */
  @Test
  def void testGuardsPrecedeIssues() {
    // basic case: should not fail
    var model = parser.parse(modelUtil.modelWithContext + "guard(false) issue")
    helper.assertNoError(model, IssueCodes::GUARDS_COME_FIRST)

    // multiple guards: should not fail
    model = parser.parse(modelUtil.modelWithContext + "guard(false) guard(true) if(false) {null} issue")
    helper.assertNoError(model, IssueCodes::GUARDS_COME_FIRST)

    // should not fail
    model = parser.parse(modelUtil.modelWithContext + "guard(false) val x = 1 var y = 2 issue")
    helper.assertNoError(model, IssueCodes::GUARDS_COME_FIRST)

    // guard not first: should fail
    model = parser.parse(modelUtil.modelWithContext + "issue guard(false)")
    helper.assertError(model, CheckPackage$Literals::XGUARD_EXPRESSION, IssueCodes::GUARDS_COME_FIRST)

    // should fail
    model = parser.parse(modelUtil.modelWithContext + "guard(true) issue guard(false)")
    helper.assertError(model, CheckPackage$Literals::XGUARD_EXPRESSION, IssueCodes::GUARDS_COME_FIRST)

    // should fail
    model = parser.parse(modelUtil.modelWithContext + "guard(true) if(true){issue} guard(true)")
    helper.assertError(model, CheckPackage$Literals::XGUARD_EXPRESSION, IssueCodes::GUARDS_COME_FIRST)
  }

  /* Tests org.eclipse.xtext.xbase.validation.EarlyExitValidator.checkDeadCode(XBlockExpression) */
  @Test
  def void testDeadCode() {
    // should not fail
    var model = parser.parse(modelUtil.modelWithContext + "issue")
    helper.assertNoError(model, IssueCodes::DEAD_CODE)

    // should fail
    model = parser.parse(modelUtil.modelWithContext + "if(false) {return} else {return} issue")
    helper.assertError(model, XbasePackage$Literals::XEXPRESSION, org::eclipse::xtext::xbase::validation::IssueCodes::UNREACHABLE_CODE)
  }



  /* Tests checkIssueExpressionExists(Context) */
  @Test
  def void testIssueExpressionExists() {
    var model = parser.parse(modelUtil.modelWithContext + "guard(false)")
    helper.assertError(model, CheckPackage$Literals::CONTEXT, IssueCodes::MISSING_ISSUE_EXPRESSION)

    // should not fail
    model = parser.parse(modelUtil.modelWithContext + "if (false) { null } else { issue")
    helper.assertNoError(model, IssueCodes::MISSING_ISSUE_EXPRESSION)

    // should fail
    model = parser.parse(modelUtil.modelWithContext + "if (false) { null } else { null } ")
    helper.assertError(model, CheckPackage$Literals::CONTEXT, IssueCodes::MISSING_ISSUE_EXPRESSION)

    // should not fail
    model = parser.parse(modelUtil.modelWithContext + "if (false) { null } else { null } issue")
    helper.assertNoError(model, IssueCodes::MISSING_ISSUE_EXPRESSION)

    // should not fail
    model = parser.parse(modelUtil.modelWithContext + "if (false) { issue ")
    helper.assertNoError(model, IssueCodes::MISSING_ISSUE_EXPRESSION)
  }

  /* Checks that Check duplicates are found. */
  @Test
  def void testCheckNamesAreUnique() {
    var contents = modelUtil.modelWithCategory + modelUtil.emptyCheck("One") + modelUtil.emptyCheck("One")
    var model = parser.parse(contents)
    helper.assertError(model, CheckPackage$Literals::CHECK, IssueCodes::DUPLICATE_CHECK)
  }
  
  /* Tests checkSeverityRangeOrder(Check) */
  @Test
  def void testSeverityRangeOrder_1() {
    helper.assertNoError(parser.parse(modelUtil.modelWithSeverityRange('warning', 'error')), 
      IssueCodes::ILLEGAL_SEVERITY_RANGE_ORDER
    )
  }
  
  /* Tests checkSeverityRangeOrder(Check) */
  @Test
  def void testSeverityRangeOrder_2() {
    helper.assertNoError(parser.parse(modelUtil.modelWithSeverityRange('ignore', 'warning')),
      IssueCodes::ILLEGAL_SEVERITY_RANGE_ORDER
    )
  }
  
  /* Tests checkSeverityRangeOrder(Check) */
  @Test
  def void testSeverityRangeOrder_3() {
    helper.assertNoError(parser.parse(modelUtil.modelWithSeverityRange('info', 'info')),
      IssueCodes::ILLEGAL_SEVERITY_RANGE_ORDER
    )
  }
  
  /* Tests checkSeverityRangeOrder(Check) */
  @Test
  def void testSeverityRangeOrder_4() {
    helper.assertError(parser.parse(modelUtil.modelWithSeverityRange('info', 'ignore')),
      CheckPackage$Literals::SEVERITY_RANGE, IssueCodes::ILLEGAL_SEVERITY_RANGE_ORDER
    )
  }
  
  /* Tests checkSeverityRangeOrder(Check) */
  @Test
  def void testSeverityRangeOrder_5() {
    helper.assertError(parser.parse(modelUtil.modelWithSeverityRange('error', 'info')),
      CheckPackage$Literals::SEVERITY_RANGE, IssueCodes::ILLEGAL_SEVERITY_RANGE_ORDER
    )
  }
  
  /* Tests checkDefaultSeverityInRange(Check) */
  @Test
  def void testDefaultSeverityInRange_1() {
    helper.assertError(parser.parse(modelUtil.modelWithSeverityRange('warning', 'error', 'info')),
      CheckPackage$Literals::CHECK, IssueCodes::DEFAULT_SEVERITY_NOT_IN_RANGE
    )
  }
  
  /* Tests checkDefaultSeverityInRange(Check) */
  @Test
  def void testDefaultSeverityInRange_2() {
    helper.assertError(parser.parse(modelUtil.modelWithSeverityRange('error', 'info', 'ignore')),
      CheckPackage$Literals::CHECK, IssueCodes::DEFAULT_SEVERITY_NOT_IN_RANGE
    )
  }
  
  /* Tests checkDefaultSeverityInRange(Check) */
  @Test
  def void testDefaultSeverityInRange_3() {
    helper.assertError(parser.parse(modelUtil.modelWithSeverityRange('error', 'error', 'ignore')),
      CheckPackage$Literals::CHECK, IssueCodes::DEFAULT_SEVERITY_NOT_IN_RANGE
    )
  }
  
  /* Tests checkDefaultSeverityInRange(Check) */
  @Test
  def void testDefaultSeverityInRange_4() {
    helper.assertNoError(parser.parse(modelUtil.modelWithSeverityRange('error', 'error', 'error')),
      IssueCodes::DEFAULT_SEVERITY_NOT_IN_RANGE
    )
  }
  
  /* Tests checkDefaultSeverityInRange(Check) */
  @Test
  def void testDefaultSeverityInRange_5() {
    helper.assertNoError(parser.parse(modelUtil.modelWithSeverityRange('info', 'error', 'warning')),
      IssueCodes::DEFAULT_SEVERITY_NOT_IN_RANGE
    )
  }

}