
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>ImagingOptions20Extension3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20Extension3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToneCompensationOptions" type="{http://www.onvif.org/ver10/schema}ToneCompensationOptions" minOccurs="0"/&gt;
 *         &lt;element name="DefoggingOptions" type="{http://www.onvif.org/ver10/schema}DefoggingOptions" minOccurs="0"/&gt;
 *         &lt;element name="NoiseReductionOptions" type="{http://www.onvif.org/ver10/schema}NoiseReductionOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension3", propOrder = {
    "toneCompensationOptions",
    "defoggingOptions",
    "noiseReductionOptions",
    "extension"
})
public class ImagingOptions20Extension3 {

    @XmlElement(name = "ToneCompensationOptions")
    protected ToneCompensationOptions toneCompensationOptions;
    @XmlElement(name = "DefoggingOptions")
    protected DefoggingOptions defoggingOptions;
    @XmlElement(name = "NoiseReductionOptions")
    protected NoiseReductionOptions noiseReductionOptions;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension4 extension;

    /**
     * 获取toneCompensationOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public ToneCompensationOptions getToneCompensationOptions() {
        return toneCompensationOptions;
    }

    /**
     * 设置toneCompensationOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public void setToneCompensationOptions(ToneCompensationOptions value) {
        this.toneCompensationOptions = value;
    }

    /**
     * 获取defoggingOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefoggingOptions }
     *     
     */
    public DefoggingOptions getDefoggingOptions() {
        return defoggingOptions;
    }

    /**
     * 设置defoggingOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefoggingOptions }
     *     
     */
    public void setDefoggingOptions(DefoggingOptions value) {
        this.defoggingOptions = value;
    }

    /**
     * 获取noiseReductionOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public NoiseReductionOptions getNoiseReductionOptions() {
        return noiseReductionOptions;
    }

    /**
     * 设置noiseReductionOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public void setNoiseReductionOptions(NoiseReductionOptions value) {
        this.noiseReductionOptions = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public ImagingOptions20Extension4 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public void setExtension(ImagingOptions20Extension4 value) {
        this.extension = value;
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
