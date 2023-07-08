package org.eclipse.acme.evaluation.framework;

import org.eclipse.emf.ecore.EObject;

public class ValidationError extends ValidationProblem{

	public ValidationError(EObject object, String message) {
		super(object, message);
	}

}
