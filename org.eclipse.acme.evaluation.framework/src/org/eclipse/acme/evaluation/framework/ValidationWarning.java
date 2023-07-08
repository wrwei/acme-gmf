package org.eclipse.acme.evaluation.framework;

import org.eclipse.emf.ecore.EObject;

public class ValidationWarning extends ValidationProblem{

	public ValidationWarning(EObject object, String message) {
		super(object, message);
	}

}
