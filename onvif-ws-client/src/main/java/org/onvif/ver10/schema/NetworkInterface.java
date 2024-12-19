
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
 * <p>Java class for NetworkInterface complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkInterface">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Info" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceInfo" minOccurs="0"/>
 *         <element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceLink" minOccurs="0"/>
 *         <element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterface" minOccurs="0"/>
 *         <element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterface" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterface", propOrder = {
    "enabled",
    "info",
    "link",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterface
    extends DeviceEntity
{

    /**
     * Indicates whether or not an interface is enabled.
     * 
     */
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    /**
     * Network interface information
     * 
     */
    @XmlElement(name = "Info")
    protected NetworkInterfaceInfo info;
    /**
     * Link configuration.
     * 
     */
    @XmlElement(name = "Link")
    protected NetworkInterfaceLink link;
    /**
     * IPv4 network interface configuration.
     * 
     */
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterface iPv4;
    /**
     * IPv6 network interface configuration.
     * 
     */
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterface iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not an interface is enabled.
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
     * Network interface information
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceInfo }
     *     
     */
    public NetworkInterfaceInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceInfo }
     *     
     * @see #getInfo()
     */
    public void setInfo(NetworkInterfaceInfo value) {
        this.info = value;
    }

    /**
     * Link configuration.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceLink }
     *     
     */
    public NetworkInterfaceLink getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceLink }
     *     
     * @see #getLink()
     */
    public void setLink(NetworkInterfaceLink value) {
        this.link = value;
    }

    /**
     * IPv4 network interface configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterface }
     *     
     */
    public IPv4NetworkInterface getIPv4() {
        return iPv4;
    }

    /**
     * Sets the value of the iPv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterface }
     *     
     * @see #getIPv4()
     */
    public void setIPv4(IPv4NetworkInterface value) {
        this.iPv4 = value;
    }

    /**
     * IPv6 network interface configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterface }
     *     
     */
    public IPv6NetworkInterface getIPv6() {
        return iPv6;
    }

    /**
     * Sets the value of the iPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterface }
     *     
     * @see #getIPv6()
     */
    public void setIPv6(IPv6NetworkInterface value) {
        this.iPv6 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public NetworkInterfaceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public void setExtension(NetworkInterfaceExtension value) {
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
