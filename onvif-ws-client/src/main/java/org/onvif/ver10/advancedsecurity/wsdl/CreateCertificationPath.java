
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
 *         <element name="CertificateIDs" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificateIDs"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "certificateIDs",
    "alias"
})
@XmlRootElement(name = "CreateCertificationPath")
public class CreateCertificationPath {

    /**
     * The IDs of the certificates to include in the certification path,
     *                   where each certificate signature except for the last one in the path must be
     *                   verifiable with the public key certified by the next certificate in the path.
     * 
     */
    @XmlElement(name = "CertificateIDs", required = true)
    protected CertificateIDs certificateIDs;
    /**
     * The tests-defined alias of the certification path.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;

    /**
     * The IDs of the certificates to include in the certification path,
     *                   where each certificate signature except for the last one in the path must be
     *                   verifiable with the public key certified by the next certificate in the path.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIDs }
     *     
     */
    public CertificateIDs getCertificateIDs() {
        return certificateIDs;
    }

    /**
     * Sets the value of the certificateIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIDs }
     *     
     * @see #getCertificateIDs()
     */
    public void setCertificateIDs(CertificateIDs value) {
        this.certificateIDs = value;
    }

    /**
     * The tests-defined alias of the certification path.
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

}
