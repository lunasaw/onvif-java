
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
 *         <element name="KeyPair" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EncryptionPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/>
 *         <element name="EncryptionPassphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "keyPair",
    "alias",
    "encryptionPassphraseID",
    "encryptionPassphrase"
})
@XmlRootElement(name = "UploadKeyPairInPKCS8")
public class UploadKeyPairInPKCS8 {

    /**
     * The key pair to be uploaded in a PKCS#8 data structure.
     * 
     */
    @XmlElement(name = "KeyPair", required = true)
    protected byte[] keyPair;
    /**
     * The tests-defined alias of the key pair.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;
    /**
     * The ID of the passphrase to use for decrypting the uploaded key
     *                   pair.
     * 
     */
    @XmlElement(name = "EncryptionPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionPassphraseID;
    /**
     * The passphrase to use for decrypting the uploaded key pair.
     * 
     */
    @XmlElement(name = "EncryptionPassphrase")
    protected String encryptionPassphrase;

    /**
     * The key pair to be uploaded in a PKCS#8 data structure.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyPair() {
        return keyPair;
    }

    /**
     * Sets the value of the keyPair property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getKeyPair()
     */
    public void setKeyPair(byte[] value) {
        this.keyPair = value;
    }

    /**
     * The tests-defined alias of the key pair.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlias()
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * The ID of the passphrase to use for decrypting the uploaded key
     *                   pair.
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
     * The passphrase to use for decrypting the uploaded key pair.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassphrase() {
        return encryptionPassphrase;
    }

    /**
     * Sets the value of the encryptionPassphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEncryptionPassphrase()
     */
    public void setEncryptionPassphrase(String value) {
        this.encryptionPassphrase = value;
    }

}
