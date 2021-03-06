/**
 *  Copyright 2014-15 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
 *  
 *  This file is part of BootsFaces.
 *  
 *  BootsFaces is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BootsFaces is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with BootsFaces. If not, see <http://www.gnu.org/licenses/>.
 */

package net.bootsfaces.component.dropMenu;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:dropMenu /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.dropMenu.DropMenu")
public class DropMenuRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:dropMenu.
	* <code>encodeBegin</code> generates the start of the component. After the, the JSF framework calls <code>encodeChildren()</code>
	* to generate the HTML code between the beginning and the end of the component. For instance, in the case of a panel component
	* the content of the panel is generated by <code>encodeChildren()</code>. After that, <code>encodeEnd()</code> is called
	* to generate the rest of the HTML code.
	 * @param context the FacesContext.
	 * @param component the current b:dropMenu.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		DropMenu dropMenu = (DropMenu) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = dropMenu.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("dropMenu", dropMenu);
		Tooltip.generateTooltip(context, dropMenu, rw);
		
	    rw.writeAttribute("binding", dropMenu.getBinding(), "binding");
	    rw.writeAttribute("drop", dropMenu.getDrop(), "drop");
	    rw.writeAttribute("id", dropMenu.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(dropMenu.isRendered()), "rendered");
	    rw.writeAttribute("tooltip", dropMenu.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", dropMenu.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", dropMenu.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", dropMenu.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", dropMenu.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", dropMenu.getValue(), "value");
		rw.writeText("Dummy content of b:dropMenu", null);
		
	}
	
	/**
	 * This methods generates the HTML code of the current b:dropMenu.
	* <code>encodeBegin</code> generates the start of the component. After the, the JSF framework calls <code>encodeChildren()</code>
	* to generate the HTML code between the beginning and the end of the component. For instance, in the case of a panel component
	* the content of the panel is generated by <code>encodeChildren()</code>. After that, <code>encodeEnd()</code> is called
	* to generate the rest of the HTML code.
	 * @param context the FacesContext.
	 * @param component the current b:dropMenu.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		DropMenu dropMenu = (DropMenu) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = dropMenu.getClientId();
		rw.endElement("dropMenu");
	    Tooltip.activateTooltips(fc, c.getAttributes(), c);
	
	}
	
}
