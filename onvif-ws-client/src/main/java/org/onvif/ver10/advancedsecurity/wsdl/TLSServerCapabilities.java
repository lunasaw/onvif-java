
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * The capabilities of a TLS server implementation on a device.
 *           
 * 
 * &lt;p&gt;TLSServerCapabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TLSServerCapabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="TLSServerSupported" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}TLSVersions" /&amp;gt;
 *       &amp;lt;attribute name="MaximumNumberOfTLSCertificationPaths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&amp;gt;
 *       &amp;lt;attribute name="TLSClientAuthSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="MaximumNumberOfTLSCertificationPathValidationPolicies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLSServerCapabilities", propOrder = {
    "any"
})
public class TLSServerCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "TLSServerSupported")
    protected List<String> tlsServerSupported;
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPaths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfTLSCertificationPaths;
    @XmlAttribute(name = "TLSClientAuthSupported")
    protected Boolean tlsClientAuthSupported;
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPathValidationPolicies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfTLSCertificationPathValidationPolicies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the tlsServerSupported property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tlsServerSupported property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTLSServerSupported().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTLSServerSupported() {
        if (tlsServerSupported == null) {
            tlsServerSupported = new ArrayList<String>();
        }
        return this.tlsServerSupported;
    }

    /**
     * 获取maximumNumberOfTLSCertificationPaths属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPaths() {
        return maximumNumberOfTLSCertificationPaths;
    }

    /**
     * 设置maximumNumberOfTLSCertificationPaths属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfTLSCertificationPaths(BigInteger value) {
        this.maximumNumberOfTLSCertificationPaths = value;
    }

    /**
     * 获取tlsClientAuthSupported属性的值。
     * This getter has been renamed from isTLSClientAuthSupported() to getTLSClientAuthSupported() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLSClientAuthSupported() {
        return tlsClientAuthSupported;
    }

    /**
     * 设置tlsClientAuthSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLSClientAuthSupported(Boolean value) {
        this.tlsClientAuthSupported = value;
    }

    /**
     * 获取maximumNumberOfTLSCertificationPathValidationPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPathValidationPolicies() {
        return maximumNumberOfTLSCertificationPathValidationPolicies;
    }

    /**
     * 设置maximumNumberOfTLSCertificationPathValidationPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfTLSCertificationPathValidationPolicies(BigInteger value) {
        this.maximumNumberOfTLSCertificationPathValidationPolicies = value;
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
