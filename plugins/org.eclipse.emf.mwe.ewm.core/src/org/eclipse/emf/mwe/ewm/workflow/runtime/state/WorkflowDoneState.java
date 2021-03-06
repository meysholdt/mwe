/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime.state;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Done State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowDoneState()
 * @model kind="class"
 * @generated
 */
public class WorkflowDoneState extends WorkflowState
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDoneState()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return StatePackage.Literals.WORKFLOW_DONE_STATE;
	}

	@Override
	public String getDisplayName()
	{
		return "Done";
	}

	
} // WorkflowDoneState
