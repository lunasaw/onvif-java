
package org.onvif.ver10.media.wsdl;

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
 *         <element name="Reboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "reboot"
})
@XmlRootElement(name = "SetVideoSourceModeResponse")
public class SetVideoSourceModeResponse {

    /**
     * The response contains information about rebooting after returning
     *                   response. When Reboot is set true, a device will reboot automatically after
     *                   setting mode.
     * 
     */
    @XmlElement(name = "Reboot")
    protected boolean reboot;

    /**
     * The response contains information about rebooting after returning
     *                   response. When Reboot is set true, a device will reboot automatically after
     *                   setting mode.
     * 
     */
    public boolean isReboot() {
        return reboot;
    }

    /**
     * Sets the value of the reboot property.
     * 
     */
    public void setReboot(boolean value) {
        this.reboot = value;
    }

}
