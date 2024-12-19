
package org.onvif.ver10.doorcontrol.wsdl;

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
 *         <element name="DoorState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorState"/>
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
    "doorState"
})
@XmlRootElement(name = "GetDoorStateResponse")
public class GetDoorStateResponse {

    /**
     * The state of the door.
     * 
     */
    @XmlElement(name = "DoorState", required = true)
    protected DoorState doorState;

    /**
     * The state of the door.
     * 
     * @return
     *     possible object is
     *     {@link DoorState }
     *     
     */
    public DoorState getDoorState() {
        return doorState;
    }

    /**
     * Sets the value of the doorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorState }
     *     
     * @see #getDoorState()
     */
    public void setDoorState(DoorState value) {
        this.doorState = value;
    }

}
