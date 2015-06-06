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

package net.bootsfaces.component.internalIE8CompatibilityLink;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:internalIE8CompatibilityLink /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.internalIE8CompatibilityLink.InternalIE8CompatibilityLink")
public class InternalIE8CompatibilityLinkRenderer extends CoreRenderer {
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		InternalIE8CompatibilityLink internalIE8CompatibilityLink = (InternalIE8CompatibilityLink) component;
		Map<String, Object> attrs = internalIE8CompatibilityLink.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = internalIE8CompatibilityLink.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("internalIE8CompatibilityLink", internalIE8CompatibilityLink);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeText("Dummy content of b:InternalIE8CompatibilityLink", null);
		rw.endElement("InternalIE8CompatibilityLink");
	}
}
