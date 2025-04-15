
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;OSDConfigurationOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OSDConfigurationOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MaximumNumberOfOSDs" type="{http://www.onvif.org/ver10/schema}MaximumNumberOfOSDs"/&amp;gt;
 *         &amp;lt;element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="PositionOption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="TextOption" type="{http://www.onvif.org/ver10/schema}OSDTextOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ImageOption" type="{http://www.onvif.org/ver10/schema}OSDImgOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptionsExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "OSDConfigurationOptions", propOrder = {
    "maximumNumberOfOSDs",
    "type",
    "positionOption",
    "textOption",
    "imageOption",
    "extension"
})
public class OSDConfigurationOptions {

    @XmlElement(name = "MaximumNumberOfOSDs", required = true)
    protected MaximumNumberOfOSDs maximumNumberOfOSDs;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected List<OSDType> type;
    @XmlElement(name = "PositionOption", required = true)
    protected List<String> positionOption;
    @XmlElement(name = "TextOption")
    protected OSDTextOptions textOption;
    @XmlElement(name = "ImageOption")
    protected OSDImgOptions imageOption;
    @XmlElement(name = "Extension")
    protected OSDConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取maximumNumberOfOSDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberOfOSDs }
     *     
     */
    public MaximumNumberOfOSDs getMaximumNumberOfOSDs() {
        return maximumNumberOfOSDs;
    }

    /**
     * 设置maximumNumberOfOSDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberOfOSDs }
     *     
     */
    public void setMaximumNumberOfOSDs(MaximumNumberOfOSDs value) {
        this.maximumNumberOfOSDs = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the type property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getType().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OSDType }
     * 
     * 
     */
    public List<OSDType> getType() {
        if (type == null) {
            type = new ArrayList<OSDType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the positionOption property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the positionOption property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPositionOption().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPositionOption() {
        if (positionOption == null) {
            positionOption = new ArrayList<String>();
        }
        return this.positionOption;
    }

    /**
     * 获取textOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptions }
     *     
     */
    public OSDTextOptions getTextOption() {
        return textOption;
    }

    /**
     * 设置textOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptions }
     *     
     */
    public void setTextOption(OSDTextOptions value) {
        this.textOption = value;
    }

    /**
     * 获取imageOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDImgOptions }
     *     
     */
    public OSDImgOptions getImageOption() {
        return imageOption;
    }

    /**
     * 设置imageOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDImgOptions }
     *     
     */
    public void setImageOption(OSDImgOptions value) {
        this.imageOption = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public OSDConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public void setExtension(OSDConfigurationOptionsExtension value) {
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
