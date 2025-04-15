
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;PTZPositionFilter complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZPositionFilter"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MinPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/&amp;gt;
 *         &amp;lt;element name="MaxPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/&amp;gt;
 *         &amp;lt;element name="EnterOrExit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
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
@XmlType(name = "PTZPositionFilter", propOrder = {
    "minPosition",
    "maxPosition",
    "enterOrExit",
    "any"
})
public class PTZPositionFilter {

    @XmlElement(name = "MinPosition", required = true)
    protected PTZVector minPosition;
    @XmlElement(name = "MaxPosition", required = true)
    protected PTZVector maxPosition;
    @XmlElement(name = "EnterOrExit")
    protected boolean enterOrExit;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取minPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getMinPosition() {
        return minPosition;
    }

    /**
     * 设置minPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     */
    public void setMinPosition(PTZVector value) {
        this.minPosition = value;
    }

    /**
     * 获取maxPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getMaxPosition() {
        return maxPosition;
    }

    /**
     * 设置maxPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     */
    public void setMaxPosition(PTZVector value) {
        this.maxPosition = value;
    }

    /**
     * 获取enterOrExit属性的值。
     * This getter has been renamed from isEnterOrExit() to getEnterOrExit() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getEnterOrExit() {
        return enterOrExit;
    }

    /**
     * 设置enterOrExit属性的值。
     * 
     */
    public void setEnterOrExit(boolean value) {
        this.enterOrExit = value;
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
