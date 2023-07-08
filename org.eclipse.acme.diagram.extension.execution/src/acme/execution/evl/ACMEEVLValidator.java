/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * Copyright (c) 2012-2014 University of Twente.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package acme.execution.evl;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.emc.emf.EmfPrettyPrinter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.types.EolAnyType;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlFixer;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import acme.execution.activator.Activator;

public class ACMEEVLValidator {

	protected Set<String> diagnosticVariables = null;
	protected EvlModule module = null;
	protected URI source = null;
	protected EmfPrettyPrinter printer = new EmfPrettyPrinter();
	protected Resource currentResource = null;
	protected ValidationResults results = new ValidationResults();;
	protected Collection<EObject> history = new ArrayList<EObject>();
	protected String modelName;
	protected String ePackageUri;
	protected String bundleId;
	protected boolean showErrorDialog = true;
	protected boolean logErrors = true;

	/** Collection of all packages that are available to this validator */
	protected Collection<EPackage> ePackages = new ArrayList<EPackage>();
	
	public static final String DEFAULT_MODEL_NAME = "_Model";

	/**
	 * Key for the validation context, that (when provided) holds a
	 * IProgressMonitor object
	 */
	public static final String VALIDATION_MONITOR = "Epsilon EVL Validation Monitor";

	/**
	 * Note when using this constructor, make sure to call
	 * {@link #initialise(URI, String, String, String)} afterwards
	 */
	public ACMEEVLValidator()
	{
	}
	
	public ACMEEVLValidator(URI source, String modelName, String bundleId) {
		initialise(source, modelName, bundleId);
	}

	public void initialise(URI source, String modelName, String bundleId) {
		// Emulate old 4-arg constructor by only allowing initialisation once
		if (this.source == null) {
			this.source = source;
			this.modelName = modelName;
			this.bundleId = bundleId;
			addAdditionalPackage("http://omg.sacm/2.0/assurancecase");
			addAdditionalPackage("http://omg.sacm/2.0/argumentation");
			addAdditionalPackage("http://omg.sacm/2.0/artifact");
			addAdditionalPackage("http://omg.sacm/2.0/terminology");
			addAdditionalPackage("http://omg.sacm/2.0/base");
			addAdditionalPackage("http://org.eclipse.acme/1.0/gsn");
		} else {
			Activator.getDefault().getLog().log(new Status(
				IStatus.WARNING, Activator.PLUGIN_ID,
				"Ignored duplicate initialisation of validator (" + source.toString() + ")."));
		}
	}

	/**
	 * <p>Indicates that the value of the entry of the {@link Diagnostician}
	 * context {@link java.util.Map} with the specified <code>name</code> should
	 * be published as a global variable in the EVL script. If the context map
	 * does not contain an entry with the specified <code>name</code>, the variable
	 * will be set to <code>null</code>.
	 *
	 * <p>Note: this map is received through the <code>validate</code> methods in this
	 * class.</p>
	 *
	 * @see #validate(EObject, DiagnosticChain, Map)
	 * @see #validate(EClass, EObject, DiagnosticChain, Map)
	 * @see #validate(EDataType, Object, DiagnosticChain, Map)
	 */
	public void addDiagnosticianVariable(String name) {
		if(diagnosticVariables == null) {
			diagnosticVariables = new HashSet<String>();
		}
		diagnosticVariables.add(name);
	}

