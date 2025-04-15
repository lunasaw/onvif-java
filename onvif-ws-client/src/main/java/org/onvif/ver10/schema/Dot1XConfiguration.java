
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;Dot1XConfiguration complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Dot1XConfiguration"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Dot1XConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&amp;gt;
 *         &amp;lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="AnonymousID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EAPMethod" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="CACertificateID" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EAPMethodConfiguration" type="{http://www.onvif.org/ver10/schema}EAPMethodConfiguration" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot1XConfigurationExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Dot1XConfiguration", propOrder = {
    "dot1XConfigurationToken",
    "identity",
    "anonymousID",
    "eapMethod",
    "caCertificateID",
    "eapMethodConfiguration",
    "extension"
})
public class Dot1XConfiguration {

    @XmlElement(name = "Dot1XConfigurationToken", required = true)
    protected String dot1XConfigurationToken;
    @XmlElement(name = "Identity", required = true)
    protected String identity;
    @XmlElement(name = "AnonymousID")
    protected String anonymousID;
    @XmlElement(name = "EAPMethod")
    protected int eapMethod;
    @XmlElement(name = "CACertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> caCertificateID;
    @XmlElement(name = "EAPMethodConfiguration")
    protected EAPMethodConfiguration eapMethodConfiguration;
    @XmlElement(name = "Extension")
    protected Dot1XConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取dot1XConfigurationToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1XConfigurationToken() {
        return dot1XConfigurationToken;
    }

    /**
     * 设置dot1XConfigurationToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1XConfigurationToken(String value) {
        this.dot1XConfigurationToken = value;
    }

    /**
     * 获取identity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置identity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * 获取anonymousID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousID() {
        return anonymousID;
    }

    /**
     * 设置anonymousID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousID(String value) {
        this.anonymousID = value;
    }

    /**
     * 获取eapMethod属性的值。
     * 
     */
    public int getEAPMethod() {
        return eapMethod;
    }

    /**
     * 设置eapMethod属性的值。
     * 
     */
    public void setEAPMethod(int value) {
        this.eapMethod = value;
    }

    /**
     * Gets the value of the caCertificateID property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the caCertificateID property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCACertificateID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCACertificateID() {
        if (caCertificateID == null) {
            caCertificateID = new ArrayList<String>();
        }
        return this.caCertificateID;
    }

    /**
     * 获取eapMethodConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EAPMethodConfiguration }
     *     
     */
    public EAPMethodConfiguration getEAPMethodConfiguration() {
        return eapMethodConfiguration;
    }

    /**
     * 设置eapMethodConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EAPMethodConfiguration }
     *     
     */
    public void setEAPMethodConfiguration(EAPMethodConfiguration value) {
        this.eapMethodConfiguration = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dot1XConfigurationExtension }
     *     
     */
    public Dot1XConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dot1XConfigurationExtension }
     *     
     */
    public void setExtension(Dot1XConfigurationExtension value) {
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
