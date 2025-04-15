
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
 * &lt;p&gt;IPv4Configuration complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IPv4Configuration"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
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
@XmlType(name = "IPv4Configuration", propOrder = {
    "manual",
    "linkLocal",
    "fromDHCP",
    "dhcp",
    "any"
})
public class IPv4Configuration {

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;
    @XmlElement(name = "LinkLocal")
    protected PrefixedIPv4Address linkLocal;
    @XmlElement(name = "FromDHCP")
    protected PrefixedIPv4Address fromDHCP;
    @XmlElement(name = "DHCP")
    protected boolean dhcp;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the manual property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the manual property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getManual().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv4Address }
     * 
     * 
     */
    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv4Address>();
        }
        return this.manual;
    }

    /**
     * 获取linkLocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getLinkLocal() {
        return linkLocal;
    }

    /**
     * 设置linkLocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public void setLinkLocal(PrefixedIPv4Address value) {
        this.linkLocal = value;
    }

    /**
     * 获取fromDHCP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getFromDHCP() {
        return fromDHCP;
    }

    /**
     * 设置fromDHCP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public void setFromDHCP(PrefixedIPv4Address value) {
        this.fromDHCP = value;
    }

    /**
     * 获取dhcp属性的值。
     * This getter has been renamed from isDHCP() to getDHCP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDHCP() {
        return dhcp;
    }

    /**
     * 设置dhcp属性的值。
     * 
     */
    public void setDHCP(boolean value) {
        this.dhcp = value;
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
