
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;VideoEncoderConfigurationOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VideoEncoderConfigurationOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="QualityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&amp;gt;
 *         &amp;lt;element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderConfigurationOptions", propOrder = {
    "qualityRange",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderConfigurationOptions {

    @XmlElement(name = "QualityRange", required = true)
    protected IntRange qualityRange;
    @XmlElement(name = "JPEG")
    protected JpegOptions jpeg;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options mpeg4;
    @XmlElement(name = "H264")
    protected H264Options h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取qualityRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getQualityRange() {
        return qualityRange;
    }

    /**
     * 设置qualityRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setQualityRange(IntRange value) {
        this.qualityRange = value;
    }

    /**
     * 获取jpeg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions }
     *     
     */
    public JpegOptions getJPEG() {
        return jpeg;
    }

    /**
     * 设置jpeg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions }
     *     
     */
    public void setJPEG(JpegOptions value) {
        this.jpeg = value;
    }

    /**
     * 获取mpeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options }
     *     
     */
    public Mpeg4Options getMPEG4() {
        return mpeg4;
    }

    /**
     * 设置mpeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options }
     *     
     */
    public void setMPEG4(Mpeg4Options value) {
        this.mpeg4 = value;
    }

    /**
     * 获取h264属性的值。
     * 
     * @return
     *     possible object is
     *     {@link H264Options }
     *     
     */
    public H264Options getH264() {
        return h264;
    }

    /**
     * 设置h264属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options }
     *     
     */
    public void setH264(H264Options value) {
        this.h264 = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public VideoEncoderOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
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
