
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.device.wsdl.StorageConfiguration;
import org.onvif.ver10.deviceio.wsdl.SerialPort;


/**
 * Base class for physical entities like inputs and outputs.
 * 
 * <p>Java class for DeviceEntity complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceEntity")
@XmlSeeAlso({
    VideoSource.class,
    AudioSource.class,
    VideoOutput.class,
    AudioOutput.class,
    NetworkInterface.class,
    RelayOutput.class,
    DigitalInput.class,
    PTZNode.class,
    OSDConfiguration.class,
    SerialPort.class,
    StorageConfiguration.class
})
public class DeviceEntity {

    /**
     * Unique identifier referencing the physical entity.
     * 
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;

    /**
     * Unique identifier referencing the physical entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

}
