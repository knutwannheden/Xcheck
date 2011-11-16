package com.avaloq.tools.dslsdk.check.core.test;

import com.avaloq.tools.dslsdk.check.CheckUiInjectorProvider;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.Implementation;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.avaloq.tools.dslsdk.check.core.test.AbstractCheckTestCase;
import com.avaloq.tools.dslsdk.check.core.test.util.CheckTestUtil;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(CheckUiInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CheckScopingTest extends AbstractCheckTestCase {
  @Inject
  private ParseHelper<CheckCatalog> parser;
  
  @Inject
  private CheckTestUtil util;
  
  /**
   * The model names are deliberately not including file extension, the actual resources
   * are also missing them. The reason for this is that if current development instance of
   * Eclipse has the Check runtime plugins installed, code will automatically be generated
   * for those resources. In order to avoid that the file extensions have been ommitted.
   */
  public List<String> getRequiredSourceFileNames() {
    ArrayList<String> _newArrayList = Lists.<String>newArrayList("CommonChecks", "SampleChecks");
    return _newArrayList;
  }
  
  public void initializeTestProject() throws CoreException {
      IProject _orCreatePluginProject = this.getOrCreatePluginProject();
      final IProject p = _orCreatePluginProject;
      List<String> _requiredSourceFileNames = this.getRequiredSourceFileNames();
      this.addSourcesToWorkspace(com.avaloq.tools.dslsdk.check.core.test.CheckScopingTest.class, _requiredSourceFileNames);
      IResourcesSetupUtil.waitForAutoBuild();
  }
  
  /**
   * Tests that Catalogs can be included in one another.
   */
  @Test
  public void testResolutionOfIncludedCatalog() throws Exception, CoreException {
      this.initializeTestProject();
      EObject _model = this.getModel("SampleChecks");
      final CheckCatalog sampleCheckModel = ((CheckCatalog) _model);
      CheckCatalog _includedCatalogs = sampleCheckModel.getIncludedCatalogs();
      final CheckCatalog includedCategory = _includedCatalogs;
      Assert.assertNotNull("The included Category is not null", includedCategory);
      boolean _eIsProxy = includedCategory.eIsProxy();
      Assert.assertFalse("The included Category could be resolved", _eIsProxy);
  }
  
  /**
   * Tests that a catalog may not reference checks (in implementations, 'def') which are
   * neither local nor included.
   */
  @Test
  public void testIllegalDirectionOfReference() throws Exception, CoreException {
      this.initializeTestProject();
      EObject _model = this.getModel("CommonChecks");
      final CheckCatalog model = ((CheckCatalog) _model);
      Implementation _firstInstanceOf = this.util.<Implementation>getFirstInstanceOf(model, com.avaloq.tools.dslsdk.check.check.Implementation.class);
      final Implementation illegalRefImpl = _firstInstanceOf;
      XIssueExpression _firstInstanceOf_1 = this.util.<XIssueExpression>getFirstInstanceOf(illegalRefImpl, com.avaloq.tools.dslsdk.check.check.XIssueExpression.class);
      final XIssueExpression issueExpr = _firstInstanceOf_1;
      Check _check = issueExpr.getCheck();
      boolean _eIsProxy = _check.eIsProxy();
      Assert.assertTrue("Referenced check cannot be resolved", _eIsProxy);
      Check _check_1 = issueExpr.getCheck();
      String _name = _check_1.getName();
      Assert.assertNull("Referenced check name is null", _name);
  }
  
  /**
   * Tests that a check may be documented using a ML_COMMENT. The documentation is inferred
   * in the description field of a check.
   */
  @Test
  public void testCheckDescriptionIsInferred() throws Exception, CoreException {
      this.initializeTestProject();
      EObject _model = this.getModel("CommonChecks");
      Check _firstInstanceOf = this.util.<Check>getFirstInstanceOf(_model, com.avaloq.tools.dslsdk.check.check.Check.class);
      final Check check = _firstInstanceOf;
      String _description = check.getDescription();
      Assert.assertEquals("Referenced check cannot be resolved", "This check is javadoc-like commented.", _description);
  }
}
