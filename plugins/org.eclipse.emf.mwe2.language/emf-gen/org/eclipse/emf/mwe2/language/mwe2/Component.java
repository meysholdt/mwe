/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject <em>Auto Inject</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends Referrable, Value
{
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_Module()
	 * @model
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Component#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Auto Inject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Inject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Inject</em>' attribute.
	 * @see #setAutoInject(boolean)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_AutoInject()
	 * @model
	 * @generated
	 */
	boolean isAutoInject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject <em>Auto Inject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Inject</em>' attribute.
	 * @see #isAutoInject()
	 * @generated
	 */
	void setAutoInject(boolean value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignment();

} // Component
