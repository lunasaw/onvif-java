
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
 * &lt;p&gt;SecurityCapabilitiesExtension2 complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SecurityCapabilitiesExtension2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="SupportedEAPMethod" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension2", propOrder = {
    "dot1X",
    "supportedEAPMethod",
    "remoteUserHandling",
    "any"
})
public class SecurityCapabilitiesExtension2 {

    @XmlElement(name = "Dot1X")
    protected boolean dot1X;
    @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
    protected List<Integer> supportedEAPMethod;
    @XmlElement(name = "RemoteUserHandling")
    protected boolean remoteUserHandling;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * 获取dot1X属性的值。
     * This getter has been renamed from isDot1X() to getDot1X() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDot1X() {
        return dot1X;
    }

    /**
     * 设置dot1X属性的值。
     * 
     */
    public void setDot1X(boolean value) {
        this.dot1X = value;
    }

    /**
     * Gets the value of the supportedEAPMethod property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the supportedEAPMethod property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSupportedEAPMethod().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethod() {
        if (supportedEAPMethod == null) {
            supportedEAPMethod = new ArrayList<Integer>();
        }
        return this.supportedEAPMethod;
    }

    /**
     * 获取remoteUserHandling属性的值。
     * This getter has been renamed from isRemoteUserHandling() to getRemoteUserHandling() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * 设置remoteUserHandling属性的值。
     * 
     */
    public void setRemoteUserHandling(boolean value) {
        this.remoteUserHandling = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
