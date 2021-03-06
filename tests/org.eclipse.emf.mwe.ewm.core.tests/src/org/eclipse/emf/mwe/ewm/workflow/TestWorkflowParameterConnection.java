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
package org.eclipse.emf.mwe.ewm.workflow;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.junit.Test;

/**
 * Test functionality of WorkflowParameterConnection
 * @author bhunt
 *
 */
public class TestWorkflowParameterConnection extends WorkflowTestHarness
{
	/**
	 * Test that the value from an output parameter is the value of a connected input parameter
	 * @throws WorkflowRuntimeException
	 */
	@Test
	public void testConnectedParameters() throws WorkflowRuntimeException
	{
		WorkflowParameter out = createStringParameter(null);
		WorkflowParameter in = createStringParameter(null);
		
		WorkflowParameterConnection connection = WorkflowFactory.eINSTANCE.createWorkflowParameterConnection();
		connection.setSourceParameter(out);
		connection.getTargetParameters().add(in);
		
		WorkflowContext context = getContext();
		out.setValue(context, "Hello");
		assertThat((String) in.getValue(context), is("Hello"));
	}
}
