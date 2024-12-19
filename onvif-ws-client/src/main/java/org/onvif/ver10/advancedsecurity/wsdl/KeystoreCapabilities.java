
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
import org.w3c.dom.Element;


/**
 * The capabilities of a keystore implementation on a device.
 * 
 * <p>Java class for KeystoreCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KeystoreCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SignatureAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="anyElement" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="MaximumNumberOfKeys" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="MaximumNumberOfCertificates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="MaximumNumberOfCertificationPaths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="RSAKeyPairGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RSAKeyLengths" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}RSAKeyLengths" />
 *       <attribute name="PKCS10ExternalCertificationWithRSA" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SelfSignedCertificateCreationWithRSA" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="X509Versions" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509Versions" />
 *       <attribute name="MaximumNumberOfPassphrases" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="PKCS8RSAKeyPairUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PKCS12CertificateWithRSAPrivateKeyUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PasswordBasedEncryptionAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PasswordBasedEncryptionAlgorithms" />
 *       <attribute name="PasswordBasedMACAlgorithms" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PasswordBasedEncryptionAlgorithms" />
 *       <attribute name="MaximumNumberOfCRLs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="MaximumNumberOfCertificationPathValidationPolicies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="EnforceTLSWebClientAuthExtKeyUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeystoreCapabilities", propOrder = {
    "signatureAlgorithms",
    "anyElement"
})
public class KeystoreCapabilities {

    /**
     * The signature algorithms supported by the keystore implementation.
     * 
     */
    @XmlElement(name = "SignatureAlgorithms")
    protected List<AlgorithmIdentifier> signatureAlgorithms;
    protected KeystoreCapabilities.AnyElement anyElement;
    /**
     * Indicates the maximum number of keys that the device can store
     *               simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfKeys")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfKeys;
    /**
     * Indicates the maximum number of certificates that the device can store
     *               simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfCertificates")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfCertificates;
    /**
     * Indicates the maximum number of certification paths that the device
     *               can store simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfCertificationPaths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfCertificationPaths;
    /**
     * Indication that the device supports on-board RSA key pair
     *               generation.
     * 
     */
    @XmlAttribute(name = "RSAKeyPairGeneration")
    protected Boolean rsaKeyPairGeneration;
    /**
     * Indicates which RSA key lengths are supported by the device.
     * 
     */
    @XmlAttribute(name = "RSAKeyLengths")
    protected List<BigInteger> rsaKeyLengths;
    /**
     * Indicates support for creating PKCS#10 requests for RSA keys and
     *               uploading the certificate obtained from a CA..
     * 
     */
    @XmlAttribute(name = "PKCS10ExternalCertificationWithRSA")
    protected Boolean pkcs10ExternalCertificationWithRSA;
    /**
     * Indicates support for creating self-signed certificates for RSA
     *               keys.
     * 
     */
    @XmlAttribute(name = "SelfSignedCertificateCreationWithRSA")
    protected Boolean selfSignedCertificateCreationWithRSA;
    /**
     * Indicates which X.509 versions are supported by the device.
     * 
     */
    @XmlAttribute(name = "X509Versions")
    protected List<Integer> x509Versions;
    /**
     * Indicates the maximum number of passphrases that the device is able to
     *               store simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfPassphrases")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfPassphrases;
    /**
     * Indicates support for uploading an RSA key pair in a PKCS#8 data
     *               structure.
     * 
     */
    @XmlAttribute(name = "PKCS8RSAKeyPairUpload")
    protected Boolean pkcs8RSAKeyPairUpload;
    /**
     * Indicates support for uploading a certificate along with an RSA
     *               private key in a PKCS#12 data structure.
     * 
     */
    @XmlAttribute(name = "PKCS12CertificateWithRSAPrivateKeyUpload")
    protected Boolean pkcs12CertificateWithRSAPrivateKeyUpload;
    /**
     * Indicates which password-based encryption algorithms are supported by
     *               the device.
     * 
     */
    @XmlAttribute(name = "PasswordBasedEncryptionAlgorithms")
    protected List<String> passwordBasedEncryptionAlgorithms;
    /**
     * Indicates which password-based MAC algorithms are supported by the
     *               device.
     * 
     */
    @XmlAttribute(name = "PasswordBasedMACAlgorithms")
    protected List<String> passwordBasedMACAlgorithms;
    /**
     * Indicates the maximum number of CRLs that the device is able to store
     *               simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfCRLs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfCRLs;
    /**
     * Indicates the maximum number of certification path validation policies
     *               that the device is able to store simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfCertificationPathValidationPolicies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfCertificationPathValidationPolicies;
    /**
     * Indicates whether a device supports checking for the TLS WWW tests
     *               auth extended key usage extension while validating certification paths.
     * 
     */
    @XmlAttribute(name = "EnforceTLSWebClientAuthExtKeyUsage")
    protected Boolean enforceTLSWebClientAuthExtKeyUsage;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The signature algorithms supported by the keystore implementation.
     * 
     * Gets the value of the signatureAlgorithms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureAlgorithms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignatureAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentifier }
     * </p>
     * 
     * 
     * @return
     *     The value of the signatureAlgorithms property.
     */
    public List<AlgorithmIdentifier> getSignatureAlgorithms() {
        if (signatureAlgorithms == null) {
            signatureAlgorithms = new ArrayList<>();
        }
        return this.signatureAlgorithms;
    }

    /**
     * Gets the value of the anyElement property.
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
     * Sets the value of the anyElement property.
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
     * Indicates the maximum number of keys that the device can store
     *               simultaneously.
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
     * Sets the value of the maximumNumberOfKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfKeys()
     */
    public void setMaximumNumberOfKeys(BigInteger value) {
        this.maximumNumberOfKeys = value;
    }

    /**
     * Indicates the maximum number of certificates that the device can store
     *               simultaneously.
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
     * Sets the value of the maximumNumberOfCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfCertificates()
     */
    public void setMaximumNumberOfCertificates(BigInteger value) {
        this.maximumNumberOfCertificates = value;
    }

    /**
     * Indicates the maximum number of certification paths that the device
     *               can store simultaneously.
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
     * Sets the value of the maximumNumberOfCertificationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfCertificationPaths()
     */
    public void setMaximumNumberOfCertificationPaths(BigInteger value) {
        this.maximumNumberOfCertificationPaths = value;
    }

    /**
     * Indication that the device supports on-board RSA key pair
     *               generation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRSAKeyPairGeneration() {
        return rsaKeyPairGeneration;
    }

    /**
     * Sets the value of the rsaKeyPairGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRSAKeyPairGeneration()
     */
    public void setRSAKeyPairGeneration(Boolean value) {
        this.rsaKeyPairGeneration = value;
    }

    /**
     * Indicates which RSA key lengths are supported by the device.
     * 
     * Gets the value of the rsaKeyLengths property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsaKeyLengths property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRSAKeyLengths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * </p>
     * 
     * 
     * @return
     *     The value of the rsaKeyLengths property.
     */
    public List<BigInteger> getRSAKeyLengths() {
        if (rsaKeyLengths == null) {
            rsaKeyLengths = new ArrayList<>();
        }
        return this.rsaKeyLengths;
    }

    /**
     * Indicates support for creating PKCS#10 requests for RSA keys and
     *               uploading the certificate obtained from a CA..
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPKCS10ExternalCertificationWithRSA() {
        return pkcs10ExternalCertificationWithRSA;
    }

    /**
     * Sets the value of the pkcs10ExternalCertificationWithRSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPKCS10ExternalCertificationWithRSA()
     */
    public void setPKCS10ExternalCertificationWithRSA(Boolean value) {
        this.pkcs10ExternalCertificationWithRSA = value;
    }

    /**
     * Indicates support for creating self-signed certificates for RSA
     *               keys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfSignedCertificateCreationWithRSA() {
        return selfSignedCertificateCreationWithRSA;
    }

    /**
     * Sets the value of the selfSignedCertificateCreationWithRSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSelfSignedCertificateCreationWithRSA()
     */
    public void setSelfSignedCertificateCreationWithRSA(Boolean value) {
        this.selfSignedCertificateCreationWithRSA = value;
    }

    /**
     * Indicates which X.509 versions are supported by the device.
     * 
     * Gets the value of the x509Versions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x509Versions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getX509Versions().add(newItem);
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
     *     The value of the x509Versions property.
     */
    public List<Integer> getX509Versions() {
        if (x509Versions == null) {
            x509Versions = new ArrayList<>();
        }
        return this.x509Versions;
    }

    /**
     * Indicates the maximum number of passphrases that the device is able to
     *               store simultaneously.
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
     * Sets the value of the maximumNumberOfPassphrases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfPassphrases()
     */
    public void setMaximumNumberOfPassphrases(BigInteger value) {
        this.maximumNumberOfPassphrases = value;
    }

    /**
     * Indicates support for uploading an RSA key pair in a PKCS#8 data
     *               structure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPKCS8RSAKeyPairUpload() {
        return pkcs8RSAKeyPairUpload;
    }

    /**
     * Sets the value of the pkcs8RSAKeyPairUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPKCS8RSAKeyPairUpload()
     */
    public void setPKCS8RSAKeyPairUpload(Boolean value) {
        this.pkcs8RSAKeyPairUpload = value;
    }

    /**
     * Indicates support for uploading a certificate along with an RSA
     *               private key in a PKCS#12 data structure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPKCS12CertificateWithRSAPrivateKeyUpload() {
        return pkcs12CertificateWithRSAPrivateKeyUpload;
    }

    /**
     * Sets the value of the pkcs12CertificateWithRSAPrivateKeyUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPKCS12CertificateWithRSAPrivateKeyUpload()
     */
    public void setPKCS12CertificateWithRSAPrivateKeyUpload(Boolean value) {
        this.pkcs12CertificateWithRSAPrivateKeyUpload = value;
    }

    /**
     * Indicates which password-based encryption algorithms are supported by
     *               the device.
     * 
     * Gets the value of the passwordBasedEncryptionAlgorithms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordBasedEncryptionAlgorithms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPasswordBasedEncryptionAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the passwordBasedEncryptionAlgorithms property.
     */
    public List<String> getPasswordBasedEncryptionAlgorithms() {
        if (passwordBasedEncryptionAlgorithms == null) {
            passwordBasedEncryptionAlgorithms = new ArrayList<>();
        }
        return this.passwordBasedEncryptionAlgorithms;
    }

    /**
     * Indicates which password-based MAC algorithms are supported by the
     *               device.
     * 
     * Gets the value of the passwordBasedMACAlgorithms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordBasedMACAlgorithms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPasswordBasedMACAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the passwordBasedMACAlgorithms property.
     */
    public List<String> getPasswordBasedMACAlgorithms() {
        if (passwordBasedMACAlgorithms == null) {
            passwordBasedMACAlgorithms = new ArrayList<>();
        }
        return this.passwordBasedMACAlgorithms;
    }

    /**
     * Indicates the maximum number of CRLs that the device is able to store
     *               simultaneously.
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
     * Sets the value of the maximumNumberOfCRLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfCRLs()
     */
    public void setMaximumNumberOfCRLs(BigInteger value) {
        this.maximumNumberOfCRLs = value;
    }

    /**
     * Indicates the maximum number of certification path validation policies
     *               that the device is able to store simultaneously.
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
     * Sets the value of the maximumNumberOfCertificationPathValidationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfCertificationPathValidationPolicies()
     */
    public void setMaximumNumberOfCertificationPathValidationPolicies(BigInteger value) {
        this.maximumNumberOfCertificationPathValidationPolicies = value;
    }

    /**
     * Indicates whether a device supports checking for the TLS WWW tests
     *               auth extended key usage extension while validating certification paths.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceTLSWebClientAuthExtKeyUsage() {
        return enforceTLSWebClientAuthExtKeyUsage;
    }

    /**
     * Sets the value of the enforceTLSWebClientAuthExtKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnforceTLSWebClientAuthExtKeyUsage()
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
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
         * {@link Object }
         * {@link Element }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }

}
