package com.avaloq.tools.dslsdk.check.naming;

import com.avaloq.tools.dslsdk.check.CheckConstants;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("all")
public class CheckIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
  protected String _getSimpleName(final JvmType element) {
    return CheckConstants.IT;
  }
  
  protected String _getSimpleName(final JvmIdentifiableElement element) {
    String _simpleName = super.getSimpleName(element);
    return _simpleName;
  }
  
  public String getSimpleName(final JvmIdentifiableElement element) {
    if (element instanceof JvmType) {
      return _getSimpleName((JvmType)element);
    } else {
      return _getSimpleName(element);
    }
  }
}
