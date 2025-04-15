
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
 * &lt;p&gt;VideoDecoderConfigurationOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VideoDecoderConfigurationOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="JpegDecOptions" type="{http://www.onvif.org/ver10/schema}JpegDecOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="H264DecOptions" type="{http://www.onvif.org/ver10/schema}H264DecOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Mpeg4DecOptions" type="{http://www.onvif.org/ver10/schema}Mpeg4DecOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoDecoderConfigurationOptionsExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "VideoDecoderConfigurationOptions", propOrder = {
    "jpegDecOptions",
    "h264DecOptions",
    "mpeg4DecOptions",
    "extension"
})
public class VideoDecoderConfigurationOptions {

    @XmlElement(name = "JpegDecOptions")
    protected JpegDecOptions jpegDecOptions;
    @XmlElement(name = "H264DecOptions")
    protected H264DecOptions h264DecOptions;
    @XmlElement(name = "Mpeg4DecOptions")
    protected Mpeg4DecOptions mpeg4DecOptions;
    @XmlElement(name = "Extension")
    protected VideoDecoderConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取jpegDecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JpegDecOptions }
     *     
     */
    public JpegDecOptions getJpegDecOptions() {
        return jpegDecOptions;
    }

    /**
     * 设置jpegDecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JpegDecOptions }
     *     
     */
    public void setJpegDecOptions(JpegDecOptions value) {
        this.jpegDecOptions = value;
    }

    /**
     * 获取h264DecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link H264DecOptions }
     *     
     */
    public H264DecOptions getH264DecOptions() {
        return h264DecOptions;
    }

    /**
     * 设置h264DecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link H264DecOptions }
     *     
     */
    public void setH264DecOptions(H264DecOptions value) {
        this.h264DecOptions = value;
    }

    /**
     * 获取mpeg4DecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4DecOptions }
     *     
     */
    public Mpeg4DecOptions getMpeg4DecOptions() {
        return mpeg4DecOptions;
    }

    /**
     * 设置mpeg4DecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4DecOptions }
     *     
     */
    public void setMpeg4DecOptions(Mpeg4DecOptions value) {
        this.mpeg4DecOptions = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoDecoderConfigurationOptionsExtension }
     *     
     */
    public VideoDecoderConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDecoderConfigurationOptionsExtension }
     *     
     */
    public void setExtension(VideoDecoderConfigurationOptionsExtension value) {
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
