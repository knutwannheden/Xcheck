package com.avaloq.tools.dslsdk.checkcfg.generator;

import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter;
import com.avaloq.tools.dslsdk.checkcfg.generator.GeneratorExtensions;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CheckCfgGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  @Inject
  private XbaseInterpreter interpreter;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      if ((fsa instanceof AbstractFileSystemAccess)) {
        String _outputPath = this.generatorExtensions.outputPath();
        ((AbstractFileSystemAccess) fsa).setOutputPath(_outputPath);
      }
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<CheckConfiguration> _filter = IterableExtensions.<CheckConfiguration>filter(_allContentsIterable, com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration.class);
      for (final CheckConfiguration configuration : _filter) {
        String _fileName = this.generatorExtensions.fileName(configuration);
        StringConcatenation _compile = this.compile(configuration);
        fsa.generateFile(_fileName, _compile);
      }
  }
  
  public StringConcatenation compile(final CheckConfiguration config) {
    StringConcatenation _xblockexpression = null;
    {
      EList<ConfiguredCatalog> _catalogConfigurations = config.getCatalogConfigurations();
      final Function1<ConfiguredCatalog,EList<ConfiguredCheck>> _function = new Function1<ConfiguredCatalog,EList<ConfiguredCheck>>() {
          public EList<ConfiguredCheck> apply(final ConfiguredCatalog cat) {
            EList<ConfiguredCheck> _checkConfigurations = cat.getCheckConfigurations();
            return _checkConfigurations;
          }
        };
      List<EList<ConfiguredCheck>> _map = ListExtensions.<ConfiguredCatalog, EList<ConfiguredCheck>>map(_catalogConfigurations, _function);
      Iterable<ConfiguredCheck> _flatten = IterableExtensions.<ConfiguredCheck>flatten(_map);
      final Iterable<ConfiguredCheck> allChecks = _flatten;
      final Function1<ConfiguredCheck,EList<ConfiguredParameter>> _function_1 = new Function1<ConfiguredCheck,EList<ConfiguredParameter>>() {
          public EList<ConfiguredParameter> apply(final ConfiguredCheck c) {
            EList<ConfiguredParameter> _parameterConfigurations = c.getParameterConfigurations();
            return _parameterConfigurations;
          }
        };
      Iterable<EList<ConfiguredParameter>> _map_1 = IterableExtensions.<ConfiguredCheck, EList<ConfiguredParameter>>map(allChecks, _function_1);
      Iterable<ConfiguredParameter> _flatten_1 = IterableExtensions.<ConfiguredParameter>flatten(_map_1);
      final Iterable<ConfiguredParameter> allParams = _flatten_1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Configured severities");
      _builder.newLine();
      {
        for(final ConfiguredCheck c : allChecks) {
          String _key = this.generatorExtensions.key(c);
          _builder.append(_key, "");
          _builder.append("=");
          int _severityValue = this.generatorExtensions.severityValue(c);
          _builder.append(_severityValue, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("# Configured parameters");
      _builder.newLine();
      {
        for(final ConfiguredParameter p : allParams) {
          XExpression _newValue = p.getNewValue();
          IEvaluationResult _evaluate = this.interpreter.evaluate(_newValue);
          Object _result = _evaluate.getResult();
          final Object value = _result;
          _builder.newLineIfNotEmpty();
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
          String _key_1 = this.generatorExtensions.key(p);
          _builder.append(_key_1, "");
          _builder.append("=");
          _builder.append(result, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
