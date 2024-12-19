
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
 *         <element name="PKCS10CSR" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/>
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
    "pkcs10CSR"
})
@XmlRootElement(name = "CreatePKCS10CSRResponse")
public class CreatePKCS10CSRResponse {

    /**
     * The DER encoded PKCS#10 certification request.
     * 
     */
    @XmlElement(name = "PKCS10CSR", required = true)
    protected byte[] pkcs10CSR;

    /**
     * The DER encoded PKCS#10 certification request.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPKCS10CSR() {
        return pkcs10CSR;
    }

    /**
     * Sets the value of the pkcs10CSR property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getPKCS10CSR()
     */
    public void setPKCS10CSR(byte[] value) {
        this.pkcs10CSR = value;
    }

}
