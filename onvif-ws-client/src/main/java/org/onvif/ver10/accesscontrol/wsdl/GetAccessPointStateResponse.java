
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
 *         <element name="AccessPointState" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointState"/>
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
    "accessPointState"
})
@XmlRootElement(name = "GetAccessPointStateResponse")
public class GetAccessPointStateResponse {

    /**
     * AccessPointState item.
     * 
     */
    @XmlElement(name = "AccessPointState", required = true)
    protected AccessPointState accessPointState;

    /**
     * AccessPointState item.
     * 
     * @return
     *     possible object is
     *     {@link AccessPointState }
     *     
     */
    public AccessPointState getAccessPointState() {
        return accessPointState;
    }

    /**
     * Sets the value of the accessPointState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointState }
     *     
     * @see #getAccessPointState()
     */
    public void setAccessPointState(AccessPointState value) {
        this.accessPointState = value;
    }

}
