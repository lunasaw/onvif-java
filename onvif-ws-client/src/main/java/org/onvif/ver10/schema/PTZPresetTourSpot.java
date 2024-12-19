
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZPresetTourSpot complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourSpot">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PresetDetail" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetail"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="StayTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourSpot", propOrder = {
    "presetDetail",
    "speed",
    "stayTime",
    "extension"
})
public class PTZPresetTourSpot {

    /**
     * Detail definition of preset position of the tour spot.
     * 
     */
    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetail presetDetail;
    /**
     * Optional parameter to specify Pan/Tilt and Zoom speed on moving toward
     *             this tour spot.
     * 
     */
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;
    /**
     * Optional parameter to specify time duration of staying on this tour
     *             sport.
     * 
     */
    @XmlElement(name = "StayTime")
    protected Duration stayTime;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSpotExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Detail definition of preset position of the tour spot.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     */
    public PTZPresetTourPresetDetail getPresetDetail() {
        return presetDetail;
    }

    /**
     * Sets the value of the presetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     * @see #getPresetDetail()
     */
    public void setPresetDetail(PTZPresetTourPresetDetail value) {
        this.presetDetail = value;
    }

    /**
     * Optional parameter to specify Pan/Tilt and Zoom speed on moving toward
     *             this tour spot.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     * @see #getSpeed()
     */
    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

    /**
     * Optional parameter to specify time duration of staying on this tour
     *             sport.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStayTime() {
        return stayTime;
    }

    /**
     * Sets the value of the stayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getStayTime()
     */
    public void setStayTime(Duration value) {
        this.stayTime = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public PTZPresetTourSpotExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public void setExtension(PTZPresetTourSpotExtension value) {
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
