
package org.onvif.ver10.device.wsdl;

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
 *         <element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HardwareId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "manufacturer",
    "model",
    "firmwareVersion",
    "serialNumber",
    "hardwareId"
})
@XmlRootElement(name = "GetDeviceInformationResponse")
public class GetDeviceInformationResponse {

    /**
     * The manufactor of the device.
     * 
     */
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    /**
     * The device model.
     * 
     */
    @XmlElement(name = "Model", required = true)
    protected String model;
    /**
     * The firmware version in the device.
     * 
     */
    @XmlElement(name = "FirmwareVersion", required = true)
    protected String firmwareVersion;
    /**
     * The serial number of the device.
     * 
     */
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    /**
     * The hardware ID of the device.
     * 
     */
    @XmlElement(name = "HardwareId", required = true)
    protected String hardwareId;

    /**
     * The manufactor of the device.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getManufacturer()
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * The device model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModel()
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * The firmware version in the device.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFirmwareVersion()
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * The serial number of the device.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSerialNumber()
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * The hardware ID of the device.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets the value of the hardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHardwareId()
     */
    public void setHardwareId(String value) {
        this.hardwareId = value;
    }

}
