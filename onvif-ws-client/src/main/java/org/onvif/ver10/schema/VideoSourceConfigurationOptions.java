
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
 * <p>VideoSourceConfigurationOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoSourceConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundsRange" type="{http://www.onvif.org/ver10/schema}IntRectangleRange"/&gt;
 *         &lt;element name="VideoSourceTokensAvailable" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "VideoSourceConfigurationOptions", propOrder = {
    "boundsRange",
    "videoSourceTokensAvailable",
    "extension"
})
public class VideoSourceConfigurationOptions {

    @XmlElement(name = "BoundsRange", required = true)
    protected IntRectangleRange boundsRange;
    @XmlElement(name = "VideoSourceTokensAvailable", required = true)
    protected List<String> videoSourceTokensAvailable;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取boundsRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRectangleRange }
     *     
     */
    public IntRectangleRange getBoundsRange() {
        return boundsRange;
    }

    /**
     * 设置boundsRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRectangleRange }
     *     
     */
    public void setBoundsRange(IntRectangleRange value) {
        this.boundsRange = value;
    }

    /**
     * Gets the value of the videoSourceTokensAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the videoSourceTokensAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoSourceTokensAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoSourceTokensAvailable() {
        if (videoSourceTokensAvailable == null) {
            videoSourceTokensAvailable = new ArrayList<String>();
        }
        return this.videoSourceTokensAvailable;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationOptionsExtension }
     *     
     */
    public VideoSourceConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationOptionsExtension }
     *     
     */
    public void setExtension(VideoSourceConfigurationOptionsExtension value) {
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
