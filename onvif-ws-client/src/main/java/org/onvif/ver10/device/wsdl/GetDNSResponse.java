
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DNSInformation;


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
 *         <element name="DNSInformation" type="{http://www.onvif.org/ver10/schema}DNSInformation"/>
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
    "dnsInformation"
})
@XmlRootElement(name = "GetDNSResponse")
public class GetDNSResponse {

    /**
     * DNS information.
     * 
     */
    @XmlElement(name = "DNSInformation", required = true)
    protected DNSInformation dnsInformation;

    /**
     * DNS information.
     * 
     * @return
     *     possible object is
     *     {@link DNSInformation }
     *     
     */
    public DNSInformation getDNSInformation() {
        return dnsInformation;
    }

    /**
     * Sets the value of the dnsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNSInformation }
     *     
     * @see #getDNSInformation()
     */
    public void setDNSInformation(DNSInformation value) {
        this.dnsInformation = value;
    }

}
