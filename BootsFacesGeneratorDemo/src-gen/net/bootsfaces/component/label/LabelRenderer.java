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

package net.bootsfaces.component.label;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:label /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.label.Label")
public class LabelRenderer extends CoreRenderer {
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Label label = (Label) component;
		Map<String, Object> attrs = label.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = label.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("label", label);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", label.getBinding(), "binding");
	    rw.writeAttribute("id", label.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(label.isRendered()), "rendered");
	    rw.writeAttribute("severity", label.getSeverity(), "severity");
	    rw.writeAttribute("text", label.getText(), "text");
	    rw.writeAttribute("tooltip", label.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", label.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", label.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", label.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", label.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Label", null);
		rw.endElement("Label");
	}
}