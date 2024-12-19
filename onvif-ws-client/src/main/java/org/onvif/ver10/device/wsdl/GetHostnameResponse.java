
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.HostnameInformation;


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
 *         <element name="HostnameInformation" type="{http://www.onvif.org/ver10/schema}HostnameInformation"/>
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
    "hostnameInformation"
})
@XmlRootElement(name = "GetHostnameResponse")
public class GetHostnameResponse {

    /**
     * Contains the hostname information.
     * 
     */
    @XmlElement(name = "HostnameInformation", required = true)
    protected HostnameInformation hostnameInformation;

    /**
     * Contains the hostname information.
     * 
     * @return
     *     possible object is
     *     {@link HostnameInformation }
     *     
     */
    public HostnameInformation getHostnameInformation() {
        return hostnameInformation;
    }

    /**
     * Sets the value of the hostnameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostnameInformation }
     *     
     * @see #getHostnameInformation()
     */
    public void setHostnameInformation(HostnameInformation value) {
        this.hostnameInformation = value;
    }

}