	/**
	 * Make an additional package available to be used by this validator.
	 * 
	 * @param packageUri
	 *            Namespace URI of the package
	 */
	public void addAdditionalPackage(String packageUri) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
		if (ePackage != null) {
			ePackages.add(ePackage);
		}
	}
	
	public boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (eObject.eResource() == null) return false;
		
		// If it is the root that is validated validate the whole resource and cache the results
		if (eObject.eContainer() == null) {
			validate(eObject.eResource(), context);

			// Add problem markers for violations in objects in externally referenced models
			for (Map.Entry<Object, Collection<UnsatisfiedConstraint>> entry : results.entrySet()) {
				if (!(entry.getKey() instanceof EObject)) {
					continue;
				}
				final EObject key = (EObject)entry.getKey();
//				if (key.eResource() == eObject.eResource()) {
//					continue;
//				}
				addMarkers("", key, diagnostics);
//				addMarkers("[" + key.eResource().getURI() + "] ", key, diagnostics);
			}
		}

		addMarkers("", eObject, diagnostics);
		return results.size() == 0;
	}

	public boolean validate(EDataType dataType, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	protected Diagnostic createDiagnostic(String msgPrefix, UnsatisfiedConstraint unsatisfied) {
		int severity = 0;

		if (unsatisfied.getConstraint().isCritique()) {
			if (unsatisfied.getConstraint().isInfo()) {
				severity = Diagnostic.INFO;
			}
			else {
				severity = Diagnostic.WARNING;
			}
		}
		else severity = Diagnostic.ERROR;
		String message = unsatisfied.getMessage();
		int code = 0;

		BasicDiagnostic diagnostic = new BasicDiagnostic(severity, bundleId, code, msgPrefix + message, new Object[]{ unsatisfied.getInstance() });

		return diagnostic;
	}
	
	protected void validate(Resource resource, Map<Object, Object> context) {
		results.clear();

		module = new EvlModule();
		try {
			module.parse(source);
		} catch (Exception e) {
			if (logException(e)) {
				LogUtil.log("An error was encountered while parsing " + source + " : " + e.getMessage(), e, isShowErrorDialog());
			}
			
			return;
		}

		if (module.getParseProblems().size() > 0) {
			if (isLogErrors()) {
				LogUtil.log(source + " has one or more syntax errors : " + module.getParseProblems().get(0).toString(), null, isShowErrorDialog());
			}
			return;
		}

		InMemoryEmfModel model = new InMemoryEmfModel(modelName, resource, ePackages);
		module.getContext().getModelRepository().addModel(model);
		
		// Add variables to the EvlModule to make the available to the EVL rules
		if (diagnosticVariables != null) {
			for (String diagnosticVariable : diagnosticVariables) {
				final Variable variable = new Variable(diagnosticVariable,
						context.get(diagnosticVariable),
						EolAnyType.Instance);
				module.getContext().getFrameStack().put(variable);
			}
		}

		try {
			module.execute();
			module.setUnsatisfiedConstraintFixer(new IEvlFixer() {
				public void fix(IEvlModule module) throws EolRuntimeException {
					// Do nothing
				}
			});

			for (UnsatisfiedConstraint unsatisfied : module.getContext().getUnsatisfiedConstraints()) {
				Object key = unsatisfied.getInstance();
				if (!results.containsKey(key)) {
					results.put(key, new ArrayList<UnsatisfiedConstraint>());
				}
				results.get(key).add(unsatisfied);
			}
		} catch (EolRuntimeException e) {
			if (logException(e)) {
				LogUtil.log("A runtime error was raised during the evaluation of " + source + " : " + e.getMessage(), e, isShowErrorDialog());
			}
		}
		finally {
			module.getContext().dispose();
			module.getContext().getModelRepository().dispose();
		}
	}

	protected void addMarkers(String msgPrefix, EObject eObject, DiagnosticChain diagnostics) {
		if(diagnostics == null) {
			// user is not interested in markers...
			return;
		}
		Collection<UnsatisfiedConstraint> unsatisfiedConstraints = results.get(eObject);
		
		if (unsatisfiedConstraints != null && unsatisfiedConstraints.size() > 0) {
			for (UnsatisfiedConstraint unsatisfied : unsatisfiedConstraints) {
				diagnostics.add(createDiagnostic(msgPrefix, unsatisfied));
			}
		}
	}

	/** @return true if an error dialog needs to be shown when an error occurs */
	public boolean isShowErrorDialog() {
		return showErrorDialog;
	}

	/**
	 * Sets whether an error dialog needs to be shown
	 * 
	 * @see #isShowErrorDialog()
	 */
	public void setShowErrorDialog(boolean showErrorDialog) {
		this.showErrorDialog = showErrorDialog;
	}

	/**
	 * Method to determine whether the given exception needs to be logged. Can
	 * be overridden to filter out certain types of exceptions (e.g. when the
	 * user cancelled the validation)
	 * 
	 * @return true if error needs to be logged
	 */
	public boolean logException(Exception exception) {
		return isLogErrors();
	}

	/**
	 * This method is used by the default implementation of
	 * {@link #logException(Exception) logException()}
	 * 
	 * @return true if errors need to be logged
	 * @see #logException(Exception)
	 */
	public boolean isLogErrors() {
		return logErrors;
	}

}
