package com.avaloq.tools.dslsdk.check.core.test.util;

import java.util.List;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

/**
 * Provides utility operations for Check model stubs. Only partial models
 * are returned as strings.
 */
@SuppressWarnings("all")
public class CheckModelUtil {
  /**
   * Returns a base model stub with package (com.test), catalog (c) and grammar (g).
   */
  public String modelWithGrammar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.test");
    _builder.newLine();
    _builder.append("catalog c for grammar g {");
    String _string = _builder.toString();
    return _string;
  }
  
  /**
   * Returns a base model stub with a default category.
   */
  public String modelWithCategory() {
    String _modelWithGrammar = this.modelWithGrammar();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("category \"Default Category\" {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithGrammar, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a base model stub with a check of given name.
   */
  public String modelWithCheck(final String checkName, final String parameter) {
    String _modelWithCategory = this.modelWithCategory();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("error \"");
    _builder.append(checkName, "");
    _builder.append("\" (");
    _builder.append(parameter, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("message \"My Message\" {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a base model stub with a severity range.
   */
  public String modelWithSeverityRange(final String min, final String max, final String severity) {
    String _modelWithCategory = this.modelWithCategory();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SeverityRange(");
    _builder.append(min, "");
    _builder.append(" .. ");
    _builder.append(max, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append(severity, "    ");
    _builder.append(" \"My Check\" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("message \"My Message\"");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a base model stub with a severity range and a default check.
   */
  public String modelWithSeverityRange(final String min, final String max) {
    String _modelWithCategory = this.modelWithCategory();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SeverityRange(");
    _builder.append(min, "");
    _builder.append(" .. ");
    _builder.append(max, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _string);
    String _modelWithCheck = this.modelWithCheck();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _modelWithCheck);
    return _operator_plus_1;
  }
  
  /**
   * Returns a base model stub with a check of given name.
   */
  public String modelWithCheck(final String checkName) {
    String _modelWithCategory = this.modelWithCategory();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("error \"");
    _builder.append(checkName, "");
    _builder.append("\" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("message \"My Message\" {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a base model stub with a check (SomeError) with severity 'error'
   * and message (MyMessage).
   */
  public String modelWithCheck() {
    String _modelWithCategory = this.modelWithCategory();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("error \"Some Error\" ()");
    _builder.newLine();
    _builder.append("message \"My Message\" {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCategory, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a dummy check with given label.
   */
  public String emptyCheck(final String label) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("error \"");
    _builder.append(label, "");
    _builder.append("\" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("message \"My message\" {");
    _builder.newLine();
    _builder.append("}");
    String _string = _builder.toString();
    return _string;
  }
  
  /**
   * Returns a base model stub with a context using context type ContextType
   * 'ctx'.
   */
  public String modelWithContext() {
    String _modelWithCheck = this.modelWithCheck();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for ContextType ctx {");
    String _string = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCheck, _string);
    return _operator_plus;
  }
  
  /**
   * Returns a base model stub with a give collection of contexts.
   */
  public String modelWithContexts(final List<String> contexts) {
    String _modelWithCheck = this.modelWithCheck();
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String c : contexts) {
        String _string = c.toString();
        _builder.append(_string, "");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
      }
    }
    String _string_1 = _builder.toString();
    String _operator_plus = StringExtensions.operator_plus(_modelWithCheck, _string_1);
    return _operator_plus;
  }
  
  /**
   * Returns a complete Check model with multiple SL_ and ML_COMMENTS
   */
  public String modelWithComments() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.test // SL1");
    _builder.newLine();
    _builder.append("/* ML1 */");
    _builder.newLine();
    _builder.append("catalog c /* ML2 */ for grammar g {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// SL2");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("category \"My cat\" {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/* ML3 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// SL3");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("error MYerr \"My Err\" (int Abc = 23) message \"A\" {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("for Atype thisName {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("val x = 3 // SL4");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// SL5");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("/* ML5 */ issue /* ML4 */");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// SL6");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} // SL7");
    _builder.newLine();
    _builder.append("}");
    String _string = _builder.toString();
    return _string;
  }
}
