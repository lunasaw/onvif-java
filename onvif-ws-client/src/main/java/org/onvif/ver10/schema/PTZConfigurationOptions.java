
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Spaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/>
 *         <element name="PTZTimeout" type="{http://www.onvif.org/ver10/schema}DurationRange"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions2" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PTZRamps" type="{http://www.onvif.org/ver10/schema}IntAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfigurationOptions", propOrder = {
    "spaces",
    "ptzTimeout",
    "any",
    "ptControlDirection",
    "extension"
})
public class PTZConfigurationOptions {

    /**
     * A list of supported coordinate systems including their range limitations.
     * 
     */
    @XmlElement(name = "Spaces", required = true)
    protected PTZSpaces spaces;
    /**
     * A timeout Range within which Timeouts are accepted by the PTZ Node.
     * 
     */
    @XmlElement(name = "PTZTimeout", required = true)
    protected DurationRange ptzTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Supported options for PT Direction Control.
     * 
     */
    @XmlElement(name = "PTControlDirection")
    protected PTControlDirectionOptions ptControlDirection;
    @XmlElement(name = "Extension")
    protected PTZConfigurationOptions2 extension;
    /**
     * The list of acceleration ramps supported by the device. The
     *           smallest acceleration value corresponds to the minimal index, the
     *           highest acceleration corresponds to the maximum index.
     * 
     */
    @XmlAttribute(name = "PTZRamps")
    protected List<Integer> ptzRamps;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A list of supported coordinate systems including their range limitations.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSpaces() {
        return spaces;
    }

    /**
     * Sets the value of the spaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     * @see #getSpaces()
     */
    public void setSpaces(PTZSpaces value) {
        this.spaces = value;
    }

    /**
     * A timeout Range within which Timeouts are accepted by the PTZ Node.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getPTZTimeout() {
        return ptzTimeout;
    }

    /**
     * Sets the value of the ptzTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     * @see #getPTZTimeout()
     */
    public void setPTZTimeout(DurationRange value) {
        this.ptzTimeout = value;
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
     * Supported options for PT Direction Control.
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionOptions }
     *     
     */
    public PTControlDirectionOptions getPTControlDirection() {
        return ptControlDirection;
    }

    /**
     * Sets the value of the ptControlDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionOptions }
     *     
     * @see #getPTControlDirection()
     */
    public void setPTControlDirection(PTControlDirectionOptions value) {
        this.ptControlDirection = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public PTZConfigurationOptions2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public void setExtension(PTZConfigurationOptions2 value) {
        this.extension = value;
    }

    /**
     * The list of acceleration ramps supported by the device. The
     *           smallest acceleration value corresponds to the minimal index, the
     *           highest acceleration corresponds to the maximum index.
     * 
     * Gets the value of the ptzRamps property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzRamps property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPTZRamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the ptzRamps property.
     */
    public List<Integer> getPTZRamps() {
        if (ptzRamps == null) {
            ptzRamps = new ArrayList<>();
        }
        return this.ptzRamps;
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
