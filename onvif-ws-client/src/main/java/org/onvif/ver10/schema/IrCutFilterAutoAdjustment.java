
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
 * <p>Java class for IrCutFilterAutoAdjustment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IrCutFilterAutoAdjustment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentExtension" minOccurs="0"/>
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
@XmlType(name = "IrCutFilterAutoAdjustment", propOrder = {
    "boundaryType",
    "boundaryOffset",
    "responseTime",
    "extension"
})
public class IrCutFilterAutoAdjustment {

    /**
     * Specifies which boundaries to automatically toggle Ir cut filter
     *             following parameters are applied to. Its options shall be chosen from
     *             tt:IrCutFilterAutoBoundaryType.
     * 
     */
    @XmlElement(name = "BoundaryType", required = true)
    protected String boundaryType;
    /**
     * Adjusts boundary exposure level for toggling Ir cut filter to on/off
     *             specified with unitless normalized value from +1.0 to -1.0. Zero is default and -1.0 is
     *             the darkest adjustment (Unitless).
     * 
     */
    @XmlElement(name = "BoundaryOffset")
    protected Float boundaryOffset;
    /**
     * Delay time of toggling Ir cut filter to on/off after crossing of the
     *             boundary exposure levels.
     * 
     */
    @XmlElement(name = "ResponseTime")
    protected Duration responseTime;
    @XmlElement(name = "Extension")
    protected IrCutFilterAutoAdjustmentExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Specifies which boundaries to automatically toggle Ir cut filter
     *             following parameters are applied to. Its options shall be chosen from
     *             tt:IrCutFilterAutoBoundaryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBoundaryType()
     */
    public void setBoundaryType(String value) {
        this.boundaryType = value;
    }

    /**
     * Adjusts boundary exposure level for toggling Ir cut filter to on/off
     *             specified with unitless normalized value from +1.0 to -1.0. Zero is default and -1.0 is
     *             the darkest adjustment (Unitless).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBoundaryOffset() {
        return boundaryOffset;
    }

    /**
     * Sets the value of the boundaryOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getBoundaryOffset()
     */
    public void setBoundaryOffset(Float value) {
        this.boundaryOffset = value;
    }

    /**
     * Delay time of toggling Ir cut filter to on/off after crossing of the
     *             boundary exposure levels.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getResponseTime()
     */
    public void setResponseTime(Duration value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentExtension }
     *     
     */
    public IrCutFilterAutoAdjustmentExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentExtension }
     *     
     */
    public void setExtension(IrCutFilterAutoAdjustmentExtension value) {
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
