
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZPresetTourStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}PTZPresetTourState"/>
 *         <element name="CurrentTourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpot" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStatusExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourStatus", propOrder = {
    "state",
    "currentTourSpot",
    "extension"
})
public class PTZPresetTourStatus {

    /**
     * Indicates state of this preset tour by Idle/Touring/Paused.
     * 
     */
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected PTZPresetTourState state;
    /**
     * Indicates a tour spot currently staying.
     * 
     */
    @XmlElement(name = "CurrentTourSpot")
    protected PTZPresetTourSpot currentTourSpot;
    @XmlElement(name = "Extension")
    protected PTZPresetTourStatusExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates state of this preset tour by Idle/Touring/Paused.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourState }
     *     
     */
    public PTZPresetTourState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourState }
     *     
     * @see #getState()
     */
    public void setState(PTZPresetTourState value) {
        this.state = value;
    }

    /**
     * Indicates a tour spot currently staying.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpot }
     *     
     */
    public PTZPresetTourSpot getCurrentTourSpot() {
        return currentTourSpot;
    }

    /**
     * Sets the value of the currentTourSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpot }
     *     
     * @see #getCurrentTourSpot()
     */
    public void setCurrentTourSpot(PTZPresetTourSpot value) {
        this.currentTourSpot = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStatusExtension }
     *     
     */
    public PTZPresetTourStatusExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStatusExtension }
     *     
     */
    public void setExtension(PTZPresetTourStatusExtension value) {
        this.extension = value;
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
