
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
 *         <element name="CertPathValidationPolicy" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicy"/>
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
    "certPathValidationPolicy"
})
@XmlRootElement(name = "GetCertPathValidationPolicyResponse")
public class GetCertPathValidationPolicyResponse {

    /**
     * The certification path validation policy that is stored under the requested ID.
     * 
     */
    @XmlElement(name = "CertPathValidationPolicy", required = true)
    protected CertPathValidationPolicy certPathValidationPolicy;

    /**
     * The certification path validation policy that is stored under the requested ID.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationPolicy }
     *     
     */
    public CertPathValidationPolicy getCertPathValidationPolicy() {
        return certPathValidationPolicy;
    }

    /**
     * Sets the value of the certPathValidationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationPolicy }
     *     
     * @see #getCertPathValidationPolicy()
     */
    public void setCertPathValidationPolicy(CertPathValidationPolicy value) {
        this.certPathValidationPolicy = value;
    }

}
