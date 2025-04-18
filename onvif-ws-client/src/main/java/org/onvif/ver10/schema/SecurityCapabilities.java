
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>SecurityCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities", propOrder = {
    "tls11",
    "tls12",
    "onboardKeyGeneration",
    "accessPolicyConfig",
    "x509Token",
    "samlToken",
    "kerberosToken",
    "relToken",
    "any",
    "extension"
})
public class SecurityCapabilities {

    @XmlElement(name = "TLS1.1")
    protected boolean tls11;
    @XmlElement(name = "TLS1.2")
    protected boolean tls12;
    @XmlElement(name = "OnboardKeyGeneration")
    protected boolean onboardKeyGeneration;
    @XmlElement(name = "AccessPolicyConfig")
    protected boolean accessPolicyConfig;
    @XmlElement(name = "X.509Token")
    protected boolean x509Token;
    @XmlElement(name = "SAMLToken")
    protected boolean samlToken;
    @XmlElement(name = "KerberosToken")
    protected boolean kerberosToken;
    @XmlElement(name = "RELToken")
    protected boolean relToken;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取tls11属性的值。
     * This getter has been renamed from isTLS11() to getTLS11() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTLS11() {
        return tls11;
    }

    /**
     * 设置tls11属性的值。
     * 
     */
    public void setTLS11(boolean value) {
        this.tls11 = value;
    }

    /**
     * 获取tls12属性的值。
     * This getter has been renamed from isTLS12() to getTLS12() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTLS12() {
        return tls12;
    }

    /**
     * 设置tls12属性的值。
     * 
     */
    public void setTLS12(boolean value) {
        this.tls12 = value;
    }

    /**
     * 获取onboardKeyGeneration属性的值。
     * This getter has been renamed from isOnboardKeyGeneration() to getOnboardKeyGeneration() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * 设置onboardKeyGeneration属性的值。
     * 
     */
    public void setOnboardKeyGeneration(boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * 获取accessPolicyConfig属性的值。
     * This getter has been renamed from isAccessPolicyConfig() to getAccessPolicyConfig() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * 设置accessPolicyConfig属性的值。
     * 
     */
    public void setAccessPolicyConfig(boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * 获取x509Token属性的值。
     * This getter has been renamed from isX509Token() to getX509Token() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getX509Token() {
        return x509Token;
    }

    /**
     * 设置x509Token属性的值。
     * 
     */
    public void setX509Token(boolean value) {
        this.x509Token = value;
    }

    /**
     * 获取samlToken属性的值。
     * This getter has been renamed from isSAMLToken() to getSAMLToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSAMLToken() {
        return samlToken;
    }

    /**
     * 设置samlToken属性的值。
     * 
     */
    public void setSAMLToken(boolean value) {
        this.samlToken = value;
    }

    /**
     * 获取kerberosToken属性的值。
     * This getter has been renamed from isKerberosToken() to getKerberosToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getKerberosToken() {
        return kerberosToken;
    }

    /**
     * 设置kerberosToken属性的值。
     * 
     */
    public void setKerberosToken(boolean value) {
        this.kerberosToken = value;
    }

    /**
     * 获取relToken属性的值。
     * This getter has been renamed from isRELToken() to getRELToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRELToken() {
        return relToken;
    }

    /**
     * 设置relToken属性的值。
     * 
     */
    public void setRELToken(boolean value) {
        this.relToken = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
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
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilitiesExtension }
     *     
     */
    public SecurityCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilitiesExtension }
     *     
     */
    public void setExtension(SecurityCapabilitiesExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
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
