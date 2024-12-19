
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
 *         <element name="CertificationPath" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPath"/>
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
    "certificationPath"
})
@XmlRootElement(name = "GetCertificationPathResponse")
public class GetCertificationPathResponse {

    /**
     * The certification path that is stored under the given ID in the
     *                   keystore.
     * 
     */
    @XmlElement(name = "CertificationPath", required = true)
    protected CertificationPath certificationPath;

    /**
     * The certification path that is stored under the given ID in the
     *                   keystore.
     * 
     * @return
     *     possible object is
     *     {@link CertificationPath }
     *     
     */
    public CertificationPath getCertificationPath() {
        return certificationPath;
    }

    /**
     * Sets the value of the certificationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationPath }
     *     
     * @see #getCertificationPath()
     */
    public void setCertificationPath(CertificationPath value) {
        this.certificationPath = value;
    }

}
