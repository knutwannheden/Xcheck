package com.avaloq.tools.dslsdk.check.core.test.util;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class CheckTestUtil {
  /**
   * Gets the first instance of given type in given context object.
   */
  public <T extends EObject> T getFirstInstanceOf(final EObject context, final Class<T> type) {
    T _instanceOf = this.<T>getInstanceOf(context, type, null, null, 1);
    return _instanceOf;
  }
  
  /**
   * Gets any instance of given type containing a given structural feature with given value using a given context object.
   */
  public <T extends EObject> T getInstanceOf(final EObject context, final Class<T> type, final int instance) {
    T _instanceOf = this.<T>getInstanceOf(context, type, null, null, instance);
    return _instanceOf;
  }
  
  /**
   * Gets the all instances of given type <code>type</code> having given value <code>value</code> on structural feature <code>feature</code>.
   */
  public <T extends EObject> Iterable<T> getAllInstancesOf(final EObject context, final Class<T> type, final EStructuralFeature feature, final Object value) {
      ArrayList<T> _newArrayList = Lists.<T>newArrayList();
      final ArrayList<T> result = _newArrayList;
      List<T> _allContentsOfType = EcoreUtil2.<T>getAllContentsOfType(context, type);
      for (final T candidate : _allContentsOfType) {
        {
          Object _eGet = candidate.eGet(feature);
          Object valueOfFeature = _eGet;
          boolean _operator_and = false;
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(valueOfFeature, null);
          if (!_operator_notEquals) {
            _operator_and = false;
          } else {
            boolean _equals = valueOfFeature.equals(value);
            _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _equals);
          }
          if (_operator_and) {
            result.add(candidate);
          }
        }
      }
      return result;
  }
  
  /**
   * Gets the first instance of given type containing a given structural feature with given value using a given context object.
   */
  public <T extends EObject> T getFirstInstanceOf(final EObject context, final Class<T> type, final EStructuralFeature feature, final Object value) {
    T _instanceOf = this.<T>getInstanceOf(context, type, feature, value, 1);
    return _instanceOf;
  }
  
  /**
   * Gets any instance of given type containing a given structural feature with given value using a given context object.
   */
  public <T extends EObject> T getInstanceOf(final EObject context, final Class<T> type, final EStructuralFeature feature, final Object value, final int instance) {
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)instance), ((Integer)1));
      int skip = _operator_minus;
      List<T> _allContentsOfType = EcoreUtil2.<T>getAllContentsOfType(context, type);
      for (final T candiadate : _allContentsOfType) {
        boolean _operator_or = false;
        boolean _operator_and = false;
        boolean _operator_equals = ObjectExtensions.operator_equals(feature, null);
        if (!_operator_equals) {
          _operator_and = false;
        } else {
          boolean _operator_equals_1 = ObjectExtensions.operator_equals(value, null);
          _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
        }
        if (_operator_and) {
          _operator_or = true;
        } else {
          Object _eGet = candiadate.eGet(feature);
          boolean _equals = _eGet.equals(value);
          _operator_or = BooleanExtensions.operator_or(_operator_and, _equals);
        }
        if (_operator_or) {
          boolean _operator_equals_2 = ObjectExtensions.operator_equals(((Integer)skip), ((Integer)0));
          if (_operator_equals_2) {
            return candiadate;
          } else {
            int _operator_minus_1 = IntegerExtensions.operator_minus(((Integer)skip), ((Integer)1));
            skip = _operator_minus_1;
          }
        }
      }
      return null;
  }
}
