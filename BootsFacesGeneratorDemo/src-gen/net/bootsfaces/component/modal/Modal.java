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

package net.bootsfaces.component.modal;

import javax.faces.component.*;

/** This class holds the attributes of &lt;b:modal /&gt;. */
@FacesComponent("net.bootsfaces.component.modal.Modal")
public class Modal extends UIComponentBase {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.modal.Modal";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.modal.Modal";
	
	public Modal() {
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
backdrop,
closeOnEscape,
id,
size,
styleClass,
title
;

        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * By default, you can close a modal dialog by clicking somewhere outside the modal. Set backdrop="false" to disable this feature. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isBackdrop() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.backdrop, true);
		return (boolean) value;
	}
	
	/**
	 * By default, you can close a modal dialog by clicking somewhere outside the modal. Set backdrop="false" to disable this feature. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBackdrop(boolean _backdrop) {
	    getStateHelper().put(PropertyKeys.backdrop, _backdrop);
    }
	

	/**
	 * By default, users can close modal dialogs by hitting the ESC key. Set close-on-escape="false" to disable this feature. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isCloseOnEscape() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.closeOnEscape, true);
		return (boolean) value;
	}
	
	/**
	 * By default, users can close modal dialogs by hitting the ESC key. Set close-on-escape="false" to disable this feature. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setCloseOnEscape(boolean _closeOnEscape) {
	    getStateHelper().put(PropertyKeys.closeOnEscape, _closeOnEscape);
    }
	

	/**
	 * Unique identifier of the component in a namingContainer. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getId() {
		String value = (String)getStateHelper().eval(PropertyKeys.id);
		return  value;
	}
	
	/**
	 * Unique identifier of the component in a namingContainer. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setId(String _id) {
	    getStateHelper().put(PropertyKeys.id, _id);
    }
	

	/**
	 * Modal's size. Possible values modal-sm, modal-lg <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getSize() {
		String value = (String)getStateHelper().eval(PropertyKeys.size);
		return  value;
	}
	
	/**
	 * Modal's size. Possible values modal-sm, modal-lg <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSize(String _size) {
	    getStateHelper().put(PropertyKeys.size, _size);
    }
	

	/**
	 * Style class of this element. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.styleClass);
		return  value;
	}
	
	/**
	 * Style class of this element. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }
	

	/**
	 * Bold title displayed in Modal's header. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTitle() {
		String value = (String)getStateHelper().eval(PropertyKeys.title);
		return  value;
	}
	
	/**
	 * Bold title displayed in Modal's header. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTitle(String _title) {
	    getStateHelper().put(PropertyKeys.title, _title);
    }
	
}

