
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>SecurityCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DefaultAccessPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UsernameToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpDigest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupportedEAPMethods" type="{http://www.onvif.org/ver10/device/wsdl}EAPMethodTypes" /&gt;
 *       &lt;attribute name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxUserNameLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxPasswordLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

    @XmlAttribute(name = "TLS1.0")
    protected Boolean tls10;
    @XmlAttribute(name = "TLS1.1")
    protected Boolean tls11;
    @XmlAttribute(name = "TLS1.2")
    protected Boolean tls12;
    @XmlAttribute(name = "OnboardKeyGeneration")
    protected Boolean onboardKeyGeneration;
    @XmlAttribute(name = "AccessPolicyConfig")
    protected Boolean accessPolicyConfig;
    @XmlAttribute(name = "DefaultAccessPolicy")
    protected Boolean defaultAccessPolicy;
    @XmlAttribute(name = "Dot1X")
    protected Boolean dot1X;
    @XmlAttribute(name = "RemoteUserHandling")
    protected Boolean remoteUserHandling;
    @XmlAttribute(name = "X.509Token")
    protected Boolean x509Token;
    @XmlAttribute(name = "SAMLToken")
    protected Boolean samlToken;
    @XmlAttribute(name = "KerberosToken")
    protected Boolean kerberosToken;
    @XmlAttribute(name = "UsernameToken")
    protected Boolean usernameToken;
    @XmlAttribute(name = "HttpDigest")
    protected Boolean httpDigest;
    @XmlAttribute(name = "RELToken")
    protected Boolean relToken;
    @XmlAttribute(name = "SupportedEAPMethods")
    protected List<Integer> supportedEAPMethods;
    @XmlAttribute(name = "MaxUsers")
    protected Integer maxUsers;
    @XmlAttribute(name = "MaxUserNameLength")
    protected Integer maxUserNameLength;
    @XmlAttribute(name = "MaxPasswordLength")
    protected Integer maxPasswordLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取tls10属性的值。
     * This getter has been renamed from isTLS10() to getTLS10() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS10() {
        return tls10;
    }

    /**
     * 设置tls10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS10(Boolean value) {
        this.tls10 = value;
    }

    /**
     * 获取tls11属性的值。
     * This getter has been renamed from isTLS11() to getTLS11() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS11() {
        return tls11;
    }

    /**
     * 设置tls11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS11(Boolean value) {
        this.tls11 = value;
    }

    /**
     * 获取tls12属性的值。
     * This getter has been renamed from isTLS12() to getTLS12() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS12() {
        return tls12;
    }

    /**
     * 设置tls12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS12(Boolean value) {
        this.tls12 = value;
    }

    /**
     * 获取onboardKeyGeneration属性的值。
     * This getter has been renamed from isOnboardKeyGeneration() to getOnboardKeyGeneration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * 设置onboardKeyGeneration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnboardKeyGeneration(Boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * 获取accessPolicyConfig属性的值。
     * This getter has been renamed from isAccessPolicyConfig() to getAccessPolicyConfig() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * 设置accessPolicyConfig属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessPolicyConfig(Boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * 获取defaultAccessPolicy属性的值。
     * This getter has been renamed from isDefaultAccessPolicy() to getDefaultAccessPolicy() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefaultAccessPolicy() {
        return defaultAccessPolicy;
    }

    /**
     * 设置defaultAccessPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAccessPolicy(Boolean value) {
        this.defaultAccessPolicy = value;
    }

    /**
     * 获取dot1X属性的值。
     * This getter has been renamed from isDot1X() to getDot1X() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDot1X() {
        return dot1X;
    }

    /**
     * 设置dot1X属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot1X(Boolean value) {
        this.dot1X = value;
    }

    /**
     * 获取remoteUserHandling属性的值。
     * This getter has been renamed from isRemoteUserHandling() to getRemoteUserHandling() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * 设置remoteUserHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteUserHandling(Boolean value) {
        this.remoteUserHandling = value;
    }

    /**
     * 获取x509Token属性的值。
     * This getter has been renamed from isX509Token() to getX509Token() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getX509Token() {
        return x509Token;
    }

    /**
     * 设置x509Token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX509Token(Boolean value) {
        this.x509Token = value;
    }

    /**
     * 获取samlToken属性的值。
     * This getter has been renamed from isSAMLToken() to getSAMLToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSAMLToken() {
        return samlToken;
    }

    /**
     * 设置samlToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSAMLToken(Boolean value) {
        this.samlToken = value;
    }

    /**
     * 获取kerberosToken属性的值。
     * This getter has been renamed from isKerberosToken() to getKerberosToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getKerberosToken() {
        return kerberosToken;
    }

    /**
     * 设置kerberosToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKerberosToken(Boolean value) {
        this.kerberosToken = value;
    }

    /**
     * 获取usernameToken属性的值。
     * This getter has been renamed from isUsernameToken() to getUsernameToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsernameToken() {
        return usernameToken;
    }

    /**
     * 设置usernameToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsernameToken(Boolean value) {
        this.usernameToken = value;
    }

    /**
     * 获取httpDigest属性的值。
     * This getter has been renamed from isHttpDigest() to getHttpDigest() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpDigest() {
        return httpDigest;
    }

    /**
     * 设置httpDigest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpDigest(Boolean value) {
        this.httpDigest = value;
    }

    /**
     * 获取relToken属性的值。
     * This getter has been renamed from isRELToken() to getRELToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRELToken() {
        return relToken;
    }

    /**
     * 设置relToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRELToken(Boolean value) {
        this.relToken = value;
    }

    /**
     * Gets the value of the supportedEAPMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEAPMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethods() {
        if (supportedEAPMethods == null) {
            supportedEAPMethods = new ArrayList<Integer>();
        }
        return this.supportedEAPMethods;
    }

    /**
     * 获取maxUsers属性的值。
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
     * 设置maxUsers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUsers(Integer value) {
        this.maxUsers = value;
    }

    /**
     * 获取maxUserNameLength属性的值。
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
     * 设置maxUserNameLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUserNameLength(Integer value) {
        this.maxUserNameLength = value;
    }

    /**
     * 获取maxPasswordLength属性的值。
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
     * 设置maxPasswordLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
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
