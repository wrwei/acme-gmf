/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package artifact.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class ArtifactDomainNavigatorItem extends PlatformObject {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { EObject.class, IPropertySource.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof artifact.diagram.navigator.ArtifactDomainNavigatorItem) {
					artifact.diagram.navigator.ArtifactDomainNavigatorItem domainNavigatorItem = (artifact.diagram.navigator.ArtifactDomainNavigatorItem) adaptableObject;
					EObject eObject = domainNavigatorItem.getEObject();
					if (adapterType == EObject.class) {
						return eObject;
					}
					if (adapterType == IPropertySource.class) {
						return domainNavigatorItem.getPropertySourceProvider().getPropertySource(eObject);
					}
				}

				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, artifact.diagram.navigator.ArtifactDomainNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private Object myParent;

	/**
	* @generated
	*/
	private EObject myEObject;

	/**
	* @generated
	*/
	private IPropertySourceProvider myPropertySourceProvider;

	/**
	* @generated
	*/
	public ArtifactDomainNavigatorItem(EObject eObject, Object parent, IPropertySourceProvider propertySourceProvider) {
		myParent = parent;
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
	}

	/**
	* @generated
	*/
	public Object getParent() {
		return myParent;
	}

	/**
	* @generated
	*/
	public EObject getEObject() {
		return myEObject;
	}

	/**
	* @generated
	*/
	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof artifact.diagram.navigator.ArtifactDomainNavigatorItem) {
			return EcoreUtil.getURI(getEObject()).equals(
					EcoreUtil.getURI(((artifact.diagram.navigator.ArtifactDomainNavigatorItem) obj).getEObject()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}

}
