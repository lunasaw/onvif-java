
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;VideoRateControl complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VideoRateControl"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * 获取frameRateLimit属性的值。
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * 设置frameRateLimit属性的值。
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * 获取encodingInterval属性的值。
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * 设置encodingInterval属性的值。
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * 获取bitrateLimit属性的值。
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * 设置bitrateLimit属性的值。
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
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
