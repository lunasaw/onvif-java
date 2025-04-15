
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;VideoEncoderOptionsExtension complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VideoEncoderOptionsExtension"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderOptionsExtension", propOrder = {
    "any",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderOptionsExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "JPEG")
    protected JpegOptions2 jpeg;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options2 mpeg4;
    @XmlElement(name = "H264")
    protected H264Options2 h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension2 extension;

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * 获取jpeg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions2 }
     *     
     */
    public JpegOptions2 getJPEG() {
        return jpeg;
    }

    /**
     * 设置jpeg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions2 }
     *     
     */
    public void setJPEG(JpegOptions2 value) {
        this.jpeg = value;
    }

    /**
     * 获取mpeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options2 }
     *     
     */
    public Mpeg4Options2 getMPEG4() {
        return mpeg4;
    }

    /**
     * 设置mpeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options2 }
     *     
     */
    public void setMPEG4(Mpeg4Options2 value) {
        this.mpeg4 = value;
    }

    /**
     * 获取h264属性的值。
     * 
     * @return
     *     possible object is
     *     {@link H264Options2 }
     *     
     */
    public H264Options2 getH264() {
        return h264;
    }

    /**
     * 设置h264属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options2 }
     *     
     */
    public void setH264(H264Options2 value) {
        this.h264 = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public VideoEncoderOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension2 value) {
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
