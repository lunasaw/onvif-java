
package org.onvif.ver10.deviceio.wsdl;

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
 *         <element name="SerialPortOptions" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfigurationOptions"/>
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
    "serialPortOptions"
})
@XmlRootElement(name = "GetSerialPortConfigurationOptionsResponse")
public class GetSerialPortConfigurationOptionsResponse {

    @XmlElement(name = "SerialPortOptions", required = true)
    protected SerialPortConfigurationOptions serialPortOptions;

    /**
     * Gets the value of the serialPortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public SerialPortConfigurationOptions getSerialPortOptions() {
        return serialPortOptions;
    }

    /**
     * Sets the value of the serialPortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public void setSerialPortOptions(SerialPortConfigurationOptions value) {
        this.serialPortOptions = value;
    }

}
