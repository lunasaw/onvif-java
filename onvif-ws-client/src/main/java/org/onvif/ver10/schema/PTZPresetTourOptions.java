
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
 * <p>Java class for PTZPresetTourOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="StartingCondition" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionOptions"/>
 *         <element name="TourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotOptions"/>
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
@XmlType(name = "PTZPresetTourOptions", propOrder = {
    "autoStart",
    "startingCondition",
    "tourSpot",
    "any"
})
public class PTZPresetTourOptions {

    /**
     * Indicates whether or not the AutoStart is supported.
     * 
     */
    @XmlElement(name = "AutoStart")
    protected boolean autoStart;
    /**
     * Supported options for Preset Tour Starting Condition.
     * 
     */
    @XmlElement(name = "StartingCondition", required = true)
    protected PTZPresetTourStartingConditionOptions startingCondition;
    /**
     * Supported options for Preset Tour Spot.
     * 
     */
    @XmlElement(name = "TourSpot", required = true)
    protected PTZPresetTourSpotOptions tourSpot;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not the AutoStart is supported.
     * 
     */
    public boolean isAutoStart() {
        return autoStart;
    }

    /**
     * Sets the value of the autoStart property.
     * 
     */
    public void setAutoStart(boolean value) {
        this.autoStart = value;
    }

    /**
     * Supported options for Preset Tour Starting Condition.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingConditionOptions }
     *     
     */
    public PTZPresetTourStartingConditionOptions getStartingCondition() {
        return startingCondition;
    }

    /**
     * Sets the value of the startingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingConditionOptions }
     *     
     * @see #getStartingCondition()
     */
    public void setStartingCondition(PTZPresetTourStartingConditionOptions value) {
        this.startingCondition = value;
    }

    /**
     * Supported options for Preset Tour Spot.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpotOptions }
     *     
     */
    public PTZPresetTourSpotOptions getTourSpot() {
        return tourSpot;
    }

    /**
     * Sets the value of the tourSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpotOptions }
     *     
     * @see #getTourSpot()
     */
    public void setTourSpot(PTZPresetTourSpotOptions value) {
        this.tourSpot = value;
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
