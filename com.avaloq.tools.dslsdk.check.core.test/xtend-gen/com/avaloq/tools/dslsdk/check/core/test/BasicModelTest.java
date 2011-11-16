package com.avaloq.tools.dslsdk.check.core.test;

import com.avaloq.tools.dslsdk.check.CheckUiInjectorProvider;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.avaloq.tools.dslsdk.check.core.test.AbstractCheckTestCase;
import com.avaloq.tools.dslsdk.check.core.test.util.CheckModelUtil;
import com.avaloq.tools.dslsdk.check.core.test.util.CheckTestUtil;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(CheckUiInjectorProvider.class)
@RunWith(XtextRunner.class)
public class BasicModelTest extends AbstractCheckTestCase {
  @Inject
  private ParseHelper<CheckCatalog> parser;
  
  @Inject
  private CheckTestUtil util;
  
  @Inject
  private CheckModelUtil modelUtil;
  
  /**
   * Tests that an empty model based on EPackage model reference can be created.
   */
  @Test
  public void testCreateEmptyModelWithPackageReference() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p catalog c {}");
      final CheckCatalog model = _parse;
      Assert.assertNotNull("CheckCatalog with EPackage reference successfully created", model);
  }
  
  /**
   * Tests that an empty model based on model reference by Xtext Grammar can be created.
   */
  @Test
  public void testCreateEmptyModelWithGrammarReference() throws Exception {
      CheckCatalog _parse = this.parser.parse("package p catalog c for grammar com.avaloq.tools.dslsdk.check.Check {}");
      final CheckCatalog model = _parse;
      Assert.assertNotNull("CheckCatalog with Grammar reference successfully created", model);
  }
  
  /**
   * Tests that an XIssueExpression takes message parameters.
   */
  @Test
  public void testXIssueExpressionMessageParameters() throws Exception {
      String _modelWithContext = this.modelUtil.modelWithContext();
      String _operator_plus = StringExtensions.operator_plus(_modelWithContext, "issue A on it  bind \"mp0\", \"mp1\"");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      final CheckCatalog model = _parse;
      XIssueExpression _firstInstanceOf = this.util.<XIssueExpression>getFirstInstanceOf(model, com.avaloq.tools.dslsdk.check.check.XIssueExpression.class);
      EList<XExpression> _messageParameters = _firstInstanceOf.getMessageParameters();
      int _size = _messageParameters.size();
      Assert.assertEquals(2, _size);
  }
  
  /**
   * Tests that an XIssueExpression takes message parameters when a marker feature has been specified.
   */
  @Test
  public void testXIssueExpressionWithMarkerFeatureMessageParameters() throws Exception {
      String _modelWithContext = this.modelUtil.modelWithContext();
      String _operator_plus = StringExtensions.operator_plus(_modelWithContext, "issue A on x#name bind \"mp0\", \"mp1\"");
      CheckCatalog _parse = this.parser.parse(_operator_plus);
      final CheckCatalog model = _parse;
      XIssueExpression _firstInstanceOf = this.util.<XIssueExpression>getFirstInstanceOf(model, com.avaloq.tools.dslsdk.check.check.XIssueExpression.class);
      EList<XExpression> _messageParameters = _firstInstanceOf.getMessageParameters();
      int _size = _messageParameters.size();
      Assert.assertEquals(2, _size);
  }
  
  /**
   * Tests that Checks documented with ML_COMMENTs have an inferred description field.
   */
  @Test
  @Ignore("Fails because CheckImplCustom uses the null resource description provider to get the document provider")
  public void testInferingOfDescription() throws Exception {
      String _modelWithCheck = this.modelUtil.modelWithCheck();
      CheckCatalog _parse = this.parser.parse(_modelWithCheck);
      Check _firstInstanceOf = this.util.<Check>getFirstInstanceOf(_parse, com.avaloq.tools.dslsdk.check.check.Check.class);
      final Check check = _firstInstanceOf;
      String _description = check.getDescription();
      Assert.assertEquals("No documentation.", _description);
  }
  
  /**
   * Tests that multi- and single-line comments are parsed in a model.
   */
  @Test
  public void testCommentsInModelParse() throws Exception {
      String _modelWithComments = this.modelUtil.modelWithComments();
      CheckCatalog _parse = this.parser.parse(_modelWithComments);
      final CheckCatalog model = _parse;
      Resource _eResource = model.eResource();
      IParseResult _parseResult = ((XtextResource) _eResource).getParseResult();
      boolean _hasSyntaxErrors = _parseResult.hasSyntaxErrors();
      Assert.assertFalse("Syntax errors not expected but occurred", _hasSyntaxErrors);
  }
}
