
package org.onvif.ver10.schema;

import java.util.HashMap;
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
 * <p>PTControlDirection complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTControlDirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFlip" type="{http://www.onvif.org/ver10/schema}EFlip" minOccurs="0"/&gt;
 *         &lt;element name="Reverse" type="{http://www.onvif.org/ver10/schema}Reverse" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTControlDirectionExtension" minOccurs="0"/&gt;
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
@XmlType(name = "PTControlDirection", propOrder = {
    "eFlip",
    "reverse",
    "extension"
})
public class PTControlDirection {

    @XmlElement(name = "EFlip")
    protected EFlip eFlip;
    @XmlElement(name = "Reverse")
    protected Reverse reverse;
    @XmlElement(name = "Extension")
    protected PTControlDirectionExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取eFlip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EFlip }
     *     
     */
    public EFlip getEFlip() {
        return eFlip;
    }

    /**
     * 设置eFlip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EFlip }
     *     
     */
    public void setEFlip(EFlip value) {
        this.eFlip = value;
    }

    /**
     * 获取reverse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Reverse }
     *     
     */
    public Reverse getReverse() {
        return reverse;
    }

    /**
     * 设置reverse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Reverse }
     *     
     */
    public void setReverse(Reverse value) {
        this.reverse = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionExtension }
     *     
     */
    public PTControlDirectionExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionExtension }
     *     
     */
    public void setExtension(PTControlDirectionExtension value) {
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
