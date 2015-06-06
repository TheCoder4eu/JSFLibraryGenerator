/*
 * generated by Xtext
 */
package de.beyondjava.xtext.jsf.generator

import de.beyondjava.xtext.jsf.componentLanguage.Component
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RendererGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(Component)) {
			fsa.generateFile("net/bootsfaces/component/"+e.name.toFirstUpper + "/" + e.name.toFirstUpper + "Renderer.java", e.compile)
		}
	}

	def compile(Component e) ''' 
		/** to do */
		package net.bootsfaces.components.«e.name»;
		
		/** This class generates the HTML code of &lt;b:«e.name» /&gt;. */
		@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.«e.widgetClass»")
		public class «e.widgetClass»Renderer {
			«generateDecodeMethod(e)»
			
			«generateEncodeBeginMethod(e)»
			
			«generateEncodeEndMethod(e)»
		}
			'''
	
	def generateDecodeMethod(Component e)
		'''
		    @Override
		    public void decode(FacesContext context, UIComponent component) {
		        «e.widgetClass» «e.widget» = («e.widgetClass») component;
		    
		        if («e.widget».isDisabled() || «e.widget».isReadonly()) {
		            return;
		        }
		    
		        decodeBehaviors(context, «e.widget»);
		    
		        String clientId = «e.widget».getClientId(context);
		        String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(«e.widget»);
		    
		        if (submittedValue != null) {
		        	«e.widget».setSubmittedValue(submittedValue);
		        }
		    }
		'''

	def generateEncodeBeginMethod(Component e)
		'''
			@Override
			public void encodeBegin(FacesContext context, UIComponent component) {
			    if (!component.isRendered()) {
			        return;
			    }
				«e.widgetClass» «e.widget» = («e.widgetClass») component;
				Map<String, Object> attrs = «e.widget».getAttributes();
				ResponseWriter rw = context.getResponseWriter();
				String clientId = «e.widget».getClientId();
				
				// put custom code here
			}
		'''

	def generateEncodeEndMethod(Component e)
		'''
			@Override
			public void encodeEnd(FacesContext context, UIComponent component) {
			    if (!component.isRendered()) {
			        return;
			    }
				«e.widgetClass» «e.widget» = («e.widgetClass») component;
				Map<String, Object> attrs = «e.widget».getAttributes();
				ResponseWriter rw = context.getResponseWriter();
				String clientId = «e.widget».getClientId();

				// Simple demo widget that simply renders every attribute value
				rw.startElement("«e.widgetClass», «e.widget»");
				Tooltip.generateTooltip(«e.widget», attrs, rw);
				
			    «FOR f : e.attributes»
			        rw.writeAttribute("«f.name»", «e.widget».get«f.name.toFirstUpper», "«f.name»");
			    «ENDFOR»
			    rw.writeText("Dummy content of b:«e.widgetClass»");
				rw.endElement("«e.widgetClass»");
			}
		'''
	
	
	def widgetClass(Component c) {
		'''«c.name.toFirstUpper»'''
	}
	
	def widget(Component c) {
		'''«c.name.toFirstLower»'''
	}
}