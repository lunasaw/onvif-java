
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZPresetTourStartingConditionOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourStartingConditionOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecurringTime" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="RecurringDuration" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/>
 *         <element name="Direction" type="{http://www.onvif.org/ver10/schema}PTZPresetTourDirection" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourStartingConditionOptions", propOrder = {
    "recurringTime",
    "recurringDuration",
    "direction",
    "extension"
})
public class PTZPresetTourStartingConditionOptions {

    /**
     * Supported range of Recurring Time.
     * 
     */
    @XmlElement(name = "RecurringTime")
    protected IntRange recurringTime;
    /**
     * Supported range of Recurring Duration.
     * 
     */
    @XmlElement(name = "RecurringDuration")
    protected DurationRange recurringDuration;
    /**
     * Supported options for Direction of Preset Tour.
     * 
     */
    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "string")
    protected List<PTZPresetTourDirection> direction;
    @XmlElement(name = "Extension")
    protected PTZPresetTourStartingConditionOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported range of Recurring Time.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getRecurringTime() {
        return recurringTime;
    }

    /**
     * Sets the value of the recurringTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getRecurringTime()
     */
    public void setRecurringTime(IntRange value) {
        this.recurringTime = value;
    }

    /**
     * Supported range of Recurring Duration.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getRecurringDuration() {
        return recurringDuration;
    }

    /**
     * Sets the value of the recurringDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     * @see #getRecurringDuration()
     */
    public void setRecurringDuration(DurationRange value) {
        this.recurringDuration = value;
    }

    /**
     * Supported options for Direction of Preset Tour.
     * 
     * Gets the value of the direction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourDirection }
     * </p>
     * 
     * 
     * @return
     *     The value of the direction property.
     */
    public List<PTZPresetTourDirection> getDirection() {
        if (direction == null) {
            direction = new ArrayList<>();
        }
        return this.direction;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingConditionOptionsExtension }
     *     
     */
    public PTZPresetTourStartingConditionOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingConditionOptionsExtension }
     *     
     */
    public void setExtension(PTZPresetTourStartingConditionOptionsExtension value) {
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
