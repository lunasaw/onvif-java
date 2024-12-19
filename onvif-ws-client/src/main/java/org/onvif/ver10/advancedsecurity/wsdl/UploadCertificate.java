
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="Certificate" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PrivateKeyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "certificate",
    "alias",
    "keyAlias",
    "privateKeyRequired"
})
@XmlRootElement(name = "UploadCertificate")
public class UploadCertificate {

    /**
     * The base64-encoded DER representation of the X.509 certificate to
     *                   be uploaded.
     * 
     */
    @XmlElement(name = "Certificate", required = true)
    protected byte[] certificate;
    /**
     * The tests-defined alias of the certificate.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;
    /**
     * The tests-defined alias of the key pair.
     * 
     */
    @XmlElement(name = "KeyAlias")
    protected String keyAlias;
    /**
     * Indicates if the device shall verify that a matching key pair with
     *                   a private key exists in the keystore.
     * 
     */
    @XmlElement(name = "PrivateKeyRequired", defaultValue = "false")
    protected Boolean privateKeyRequired;

    /**
     * The base64-encoded DER representation of the X.509 certificate to
     *                   be uploaded.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getCertificate()
     */
    public void setCertificate(byte[] value) {
        this.certificate = value;
    }

    /**
     * The tests-defined alias of the certificate.
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
     * Indicates if the device shall verify that a matching key pair with
     *                   a private key exists in the keystore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateKeyRequired() {
        return privateKeyRequired;
    }

    /**
     * Sets the value of the privateKeyRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrivateKeyRequired()
     */
    public void setPrivateKeyRequired(Boolean value) {
        this.privateKeyRequired = value;
    }

}
