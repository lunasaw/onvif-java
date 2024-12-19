
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         <element name="Capabilities" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}ServiceCapabilities"/>
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
    "capabilities"
})
@XmlRootElement(name = "GetServiceCapabilitiesResponse")
public class GetServiceCapabilitiesResponse {

    /**
     * The capability response message contains the requested Access
     *                   Control service capabilities using a hierarchical XML capability structure.
     * 
     */
    @XmlElement(name = "Capabilities", required = true)
    protected ServiceCapabilities capabilities;

    /**
     * The capability response message contains the requested Access
     *                   Control service capabilities using a hierarchical XML capability structure.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilities }
     *     
     */
    public ServiceCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilities }
     *     
     * @see #getCapabilities()
     */
    public void setCapabilities(ServiceCapabilities value) {
        this.capabilities = value;
    }

}
