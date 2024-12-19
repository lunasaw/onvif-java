
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element name="X509Version" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="Subject" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DistinguishedName"/>
 *         <element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="notValidBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="notValidAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="SignatureAlgorithm" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509v3Extension" maxOccurs="unbounded" minOccurs="0"/>
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
    "x509Version",
    "subject",
    "keyID",
    "alias",
    "notValidBefore",
    "notValidAfter",
    "signatureAlgorithm",
    "extension"
})
@XmlRootElement(name = "CreateSelfSignedCertificate")
public class CreateSelfSignedCertificate {

    /**
     * The X.509 version that the generated certificate shall comply
     *                   to.
     * 
     */
    @XmlElement(name = "X509Version")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger x509Version;
    /**
     * Distinguished name of the entity that the certificate shall belong
     *                   to.
     * 
     */
    @XmlElement(name = "Subject", required = true)
    protected DistinguishedName subject;
    /**
     * The ID of the key for which the certificate shall be created.
     * 
     */
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    /**
     * The tests-defined alias of the certificate to be created.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;
    /**
     * The X.509 not valid before information to be included in the
     *                   certificate. Defaults to the device's current time or a time before the device's
     *                   current time.
     * 
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidBefore;
    /**
     * The X.509 not valid after information to be included in the
     *                   certificate. Defaults to the time 99991231235959Z as specified in RFC 5280.
     * 
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidAfter;
    /**
     * The signature algorithm to be used for signing the certificate.
     *                   Defaults to SHA1 with RSA Encryption.
     * 
     */
    @XmlElement(name = "SignatureAlgorithm", required = true)
    protected AlgorithmIdentifier signatureAlgorithm;
    /**
     * An X.509v3 extension to be included in the certificate.
     * 
     */
    @XmlElement(name = "Extension")
    protected List<X509V3Extension> extension;

    /**
     * The X.509 version that the generated certificate shall comply
     *                   to.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX509Version() {
        return x509Version;
    }

    /**
     * Sets the value of the x509Version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getX509Version()
     */
    public void setX509Version(BigInteger value) {
        this.x509Version = value;
    }

    /**
     * Distinguished name of the entity that the certificate shall belong
     *                   to.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName }
     *     
     */
    public DistinguishedName getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName }
     *     
     * @see #getSubject()
     */
    public void setSubject(DistinguishedName value) {
        this.subject = value;
    }

    /**
     * The ID of the key for which the certificate shall be created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyID()
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * The tests-defined alias of the certificate to be created.
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
     * The X.509 not valid before information to be included in the
     *                   certificate. Defaults to the device's current time or a time before the device's
     *                   current time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidBefore()
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * The X.509 not valid after information to be included in the
     *                   certificate. Defaults to the time 99991231235959Z as specified in RFC 5280.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidAfter()
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * The signature algorithm to be used for signing the certificate.
     *                   Defaults to SHA1 with RSA Encryption.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *     
     * @see #getSignatureAlgorithm()
     */
    public void setSignatureAlgorithm(AlgorithmIdentifier value) {
        this.signatureAlgorithm = value;
    }

    /**
     * An X.509v3 extension to be included in the certificate.
     * 
     * Gets the value of the extension property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X509V3Extension }
     * </p>
     * 
     * 
     * @return
     *     The value of the extension property.
     */
    public List<X509V3Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

}
