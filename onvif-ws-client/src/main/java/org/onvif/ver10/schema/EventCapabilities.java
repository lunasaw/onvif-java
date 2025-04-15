
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
 * &lt;p&gt;EventCapabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EventCapabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="WSPullPointSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
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
@XmlType(name = "EventCapabilities", propOrder = {
    "xAddr",
    "wsSubscriptionPolicySupport",
    "wsPullPointSupport",
    "wsPausableSubscriptionManagerInterfaceSupport",
    "any"
})
public class EventCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "WSSubscriptionPolicySupport")
    protected boolean wsSubscriptionPolicySupport;
    @XmlElement(name = "WSPullPointSupport")
    protected boolean wsPullPointSupport;
    @XmlElement(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected boolean wsPausableSubscriptionManagerInterfaceSupport;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取xAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * 设置xAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * 获取wsSubscriptionPolicySupport属性的值。
     * This getter has been renamed from isWSSubscriptionPolicySupport() to getWSSubscriptionPolicySupport() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    /**
     * 设置wsSubscriptionPolicySupport属性的值。
     * 
     */
    public void setWSSubscriptionPolicySupport(boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    /**
     * 获取wsPullPointSupport属性的值。
     * This getter has been renamed from isWSPullPointSupport() to getWSPullPointSupport() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getWSPullPointSupport() {
        return wsPullPointSupport;
    }

    /**
     * 设置wsPullPointSupport属性的值。
     * 
     */
    public void setWSPullPointSupport(boolean value) {
        this.wsPullPointSupport = value;
    }

    /**
     * 获取wsPausableSubscriptionManagerInterfaceSupport属性的值。
     * This getter has been renamed from isWSPausableSubscriptionManagerInterfaceSupport() to getWSPausableSubscriptionManagerInterfaceSupport() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    /**
     * 设置wsPausableSubscriptionManagerInterfaceSupport属性的值。
     * 
     */
    public void setWSPausableSubscriptionManagerInterfaceSupport(boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
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
