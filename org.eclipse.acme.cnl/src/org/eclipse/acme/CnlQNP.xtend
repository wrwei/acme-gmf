package org.eclipse.acme;

import cnl.MetaValue
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class CnlQNP extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(MetaValue e) {
		return QualifiedName.create(e.name);
	}

}
