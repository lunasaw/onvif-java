
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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrCutFilterAutoAdjustmentOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IrCutFilterAutoAdjustmentOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ResponseTimeRange" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "IrCutFilterAutoAdjustmentOptions", propOrder = {
    "boundaryType",
    "boundaryOffset",
    "responseTimeRange",
    "extension"
})
public class IrCutFilterAutoAdjustmentOptions {

    /**
     * Supported options of boundary types for adjustment of Ir cut filter auto
     *             mode. The opptions shall be chosen from tt:IrCutFilterAutoBoundaryType.
     * 
     */
    @XmlElement(name = "BoundaryType", required = true)
    protected List<String> boundaryType;
    /**
     * Indicates whether or not boundary offset for toggling Ir cut filter is
     *             supported.
     * 
     */
    @XmlElement(name = "BoundaryOffset")
    protected Boolean boundaryOffset;
    /**
     * Supported range of delay time for toggling Ir cut filter.
     * 
     */
    @XmlElement(name = "ResponseTimeRange")
    protected DurationRange responseTimeRange;
    @XmlElement(name = "Extension")
    protected IrCutFilterAutoAdjustmentOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported options of boundary types for adjustment of Ir cut filter auto
     *             mode. The opptions shall be chosen from tt:IrCutFilterAutoBoundaryType.
     * 
     * Gets the value of the boundaryType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBoundaryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the boundaryType property.
     */
    public List<String> getBoundaryType() {
        if (boundaryType == null) {
            boundaryType = new ArrayList<>();
        }
        return this.boundaryType;
    }

    /**
     * Indicates whether or not boundary offset for toggling Ir cut filter is
     *             supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoundaryOffset() {
        return boundaryOffset;
    }

    /**
     * Sets the value of the boundaryOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBoundaryOffset()
     */
    public void setBoundaryOffset(Boolean value) {
        this.boundaryOffset = value;
    }

    /**
     * Supported range of delay time for toggling Ir cut filter.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getResponseTimeRange() {
        return responseTimeRange;
    }

    /**
     * Sets the value of the responseTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     * @see #getResponseTimeRange()
     */
    public void setResponseTimeRange(DurationRange value) {
        this.responseTimeRange = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentOptionsExtension }
     *     
     */
    public IrCutFilterAutoAdjustmentOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentOptionsExtension }
     *     
     */
    public void setExtension(IrCutFilterAutoAdjustmentOptionsExtension value) {
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
