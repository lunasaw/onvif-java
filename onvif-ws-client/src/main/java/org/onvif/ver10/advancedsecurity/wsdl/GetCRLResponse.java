
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
 *         <element name="Crl" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CRL"/>
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
    "crl"
})
@XmlRootElement(name = "GetCRLResponse")
public class GetCRLResponse {

    /**
     * The CRL with the requested ID.
     * 
     */
    @XmlElement(name = "Crl", required = true)
    protected CRL crl;

    /**
     * The CRL with the requested ID.
     * 
     * @return
     *     possible object is
     *     {@link CRL }
     *     
     */
    public CRL getCrl() {
        return crl;
    }

    /**
     * Sets the value of the crl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRL }
     *     
     * @see #getCrl()
     */
    public void setCrl(CRL value) {
        this.crl = value;
    }

}
