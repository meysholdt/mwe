/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.parser;

import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.factories.IWorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.25.2.1 $
 */
public class WorkflowContentHandler extends DefaultHandler {

	private static final String NO_VALID_CHILD_ELEMENT_MSG = "is no valid child element for element";

	private static final String ILLEGAL_TAG_NAME_MSG = "Illegal tag name:";

	private static final String TAG_NAME_PATTERN = "[a-zA-Z0-9\\.\\-]+";

	protected Locator locator;

	protected WorkflowEditor editor;

	protected IProject project;

	protected IDocument document;

	private IWorkflowElement rootElement;

	private IWorkflowElement currentElement;

	private String positionCategory;

	/**
	 * This method overrides the implementation of <code>endDocument</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	@Override
	public void endDocument() throws SAXException {
		assert currentElement == rootElement;
		rootElement.setEndElementRange(createPositionRange());
	}

	/**
	 * This method overrides the implementation of <code>endElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(final String uri, final String ln, final String qName) throws SAXException {
		if (isIllegalName(qName))
			throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG + qName, true);

		currentElement.setEndElementRange(createPositionRange());
		if (currentElement.hasParent()) {
			currentElement = currentElement.getParent();
		}
	}

	/**
	 * Returns the value of field <code>positionCategory</code>.
	 * 
	 * @return value of <code>positionCategory</code>.
	 */
	public String getPositionCategory() {
		return positionCategory;
	}

	/**
	 * Returns the value of field <code>rootElement</code>.
	 * 
	 * @return value of <code>rootElement</code>.
	 */
	public IWorkflowElement getRootElement() {
		return rootElement;
	}

	/**
	 * Sets a new value for field <code>document</code>.
	 * 
	 * @param document
	 *            new value for <code>document</code>.
	 */
	public void setDocument(final IDocument document) {
		this.document = document;
	}

	/**
	 * This method overrides the implementation of
	 * <code>setDocumentLocator</code> inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator)
	 */
	@Override
	public void setDocumentLocator(final Locator locator) {
		this.locator = locator;
	}

	/**
	 * Sets a new value for field <code>editor</code>.
	 * 
	 * @param editor
	 *            new value for <code>editor</code>.
	 */
	public void setEditor(WorkflowEditor editor) {
		this.editor = editor;
	}

	/**
	 * Sets a new value for field <code>positionCategory</code>.
	 * 
	 * @param positionCategory
	 *            new value for <code>positionCategory</code>.
	 */
	public void setPositionCategory(final String positionCategory) {
		this.positionCategory = positionCategory;
	}

	/**
	 * Sets a new value for field <code>project</code>.
	 * 
	 * @param project
	 *            new value for <code>project</code>.
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

	/**
	 * This method overrides the implementation of <code>startDocument</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	@Override
	public void startDocument() throws SAXException {
		rootElement = newWorkflowElement(IWorkflowElement.WORKFLOWFILE_TAG);
		currentElement = rootElement;
		rootElement.setStartElementRange(createPositionRange());
	}

	/**
	 * This method overrides the implementation of <code>startElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(final String uri, final String ln, final String qName, final Attributes attributes)
			throws SAXException {

		final IWorkflowElement element = newWorkflowElement(qName);
		if (isIllegalName(qName))
			throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG + " " + qName, true);

		element.setStartElementRange(createPositionRange());
		for (int i = 0; i < attributes.getLength(); i++) {
			final String attrName = attributes.getQName(i);
			final String attrValue = attributes.getValue(i);
			IWorkflowSyntaxFactory factory = WorkflowSyntaxFactory.getInstance();
			final IWorkflowAttribute attr = factory.newWorkflowAttribute(element, attrName, attrValue);
			element.addAttribute(attr);
		}

		if (element.isValidChildFor(currentElement)) {
			currentElement.addChild(element);
		}
		else
			throw new ValidationException(locator, "'" + qName + "' " + NO_VALID_CHILD_ELEMENT_MSG + " '"
					+ currentElement.getName() + "'", true);
		currentElement = element;
	}

	private ElementPositionRange createPositionRange() {
		final int line = locator.getLineNumber() - 1;
		final int offset = getOffsetFromLine(line);
		final int startOffset = getCharStart(offset);
		final int endOffset = getCharEnd(offset);
		return new ElementPositionRange(document, startOffset, endOffset);
	}

	private Integer getCharEnd(final int offset) {
		try {
			final IRegion region = document.getLineInformationOfOffset(offset);
			final int endChar = region.getOffset() + region.getLength();
			return endChar;
		}
		catch (final BadLocationException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Integer getCharStart(final int offset) {
		return searchChar(offset, '<', true);
	}

	private Integer searchChar(int offset, char stopChar, boolean backwards) {
		try {
			int singleQuotes = 0;
			int doubleQuotes = 0;
			int i = offset;

			while (i >= 0 && i <= document.getLength() - 1) {
				char ch = document.getChar(i);
				if (ch == '"') {
					doubleQuotes++;
					continue;
				}
				else if (ch == '\'') {
					singleQuotes++;
					continue;
				}

				if (ch == stopChar && (singleQuotes % 2 == 0) && (doubleQuotes % 2 == 0)) {
					break;
				}

				if (backwards) {
					i--;
				}
				else {
					i++;
				}
			}
			return i;
		}
		catch (BadLocationException e) {
			Log.logError("", e);
			return -1;
		}
	}

	private int getOffsetFromLine(final int lineNumber) {
		int offset = 0;
		try {
			offset = document.getLineOffset(lineNumber);
		}
		catch (final BadLocationException e) {
			try {
				offset = document.getLineOffset(lineNumber - 1);
			}
			catch (final BadLocationException e1) {
			}
		}
		return offset;
	}

	private boolean isIllegalName(final String name) {
		return !Pattern.matches(TAG_NAME_PATTERN, name);
	}

	private IWorkflowElement newWorkflowElement(String name) {
		final IWorkflowSyntaxFactory factory = WorkflowSyntaxFactory.getInstance();
		IWorkflowElement element;
		if (editor != null && editor.getInputFile() != null) {
			element = factory.newWorkflowElement(editor, editor.getInputFile().getProject(), document, name);
		}
		else {
			element = factory.newWorkflowElement(null, project, document, name);
		}
		return element;
	}
}
