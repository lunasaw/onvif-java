
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;VideoSourceConfigurationExtension complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VideoSourceConfigurationExtension"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Rotate" type="{http://www.onvif.org/ver10/schema}Rotate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = {
    "rotate",
    "extension"
})
public class VideoSourceConfigurationExtension {

    @XmlElement(name = "Rotate")
    protected Rotate rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;

    /**
     * 获取rotate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rotate }
     *     
     */
    public Rotate getRotate() {
        return rotate;
    }

    /**
     * 设置rotate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rotate }
     *     
     */
    public void setRotate(Rotate value) {
        this.rotate = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public VideoSourceConfigurationExtension2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public void setExtension(VideoSourceConfigurationExtension2 value) {
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
