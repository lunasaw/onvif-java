
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="CertWithPrivateKey" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/>
 *         <element name="CertificationPathAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IgnoreAdditionalCertificates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IntegrityPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/>
 *         <element name="EncryptionPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/>
 *         <element name="Passphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "certWithPrivateKey",
    "certificationPathAlias",
    "keyAlias",
    "ignoreAdditionalCertificates",
    "integrityPassphraseID",
    "encryptionPassphraseID",
    "passphrase"
})
@XmlRootElement(name = "UploadCertificateWithPrivateKeyInPKCS12")
public class UploadCertificateWithPrivateKeyInPKCS12 {

    /**
     * The certificates and key pair to be uploaded in a PKCS#12 data
     *                   structure.
     * 
     */
    @XmlElement(name = "CertWithPrivateKey", required = true)
    protected byte[] certWithPrivateKey;
    /**
     * The tests-defined alias of the certification path.
     * 
     */
    @XmlElement(name = "CertificationPathAlias")
    protected String certificationPathAlias;
    /**
     * The tests-defined alias of the key pair.
     * 
     */
    @XmlElement(name = "KeyAlias")
    protected String keyAlias;
    /**
     * True if and only if the device shall behave as if
     *                   the tests had only supplied the first certificate in the sequence of
     *                   certificates.
     * 
     */
    @XmlElement(name = "IgnoreAdditionalCertificates", defaultValue = "false")
    protected Boolean ignoreAdditionalCertificates;
    /**
     * The ID of the passphrase to use for integrity checking of the
     *                   uploaded PKCS#12 data structure.
     * 
     */
    @XmlElement(name = "IntegrityPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String integrityPassphraseID;
    /**
     * The ID of the passphrase to use for decrypting the uploaded
     *                   PKCS#12 data structure.
     * 
     */
    @XmlElement(name = "EncryptionPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionPassphraseID;
    /**
     * The passphrase to use for integrity checking and decrypting the
     *                   uploaded PKCS#12 data structure.
     * 
     */
    @XmlElement(name = "Passphrase")
    protected String passphrase;

    /**
     * The certificates and key pair to be uploaded in a PKCS#12 data
     *                   structure.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertWithPrivateKey() {
        return certWithPrivateKey;
    }

    /**
     * Sets the value of the certWithPrivateKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getCertWithPrivateKey()
     */
    public void setCertWithPrivateKey(byte[] value) {
        this.certWithPrivateKey = value;
    }

    /**
     * The tests-defined alias of the certification path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationPathAlias() {
        return certificationPathAlias;
    }

    /**
     * Sets the value of the certificationPathAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertificationPathAlias()
     */
    public void setCertificationPathAlias(String value) {
        this.certificationPathAlias = value;
    }

    /**
     * The tests-defined alias of the key pair.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    /**
     * Sets the value of the keyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyAlias()
     */
    public void setKeyAlias(String value) {
        this.keyAlias = value;
    }

    /**
     * True if and only if the device shall behave as if
     *                   the tests had only supplied the first certificate in the sequence of
     *                   certificates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAdditionalCertificates() {
        return ignoreAdditionalCertificates;
    }

    /**
     * Sets the value of the ignoreAdditionalCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIgnoreAdditionalCertificates()
     */
    public void setIgnoreAdditionalCertificates(Boolean value) {
        this.ignoreAdditionalCertificates = value;
    }

    /**
     * The ID of the passphrase to use for integrity checking of the
     *                   uploaded PKCS#12 data structure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrityPassphraseID() {
        return integrityPassphraseID;
    }

    /**
     * Sets the value of the integrityPassphraseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIntegrityPassphraseID()
     */
    public void setIntegrityPassphraseID(String value) {
        this.integrityPassphraseID = value;
    }

    /**
     * The ID of the passphrase to use for decrypting the uploaded
     *                   PKCS#12 data structure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassphraseID() {
        return encryptionPassphraseID;
    }

    /**
     * Sets the value of the encryptionPassphraseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEncryptionPassphraseID()
     */
    public void setEncryptionPassphraseID(String value) {
        this.encryptionPassphraseID = value;
    }

    /**
     * The passphrase to use for integrity checking and decrypting the
     *                   uploaded PKCS#12 data structure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * Sets the value of the passphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassphrase()
     */
    public void setPassphrase(String value) {
        this.passphrase = value;
    }

}
