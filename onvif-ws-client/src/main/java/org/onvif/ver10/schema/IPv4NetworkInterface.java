
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPv4NetworkInterface complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPv4NetworkInterface">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Config" type="{http://www.onvif.org/ver10/schema}IPv4Configuration"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4NetworkInterface", propOrder = {
    "enabled",
    "config"
})
public class IPv4NetworkInterface {

    /**
     * Indicates whether or not IPv4 is enabled.
     * 
     */
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    /**
     * IPv4 configuration.
     * 
     */
    @XmlElement(name = "Config", required = true)
    protected IPv4Configuration config;

    /**
     * Indicates whether or not IPv4 is enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * IPv4 configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv4Configuration }
     *     
     */
    public IPv4Configuration getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4Configuration }
     *     
     * @see #getConfig()
     */
    public void setConfig(IPv4Configuration value) {
        this.config = value;
    }

}
