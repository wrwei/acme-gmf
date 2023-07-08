package org.eclipse.acme.evaluation.framework;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;

public class ValidationCentre {

	protected ArrayList<ValidationWarning> warnings = new ArrayList<>();
	protected ArrayList<ValidationError> errors = new ArrayList<>();
	
	private static ValidationCentre instance = new ValidationCentre();
	public static ValidationCentre getInstance() {
		return instance;
	}
	
	public void init() {
		clear();
	}
	
	public void addError(EObject object, String message, BasicDiagnostic diagnostic, IFile file) {
		ValidationError error = new ValidationError(object, message);
		error.setDiagnostic(diagnostic);
		error.setFile(file);
		errors.add(error);
	}
	
	public void removeError(EObject object) {
		ArrayList<ValidationError> temp = new ArrayList<>();
		for(ValidationError error: errors) {
			if (error.getObject().equals(object)) {
				temp.add(error);
			}
		}
		errors.removeAll(temp);
	}
	
	public void addWarning(EObject object, String message, BasicDiagnostic diagnostic, IFile file) {
		ValidationWarning warning = new ValidationWarning(object, message);
		warning.setDiagnostic(diagnostic);
		warning.setFile(file);
		warnings.add(warning);
	}
	
	public void removeWarning(EObject object) {
		ArrayList<ValidationWarning> temp = new ArrayList<>();
		for(ValidationWarning warning: warnings) {
			if (warning.getObject().equals(object)) {
				temp.add(warning);
			}
		}
		warnings.removeAll(temp);
	}
	
	public void clear()
	{
		warnings.clear();
		errors.clear();
	}
	
	public void clear(EObject container) {
		for(EObject obj: container.eContents()) {
			removeError(obj);
		}
	}
	
	public ArrayList<ValidationError> getErrors() {
		return errors;
	}
	
	public ArrayList<ValidationWarning> getWarnings() {
		return warnings;
	}
	
	public ValidationError getError(Object object) {
		for(ValidationError error: errors) {
			if (error.getObject().equals(object)) {
				return error;
			}
		}
		return null;
	}
	
	public ValidationWarning getWarning(Object object) {
		for(ValidationWarning warning: warnings) {
			if (warning.getObject().equals(object)) {
				return warning;
			}
		}
		return null;
	}
	
	public ArrayList<ValidationError> getErrors(EObject object) {
		ArrayList<ValidationError> temp = new ArrayList<>();
		for(EObject obj: object.eContents()) {
			ValidationError error = getError(obj);
			if (error != null) {
				temp.add(error);
			}
		}
		return temp;
	}
	
	public ArrayList<ValidationWarning> getWarnings(EObject object) {
		ArrayList<ValidationWarning> temp = new ArrayList<>();
		for(EObject obj: object.eContents()) {
			ValidationWarning warning = getWarning(obj);
			if (warning != null) {
				temp.add(warning);
			}
		}
		return temp;
	}
}
