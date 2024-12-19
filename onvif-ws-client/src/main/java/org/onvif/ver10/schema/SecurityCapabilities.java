
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
import org.w3c.dom.Element;


/**
 * <p>Java class for SecurityCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurityCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

    /**
     * Indicates whether or not TLS 1.1 is supported.
     * 
     */
    @XmlElement(name = "TLS1.1")
    protected boolean tls11;
    /**
     * Indicates whether or not TLS 1.2 is supported.
     * 
     */
    @XmlElement(name = "TLS1.2")
    protected boolean tls12;
    /**
     * Indicates whether or not onboard key generation is supported.
     * 
     */
    @XmlElement(name = "OnboardKeyGeneration")
    protected boolean onboardKeyGeneration;
    /**
     * Indicates whether or not access policy configuration is supported.
     * 
     */
    @XmlElement(name = "AccessPolicyConfig")
    protected boolean accessPolicyConfig;
    /**
     * Indicates whether or not WS-Security X.509 token is supported.
     * 
     */
    @XmlElement(name = "X.509Token")
    protected boolean x509Token;
    /**
     * Indicates whether or not WS-Security SAML token is supported.
     * 
     */
    @XmlElement(name = "SAMLToken")
    protected boolean samlToken;
    /**
     * Indicates whether or not WS-Security Kerberos token is supported.
     * 
     */
    @XmlElement(name = "KerberosToken")
    protected boolean kerberosToken;
    /**
     * Indicates whether or not WS-Security REL token is supported.
     * 
     */
    @XmlElement(name = "RELToken")
    protected boolean relToken;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not TLS 1.1 is supported.
     * 
     */
    public boolean isTLS11() {
        return tls11;
    }

    /**
     * Sets the value of the tls11 property.
     * 
     */
    public void setTLS11(boolean value) {
        this.tls11 = value;
    }

    /**
     * Indicates whether or not TLS 1.2 is supported.
     * 
     */
    public boolean isTLS12() {
        return tls12;
    }

    /**
     * Sets the value of the tls12 property.
     * 
     */
    public void setTLS12(boolean value) {
        this.tls12 = value;
    }

    /**
     * Indicates whether or not onboard key generation is supported.
     * 
     */
    public boolean isOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * Sets the value of the onboardKeyGeneration property.
     * 
     */
    public void setOnboardKeyGeneration(boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * Indicates whether or not access policy configuration is supported.
     * 
     */
    public boolean isAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * Sets the value of the accessPolicyConfig property.
     * 
     */
    public void setAccessPolicyConfig(boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * Indicates whether or not WS-Security X.509 token is supported.
     * 
     */
    public boolean isX509Token() {
        return x509Token;
    }

    /**
     * Sets the value of the x509Token property.
     * 
     */
    public void setX509Token(boolean value) {
        this.x509Token = value;
    }

    /**
     * Indicates whether or not WS-Security SAML token is supported.
     * 
     */
    public boolean isSAMLToken() {
        return samlToken;
    }

    /**
     * Sets the value of the samlToken property.
     * 
     */
    public void setSAMLToken(boolean value) {
        this.samlToken = value;
    }

    /**
     * Indicates whether or not WS-Security Kerberos token is supported.
     * 
     */
    public boolean isKerberosToken() {
        return kerberosToken;
    }

    /**
     * Sets the value of the kerberosToken property.
     * 
     */
    public void setKerberosToken(boolean value) {
        this.kerberosToken = value;
    }

    /**
     * Indicates whether or not WS-Security REL token is supported.
     * 
     */
    public boolean isRELToken() {
        return relToken;
    }

    /**
     * Sets the value of the relToken property.
     * 
     */
    public void setRELToken(boolean value) {
        this.relToken = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets the value of the extension property.
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
     * Sets the value of the extension property.
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

}
