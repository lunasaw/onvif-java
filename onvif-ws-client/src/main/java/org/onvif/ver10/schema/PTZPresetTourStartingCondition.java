
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZPresetTourStartingCondition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourStartingCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecurringTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RecurringDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Direction" type="{http://www.onvif.org/ver10/schema}PTZPresetTourDirection" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RandomPresetOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZPresetTourStartingCondition", propOrder = {
    "recurringTime",
    "recurringDuration",
    "direction",
    "extension"
})
public class PTZPresetTourStartingCondition {

    /**
     * Optional parameter to specify how many times the preset tour is
     *             recurred.
     * 
     */
    @XmlElement(name = "RecurringTime")
    protected Integer recurringTime;
    /**
     * Optional parameter to specify how long time duration the preset tour is
     *             recurred.
     * 
     */
    @XmlElement(name = "RecurringDuration")
    protected Duration recurringDuration;
    /**
     * Optional parameter to choose which direction the preset tour goes.
     *             Forward shall be chosen in case it is omitted.
     * 
     */
    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "string")
    protected PTZPresetTourDirection direction;
    @XmlElement(name = "Extension")
    protected PTZPresetTourStartingConditionExtension extension;
    /**
     * Execute presets in random order. If set to true and Direction is also
     *           present, Direction will be ignored and presets of the Tour will be recalled randomly.
     * 
     */
    @XmlAttribute(name = "RandomPresetOrder")
    protected Boolean randomPresetOrder;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Optional parameter to specify how many times the preset tour is
     *             recurred.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurringTime() {
        return recurringTime;
    }

    /**
     * Sets the value of the recurringTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getRecurringTime()
     */
    public void setRecurringTime(Integer value) {
        this.recurringTime = value;
    }

    /**
     * Optional parameter to specify how long time duration the preset tour is
     *             recurred.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRecurringDuration() {
        return recurringDuration;
    }

    /**
     * Sets the value of the recurringDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getRecurringDuration()
     */
    public void setRecurringDuration(Duration value) {
        this.recurringDuration = value;
    }

    /**
     * Optional parameter to choose which direction the preset tour goes.
     *             Forward shall be chosen in case it is omitted.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourDirection }
     *     
     */
    public PTZPresetTourDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourDirection }
     *     
     * @see #getDirection()
     */
    public void setDirection(PTZPresetTourDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingConditionExtension }
     *     
     */
    public PTZPresetTourStartingConditionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingConditionExtension }
     *     
     */
    public void setExtension(PTZPresetTourStartingConditionExtension value) {
        this.extension = value;
    }

    /**
     * Execute presets in random order. If set to true and Direction is also
     *           present, Direction will be ignored and presets of the Tour will be recalled randomly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandomPresetOrder() {
        return randomPresetOrder;
    }

    /**
     * Sets the value of the randomPresetOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRandomPresetOrder()
     */
    public void setRandomPresetOrder(Boolean value) {
        this.randomPresetOrder = value;
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
