/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowComponentExecutionInfoValidator.java,v 1.1 2009/04/25 04:21:35 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkflowComponentExecutionInfoValidator
{
	boolean validate();

	boolean validateStartTime(long value);
	boolean validateEndTime(long value);
}
