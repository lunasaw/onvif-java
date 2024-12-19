
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurityCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DefaultAccessPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UsernameToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpDigest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SupportedEAPMethods" type="{http://www.onvif.org/ver10/device/wsdl}EAPMethodTypes" />
 *       <attribute name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="MaxUserNameLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="MaxPasswordLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

    /**
     * Indicates support for TLS 1.0.
     * 
     */
    @XmlAttribute(name = "TLS1.0")
    protected Boolean tls10;
    /**
     * Indicates support for TLS 1.1.
     * 
     */
    @XmlAttribute(name = "TLS1.1")
    protected Boolean tls11;
    /**
     * Indicates support for TLS 1.2.
     * 
     */
    @XmlAttribute(name = "TLS1.2")
    protected Boolean tls12;
    /**
     * Indicates support for onboard key generation.
     * 
     */
    @XmlAttribute(name = "OnboardKeyGeneration")
    protected Boolean onboardKeyGeneration;
    /**
     * Indicates support for access policy configuration.
     * 
     */
    @XmlAttribute(name = "AccessPolicyConfig")
    protected Boolean accessPolicyConfig;
    /**
     * Indicates support for the ONVIF default access policy.
     * 
     */
    @XmlAttribute(name = "DefaultAccessPolicy")
    protected Boolean defaultAccessPolicy;
    /**
     * Indicates support for IEEE 802.1X configuration.
     * 
     */
    @XmlAttribute(name = "Dot1X")
    protected Boolean dot1X;
    /**
     * Indicates support for remote user configuration. Used when accessing
     *               another device.
     * 
     */
    @XmlAttribute(name = "RemoteUserHandling")
    protected Boolean remoteUserHandling;
    /**
     * Indicates support for WS-Security X.509 token.
     * 
     */
    @XmlAttribute(name = "X.509Token")
    protected Boolean x509Token;
    /**
     * Indicates support for WS-Security SAML token.
     * 
     */
    @XmlAttribute(name = "SAMLToken")
    protected Boolean samlToken;
    /**
     * Indicates support for WS-Security Kerberos token.
     * 
     */
    @XmlAttribute(name = "KerberosToken")
    protected Boolean kerberosToken;
    /**
     * Indicates support for WS-Security Username token.
     * 
     */
    @XmlAttribute(name = "UsernameToken")
    protected Boolean usernameToken;
    /**
     * Indicates support for WS over HTTP digest authenticated communication
     *               layer.
     * 
     */
    @XmlAttribute(name = "HttpDigest")
    protected Boolean httpDigest;
    /**
     * Indicates support for WS-Security REL token.
     * 
     */
    @XmlAttribute(name = "RELToken")
    protected Boolean relToken;
    /**
     * EAP Methods supported by the device. The int values refer to the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tds="http://www.onvif.org/ver10/device/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/eap-numbers/eap-numbers.xhtml"&gt;IANA EAP
     *               Registry&lt;/a&gt;
     * </pre>
     * .
     * 
     */
    @XmlAttribute(name = "SupportedEAPMethods")
    protected List<Integer> supportedEAPMethods;
    /**
     * The maximum number of users that the device supports.
     * 
     */
    @XmlAttribute(name = "MaxUsers")
    protected Integer maxUsers;
    /**
     * Maximum number of characters supported for the username by
     *               CreateUsers.
     * 
     */
    @XmlAttribute(name = "MaxUserNameLength")
    protected Integer maxUserNameLength;
    /**
     * Maximum number of characters supported for the password by CreateUsers
     *               and SetUser.
     * 
     */
    @XmlAttribute(name = "MaxPasswordLength")
    protected Integer maxPasswordLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates support for TLS 1.0.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS10() {
        return tls10;
    }

    /**
     * Sets the value of the tls10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTLS10()
     */
    public void setTLS10(Boolean value) {
        this.tls10 = value;
    }

    /**
     * Indicates support for TLS 1.1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS11() {
        return tls11;
    }

    /**
     * Sets the value of the tls11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTLS11()
     */
    public void setTLS11(Boolean value) {
        this.tls11 = value;
    }

    /**
     * Indicates support for TLS 1.2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS12() {
        return tls12;
    }

    /**
     * Sets the value of the tls12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTLS12()
     */
    public void setTLS12(Boolean value) {
        this.tls12 = value;
    }

    /**
     * Indicates support for onboard key generation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * Sets the value of the onboardKeyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOnboardKeyGeneration()
     */
    public void setOnboardKeyGeneration(Boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * Indicates support for access policy configuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * Sets the value of the accessPolicyConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccessPolicyConfig()
     */
    public void setAccessPolicyConfig(Boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * Indicates support for the ONVIF default access policy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAccessPolicy() {
        return defaultAccessPolicy;
    }

    /**
     * Sets the value of the defaultAccessPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDefaultAccessPolicy()
     */
    public void setDefaultAccessPolicy(Boolean value) {
        this.defaultAccessPolicy = value;
    }

    /**
     * Indicates support for IEEE 802.1X configuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDot1X() {
        return dot1X;
    }

    /**
     * Sets the value of the dot1X property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDot1X()
     */
    public void setDot1X(Boolean value) {
        this.dot1X = value;
    }

    /**
     * Indicates support for remote user configuration. Used when accessing
     *               another device.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * Sets the value of the remoteUserHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRemoteUserHandling()
     */
    public void setRemoteUserHandling(Boolean value) {
        this.remoteUserHandling = value;
    }

    /**
     * Indicates support for WS-Security X.509 token.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isX509Token() {
        return x509Token;
    }

    /**
     * Sets the value of the x509Token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isX509Token()
     */
    public void setX509Token(Boolean value) {
        this.x509Token = value;
    }

    /**
     * Indicates support for WS-Security SAML token.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSAMLToken() {
        return samlToken;
    }

    /**
     * Sets the value of the samlToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSAMLToken()
     */
    public void setSAMLToken(Boolean value) {
        this.samlToken = value;
    }

    /**
     * Indicates support for WS-Security Kerberos token.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKerberosToken() {
        return kerberosToken;
    }

    /**
     * Sets the value of the kerberosToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKerberosToken()
     */
    public void setKerberosToken(Boolean value) {
        this.kerberosToken = value;
    }

    /**
     * Indicates support for WS-Security Username token.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsernameToken() {
        return usernameToken;
    }

    /**
     * Sets the value of the usernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUsernameToken()
     */
    public void setUsernameToken(Boolean value) {
        this.usernameToken = value;
    }

    /**
     * Indicates support for WS over HTTP digest authenticated communication
     *               layer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpDigest() {
        return httpDigest;
    }

    /**
     * Sets the value of the httpDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHttpDigest()
     */
    public void setHttpDigest(Boolean value) {
        this.httpDigest = value;
    }

    /**
     * Indicates support for WS-Security REL token.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRELToken() {
        return relToken;
    }

    /**
     * Sets the value of the relToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRELToken()
     */
    public void setRELToken(Boolean value) {
        this.relToken = value;
    }

    /**
     * EAP Methods supported by the device. The int values refer to the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tds="http://www.onvif.org/ver10/device/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/eap-numbers/eap-numbers.xhtml"&gt;IANA EAP
     *               Registry&lt;/a&gt;
     * </pre>
     * .
     * 
     * Gets the value of the supportedEAPMethods property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethods property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEAPMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedEAPMethods property.
     */
    public List<Integer> getSupportedEAPMethods() {
        if (supportedEAPMethods == null) {
            supportedEAPMethods = new ArrayList<>();
        }
        return this.supportedEAPMethods;
    }

    /**
     * The maximum number of users that the device supports.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    /**
     * Sets the value of the maxUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxUsers()
     */
    public void setMaxUsers(Integer value) {
        this.maxUsers = value;
    }

    /**
     * Maximum number of characters supported for the username by
     *               CreateUsers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUserNameLength() {
        return maxUserNameLength;
    }

    /**
     * Sets the value of the maxUserNameLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxUserNameLength()
     */
    public void setMaxUserNameLength(Integer value) {
        this.maxUserNameLength = value;
    }

    /**
     * Maximum number of characters supported for the password by CreateUsers
     *               and SetUser.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPasswordLength() {
        return maxPasswordLength;
    }

    /**
     * Sets the value of the maxPasswordLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxPasswordLength()
     */
    public void setMaxPasswordLength(Integer value) {
        this.maxPasswordLength = value;
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
