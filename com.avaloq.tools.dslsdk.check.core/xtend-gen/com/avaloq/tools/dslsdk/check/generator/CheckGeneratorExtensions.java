package com.avaloq.tools.dslsdk.check.generator;

import com.avaloq.tools.dslsdk.check.CheckConstants;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.check.Implementation;
import com.avaloq.tools.dslsdk.check.check.SeverityKind;
import com.avaloq.tools.dslsdk.check.check.TriggerKind;
import com.avaloq.tools.dslsdk.check.check.XGuardExpression;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CheckGeneratorExtensions {
  @Inject
  private XbaseInterpreter interpreter;
  
  public String shortName(final JvmTypeReference r, final ImportManager importManager) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      JvmType _type = r.getType();
      importManager.appendType(_type, builder);
      String _string = builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public String catalogClassName(final CheckCatalog c) {
    String _name = c.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "CheckCatalog");
    return _operator_plus;
  }
  
  public String validatorFileName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _validatorClassName = this.validatorClassName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _validatorClassName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
  }
  
  public String catalogFileName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _catalogClassName = this.catalogClassName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _catalogClassName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
  }
  
  public <T extends EObject> T parent(final EObject object, final Class<T> c) {
    T _containerOfType = EcoreUtil2.<T>getContainerOfType(object, c);
    return _containerOfType;
  }
  
  public String preferenceInitializerClassName(final CheckCatalog c) {
    String _name = c.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "PreferenceInitializer");
    return _operator_plus;
  }
  
  public String issueCodesClassName(final CheckCatalog c) {
    String _name = c.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "IssueCodes");
    return _operator_plus;
  }
  
  public String qualifiedPreferenceInitializerClassName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _operator_plus = StringExtensions.operator_plus(_packageName, ".");
    String _name = c.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "PreferenceInitializer");
    return _operator_plus_2;
  }
  
  public String quickfixClassName(final CheckCatalog c) {
    String _name = c.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "QuickfixProvider");
    return _operator_plus;
  }
  
  public String qualifiedPreferenceInitializerFileName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _preferenceInitializerClassName = this.preferenceInitializerClassName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _preferenceInitializerClassName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
  }
  
  public String qualifiedIssueCodesFileName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _issueCodesClassName = this.issueCodesClassName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _issueCodesClassName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
  }
  
  public String qualifiedQuickfixClassName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _operator_plus = StringExtensions.operator_plus(_packageName, ".");
    String _name = c.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "QuickfixProvider");
    return _operator_plus_2;
  }
  
  public String qualifiedQuickfixFileName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _quickfixClassName = this.quickfixClassName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _quickfixClassName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
  }
  
  public String qualifiedValidatorClassName(final CheckCatalog c) {
    String _packageName = c.getPackageName();
    String _operator_plus = StringExtensions.operator_plus(_packageName, ".");
    String _name = c.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "CheckImpl");
    return _operator_plus_2;
  }
  
  public String validatorClassName(final CheckCatalog c) {
    String _name = c.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "CheckImpl");
    return _operator_plus;
  }
  
  protected String _qualifiedIssueCodeName(final XIssueExpression i) {
    String _xblockexpression = null;
    {
      String _issueCodeName = this.issueCodeName(i);
      final String result = _issueCodeName;
      String _xifexpression = null;
      boolean _operator_equals = ObjectExtensions.operator_equals(result, null);
      if (_operator_equals) {
        _xifexpression = null;
      } else {
        CheckCatalog _parent = this.<CheckCatalog>parent(i, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
        String _issueCodesClassName = this.issueCodesClassName(_parent);
        String _operator_plus = StringExtensions.operator_plus(_issueCodesClassName, ".");
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, result);
        _xifexpression = _operator_plus_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected String _qualifiedIssueCodeName(final Context c) {
    CheckCatalog _parent = this.<CheckCatalog>parent(c, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
    String _issueCodesClassName = this.issueCodesClassName(_parent);
    String _operator_plus = StringExtensions.operator_plus(_issueCodesClassName, ".");
    String _issueCodeName = this.issueCodeName(c);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _issueCodeName);
    return _operator_plus_1;
  }
  
  protected String _issueCodeName(final Context c) {
    String _xblockexpression = null;
    {
      String result = null;
      EObject _eContainer = c.eContainer();
      if ((_eContainer instanceof Check)) {
        {
          EObject _eContainer_1 = c.eContainer();
          final Check check = ((Check) _eContainer_1);
          String _name = check.getName();
          String _splitCamelCase = this.splitCamelCase(_name);
          String _upperCase = _splitCamelCase.toUpperCase();
          String _operator_plus = StringExtensions.operator_plus(_upperCase, "_");
          JvmTypeReference _contextType = c.getContextType();
          String _simpleName = _contextType.getSimpleName();
          String _upperCase_1 = _simpleName.toUpperCase();
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _upperCase_1);
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "_");
          EList<Context> _contexts = check.getContexts();
          int _indexOf = _contexts.indexOf(c);
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ((Integer)_indexOf));
          result = _operator_plus_3;
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  protected String _issueCodeName(final XIssueExpression i) {
    String _xifexpression = null;
    String _issueCode = i.getIssueCode();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_issueCode, null);
    if (_operator_notEquals) {
      String _issueCode_1 = i.getIssueCode();
      String _splitCamelCase = this.splitCamelCase(_issueCode_1);
      String _upperCase = _splitCamelCase.toUpperCase();
      _xifexpression = _upperCase;
    } else {
      String _xblockexpression = null;
      {
        Context _parent = this.<Context>parent(i, com.avaloq.tools.dslsdk.check.check.Context.class);
        final Context context = _parent;
        String _xifexpression_1 = null;
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(context, null);
        if (_operator_notEquals_1) {
          String _issueCodeName = this.issueCodeName(context);
          _xifexpression_1 = _issueCodeName;
        } else {
          _xifexpression_1 = null;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Converts a string such as "AbcDef" to "ABC_DEF".
   */
  public String splitCamelCase(final String s) {
    String _format = String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])");
    String _replaceAll = s.replaceAll(_format, "_");
    return _replaceAll;
  }
  
  public String folderName(final String javaPackageName) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(javaPackageName, null);
    if (_operator_notEquals) {
      String _replace = javaPackageName.replace(".", "/");
      _xifexpression = _replace;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String methodName(final Context context) {
    String _switchResult = null;
    EObject _eContainer = context.eContainer();
    final EObject container = _eContainer;
    boolean matched = false;
    if (!matched) {
      if (container instanceof Check) {
        final Check container_1 = (Check) container;
        matched=true;
        String _name = container_1.getName();
        _switchResult = _name;
      }
    }
    if (!matched) {
      if (container instanceof Implementation) {
        final Implementation container_2 = (Implementation) container;
        matched=true;
        String _name_1 = container_2.getName();
        _switchResult = _name_1;
      }
    }
    JvmTypeReference _contextType = context.getContextType();
    String _simpleName = _contextType.getSimpleName();
    String _operator_plus = StringExtensions.operator_plus(_switchResult, _simpleName);
    String _firstLower = StringExtensions.toFirstLower(_operator_plus);
    return _firstLower;
  }
  
  public String thisParameterName(final Context context) {
    String _xifexpression = null;
    String _it = context.getIt();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_it, null);
    if (_operator_notEquals) {
      String _operator_plus = StringExtensions.operator_plus("_", CheckConstants.IT);
      _xifexpression = _operator_plus;
    } else {
      String _operator_plus_1 = StringExtensions.operator_plus("_", CheckConstants.IT);
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
  
  public boolean isInterface(final JvmTypeReference typeRef) {
    JvmType _type = typeRef.getType();
    boolean _isInterface = ((JvmGenericType) _type).isInterface();
    return _isInterface;
  }
  
  public String checkType(final Context context) {
      TriggerKind _xifexpression = null;
      EObject _eContainer = context.eContainer();
      if ((_eContainer instanceof Check)) {
        EObject _eContainer_1 = context.eContainer();
        TriggerKind _kind = ((Check) _eContainer_1).getKind();
        _xifexpression = _kind;
      } else {
        _xifexpression = TriggerKind.FAST;
      }
      final TriggerKind kind = _xifexpression;
      CheckType _switchResult = null;
      final TriggerKind kind_1 = kind;
      boolean matched = false;
      if (!matched) {
        if (ObjectExtensions.operator_equals(kind_1,TriggerKind.EXPENSIVE)) {
          matched=true;
          _switchResult = CheckType.EXPENSIVE;
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(kind_1,TriggerKind.NORMAL)) {
          matched=true;
          _switchResult = CheckType.NORMAL;
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(kind_1,TriggerKind.FAST)) {
          matched=true;
          _switchResult = CheckType.FAST;
        }
      }
      String _string = _switchResult.toString();
      String _operator_plus = StringExtensions.operator_plus("CheckType.", _string);
      return _operator_plus;
  }
  
  public Iterable<XIssueExpression> issues(final Check check) {
    EList<Context> _contexts = check.getContexts();
    final Function1<Context,Iterable<XIssueExpression>> _function = new Function1<Context,Iterable<XIssueExpression>>() {
        public Iterable<XIssueExpression> apply(final Context c) {
          Iterable<XIssueExpression> _issues = CheckGeneratorExtensions.this.issues(c);
          return _issues;
        }
      };
    List<Iterable<XIssueExpression>> _map = ListExtensions.<Context, Iterable<XIssueExpression>>map(_contexts, _function);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_map);
    return _flatten;
  }
  
  public Iterable<XIssueExpression> issues(final Context context) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _constraint = context.getConstraint();
    boolean _operator_equals = ObjectExtensions.operator_equals(_constraint, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _constraint_1 = context.getConstraint();
      Iterable<XIssueExpression> _issues = this.issues(_constraint_1);
      _xifexpression = _issues;
    }
    return _xifexpression;
  }
  
  public Iterable<Check> issuedChecks(final Context context) {
    Iterable<XIssueExpression> _issues = this.issues(context);
    final Function1<XIssueExpression,Check> _function = new Function1<XIssueExpression,Check>() {
        public Check apply(final XIssueExpression i) {
          Check _issuedCheck = CheckGeneratorExtensions.this.issuedCheck(i);
          return _issuedCheck;
        }
      };
    Iterable<Check> _map = IterableExtensions.<XIssueExpression, Check>map(_issues, _function);
    return _map;
  }
  
  public Check issuedCheck(final XIssueExpression expression) {
    Check _xifexpression = null;
    Check _check = expression.getCheck();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_check, null);
    if (_operator_notEquals) {
      Check _check_1 = expression.getCheck();
      _xifexpression = _check_1;
    } else {
      Check _xblockexpression = null;
      {
        Check _containerOfType = EcoreUtil2.<Check>getContainerOfType(expression, com.avaloq.tools.dslsdk.check.check.Check.class);
        final Check containerCheck = _containerOfType;
        Check _xifexpression_1 = null;
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(containerCheck, null);
        if (_operator_notEquals_1) {
          _xifexpression_1 = containerCheck;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XExpression expression) {
    List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
    return ((Iterable<XIssueExpression>) _emptyList);
  }
  
  protected Iterable<XIssueExpression> _issues(final XBlockExpression expression) {
    EList<XExpression> _expressions = expression.getExpressions();
    final Function1<XExpression,Iterable<XIssueExpression>> _function = new Function1<XExpression,Iterable<XIssueExpression>>() {
        public Iterable<XIssueExpression> apply(final XExpression x) {
          Iterable<XIssueExpression> _issues = CheckGeneratorExtensions.this.issues(x);
          return _issues;
        }
      };
    List<Iterable<XIssueExpression>> _map = ListExtensions.<XExpression, Iterable<XIssueExpression>>map(_expressions, _function);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_map);
    return ((Iterable<XIssueExpression>) _flatten);
  }
  
  protected Iterable<XIssueExpression> _issues(final XIssueExpression expression) {
    List<XIssueExpression> _singletonList = Collections.<XIssueExpression>singletonList(expression);
    return _singletonList;
  }
  
  protected Iterable<XIssueExpression> _issues(final XIfExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _if = expression.getIf();
    boolean _operator_equals = ObjectExtensions.operator_equals(_if, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _if_1 = expression.getIf();
      Iterable<XIssueExpression> _issues = this.issues(_if_1);
      _xifexpression = _issues;
    }
    Iterable<XIssueExpression> _xifexpression_1 = null;
    XExpression _then = expression.getThen();
    boolean _operator_equals_1 = ObjectExtensions.operator_equals(_then, null);
    if (_operator_equals_1) {
      List<XIssueExpression> _emptyList_1 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_1 = _emptyList_1;
    } else {
      XExpression _then_1 = expression.getThen();
      Iterable<XIssueExpression> _issues_1 = this.issues(_then_1);
      _xifexpression_1 = _issues_1;
    }
    Iterable<XIssueExpression> _xifexpression_2 = null;
    XExpression _else = expression.getElse();
    boolean _operator_equals_2 = ObjectExtensions.operator_equals(_else, null);
    if (_operator_equals_2) {
      List<XIssueExpression> _emptyList_2 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_2 = _emptyList_2;
    } else {
      XExpression _else_1 = expression.getElse();
      Iterable<XIssueExpression> _issues_2 = this.issues(_else_1);
      _xifexpression_2 = _issues_2;
    }
    LinkedList<Iterable<XIssueExpression>> _newLinkedList = CollectionLiterals.<Iterable<XIssueExpression>>newLinkedList(_xifexpression, _xifexpression_1, _xifexpression_2);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_newLinkedList);
    return ((Iterable<XIssueExpression>) _flatten);
  }
  
  protected Iterable<XIssueExpression> _issues(final XDoWhileExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _predicate = expression.getPredicate();
    boolean _operator_equals = ObjectExtensions.operator_equals(_predicate, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _predicate_1 = expression.getPredicate();
      Iterable<XIssueExpression> _issues = this.issues(_predicate_1);
      _xifexpression = _issues;
    }
    Iterable<XIssueExpression> _xifexpression_1 = null;
    XExpression _body = expression.getBody();
    boolean _operator_equals_1 = ObjectExtensions.operator_equals(_body, null);
    if (_operator_equals_1) {
      List<XIssueExpression> _emptyList_1 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_1 = _emptyList_1;
    } else {
      XExpression _body_1 = expression.getBody();
      Iterable<XIssueExpression> _issues_1 = this.issues(_body_1);
      _xifexpression_1 = _issues_1;
    }
    LinkedList<Iterable<XIssueExpression>> _newLinkedList = CollectionLiterals.<Iterable<XIssueExpression>>newLinkedList(_xifexpression, _xifexpression_1);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_newLinkedList);
    return ((Iterable<XIssueExpression>) _flatten);
  }
  
  protected Iterable<XIssueExpression> _issues(final XForLoopExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _forExpression = expression.getForExpression();
    boolean _operator_equals = ObjectExtensions.operator_equals(_forExpression, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _forExpression_1 = expression.getForExpression();
      Iterable<XIssueExpression> _issues = this.issues(_forExpression_1);
      _xifexpression = _issues;
    }
    Iterable<XIssueExpression> _xifexpression_1 = null;
    XExpression _eachExpression = expression.getEachExpression();
    boolean _operator_equals_1 = ObjectExtensions.operator_equals(_eachExpression, null);
    if (_operator_equals_1) {
      List<XIssueExpression> _emptyList_1 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_1 = _emptyList_1;
    } else {
      XExpression _eachExpression_1 = expression.getEachExpression();
      Iterable<XIssueExpression> _issues_1 = this.issues(_eachExpression_1);
      _xifexpression_1 = _issues_1;
    }
    LinkedList<Iterable<XIssueExpression>> _newLinkedList = CollectionLiterals.<Iterable<XIssueExpression>>newLinkedList(_xifexpression, _xifexpression_1);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_newLinkedList);
    return ((Iterable<XIssueExpression>) _flatten);
  }
  
  protected Iterable<XIssueExpression> _issues(final XGuardExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _guard = expression.getGuard();
    boolean _operator_equals = ObjectExtensions.operator_equals(_guard, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _guard_1 = expression.getGuard();
      Iterable<XIssueExpression> _issues = this.issues(_guard_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XInstanceOfExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _expression = expression.getExpression();
    boolean _operator_equals = ObjectExtensions.operator_equals(_expression, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _expression_1 = expression.getExpression();
      Iterable<XIssueExpression> _issues = this.issues(_expression_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XReturnExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _expression = expression.getExpression();
    boolean _operator_equals = ObjectExtensions.operator_equals(_expression, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _expression_1 = expression.getExpression();
      Iterable<XIssueExpression> _issues = this.issues(_expression_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XSwitchExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _switch = expression.getSwitch();
    boolean _operator_equals = ObjectExtensions.operator_equals(_switch, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _switch_1 = expression.getSwitch();
      Iterable<XIssueExpression> _issues = this.issues(_switch_1);
      _xifexpression = _issues;
    }
    Iterable<XIssueExpression> _xifexpression_1 = null;
    EList<XCasePart> _cases = expression.getCases();
    boolean _operator_equals_1 = ObjectExtensions.operator_equals(_cases, null);
    if (_operator_equals_1) {
      List<XIssueExpression> _emptyList_1 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_1 = _emptyList_1;
    } else {
      EList<XCasePart> _cases_1 = expression.getCases();
      final Function1<XCasePart,Iterable<XIssueExpression>> _function = new Function1<XCasePart,Iterable<XIssueExpression>>() {
          public Iterable<XIssueExpression> apply(final XCasePart c) {
            Iterable<XIssueExpression> _issues = CheckGeneratorExtensions.this.issues(c);
            return _issues;
          }
        };
      List<Iterable<XIssueExpression>> _map = ListExtensions.<XCasePart, Iterable<XIssueExpression>>map(_cases_1, _function);
      Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_map);
      _xifexpression_1 = _flatten;
    }
    LinkedList<Iterable<XIssueExpression>> _newLinkedList = CollectionLiterals.<Iterable<XIssueExpression>>newLinkedList(_xifexpression, _xifexpression_1);
    Iterable<XIssueExpression> _flatten_1 = IterableExtensions.<XIssueExpression>flatten(_newLinkedList);
    return ((Iterable<XIssueExpression>) _flatten_1);
  }
  
  public Iterable<XIssueExpression> issues(final XCasePart casePart) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _case = casePart.getCase();
    boolean _operator_equals = ObjectExtensions.operator_equals(_case, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _case_1 = casePart.getCase();
      Iterable<XIssueExpression> _issues = this.issues(_case_1);
      _xifexpression = _issues;
    }
    Iterable<XIssueExpression> _xifexpression_1 = null;
    XExpression _then = casePart.getThen();
    boolean _operator_equals_1 = ObjectExtensions.operator_equals(_then, null);
    if (_operator_equals_1) {
      List<XIssueExpression> _emptyList_1 = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression_1 = _emptyList_1;
    } else {
      XExpression _then_1 = casePart.getThen();
      Iterable<XIssueExpression> _issues_1 = this.issues(_then_1);
      _xifexpression_1 = _issues_1;
    }
    LinkedList<Iterable<XIssueExpression>> _newLinkedList = CollectionLiterals.<Iterable<XIssueExpression>>newLinkedList(_xifexpression, _xifexpression_1);
    Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_newLinkedList);
    return ((Iterable<XIssueExpression>) _flatten);
  }
  
  protected Iterable<XIssueExpression> _issues(final XThrowExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _expression = expression.getExpression();
    boolean _operator_equals = ObjectExtensions.operator_equals(_expression, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _expression_1 = expression.getExpression();
      Iterable<XIssueExpression> _issues = this.issues(_expression_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XVariableDeclaration expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _right = expression.getRight();
    boolean _operator_equals = ObjectExtensions.operator_equals(_right, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _right_1 = expression.getRight();
      Iterable<XIssueExpression> _issues = this.issues(_right_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected Iterable<XIssueExpression> _issues(final XTryCatchFinallyExpression expression) {
    Iterable<XIssueExpression> _xifexpression = null;
    XExpression _expression = expression.getExpression();
    boolean _operator_equals = ObjectExtensions.operator_equals(_expression, null);
    if (_operator_equals) {
      List<XIssueExpression> _emptyList = CollectionLiterals.<XIssueExpression>emptyList();
      _xifexpression = _emptyList;
    } else {
      XExpression _expression_1 = expression.getExpression();
      Iterable<XIssueExpression> _issues = this.issues(_expression_1);
      _xifexpression = ((Iterable<XIssueExpression>) _issues);
    }
    return _xifexpression;
  }
  
  protected String _key(final Check check) {
    String _xblockexpression = null;
    {
      CheckCatalog _parent = this.<CheckCatalog>parent(check, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
      final CheckCatalog catalog = _parent;
      String _name = catalog.getName();
      String _operator_plus = StringExtensions.operator_plus(_name, ".");
      String _name_1 = check.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  protected String _key(final FormalParameter param) {
    String _xblockexpression = null;
    {
      CheckCatalog _parent = this.<CheckCatalog>parent(param, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
      final CheckCatalog catalog = _parent;
      EObject _eContainer = param.eContainer();
      final Check check = ((Check) _eContainer);
      String _name = catalog.getName();
      String _operator_plus = StringExtensions.operator_plus(_name, ".");
      String _name_1 = check.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".");
      JvmFormalParameter _parameter = param.getParameter();
      String _name_2 = _parameter.getName();
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_2);
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String severityKey(final Check check) {
    String _key = this.key(check);
    String _upperCase = _key.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus(_upperCase, "$SEVERITY");
    return _operator_plus;
  }
  
  public String parameterKey(final FormalParameter param) {
    String _key = this.key(param);
    String _upperCase = _key.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus(_upperCase, "$PARAMETER");
    return _operator_plus;
  }
  
  public int severityValue(final String severityName) {
    String _lowerCase = severityName.toLowerCase();
    SeverityKind _byName = SeverityKind.getByName(_lowerCase);
    int _value = _byName.getValue();
    return _value;
  }
  
  /**
   * Get the name of the getter in the configuration store
   */
  public String configurationStoreGetterName(final FormalParameter parameter) {
    String _preferenceServiceLookupOperation = this.preferenceServiceLookupOperation(parameter);
    return _preferenceServiceLookupOperation;
  }
  
  /**
   * Gets typed operation names for getting values from Eclipse preferences.
   */
  public String preferenceServiceLookupOperation(final FormalParameter parameter) {
    String _xblockexpression = null;
    {
      XExpression _defaultValue = parameter.getDefaultValue();
      IEvaluationResult _evaluate = this.interpreter.evaluate(_defaultValue);
      Object _result = _evaluate.getResult();
      final Object result = _result;
      String _switchResult = null;
      final Object result_1 = result;
      boolean matched = false;
      if (!matched) {
        if (result_1 instanceof Boolean) {
          final Boolean result_2 = (Boolean) result_1;
          matched=true;
          _switchResult = "getBoolean";
        }
      }
      if (!matched) {
        if (result_1 instanceof Integer) {
          final Integer result_3 = (Integer) result_1;
          matched=true;
          _switchResult = "getInt";
        }
      }
      if (!matched) {
        _switchResult = "getString";
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  /**
   * Gets typed operation names for putting values in Eclipse preferences.
   */
  public String preferenceServicePutOperation(final FormalParameter parameter) {
    String _xblockexpression = null;
    {
      XExpression _defaultValue = parameter.getDefaultValue();
      IEvaluationResult _evaluate = this.interpreter.evaluate(_defaultValue);
      Object _result = _evaluate.getResult();
      final Object result = _result;
      String _switchResult = null;
      final Object result_1 = result;
      boolean matched = false;
      if (!matched) {
        if (result_1 instanceof Boolean) {
          final Boolean result_2 = (Boolean) result_1;
          matched=true;
          _switchResult = "putBoolean";
        }
      }
      if (!matched) {
        if (result_1 instanceof Integer) {
          final Integer result_3 = (Integer) result_1;
          matched=true;
          _switchResult = "putInt";
        }
      }
      if (!matched) {
        _switchResult = "put";
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  /**
   * Gets the IProject which is associated with a given EObject or <code>null</code>
   * if none could be determined.
   */
  public IProject projectForObject(final EObject object) {
      Resource _eResource = object.eResource();
      final Resource res = _eResource;
      URI _uRI = res.getURI();
      boolean _isPlatform = _uRI.isPlatform();
      if (_isPlatform) {
        {
          IWorkspace _workspace = ResourcesPlugin.getWorkspace();
          IWorkspaceRoot _root = _workspace.getRoot();
          URI _uRI_1 = res.getURI();
          String _platformString = _uRI_1.toPlatformString(true);
          IResource _findMember = _root.findMember(_platformString);
          final IFile file = ((IFile) _findMember);
          IProject _project = file.getProject();
          return _project;
        }
      }
      return null;
  }
  
  /**
   * Gets the name of the project in which given object is contained.
   */
  public String bundleName(final EObject object) {
      IProject _projectForObject = this.projectForObject(object);
      final IProject proj = _projectForObject;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(proj, null);
      if (_operator_notEquals) {
        String _name = proj.getName();
        return _name;
      }
      return null;
  }
  
  public String qualifiedIssueCodeName(final EObject c) {
    if (c instanceof Context) {
      return _qualifiedIssueCodeName((Context)c);
    } else if (c instanceof XIssueExpression) {
      return _qualifiedIssueCodeName((XIssueExpression)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public String issueCodeName(final EObject c) {
    if (c instanceof Context) {
      return _issueCodeName((Context)c);
    } else if (c instanceof XIssueExpression) {
      return _issueCodeName((XIssueExpression)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public Iterable<XIssueExpression> issues(final XExpression expression) {
    if (expression instanceof XDoWhileExpression) {
      return _issues((XDoWhileExpression)expression);
    } else if (expression instanceof XGuardExpression) {
      return _issues((XGuardExpression)expression);
    } else if (expression instanceof XIssueExpression) {
      return _issues((XIssueExpression)expression);
    } else if (expression instanceof XBlockExpression) {
      return _issues((XBlockExpression)expression);
    } else if (expression instanceof XForLoopExpression) {
      return _issues((XForLoopExpression)expression);
    } else if (expression instanceof XIfExpression) {
      return _issues((XIfExpression)expression);
    } else if (expression instanceof XInstanceOfExpression) {
      return _issues((XInstanceOfExpression)expression);
    } else if (expression instanceof XReturnExpression) {
      return _issues((XReturnExpression)expression);
    } else if (expression instanceof XSwitchExpression) {
      return _issues((XSwitchExpression)expression);
    } else if (expression instanceof XThrowExpression) {
      return _issues((XThrowExpression)expression);
    } else if (expression instanceof XTryCatchFinallyExpression) {
      return _issues((XTryCatchFinallyExpression)expression);
    } else if (expression instanceof XVariableDeclaration) {
      return _issues((XVariableDeclaration)expression);
    } else {
      return _issues(expression);
    }
  }
  
  public String key(final EObject check) {
    if (check instanceof Check) {
      return _key((Check)check);
    } else if (check instanceof FormalParameter) {
      return _key((FormalParameter)check);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(check).toString());
    }
  }
}
