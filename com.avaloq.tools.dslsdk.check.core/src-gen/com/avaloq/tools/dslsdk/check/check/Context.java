/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.check.check;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.Context#getContextType <em>Context Type</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.Context#getIt <em>It</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.Context#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Documented
{
	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' containment reference.
	 * @see #setContextType(JvmTypeReference)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getContext_ContextType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getContextType();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.Context#getContextType <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' containment reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>It</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>It</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>It</em>' attribute.
	 * @see #setIt(String)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getContext_It()
	 * @model
	 * @generated
	 */
	String getIt();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.Context#getIt <em>It</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>It</em>' attribute.
	 * @see #getIt()
	 * @generated
	 */
	void setIt(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(XExpression)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getContext_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getConstraint();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.Context#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(XExpression value);

} // Context
