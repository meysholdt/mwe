package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;

public class ValueImplCustom extends ValueImpl {

	protected JvmType findJvmType(URI uri) {
		InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createJvmVoid();
		proxy.eSetProxyURI(uri);
		JvmType result = (JvmType) EcoreUtil.resolve(proxy, this);
		return result;
	}
	
	protected URI getURIForFqn(String fqn) {
		StringBuilder uriBuilder = new StringBuilder(URIHelperConstants.PROTOCOL.length() + 1 + fqn.length() * 2 + 1);
		uriBuilder.append(URIHelperConstants.PROTOCOL).append(":").append(URIHelperConstants.OBJECTS);
		uriBuilder.append(fqn);
		uriBuilder.append('#');
		uriBuilder.append(fqn);
		return URI.createURI(uriBuilder.toString());
	}
	
	protected URI getURIForPrimitive(String primitive) {
		StringBuilder uriBuilder = new StringBuilder(URIHelperConstants.PROTOCOL.length() + 1 + primitive.length() + 1);
		uriBuilder.append(URIHelperConstants.PROTOCOL).append(":").append(URIHelperConstants.PRIMITIVES);
		uriBuilder.append('#');
		uriBuilder.append(primitive);
		return URI.createURI(uriBuilder.toString());
	}
	
}