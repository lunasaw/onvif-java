
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * The capabilities of a keystore implementation on a device.
 *           
 * 
 * <p>KeystoreCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="KeystoreCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignatureAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anyElement" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaximumNumberOfKeys" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MaximumNumberOfCertificates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MaximumNumberOfCertificationPaths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="RSAKeyPairGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RSAKeyLengths" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}RSAKeyLengths" /&gt;
 *       &lt;attribute name="PKCS10ExternalCertificationWithRSA" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SelfSignedCertificateCreationWithRSA" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="X509Versions" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509Versions" /&gt;
 *       &lt;attribute name="MaximumNumberOfPassphrases" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="PKCS8RSAKeyPairUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PKCS12CertificateWithRSAPrivateKeyUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PasswordBasedEncryptionAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PasswordBasedEncryptionAlgorithms" /&gt;
 *       &lt;attribute name="PasswordBasedMACAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PasswordBasedEncryptionAlgorithms" /&gt;
 *       &lt;attribute name="MaximumNumberOfCRLs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="MaximumNumberOfCertificationPathValidationPolicies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="EnforceTLSWebClientAuthExtKeyUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeystoreCapabilities", propOrder = {
    "signatureAlgorithms",
    "anyElement"
})
public class KeystoreCapabilities {

    @XmlElement(name = "SignatureAlgorithms")
    protected List<AlgorithmIdentifier> signatureAlgorithms;
    protected KeystoreCapabilities.AnyElement anyElement;
    @XmlAttribute(name = "MaximumNumberOfKeys")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfKeys;
    @XmlAttribute(name = "MaximumNumberOfCertificates")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfCertificates;
    @XmlAttribute(name = "MaximumNumberOfCertificationPaths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfCertificationPaths;
    @XmlAttribute(name = "RSAKeyPairGeneration")
    protected Boolean rsaKeyPairGeneration;
    @XmlAttribute(name = "RSAKeyLengths")
    protected List<BigInteger> rsaKeyLengths;
    @XmlAttribute(name = "PKCS10ExternalCertificationWithRSA")
    protected Boolean pkcs10ExternalCertificationWithRSA;
    @XmlAttribute(name = "SelfSignedCertificateCreationWithRSA")
    protected Boolean selfSignedCertificateCreationWithRSA;
    @XmlAttribute(name = "X509Versions")
    protected List<Integer> x509Versions;
    @XmlAttribute(name = "MaximumNumberOfPassphrases")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfPassphrases;
    @XmlAttribute(name = "PKCS8RSAKeyPairUpload")
    protected Boolean pkcs8RSAKeyPairUpload;
    @XmlAttribute(name = "PKCS12CertificateWithRSAPrivateKeyUpload")
    protected Boolean pkcs12CertificateWithRSAPrivateKeyUpload;
    @XmlAttribute(name = "PasswordBasedEncryptionAlgorithms")
    protected List<String> passwordBasedEncryptionAlgorithms;
    @XmlAttribute(name = "PasswordBasedMACAlgorithms")
    protected List<String> passwordBasedMACAlgorithms;
    @XmlAttribute(name = "MaximumNumberOfCRLs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfCRLs;
    @XmlAttribute(name = "MaximumNumberOfCertificationPathValidationPolicies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfCertificationPathValidationPolicies;
    @XmlAttribute(name = "EnforceTLSWebClientAuthExtKeyUsage")
    protected Boolean enforceTLSWebClientAuthExtKeyUsage;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the signatureAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the signatureAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentifier }
     * 
     * 
     */
    public List<AlgorithmIdentifier> getSignatureAlgorithms() {
        if (signatureAlgorithms == null) {
            signatureAlgorithms = new ArrayList<AlgorithmIdentifier>();
        }
        return this.signatureAlgorithms;
    }

    /**
     * 获取anyElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link KeystoreCapabilities.AnyElement }
     *     
     */
    public KeystoreCapabilities.AnyElement getAnyElement() {
        return anyElement;
    }

    /**
     * 设置anyElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link KeystoreCapabilities.AnyElement }
     *     
     */
    public void setAnyElement(KeystoreCapabilities.AnyElement value) {
        this.anyElement = value;
    }

    /**
     * 获取maximumNumberOfKeys属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfKeys() {
        return maximumNumberOfKeys;
    }

    /**
     * 设置maximumNumberOfKeys属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfKeys(BigInteger value) {
        this.maximumNumberOfKeys = value;
    }

    /**
     * 获取maximumNumberOfCertificates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfCertificates() {
        return maximumNumberOfCertificates;
    }

    /**
     * 设置maximumNumberOfCertificates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfCertificates(BigInteger value) {
        this.maximumNumberOfCertificates = value;
    }

    /**
     * 获取maximumNumberOfCertificationPaths属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfCertificationPaths() {
        return maximumNumberOfCertificationPaths;
    }

    /**
     * 设置maximumNumberOfCertificationPaths属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfCertificationPaths(BigInteger value) {
        this.maximumNumberOfCertificationPaths = value;
    }

    /**
     * 获取rsaKeyPairGeneration属性的值。
     * This getter has been renamed from isRSAKeyPairGeneration() to getRSAKeyPairGeneration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRSAKeyPairGeneration() {
        return rsaKeyPairGeneration;
    }

    /**
     * 设置rsaKeyPairGeneration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRSAKeyPairGeneration(Boolean value) {
        this.rsaKeyPairGeneration = value;
    }

    /**
     * Gets the value of the rsaKeyLengths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rsaKeyLengths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRSAKeyLengths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getRSAKeyLengths() {
        if (rsaKeyLengths == null) {
            rsaKeyLengths = new ArrayList<BigInteger>();
        }
        return this.rsaKeyLengths;
    }

    /**
     * 获取pkcs10ExternalCertificationWithRSA属性的值。
     * This getter has been renamed from isPKCS10ExternalCertificationWithRSA() to getPKCS10ExternalCertificationWithRSA() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPKCS10ExternalCertificationWithRSA() {
        return pkcs10ExternalCertificationWithRSA;
    }

    /**
     * 设置pkcs10ExternalCertificationWithRSA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPKCS10ExternalCertificationWithRSA(Boolean value) {
        this.pkcs10ExternalCertificationWithRSA = value;
    }

    /**
     * 获取selfSignedCertificateCreationWithRSA属性的值。
     * This getter has been renamed from isSelfSignedCertificateCreationWithRSA() to getSelfSignedCertificateCreationWithRSA() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSelfSignedCertificateCreationWithRSA() {
        return selfSignedCertificateCreationWithRSA;
    }

    /**
     * 设置selfSignedCertificateCreationWithRSA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfSignedCertificateCreationWithRSA(Boolean value) {
        this.selfSignedCertificateCreationWithRSA = value;
    }

    /**
     * Gets the value of the x509Versions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the x509Versions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX509Versions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getX509Versions() {
        if (x509Versions == null) {
            x509Versions = new ArrayList<Integer>();
        }
        return this.x509Versions;
    }

    /**
     * 获取maximumNumberOfPassphrases属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfPassphrases() {
        return maximumNumberOfPassphrases;
    }

    /**
     * 设置maximumNumberOfPassphrases属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfPassphrases(BigInteger value) {
        this.maximumNumberOfPassphrases = value;
    }

    /**
     * 获取pkcs8RSAKeyPairUpload属性的值。
     * This getter has been renamed from isPKCS8RSAKeyPairUpload() to getPKCS8RSAKeyPairUpload() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPKCS8RSAKeyPairUpload() {
        return pkcs8RSAKeyPairUpload;
    }

    /**
     * 设置pkcs8RSAKeyPairUpload属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPKCS8RSAKeyPairUpload(Boolean value) {
        this.pkcs8RSAKeyPairUpload = value;
    }

    /**
     * 获取pkcs12CertificateWithRSAPrivateKeyUpload属性的值。
     * This getter has been renamed from isPKCS12CertificateWithRSAPrivateKeyUpload() to getPKCS12CertificateWithRSAPrivateKeyUpload() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPKCS12CertificateWithRSAPrivateKeyUpload() {
        return pkcs12CertificateWithRSAPrivateKeyUpload;
    }

    /**
     * 设置pkcs12CertificateWithRSAPrivateKeyUpload属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPKCS12CertificateWithRSAPrivateKeyUpload(Boolean value) {
        this.pkcs12CertificateWithRSAPrivateKeyUpload = value;
    }

    /**
     * Gets the value of the passwordBasedEncryptionAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passwordBasedEncryptionAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordBasedEncryptionAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPasswordBasedEncryptionAlgorithms() {
        if (passwordBasedEncryptionAlgorithms == null) {
            passwordBasedEncryptionAlgorithms = new ArrayList<String>();
        }
        return this.passwordBasedEncryptionAlgorithms;
    }

    /**
     * Gets the value of the passwordBasedMACAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passwordBasedMACAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordBasedMACAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPasswordBasedMACAlgorithms() {
        if (passwordBasedMACAlgorithms == null) {
            passwordBasedMACAlgorithms = new ArrayList<String>();
        }
        return this.passwordBasedMACAlgorithms;
    }

    /**
     * 获取maximumNumberOfCRLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfCRLs() {
        return maximumNumberOfCRLs;
    }

    /**
     * 设置maximumNumberOfCRLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfCRLs(BigInteger value) {
        this.maximumNumberOfCRLs = value;
    }

    /**
     * 获取maximumNumberOfCertificationPathValidationPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfCertificationPathValidationPolicies() {
        return maximumNumberOfCertificationPathValidationPolicies;
    }

    /**
     * 设置maximumNumberOfCertificationPathValidationPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfCertificationPathValidationPolicies(BigInteger value) {
        this.maximumNumberOfCertificationPathValidationPolicies = value;
    }

    /**
     * 获取enforceTLSWebClientAuthExtKeyUsage属性的值。
     * This getter has been renamed from isEnforceTLSWebClientAuthExtKeyUsage() to getEnforceTLSWebClientAuthExtKeyUsage() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnforceTLSWebClientAuthExtKeyUsage() {
        return enforceTLSWebClientAuthExtKeyUsage;
    }

    /**
     * 设置enforceTLSWebClientAuthExtKeyUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceTLSWebClientAuthExtKeyUsage(Boolean value) {
        this.enforceTLSWebClientAuthExtKeyUsage = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AnyElement {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * {@link Object }
         * {@link Element }
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
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }

}
