
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;ImagingSettingsExtension203 complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ImagingSettingsExtension203"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ToneCompensation" type="{http://www.onvif.org/ver10/schema}ToneCompensation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Defogging" type="{http://www.onvif.org/ver10/schema}Defogging" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NoiseReduction" type="{http://www.onvif.org/ver10/schema}NoiseReduction" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension204" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension203", propOrder = {
    "toneCompensation",
    "defogging",
    "noiseReduction",
    "extension"
})
public class ImagingSettingsExtension203 {

    @XmlElement(name = "ToneCompensation")
    protected ToneCompensation toneCompensation;
    @XmlElement(name = "Defogging")
    protected Defogging defogging;
    @XmlElement(name = "NoiseReduction")
    protected NoiseReduction noiseReduction;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension204 extension;

    /**
     * 获取toneCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensation }
     *     
     */
    public ToneCompensation getToneCompensation() {
        return toneCompensation;
    }

    /**
     * 设置toneCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensation }
     *     
     */
    public void setToneCompensation(ToneCompensation value) {
        this.toneCompensation = value;
    }

    /**
     * 获取defogging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Defogging }
     *     
     */
    public Defogging getDefogging() {
        return defogging;
    }

    /**
     * 设置defogging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Defogging }
     *     
     */
    public void setDefogging(Defogging value) {
        this.defogging = value;
    }

    /**
     * 获取noiseReduction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoiseReduction }
     *     
     */
    public NoiseReduction getNoiseReduction() {
        return noiseReduction;
    }

    /**
     * 设置noiseReduction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReduction }
     *     
     */
    public void setNoiseReduction(NoiseReduction value) {
        this.noiseReduction = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public ImagingSettingsExtension204 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public void setExtension(ImagingSettingsExtension204 value) {
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
