/*******************************************************************************
 * Copyright (c) 2009 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext;

/**
 * @author bhunt
 *
 */
public class WorkflowLogExceptionCommand extends WorkflowBaseLogCommand
{
	public WorkflowLogExceptionCommand(WorkflowTransactionalContext context, WorkflowComponent component, Exception e)
	{
		super(context, component);
		this.e = e;
	}
	
	public void doExecute()
	{
		WorkflowLog log = getLog();
		log.logException(e);
	}

	private Exception e;
}
