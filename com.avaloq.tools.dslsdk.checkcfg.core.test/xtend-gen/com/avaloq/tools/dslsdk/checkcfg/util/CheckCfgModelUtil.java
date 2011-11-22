package com.avaloq.tools.dslsdk.checkcfg.util;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

/**
 * Provides utility operations for Check Configuration model stubs. Only partial models
 * are returned as strings.
 */
@SuppressWarnings("all")
public class CheckCfgModelUtil {
  public String basicModel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("check configuration \"Testing\" {");
    String _string = _builder.toString();
    return _string;
  }
  
  public String basicModelWithCatalog() {
    String _basicModel = this.basicModel();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("catalog Sample {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_basicModel, _string);
    return _operator_plus;
  }
  
  public String basicModelWithTest() {
    String _basicModelWithCatalog = this.basicModelWithCatalog();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_basicModelWithCatalog, _string);
    return _operator_plus;
  }
  
  public String basicModelWithDisabledTest() {
    String _basicModelWithCatalog = this.basicModelWithCatalog();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ignore Test");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_basicModelWithCatalog, _string);
    return _operator_plus;
  }
}
