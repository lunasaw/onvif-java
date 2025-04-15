
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * &lt;p&gt;OSDTextOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OSDTextOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="FontSizeRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextOptionsExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "OSDTextOptions", propOrder = {
    "type",
    "fontSizeRange",
    "dateFormat",
    "timeFormat",
    "fontColor",
    "backgroundColor",
    "extension"
})
public class OSDTextOptions {

    @XmlElement(name = "Type", required = true)
    protected List<String> type;
    @XmlElement(name = "FontSizeRange")
    protected IntRange fontSizeRange;
    @XmlElement(name = "DateFormat")
    protected List<String> dateFormat;
    @XmlElement(name = "TimeFormat")
    protected List<String> timeFormat;
    @XmlElement(name = "FontColor")
    protected OSDColorOptions fontColor;
    @XmlElement(name = "BackgroundColor")
    protected OSDColorOptions backgroundColor;
    @XmlElement(name = "Extension")
    protected OSDTextOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    /**
     * 获取fontSizeRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFontSizeRange() {
        return fontSizeRange;
    }

    /**
     * 设置fontSizeRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFontSizeRange(IntRange value) {
        this.fontSizeRange = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dateFormat property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDateFormat().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDateFormat() {
        if (dateFormat == null) {
            dateFormat = new ArrayList<String>();
        }
        return this.dateFormat;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the timeFormat property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTimeFormat().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTimeFormat() {
        if (timeFormat == null) {
            timeFormat = new ArrayList<String>();
        }
        return this.timeFormat;
    }

    /**
     * 获取fontColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getFontColor() {
        return fontColor;
    }

    /**
     * 设置fontColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     */
    public void setFontColor(OSDColorOptions value) {
        this.fontColor = value;
    }

    /**
     * 获取backgroundColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置backgroundColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     */
    public void setBackgroundColor(OSDColorOptions value) {
        this.backgroundColor = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public OSDTextOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public void setExtension(OSDTextOptionsExtension value) {
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
