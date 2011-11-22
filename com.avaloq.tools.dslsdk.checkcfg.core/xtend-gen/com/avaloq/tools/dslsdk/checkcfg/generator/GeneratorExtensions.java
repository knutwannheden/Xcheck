package com.avaloq.tools.dslsdk.checkcfg.generator;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.generator.CheckGeneratorExtensions;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class GeneratorExtensions {
  @Inject
  private CheckGeneratorExtensions checkGenerator;
  
  public String outputPath() {
    return ".settings";
  }
  
  public String fileName(final CheckConfiguration configuration) {
    return "com.avaloq.tools.dslsdk.checkcfg.core.prefs";
  }
  
  protected String _key(final ConfiguredCheck check) {
    Check _check = check.getCheck();
    String _severityKey = this.checkGenerator.severityKey(_check);
    return _severityKey;
  }
  
  protected String _key(final ConfiguredParameter param) {
    FormalParameter _parameter = param.getParameter();
    String _parameterKey = this.checkGenerator.parameterKey(_parameter);
    return _parameterKey;
  }
  
  public int severityValue(final ConfiguredCheck check) {
      SeverityKind _severity = check.getSeverity();
      boolean _equals = _severity.equals(SeverityKind.INHERIT);
      if (_equals) {
        Check _check = check.getCheck();
        com.avaloq.tools.dslsdk.check.check.SeverityKind _defaultSeverity = _check.getDefaultSeverity();
        int _value = _defaultSeverity.getValue();
        return _value;
      }
      SeverityKind _severity_1 = check.getSeverity();
      String _name = _severity_1.name();
      int _severityValue = this.checkGenerator.severityValue(_name);
      return _severityValue;
  }
  
  public String key(final EObject check) {
    if (check instanceof ConfiguredCheck) {
      return _key((ConfiguredCheck)check);
    } else if (check instanceof ConfiguredParameter) {
      return _key((ConfiguredParameter)check);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(check).toString());
    }
  }
}
