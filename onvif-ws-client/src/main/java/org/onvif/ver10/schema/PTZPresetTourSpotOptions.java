
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
 * <p>Java class for PTZPresetTourSpotOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourSpotOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PresetDetail" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetailOptions"/>
 *         <element name="StayTime" type="{http://www.onvif.org/ver10/schema}DurationRange"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourSpotOptions", propOrder = {
    "presetDetail",
    "stayTime",
    "any"
})
public class PTZPresetTourSpotOptions {

    /**
     * Supported options for detail definition of preset position of the tour
     *             spot.
     * 
     */
    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetailOptions presetDetail;
    /**
     * Supported range of stay time for a tour spot.
     * 
     */
    @XmlElement(name = "StayTime", required = true)
    protected DurationRange stayTime;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported options for detail definition of preset position of the tour
     *             spot.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourPresetDetailOptions }
     *     
     */
    public PTZPresetTourPresetDetailOptions getPresetDetail() {
        return presetDetail;
    }

    /**
     * Sets the value of the presetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourPresetDetailOptions }
     *     
     * @see #getPresetDetail()
     */
    public void setPresetDetail(PTZPresetTourPresetDetailOptions value) {
        this.presetDetail = value;
    }

    /**
     * Supported range of stay time for a tour spot.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getStayTime() {
        return stayTime;
    }

    /**
     * Sets the value of the stayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     * @see #getStayTime()
     */
    public void setStayTime(DurationRange value) {
        this.stayTime = value;
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
