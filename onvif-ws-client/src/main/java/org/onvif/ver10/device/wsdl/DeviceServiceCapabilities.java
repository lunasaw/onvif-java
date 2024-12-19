
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceServiceCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceServiceCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Network" type="{http://www.onvif.org/ver10/device/wsdl}NetworkCapabilities"/>
 *         <element name="Security" type="{http://www.onvif.org/ver10/device/wsdl}SecurityCapabilities"/>
 *         <element name="System" type="{http://www.onvif.org/ver10/device/wsdl}SystemCapabilities"/>
 *         <element name="Misc" type="{http://www.onvif.org/ver10/device/wsdl}MiscCapabilities" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceServiceCapabilities", propOrder = {
    "network",
    "security",
    "system",
    "misc"
})
public class DeviceServiceCapabilities {

    /**
     * Network capabilities.
     * 
     */
    @XmlElement(name = "Network", required = true)
    protected NetworkCapabilities network;
    /**
     * Security capabilities.
     * 
     */
    @XmlElement(name = "Security", required = true)
    protected SecurityCapabilities security;
    /**
     * System capabilities.
     * 
     */
    @XmlElement(name = "System", required = true)
    protected SystemCapabilities system;
    /**
     * Capabilities that do not fit in any of the other categories.
     * 
     */
    @XmlElement(name = "Misc")
    protected MiscCapabilities misc;

    /**
     * Network capabilities.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilities }
     *     
     */
    public NetworkCapabilities getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilities }
     *     
     * @see #getNetwork()
     */
    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    /**
     * Security capabilities.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilities }
     *     
     */
    public SecurityCapabilities getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilities }
     *     
     * @see #getSecurity()
     */
    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    /**
     * System capabilities.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilities }
     *     
     */
    public SystemCapabilities getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilities }
     *     
     * @see #getSystem()
     */
    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    /**
     * Capabilities that do not fit in any of the other categories.
     * 
     * @return
     *     possible object is
     *     {@link MiscCapabilities }
     *     
     */
    public MiscCapabilities getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscCapabilities }
     *     
     * @see #getMisc()
     */
    public void setMisc(MiscCapabilities value) {
        this.misc = value;
    }

}
