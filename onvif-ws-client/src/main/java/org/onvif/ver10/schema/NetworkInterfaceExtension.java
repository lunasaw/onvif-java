
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;NetworkInterfaceExtension complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NetworkInterfaceExtension"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/&amp;gt;
 *         &amp;lt;element name="Dot3" type="{http://www.onvif.org/ver10/schema}Dot3Configuration" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Dot11" type="{http://www.onvif.org/ver10/schema}Dot11Configuration" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceExtension", propOrder = {
    "any",
    "interfaceType",
    "dot3",
    "dot11",
    "extension"
})
public class NetworkInterfaceExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "InterfaceType")
    protected int interfaceType;
    @XmlElement(name = "Dot3")
    protected List<Dot3Configuration> dot3;
    @XmlElement(name = "Dot11")
    protected List<Dot11Configuration> dot11;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension2 extension;

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
     * 获取interfaceType属性的值。
     * 
     */
    public int getInterfaceType() {
        return interfaceType;
    }

    /**
     * 设置interfaceType属性的值。
     * 
     */
    public void setInterfaceType(int value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the dot3 property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dot3 property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDot3().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Dot3Configuration }
     * 
     * 
     */
    public List<Dot3Configuration> getDot3() {
        if (dot3 == null) {
            dot3 = new ArrayList<Dot3Configuration>();
        }
        return this.dot3;
    }

    /**
     * Gets the value of the dot11 property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dot11 property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDot11().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Configuration }
     * 
     * 
     */
    public List<Dot11Configuration> getDot11() {
        if (dot11 == null) {
            dot11 = new ArrayList<Dot11Configuration>();
        }
        return this.dot11;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceExtension2 }
     *     
     */
    public NetworkInterfaceExtension2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceExtension2 }
     *     
     */
    public void setExtension(NetworkInterfaceExtension2 value) {
        this.extension = value;
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
