/*
 * generated by Xtext
 */
package de.beyondjava.xtext.jsf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ComponentLanguageStandaloneSetup extends ComponentLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ComponentLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
