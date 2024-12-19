
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkInterfaceSetConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkInterfaceSetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting" minOccurs="0"/>
 *         <element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         <element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "link",
    "mtu",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterfaceSetConfiguration {

    /**
     * Indicates whether or not an interface is enabled.
     * 
     */
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    /**
     * Link configuration.
     * 
     */
    @XmlElement(name = "Link")
    protected NetworkInterfaceConnectionSetting link;
    /**
     * Maximum transmission unit.
     * 
     */
    @XmlElement(name = "MTU")
    protected Integer mtu;
    /**
     * IPv4 network interface configuration.
     * 
     */
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterfaceSetConfiguration iPv4;
    /**
     * IPv6 network interface configuration.
     * 
     */
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterfaceSetConfiguration iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceSetConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not an interface is enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnabled()
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Link configuration.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     * @see #getLink()
     */
    public void setLink(NetworkInterfaceConnectionSetting value) {
        this.link = value;
    }

    /**
     * Maximum transmission unit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTU() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMTU()
     */
    public void setMTU(Integer value) {
        this.mtu = value;
    }

    /**
     * IPv4 network interface configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv4NetworkInterfaceSetConfiguration getIPv4() {
        return iPv4;
    }

    /**
     * Sets the value of the iPv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     * @see #getIPv4()
     */
    public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
        this.iPv4 = value;
    }

    /**
     * IPv6 network interface configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv6NetworkInterfaceSetConfiguration getIPv6() {
        return iPv6;
    }

    /**
     * Sets the value of the iPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     * @see #getIPv6()
     */
    public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
        this.iPv6 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public NetworkInterfaceSetConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
