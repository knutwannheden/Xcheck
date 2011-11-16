/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.check.check;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(JvmFormalParameter)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getFormalParameter_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	JvmFormalParameter getParameter();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(JvmFormalParameter value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(XExpression)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getFormalParameter_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getDefaultValue();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(XExpression value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.avaloq.tools.dslsdk.check.check.CheckPackage#getFormalParameter_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.check.check.FormalParameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // FormalParameter
