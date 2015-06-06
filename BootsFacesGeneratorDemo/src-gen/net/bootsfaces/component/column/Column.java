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

package net.bootsfaces.component.column;

import javax.faces.component.*;

/** This class holds the attributes of &lt;b:column /&gt;. */
@FacesComponent("net.bootsfaces.component.column.Column")
public class Column extends UIOutput {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.column.Column";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.column.Column";
	
	public Column() {
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
colLg,
colMd,
colSm,
colXs,
id,
offset,
offsetLg,
offsetSm,
offsetXs,
span,
style,
styleClass,
tooltip,
tooltipDelay,
tooltipDelayHide,
tooltipDelayShow,
tooltipPosition
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
	 * Integer value to specify how many columns to span. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getColLg() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.colLg, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to span. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColLg(int _colLg) {
	    getStateHelper().put(PropertyKeys.colLg, _colLg);
    }
	

	/**
	 * Integer value to specify how many columns to span. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getColMd() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.colMd, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to span. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColMd(int _colMd) {
	    getStateHelper().put(PropertyKeys.colMd, _colMd);
    }
	

	/**
	 * Integer value to specify how many columns to span. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getColSm() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.colSm, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to span. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColSm(int _colSm) {
	    getStateHelper().put(PropertyKeys.colSm, _colSm);
    }
	

	/**
	 * Integer value to specify how many columns to span. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getColXs() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.colXs, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to span. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColXs(int _colXs) {
	    getStateHelper().put(PropertyKeys.colXs, _colXs);
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
	 * Integer value to specify how many columns to offset. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getOffset() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.offset, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to offset. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOffset(int _offset) {
	    getStateHelper().put(PropertyKeys.offset, _offset);
    }
	

	/**
	 * Integer value to specify how many columns to offset. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getOffsetLg() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.offsetLg, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to offset. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOffsetLg(int _offsetLg) {
	    getStateHelper().put(PropertyKeys.offsetLg, _offsetLg);
    }
	

	/**
	 * Integer value to specify how many columns to offset. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getOffsetSm() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.offsetSm, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to offset. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOffsetSm(int _offsetSm) {
	    getStateHelper().put(PropertyKeys.offsetSm, _offsetSm);
    }
	

	/**
	 * Integer value to specify how many columns to offset. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getOffsetXs() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.offsetXs, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to offset. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOffsetXs(int _offsetXs) {
	    getStateHelper().put(PropertyKeys.offsetXs, _offsetXs);
    }
	

	/**
	 * Integer value to specify how many columns to span. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getSpan() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.span, 0);
		return (int) value;
	}
	
	/**
	 * Integer value to specify how many columns to span. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSpan(int _span) {
	    getStateHelper().put(PropertyKeys.span, _span);
    }
	

	/**
	 * Inline style of the input element. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.style);
		return  value;
	}
	
	/**
	 * Inline style of the input element. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
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
	 * The text of the tooltip. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltip);
		return  value;
	}
	
	/**
	 * The text of the tooltip. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
    }
	

	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipDelay() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelay);
		return  value;
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(String _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipDelayHide() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelayHide);
		return  value;
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(String _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipDelayShow() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelayShow);
		return  value;
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(String _tooltipDelayShow) {
	    getStateHelper().put(PropertyKeys.tooltipDelayShow, _tooltipDelayShow);
    }
	

	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipPosition() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipPosition);
		return  value;
	}
	
	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipPosition(String _tooltipPosition) {
	    getStateHelper().put(PropertyKeys.tooltipPosition, _tooltipPosition);
    }
	
}

