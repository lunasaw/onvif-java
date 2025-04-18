
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>IrCutFilterAutoAdjustmentOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IrCutFilterAutoAdjustmentOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTimeRange" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptionsExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

    @XmlElement(name = "BoundaryType", required = true)
    protected List<String> boundaryType;
    @XmlElement(name = "BoundaryOffset")
    protected Boolean boundaryOffset;
    @XmlElement(name = "ResponseTimeRange")
    protected DurationRange responseTimeRange;
    @XmlElement(name = "Extension")
    protected IrCutFilterAutoAdjustmentOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the boundaryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBoundaryType() {
        if (boundaryType == null) {
            boundaryType = new ArrayList<String>();
        }
        return this.boundaryType;
    }

    /**
     * 获取boundaryOffset属性的值。
     * This getter has been renamed from isBoundaryOffset() to getBoundaryOffset() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBoundaryOffset() {
        return boundaryOffset;
    }

    /**
     * 设置boundaryOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoundaryOffset(Boolean value) {
        this.boundaryOffset = value;
    }

    /**
     * 获取responseTimeRange属性的值。
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
     * 设置responseTimeRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setResponseTimeRange(DurationRange value) {
        this.responseTimeRange = value;
    }

    /**
     * 获取extension属性的值。
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
     * 设置extension属性的值。
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
