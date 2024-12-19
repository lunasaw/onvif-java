
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZPositionFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPositionFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MinPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *         <element name="MaxPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *         <element name="EnterOrExit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZPositionFilter", propOrder = {
    "minPosition",
    "maxPosition",
    "enterOrExit",
    "any"
})
public class PTZPositionFilter {

    /**
     * The lower boundary of the PTZ volume to look for.
     * 
     */
    @XmlElement(name = "MinPosition", required = true)
    protected PTZVector minPosition;
    /**
     * The upper boundary of the PTZ volume to look for.
     * 
     */
    @XmlElement(name = "MaxPosition", required = true)
    protected PTZVector maxPosition;
    /**
     * If true, search for when entering the specified PTZ volume.
     * 
     */
    @XmlElement(name = "EnterOrExit")
    protected boolean enterOrExit;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The lower boundary of the PTZ volume to look for.
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getMinPosition() {
        return minPosition;
    }

    /**
     * Sets the value of the minPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     * @see #getMinPosition()
     */
    public void setMinPosition(PTZVector value) {
        this.minPosition = value;
    }

    /**
     * The upper boundary of the PTZ volume to look for.
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getMaxPosition() {
        return maxPosition;
    }

    /**
     * Sets the value of the maxPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     * @see #getMaxPosition()
     */
    public void setMaxPosition(PTZVector value) {
        this.maxPosition = value;
    }

    /**
     * If true, search for when entering the specified PTZ volume.
     * 
     */
    public boolean isEnterOrExit() {
        return enterOrExit;
    }

    /**
     * Sets the value of the enterOrExit property.
     * 
     */
    public void setEnterOrExit(boolean value) {
        this.enterOrExit = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
