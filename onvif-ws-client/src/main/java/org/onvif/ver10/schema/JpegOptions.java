
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>JpegOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JpegOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JpegOptions", propOrder = {
    "resolutionsAvailable",
    "frameRateRange",
    "encodingIntervalRange"
})
@XmlSeeAlso({
    JpegOptions2 .class
})
public class JpegOptions {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;
    @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;

    /**
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution }
     * 
     * 
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * 获取frameRateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFrameRateRange() {
        return frameRateRange;
    }

    /**
     * 设置frameRateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    /**
     * 获取encodingIntervalRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getEncodingIntervalRange() {
        return encodingIntervalRange;
    }

    /**
     * 设置encodingIntervalRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
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
