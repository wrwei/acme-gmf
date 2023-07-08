package org.eclipse.acme.evaluation.framework;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;

public class ValidationProblem {

	protected EObject object;
	protected String message;
	protected IFile file;
	protected BasicDiagnostic diagnostic;
	
	public ValidationProblem(EObject object, String message) {
		this.object = object;
		this.message = message;
	}
	
	public void setObject(EObject object) {
		this.object = object;
	}
	
	public EObject getObject() {
		return object;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setFile(IFile file) {
		this.file = file;
	}
	
	public IFile getFile() {
		return file;
	}
	
	public void setDiagnostic(BasicDiagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}
	
	public BasicDiagnostic getDiagnostic() {
		return diagnostic;
	}
	
}
