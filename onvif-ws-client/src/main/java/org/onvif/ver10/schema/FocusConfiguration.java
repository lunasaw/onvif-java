
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;FocusConfiguration complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FocusConfiguration"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/&amp;gt;
 *         &amp;lt;element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
 *         &amp;lt;element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
 *         &amp;lt;element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "FocusConfiguration", propOrder = {
    "autoFocusMode",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "any"
})
public class FocusConfiguration {

    @XmlElement(name = "AutoFocusMode", required = true)
    @XmlSchemaType(name = "string")
    protected AutoFocusMode autoFocusMode;
    @XmlElement(name = "DefaultSpeed")
    protected float defaultSpeed;
    @XmlElement(name = "NearLimit")
    protected float nearLimit;
    @XmlElement(name = "FarLimit")
    protected float farLimit;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取autoFocusMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AutoFocusMode }
     *     
     */
    public AutoFocusMode getAutoFocusMode() {
        return autoFocusMode;
    }

    /**
     * 设置autoFocusMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AutoFocusMode }
     *     
     */
    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    /**
     * 获取defaultSpeed属性的值。
     * 
     */
    public float getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * 设置defaultSpeed属性的值。
     * 
     */
    public void setDefaultSpeed(float value) {
        this.defaultSpeed = value;
    }

    /**
     * 获取nearLimit属性的值。
     * 
     */
    public float getNearLimit() {
        return nearLimit;
    }

    /**
     * 设置nearLimit属性的值。
     * 
     */
    public void setNearLimit(float value) {
        this.nearLimit = value;
    }

    /**
     * 获取farLimit属性的值。
     * 
     */
    public float getFarLimit() {
        return farLimit;
    }

    /**
     * 设置farLimit属性的值。
     * 
     */
    public void setFarLimit(float value) {
        this.farLimit = value;
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
