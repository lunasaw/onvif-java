
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;PTZConfigurationOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZConfigurationOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Spaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/&amp;gt;
 *         &amp;lt;element name="PTZTimeout" type="{http://www.onvif.org/ver10/schema}DurationRange"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="PTZRamps" type="{http://www.onvif.org/ver10/schema}IntAttrList" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfigurationOptions", propOrder = {
    "spaces",
    "ptzTimeout",
    "any",
    "ptControlDirection",
    "extension"
})
public class PTZConfigurationOptions {

    @XmlElement(name = "Spaces", required = true)
    protected PTZSpaces spaces;
    @XmlElement(name = "PTZTimeout", required = true)
    protected DurationRange ptzTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "PTControlDirection")
    protected PTControlDirectionOptions ptControlDirection;
    @XmlElement(name = "Extension")
    protected PTZConfigurationOptions2 extension;
    @XmlAttribute(name = "PTZRamps")
    protected List<Integer> ptzRamps;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取spaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSpaces() {
        return spaces;
    }

    /**
     * 设置spaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     */
    public void setSpaces(PTZSpaces value) {
        this.spaces = value;
    }

    /**
     * 获取ptzTimeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getPTZTimeout() {
        return ptzTimeout;
    }

    /**
     * 设置ptzTimeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setPTZTimeout(DurationRange value) {
        this.ptzTimeout = value;
    }

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
     * 获取ptControlDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionOptions }
     *     
     */
    public PTControlDirectionOptions getPTControlDirection() {
        return ptControlDirection;
    }

    /**
     * 设置ptControlDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionOptions }
     *     
     */
    public void setPTControlDirection(PTControlDirectionOptions value) {
        this.ptControlDirection = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public PTZConfigurationOptions2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public void setExtension(PTZConfigurationOptions2 value) {
        this.extension = value;
    }

    /**
     * Gets the value of the ptzRamps property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ptzRamps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPTZRamps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPTZRamps() {
        if (ptzRamps == null) {
            ptzRamps = new ArrayList<Integer>();
        }
        return this.ptzRamps;
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
