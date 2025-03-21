
package org.onvif.ver10.recording.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>TrackOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrackOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SpareTotal" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareVideo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareAudio" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareMetadata" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackOptions")
public class TrackOptions {

    @XmlAttribute(name = "SpareTotal")
    protected Integer spareTotal;
    @XmlAttribute(name = "SpareVideo")
    protected Integer spareVideo;
    @XmlAttribute(name = "SpareAudio")
    protected Integer spareAudio;
    @XmlAttribute(name = "SpareMetadata")
    protected Integer spareMetadata;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取spareTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareTotal() {
        return spareTotal;
    }

    /**
     * 设置spareTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareTotal(Integer value) {
        this.spareTotal = value;
    }

    /**
     * 获取spareVideo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareVideo() {
        return spareVideo;
    }

    /**
     * 设置spareVideo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareVideo(Integer value) {
        this.spareVideo = value;
    }

    /**
     * 获取spareAudio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareAudio() {
        return spareAudio;
    }

    /**
     * 设置spareAudio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareAudio(Integer value) {
        this.spareAudio = value;
    }

    /**
     * 获取spareMetadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareMetadata() {
        return spareMetadata;
    }

    /**
     * 设置spareMetadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareMetadata(Integer value) {
        this.spareMetadata = value;
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
