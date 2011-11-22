package com.avaloq.tools.dslsdk.check.generator;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.check.Implementation;
import com.avaloq.tools.dslsdk.check.check.SeverityKind;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.avaloq.tools.dslsdk.check.generator.CheckCompiler;
import com.avaloq.tools.dslsdk.check.generator.CheckGeneratorExtensions;
import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CheckGenerator implements IGenerator {
  @Inject
  private CheckGeneratorExtensions generatorExtensions;
  
  @Inject
  private CheckCompiler checkCompiler;
  
  /**
   * Used for evaluating Xbase expressions.
   */
  @Inject
  private XbaseInterpreter interpreter;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<CheckCatalog> _filter = IterableExtensions.<CheckCatalog>filter(_allContentsIterable, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
    for (final CheckCatalog catalog : _filter) {
      {
        String _validatorFileName = this.generatorExtensions.validatorFileName(catalog);
        StringConcatenation _compileValidator = this.compileValidator(catalog);
        fsa.generateFile(_validatorFileName, _compileValidator);
        String _catalogFileName = this.generatorExtensions.catalogFileName(catalog);
        StringConcatenation _compileCatalog = this.compileCatalog(catalog);
        fsa.generateFile(_catalogFileName, _compileCatalog);
        String _qualifiedIssueCodesFileName = this.generatorExtensions.qualifiedIssueCodesFileName(catalog);
        StringConcatenation _compileIssueCodes = this.compileIssueCodes(catalog);
        fsa.generateFile(_qualifiedIssueCodesFileName, _compileIssueCodes);
        String _qualifiedPreferenceInitializerFileName = this.generatorExtensions.qualifiedPreferenceInitializerFileName(catalog);
        StringConcatenation _compilePreferenceInitializer = this.compilePreferenceInitializer(catalog);
        fsa.generateFile(_qualifiedPreferenceInitializerFileName, _compilePreferenceInitializer);
      }
    }
  }
  
  /**
   * Validator Compiler
   */
  public StringConcatenation compileValidator(final CheckCatalog c) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _bodyValidator = this.bodyValidator(c, importManager);
    final StringConcatenation body = _bodyValidator;
    _builder.newLineIfNotEmpty();
    {
      String _packageName = c.getPackageName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_packageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _packageName_1 = c.getPackageName();
        _builder.append(_packageName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("import org.eclipse.xtext.validation.Check;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.validation.CheckType;");
    _builder.newLine();
    _builder.append("import com.avaloq.tools.dslsdk.check.runtime.issue.DefaultCheckImpl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;");
    _builder.newLine();
    _builder.newLine();
    {
      List<String> _imports = importManager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation bodyValidator(final CheckCatalog checkCatalog, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _headerValidator = this.headerValidator(checkCatalog);
    _builder.append(_headerValidator, "");
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    CheckCatalog _includedCatalogs = checkCatalog.getIncludedCatalogs();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_includedCatalogs, null);
    if (_operator_notEquals) {
      CheckCatalog _includedCatalogs_1 = checkCatalog.getIncludedCatalogs();
      String _validatorClassName = this.generatorExtensions.validatorClassName(_includedCatalogs_1);
      _xifexpression = _validatorClassName;
    } else {
      _xifexpression = "DefaultCheckImpl";
    }
    String parentCheckImpl = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _validatorClassName_1 = this.generatorExtensions.validatorClassName(checkCatalog);
    _builder.append(_validatorClassName_1, "");
    _builder.append(" extends ");
    _builder.append(parentCheckImpl, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private ");
    String _catalogClassName = this.generatorExtensions.catalogClassName(checkCatalog);
    _builder.append(_catalogClassName, "  ");
    _builder.append(" catalog;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("  ");
    EList<Check> _allChecks = checkCatalog.getAllChecks();
    final EList<Check> allChecks = _allChecks;
    _builder.newLineIfNotEmpty();
    {
      for(final Check check : allChecks) {
        _builder.append("  ");
        _builder.append("private ");
        String _catalogClassName_1 = this.generatorExtensions.catalogClassName(checkCatalog);
        _builder.append(_catalogClassName_1, "  ");
        _builder.append(".");
        String _name = check.getName();
        _builder.append(_name, "  ");
        _builder.append(" ");
        String _name_1 = check.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower, "  ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("/** Gets the ");
        String _catalogClassName_2 = this.generatorExtensions.catalogClassName(checkCatalog);
        _builder.append(_catalogClassName_2, "  ");
        _builder.append(".");
        String _name_2 = check.getName();
        _builder.append(_name_2, "  ");
        _builder.append(" instance. */");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("private ");
        String _catalogClassName_3 = this.generatorExtensions.catalogClassName(checkCatalog);
        _builder.append(_catalogClassName_3, "  ");
        _builder.append(".");
        String _name_3 = check.getName();
        _builder.append(_name_3, "  ");
        _builder.append(" get");
        String _name_4 = check.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper, "  ");
        _builder.append("(EObject context) {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("if (");
        String _name_5 = check.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
        _builder.append(_firstLower_1, "    ");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("    ");
        String _name_6 = check.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_2, "      ");
        _builder.append(" = catalog.new ");
        String _name_7 = check.getName();
        _builder.append(_name_7, "      ");
        _builder.append("(getMessageAcceptor(), context);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("return ");
        String _name_8 = check.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_8);
        _builder.append(_firstLower_3, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      final Function1<Check,EList<Context>> _function = new Function1<Check,EList<Context>>() {
          public EList<Context> apply(final Check c) {
            EList<Context> _contexts = c.getContexts();
            return _contexts;
          }
        };
      List<EList<Context>> _map = ListExtensions.<Check, EList<Context>>map(allChecks, _function);
      Iterable<Context> _flatten = IterableExtensions.<Context>flatten(_map);
      for(final Context context : _flatten) {
        _builder.append("  ");
        StringConcatenation _context = this.context(context, importManager);
        _builder.append(_context, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Implementation> _implementations = checkCatalog.getImplementations();
      for(final Implementation implementation : _implementations) {
        _builder.newLine();
        _builder.append("  ");
        Context _context_1 = implementation.getContext();
        StringConcatenation _context_2 = this.context(_context_1, importManager);
        _builder.append(_context_2, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation context(final Context context, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(context);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@Check(");
    String _checkType = this.generatorExtensions.checkType(context);
    _builder.append(_checkType, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("public void ");
    String _methodName = this.generatorExtensions.methodName(context);
    _builder.append(_methodName, "");
    _builder.append("(");
    JvmTypeReference _contextType = context.getContextType();
    String _shortName = this.generatorExtensions.shortName(_contextType, importManager);
    _builder.append(_shortName, "");
    _builder.append(" ");
    String _thisParameterName = this.generatorExtensions.thisParameterName(context);
    _builder.append(_thisParameterName, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _compile = this.checkCompiler.compile(context, importManager);
    _builder.append(_compile, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Catalogue generator
   */
  public StringConcatenation compileCatalog(final CheckCatalog checkCatalog) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _bodyCatalog = this.bodyCatalog(checkCatalog, importManager);
    final StringConcatenation body = _bodyCatalog;
    _builder.newLineIfNotEmpty();
    {
      String _packageName = checkCatalog.getPackageName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_packageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _packageName_1 = checkCatalog.getPackageName();
        _builder.append(_packageName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("import org.eclipse.core.runtime.Platform;");
    _builder.newLine();
    _builder.append("import org.eclipse.osgi.util.NLS;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.validation.ValidationMessageAcceptor;");
    _builder.newLine();
    _builder.newLine();
    {
      List<String> _imports = importManager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import com.avaloq.tools.dslsdk.check.runtime.issue.AbstractIssue;");
    _builder.newLine();
    _builder.append("import com.avaloq.tools.dslsdk.check.runtime.issue.DefaultCheckCatalog;");
    _builder.newLine();
    _builder.append("import com.avaloq.tools.dslsdk.check.runtime.issue.SeverityKind;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.avaloq.tools.dslsdk.check.runtime.configuration.ICheckConfigurationStoreService;");
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation bodyCatalog(final CheckCatalog checkCatalog, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _headerIssues = this.headerIssues(checkCatalog);
    _builder.append(_headerIssues, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _catalogClassName = this.generatorExtensions.catalogClassName(checkCatalog);
    _builder.append(_catalogClassName, "");
    _builder.append(" extends DefaultCheckCatalog {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("protected ICheckConfigurationStoreService checkConfigurationStoreService; ");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Check> _allChecks = checkCatalog.getAllChecks();
      for(final Check check : _allChecks) {
        _builder.newLine();
        _builder.append("  ");
        StringConcatenation _issue = this.issue(check, importManager);
        _builder.append(_issue, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation issue(final Check check, final ImportManager importManager) {
    StringConcatenation _xblockexpression = null;
    {
      String _bundleName = this.generatorExtensions.bundleName(check);
      final String bundle = _bundleName;
      String _severityKey = this.generatorExtensions.severityKey(check);
      final String severityKey = _severityKey;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class ");
      String _name = check.getName();
      _builder.append(_name, "");
      _builder.append(" extends AbstractIssue {");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("/** Stores the context object for this check. */");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("private final EObject context;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.append("public ");
      String _name_1 = check.getName();
      _builder.append(_name_1, "  ");
      _builder.append("(ValidationMessageAcceptor messageAcceptor, EObject context) {");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("super(messageAcceptor);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("this.context = context;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        EList<FormalParameter> _formalParameters = check.getFormalParameters();
        for(final FormalParameter parameter : _formalParameters) {
          _builder.append("  ");
          _builder.append("  ");
          String _configurationStoreGetterName = this.generatorExtensions.configurationStoreGetterName(parameter);
          final String operation = _configurationStoreGetterName;
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("  ");
          String _parameterKey = this.generatorExtensions.parameterKey(parameter);
          final String parameterKey = _parameterKey;
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("  ");
          XExpression _defaultValue = parameter.getDefaultValue();
          IEvaluationResult _evaluate = this.interpreter.evaluate(_defaultValue);
          Object _result = _evaluate.getResult();
          final Object value = _result;
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("  ");
          Object _switchResult = null;
          final Object value_1 = value;
          boolean matched = false;
          if (!matched) {
            if (value_1 instanceof String) {
              final String value_2 = (String) value_1;
              matched=true;
              String _operator_plus = StringExtensions.operator_plus("\"", value_2);
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\"");
              _switchResult = _operator_plus_1;
            }
          }
          if (!matched) {
            _switchResult = value;
          }
          Object result = _switchResult;
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("* Gets the value for formal parameter <em>");
          JvmFormalParameter _parameter = parameter.getParameter();
          String _name_2 = _parameter.getName();
          _builder.append(_name_2, "   ");
          _builder.append("</em>. The value returned is either");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("* the default ({@code ");
          _builder.append(value, "   ");
          _builder.append("}), as is set in the check definition, or the configured value, if");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("* existing.");
          _builder.newLine();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("* ");
          _builder.newLine();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("* @return the value of this formal parameter");
          _builder.newLine();
          _builder.append("  ");
          _builder.append(" ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public ");
          JvmFormalParameter _parameter_1 = parameter.getParameter();
          JvmTypeReference _parameterType = _parameter_1.getParameterType();
          String _shortName = this.generatorExtensions.shortName(_parameterType, importManager);
          _builder.append(_shortName, "  ");
          _builder.append(" get");
          JvmFormalParameter _parameter_2 = parameter.getParameter();
          String _name_3 = _parameter_2.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name_3);
          _builder.append(_firstUpper, "  ");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("  ");
          _builder.append("return checkConfigurationStoreService.getCheckConfigurationStore(context).");
          _builder.append(operation, "    ");
          _builder.append("(\"");
          _builder.append(bundle, "    ");
          _builder.append("\", \"");
          _builder.append(parameterKey, "    ");
          _builder.append("\", ");
          _builder.append(result, "    ");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("} ");
          _builder.newLine();
          _builder.append("  ");
          _builder.newLine();
        }
      }
      _builder.append("  ");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* Gets the message associated with a violation of this check.");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("*");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* @param bindings the message bindings");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* @return the message identifying a violation of this check");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("public String getMessage(Object... bindings) {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("return NLS.bind(\"");
      String _message = check.getMessage();
      String _convertToJavaString = Strings.convertToJavaString(_message);
      _builder.append(_convertToJavaString, "    ");
      _builder.append("\", bindings);");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("  ");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* Gets the {@link SeverityKind severity kind} of check <em>");
      String _label = check.getLabel();
      _builder.append(_label, "   ");
      _builder.append("</em>. The severity kind returned");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("* is either the default ({@code ");
      SeverityKind _defaultSeverity = check.getDefaultSeverity();
      String _name_4 = _defaultSeverity.name();
      _builder.append(_name_4, "   ");
      _builder.append("}), as is set in the check definition, or the");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("* configured value, if existing.");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("* @return the severity kind of this check");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("public SeverityKind getSeverityKind() {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("final int result = checkConfigurationStoreService.getCheckConfigurationStore(context).getInt(\"");
      _builder.append(bundle, "    ");
      _builder.append("\", \"");
      _builder.append(severityKey, "    ");
      _builder.append("\", ");
      SeverityKind _defaultSeverity_1 = check.getDefaultSeverity();
      int _value = _defaultSeverity_1.getValue();
      _builder.append(_value, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (SeverityKind.values().length > result) {");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return SeverityKind.values()[result];");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("return SeverityKind.values()[");
      SeverityKind _defaultSeverity_2 = check.getDefaultSeverity();
      int _value_1 = _defaultSeverity_2.getValue();
      _builder.append(_value_1, "    ");
      _builder.append("]; // non-existing severity was configured, return default");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * Headers
   */
  public StringConcatenation header(final Context context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  ");
    String _methodName = this.generatorExtensions.methodName(context);
    _builder.append(_methodName, " ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation headerValidator(final CheckCatalog catalog) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  Validator for ");
    String _name = catalog.getName();
    _builder.append(_name, " ");
    _builder.append(".");
    {
      CheckCatalog _includedCatalogs = catalog.getIncludedCatalogs();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_includedCatalogs, null);
      if (_operator_notEquals) {
        _builder.append(" Includes validations from its parent catalog.");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @see ");
        CheckCatalog _includedCatalogs_1 = catalog.getIncludedCatalogs();
        String _validatorClassName = this.generatorExtensions.validatorClassName(_includedCatalogs_1);
        _builder.append(_validatorClassName, " ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation headerIssues(final CheckCatalog catalog) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  Issues for ");
    String _name = catalog.getName();
    _builder.append(_name, " ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Creates an IssueCodes file for a Check Catalog. Every Check Catalog will have its own file
   * of issue codes.
   */
  public StringConcatenation compileIssueCodes(final CheckCatalog catalog) {
    StringConcatenation _xblockexpression = null;
    {
      EList<Check> _allChecks = catalog.getAllChecks();
      final Function1<Check,Iterable<XIssueExpression>> _function = new Function1<Check,Iterable<XIssueExpression>>() {
          public Iterable<XIssueExpression> apply(final Check c) {
            Iterable<XIssueExpression> _issues = CheckGenerator.this.generatorExtensions.issues(c);
            return _issues;
          }
        };
      List<Iterable<XIssueExpression>> _map = ListExtensions.<Check, Iterable<XIssueExpression>>map(_allChecks, _function);
      Iterable<XIssueExpression> _flatten = IterableExtensions.<XIssueExpression>flatten(_map);
      final Iterable<XIssueExpression> allIssues = _flatten;
      final Function1<XIssueExpression,String> _function_1 = new Function1<XIssueExpression,String>() {
          public String apply(final XIssueExpression i) {
            String _issueCodeName = CheckGenerator.this.generatorExtensions.issueCodeName(i);
            return _issueCodeName;
          }
        };
      Iterable<String> _map_1 = IterableExtensions.<XIssueExpression, String>map(allIssues, _function_1);
      Set<String> _set = IterableExtensions.<String>toSet(_map_1);
      final Set<String> issueNames = _set;
      StringConcatenation _builder = new StringConcatenation();
      {
        String _packageName = catalog.getPackageName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_packageName);
        boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
        if (_operator_not) {
          _builder.append("package ");
          String _packageName_1 = catalog.getPackageName();
          _builder.append(_packageName_1, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Issue codes which may be used to address validation issues (for instance in quickfixes).");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@SuppressWarnings(\"all\")");
      _builder.newLine();
      _builder.append("public final class ");
      String _issueCodesClassName = this.generatorExtensions.issueCodesClassName(catalog);
      _builder.append(_issueCodesClassName, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("// The prefix for all issue codes");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("private static final String ISSUE_CODE_PREFIX = \"");
      String _packageName_2 = catalog.getPackageName();
      _builder.append(_packageName_2, "  ");
      _builder.append(".");
      String _issueCodesClassName_1 = this.generatorExtensions.issueCodesClassName(catalog);
      _builder.append(_issueCodesClassName_1, "  ");
      _builder.append(".\";");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.newLine();
      {
        for(final String name : issueNames) {
          _builder.append("  ");
          _builder.append("public static final String ");
          _builder.append(name, "  ");
          _builder.append(" = ISSUE_CODE_PREFIX + \"");
          String _replaceAll = name.replaceAll("_", ".");
          String _lowerCase = _replaceAll.toLowerCase();
          _builder.append(_lowerCase, "  ");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("private ");
      String _issueCodesClassName_2 = this.generatorExtensions.issueCodesClassName(catalog);
      _builder.append(_issueCodesClassName_2, "  ");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("// Prevent instantiation.");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * Creates contents for the generated preference initializer class. Defaults need to be created for
   * <ul>
   * <li>Check default severity value
   * <li>Formal Parameter default value
   * </ul>
   */
  public StringConcatenation compilePreferenceInitializer(final CheckCatalog catalog) {
    StringConcatenation _xblockexpression = null;
    {
      EList<Check> _allChecks = catalog.getAllChecks();
      final EList<Check> allChecks = _allChecks;
      final Function1<Check,EList<FormalParameter>> _function = new Function1<Check,EList<FormalParameter>>() {
          public EList<FormalParameter> apply(final Check c) {
            EList<FormalParameter> _formalParameters = c.getFormalParameters();
            return _formalParameters;
          }
        };
      List<EList<FormalParameter>> _map = ListExtensions.<Check, EList<FormalParameter>>map(allChecks, _function);
      Iterable<FormalParameter> _flatten = IterableExtensions.<FormalParameter>flatten(_map);
      final Iterable<FormalParameter> allParams = _flatten;
      StringConcatenation _builder = new StringConcatenation();
      {
        String _packageName = catalog.getPackageName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_packageName);
        boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
        if (_operator_not) {
          _builder.append("package ");
          String _packageName_1 = catalog.getPackageName();
          _builder.append(_packageName_1, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;");
      _builder.newLine();
      _builder.append("import org.eclipse.core.runtime.preferences.IEclipsePreferences;");
      _builder.newLine();
      _builder.append("import org.eclipse.core.runtime.preferences.InstanceScope;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Preference initializer for ");
      String _name = catalog.getName();
      _builder.append(_name, " ");
      _builder.append(". Provides default values for configurable");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* properties.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@SuppressWarnings(\"all\")");
      _builder.newLine();
      _builder.append("public final class ");
      String _preferenceInitializerClassName = this.generatorExtensions.preferenceInitializerClassName(catalog);
      _builder.append(_preferenceInitializerClassName, "");
      _builder.append(" extends AbstractPreferenceInitializer {");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("private static final String RUNTIME_NODE_NAME = \"");
      String _bundleName = this.generatorExtensions.bundleName(catalog);
      _builder.append(_bundleName, "  ");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("/** Initialize defaults. */");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("public void initializeDefaultPreferences() {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("final IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(RUNTIME_NODE_NAME);");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("// Check severities");
      _builder.newLine();
      {
        for(final Check c : allChecks) {
          _builder.append("    ");
          _builder.append("preferences.putInt(\"");
          String _severityKey = this.generatorExtensions.severityKey(c);
          _builder.append(_severityKey, "    ");
          _builder.append("\", ");
          SeverityKind _defaultSeverity = c.getDefaultSeverity();
          int _value = _defaultSeverity.getValue();
          _builder.append(_value, "    ");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("// Formal parameters");
      _builder.newLine();
      {
        for(final FormalParameter p : allParams) {
          _builder.append("    ");
          XExpression _defaultValue = p.getDefaultValue();
          IEvaluationResult _evaluate = this.interpreter.evaluate(_defaultValue);
          Object _result = _evaluate.getResult();
          final Object value = _result;
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          String _preferenceServicePutOperation = this.generatorExtensions.preferenceServicePutOperation(p);
          final String op = _preferenceServicePutOperation;
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          Object _switchResult = null;
          final Object value_1 = value;
          boolean matched = false;
          if (!matched) {
            if (value_1 instanceof String) {
              final String value_2 = (String) value_1;
              matched=true;
              String _operator_plus = StringExtensions.operator_plus("\"", value_2);
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\"");
              _switchResult = _operator_plus_1;
            }
          }
          if (!matched) {
            _switchResult = value;
          }
          Object result = _switchResult;
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("preferences.");
          _builder.append(op, "    ");
          _builder.append("(\"");
          String _parameterKey = this.generatorExtensions.parameterKey(p);
          _builder.append(_parameterKey, "    ");
          _builder.append("\", ");
          _builder.append(result, "    ");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
