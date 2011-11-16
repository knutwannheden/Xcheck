package com.avaloq.tools.dslsdk.check.validation;

import com.avaloq.tools.dslsdk.check.CheckUiInjectorProvider;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.core.test.AbstractCheckTestCase;
import com.avaloq.tools.dslsdk.check.core.test.util.CheckModelUtil;
import com.avaloq.tools.dslsdk.check.validation.IssueCodes;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage.Literals;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Tests for various check validations as implemented in the validation classes
 * <ul>
 * <li>com.avaloq.tools.dslsdk.check.validation.CheckJavaValidator
 * <li>com.avaloq.tools.dslsdk.check.validation.ClasspathBasedChecks
 * </ul>
 */
@SuppressWarnings("all")
@InjectWith(CheckUiInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CheckValidationTest extends AbstractCheckTestCase {
  @Inject
  private ValidationTestHelper helper;
  
  @Inject
  private ParseHelper<CheckCatalog> parser;
  
  @Inject
  private CheckModelUtil modelUtil;
  
  /**
   * Tests checkReturnExpressions(XReturnExpression)
   */
  @Test
  public void testReturnExpressions() throws Exception {
      String _modelWithGrammar = this.modelUtil.modelWithGrammar();
      String _operator_plus = StringExtensions.operator_plus(_modelWithGrammar, "def SomeDef for X { return null;");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      final CheckCatalog model = _parse;
      this.helper.assertError(model, Literals.XRETURN_EXPRESSION, IssueCodes.RETURN_IN_IMPL);
  }
  
  /**
   * Tests checkIssuedCheck(XIssueExpression)
   */
  @Test
  public void testIssuedCheck() throws Exception {
      String _modelWithGrammar = this.modelUtil.modelWithGrammar();
      String _operator_plus = StringExtensions.operator_plus(_modelWithGrammar, "def SomeDef for X { issue on");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      final CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XISSUE_EXPRESSION, IssueCodes.ISSUED_CHECK);
  }
  
  /**
   * Tests checkImplicitIssuedCheck(XIssueExpression)
   */
  @Test
  public void testImplicitIssuedCheck() throws Exception {
      String _modelWithCheck = this.modelUtil.modelWithCheck("A");
      String _operator_plus = StringExtensions.operator_plus(_modelWithCheck, "for X { issue A");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      final CheckCatalog model = _parse;
      this.helper.assertWarning(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XISSUE_EXPRESSION, IssueCodes.IMPLICIT_ISSUED_CHECK);
      String _modelWithCheck_1 = this.modelUtil.modelWithCheck("A");
      String _operator_plus_1 = StringExtensions.operator_plus(_modelWithCheck_1, "for X { issue A");
      CheckCatalog _parse_1 = this.parser.parse(_operator_plus_1);
      final CheckCatalog model2 = _parse_1;
      this.helper.assertWarning(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XISSUE_EXPRESSION, IssueCodes.IMPLICIT_ISSUED_CHECK);
  }
  
  /**
   * Tests checkIncludedCatalogNotSupported(CheckCatalog)
   */
  @Test
  public void testIncludedCatalogNotSupported() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p catalog c for grammar g with SomeCat");
      final CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.UNSUPPORTED_INCLUDED_CATALOG);
  }
  
  /**
   * Tests checkFileNamingConventions(CheckCatalog)
   */
  @Test
  public void testFileNamingConventions() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p catalog c  ");
      final CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.WRONG_FILE);
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.WRONG_PACKAGE);
  }
  
  /**
   * Tests checkPackageName(CheckCatalog). All given package names are valid.
   */
  @Test
  public void testPackageNameIsValid() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p ");
      this.helper.assertNoError(_parse, IssueCodes.INVALID_PACKAGE_NAME);
      CheckCatalog _parse_1 = this.parser.parse("package p.q.r ");
      this.helper.assertNoError(_parse_1, IssueCodes.INVALID_PACKAGE_NAME);
  }
  
  /**
   * Tests checkPackageName(CheckCatalog). All given package names are invalid.
   */
  @Test
  public void testPackageNameIsInvalid() throws Exception {
      CheckCatalog _parse = this.parser.parse("package P.p.P. ");
      this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.INVALID_PACKAGE_NAME);
      CheckCatalog _parse_1 = this.parser.parse("package P.package.P. ");
      this.helper.assertError(_parse_1, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.INVALID_PACKAGE_NAME);
  }
  
  /**
   * Tests checkContextTypeIsUnique(Check)
   */
  @Test
  @Ignore("Tests do not work because of scoping issues at run-time")
  public void testContextTypeIsUnique() throws Exception {
      ArrayList<String> _newArrayList = Lists.<String>newArrayList("for C c {issue}", "for C d {issue}");
      ArrayList<String> contexts = _newArrayList;
      String _modelWithContexts = this.modelUtil.modelWithContexts(contexts);
      CheckCatalog _parse = this.parser.parse(_modelWithContexts);
      CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CONTEXT, IssueCodes.CONTEXT_TYPES_NOT_UNIQUE);
      ArrayList<String> _newArrayList_1 = Lists.<String>newArrayList("for C c {issue}", "for D d {issue}", "for C e {issue}");
      contexts = _newArrayList_1;
      String _modelWithContexts_1 = this.modelUtil.modelWithContexts(contexts);
      CheckCatalog _parse_1 = this.parser.parse(_modelWithContexts_1);
      model = _parse_1;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CONTEXT, IssueCodes.CONTEXT_TYPES_NOT_UNIQUE);
      ArrayList<String> _newArrayList_2 = Lists.<String>newArrayList("for org.eclipse.emf.ecore.EObject e {issue}", "for E e {issue}");
      contexts = _newArrayList_2;
      String _modelWithContexts_2 = this.modelUtil.modelWithContexts(contexts);
      CheckCatalog _parse_2 = this.parser.parse(_modelWithContexts_2);
      model = _parse_2;
      this.helper.assertNoError(model, IssueCodes.CONTEXT_TYPES_NOT_UNIQUE);
  }
  
  /**
   * Tests checkCircularDependency(CheckCatalog)
   */
  @Test
  public void testCatalogMayNotIncludeItself() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p catalog c for grammar g with c ");
      final CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK_CATALOG, IssueCodes.INCLUDED_CATALOGS_WITH_CIRCULAR_DEPENDENCIES);
  }
  
  /**
   * Tests checkGuardsFirstInBlockExpression(Context)
   */
  @Test
  public void testGuardsPrecedeIssues() throws Exception {
      String _modelWithContext = this.modelUtil.modelWithContext();
      String _operator_plus = StringExtensions.operator_plus(_modelWithContext, "guard(false) issue");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      CheckCatalog model = _parse;
      this.helper.assertNoError(model, IssueCodes.GUARDS_COME_FIRST);
      String _modelWithContext_1 = this.modelUtil.modelWithContext();
      String _operator_plus_1 = StringExtensions.operator_plus(_modelWithContext_1, "guard(false) guard(true) if(false) {null} issue");
      CheckCatalog _parse_1 = this.parser.parse(_operator_plus_1);
      model = _parse_1;
      this.helper.assertNoError(model, IssueCodes.GUARDS_COME_FIRST);
      String _modelWithContext_2 = this.modelUtil.modelWithContext();
      String _operator_plus_2 = StringExtensions.operator_plus(_modelWithContext_2, "guard(false) val x = 1 var y = 2 issue");
      CheckCatalog _parse_2 = this.parser.parse(_operator_plus_2);
      model = _parse_2;
      this.helper.assertNoError(model, IssueCodes.GUARDS_COME_FIRST);
      String _modelWithContext_3 = this.modelUtil.modelWithContext();
      String _operator_plus_3 = StringExtensions.operator_plus(_modelWithContext_3, "issue guard(false)");
      CheckCatalog _parse_3 = this.parser.parse(_operator_plus_3);
      model = _parse_3;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XGUARD_EXPRESSION, IssueCodes.GUARDS_COME_FIRST);
      String _modelWithContext_4 = this.modelUtil.modelWithContext();
      String _operator_plus_4 = StringExtensions.operator_plus(_modelWithContext_4, "guard(true) issue guard(false)");
      CheckCatalog _parse_4 = this.parser.parse(_operator_plus_4);
      model = _parse_4;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XGUARD_EXPRESSION, IssueCodes.GUARDS_COME_FIRST);
      String _modelWithContext_5 = this.modelUtil.modelWithContext();
      String _operator_plus_5 = StringExtensions.operator_plus(_modelWithContext_5, "guard(true) if(true){issue} guard(true)");
      CheckCatalog _parse_5 = this.parser.parse(_operator_plus_5);
      model = _parse_5;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.XGUARD_EXPRESSION, IssueCodes.GUARDS_COME_FIRST);
  }
  
  /**
   * Tests org.eclipse.xtext.xbase.validation.EarlyExitValidator.checkDeadCode(XBlockExpression)
   */
  @Test
  public void testDeadCode() throws Exception {
      String _modelWithContext = this.modelUtil.modelWithContext();
      String _operator_plus = StringExtensions.operator_plus(_modelWithContext, "issue");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      CheckCatalog model = _parse;
      this.helper.assertNoError(model, IssueCodes.DEAD_CODE);
      String _modelWithContext_1 = this.modelUtil.modelWithContext();
      String _operator_plus_1 = StringExtensions.operator_plus(_modelWithContext_1, "if(false) {return} else {return} issue");
      CheckCatalog _parse_1 = this.parser.parse(_operator_plus_1);
      model = _parse_1;
      this.helper.assertError(model, Literals.XEXPRESSION, org.eclipse.xtext.xbase.validation.IssueCodes.UNREACHABLE_CODE);
  }
  
  /**
   * Tests checkIssueExpressionExists(Context)
   */
  @Test
  public void testIssueExpressionExists() throws Exception {
      String _modelWithContext = this.modelUtil.modelWithContext();
      String _operator_plus = StringExtensions.operator_plus(_modelWithContext, "guard(false)");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CONTEXT, IssueCodes.MISSING_ISSUE_EXPRESSION);
      String _modelWithContext_1 = this.modelUtil.modelWithContext();
      String _operator_plus_1 = StringExtensions.operator_plus(_modelWithContext_1, "if (false) { null } else { issue");
      CheckCatalog _parse_1 = this.parser.parse(_operator_plus_1);
      model = _parse_1;
      this.helper.assertNoError(model, IssueCodes.MISSING_ISSUE_EXPRESSION);
      String _modelWithContext_2 = this.modelUtil.modelWithContext();
      String _operator_plus_2 = StringExtensions.operator_plus(_modelWithContext_2, "if (false) { null } else { null } ");
      CheckCatalog _parse_2 = this.parser.parse(_operator_plus_2);
      model = _parse_2;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CONTEXT, IssueCodes.MISSING_ISSUE_EXPRESSION);
      String _modelWithContext_3 = this.modelUtil.modelWithContext();
      String _operator_plus_3 = StringExtensions.operator_plus(_modelWithContext_3, "if (false) { null } else { null } issue");
      CheckCatalog _parse_3 = this.parser.parse(_operator_plus_3);
      model = _parse_3;
      this.helper.assertNoError(model, IssueCodes.MISSING_ISSUE_EXPRESSION);
      String _modelWithContext_4 = this.modelUtil.modelWithContext();
      String _operator_plus_4 = StringExtensions.operator_plus(_modelWithContext_4, "if (false) { issue ");
      CheckCatalog _parse_4 = this.parser.parse(_operator_plus_4);
      model = _parse_4;
      this.helper.assertNoError(model, IssueCodes.MISSING_ISSUE_EXPRESSION);
  }
  
  /**
   * Checks that Check duplicates are found.
   */
  @Test
  public void testCheckNamesAreUnique() throws Exception {
      String _modelWithCategory = this.modelUtil.modelWithCategory();
      String _emptyCheck = this.modelUtil.emptyCheck("One");
      String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _emptyCheck);
      String _emptyCheck_1 = this.modelUtil.emptyCheck("One");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _emptyCheck_1);
      String contents = _operator_plus_1;
      CheckCatalog _parse = this.parser.parse(contents);
      CheckCatalog model = _parse;
      this.helper.assertError(model, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK, IssueCodes.DUPLICATE_CHECK);
  }
  
  /**
   * Tests checkSeverityRangeOrder(Check)
   */
  @Test
  public void testSeverityRangeOrder_1() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("warning", "error");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertNoError(_parse, IssueCodes.ILLEGAL_SEVERITY_RANGE_ORDER);
  }
  
  /**
   * Tests checkSeverityRangeOrder(Check)
   */
  @Test
  public void testSeverityRangeOrder_2() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("ignore", "warning");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertNoError(_parse, IssueCodes.ILLEGAL_SEVERITY_RANGE_ORDER);
  }
  
  /**
   * Tests checkSeverityRangeOrder(Check)
   */
  @Test
  public void testSeverityRangeOrder_3() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("info", "info");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertNoError(_parse, IssueCodes.ILLEGAL_SEVERITY_RANGE_ORDER);
  }
  
  /**
   * Tests checkSeverityRangeOrder(Check)
   */
  @Test
  public void testSeverityRangeOrder_4() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("info", "ignore");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.SEVERITY_RANGE, IssueCodes.ILLEGAL_SEVERITY_RANGE_ORDER);
  }
  
  /**
   * Tests checkSeverityRangeOrder(Check)
   */
  @Test
  public void testSeverityRangeOrder_5() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("error", "info");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.SEVERITY_RANGE, IssueCodes.ILLEGAL_SEVERITY_RANGE_ORDER);
  }
  
  /**
   * Tests checkDefaultSeverityInRange(Check)
   */
  @Test
  public void testDefaultSeverityInRange_1() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("warning", "error", "info");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK, IssueCodes.DEFAULT_SEVERITY_NOT_IN_RANGE);
  }
  
  /**
   * Tests checkDefaultSeverityInRange(Check)
   */
  @Test
  public void testDefaultSeverityInRange_2() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("error", "info", "ignore");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK, IssueCodes.DEFAULT_SEVERITY_NOT_IN_RANGE);
  }
  
  /**
   * Tests checkDefaultSeverityInRange(Check)
   */
  @Test
  public void testDefaultSeverityInRange_3() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("error", "error", "ignore");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertError(_parse, com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals.CHECK, IssueCodes.DEFAULT_SEVERITY_NOT_IN_RANGE);
  }
  
  /**
   * Tests checkDefaultSeverityInRange(Check)
   */
  @Test
  public void testDefaultSeverityInRange_4() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("error", "error", "error");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertNoError(_parse, IssueCodes.DEFAULT_SEVERITY_NOT_IN_RANGE);
  }
  
  /**
   * Tests checkDefaultSeverityInRange(Check)
   */
  @Test
  public void testDefaultSeverityInRange_5() throws Exception {
    String _modelWithSeverityRange = this.modelUtil.modelWithSeverityRange("info", "error", "warning");
    CheckCatalog _parse = this.parser.parse(_modelWithSeverityRange);
    this.helper.assertNoError(_parse, IssueCodes.DEFAULT_SEVERITY_NOT_IN_RANGE);
  }
}
