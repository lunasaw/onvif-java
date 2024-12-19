
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot11Configuration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Dot1XConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="HostnameFromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NTP" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="DHCPv6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

    /**
     * Indicates support for IP filtering.
     * 
     */
    @XmlAttribute(name = "IPFilter")
    protected Boolean ipFilter;
    /**
     * Indicates support for zeroconf.
     * 
     */
    @XmlAttribute(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;
    /**
     * Indicates support for IPv6.
     * 
     */
    @XmlAttribute(name = "IPVersion6")
    protected Boolean ipVersion6;
    /**
     * Indicates support for dynamic DNS configuration.
     * 
     */
    @XmlAttribute(name = "DynDNS")
    protected Boolean dynDNS;
    /**
     * Indicates support for IEEE 802.11 configuration.
     * 
     */
    @XmlAttribute(name = "Dot11Configuration")
    protected Boolean dot11Configuration;
    /**
     * Indicates the maximum number of Dot1X configurations supported by the
     *               device
     * 
     */
    @XmlAttribute(name = "Dot1XConfigurations")
    protected Integer dot1XConfigurations;
    /**
     * Indicates support for retrieval of hostname from DHCP.
     * 
     */
    @XmlAttribute(name = "HostnameFromDHCP")
    protected Boolean hostnameFromDHCP;
    /**
     * Maximum number of NTP servers supported by the devices SetNTP
     *               command.
     * 
     */
    @XmlAttribute(name = "NTP")
    protected Integer ntp;
    /**
     * Indicates support for Stateful IPv6 DHCP.
     * 
     */
    @XmlAttribute(name = "DHCPv6")
    protected Boolean dhcPv6;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates support for IP filtering.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPFilter() {
        return ipFilter;
    }

    /**
     * Sets the value of the ipFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIPFilter()
     */
    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    /**
     * Indicates support for zeroconf.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * Sets the value of the zeroConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isZeroConfiguration()
     */
    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    /**
     * Indicates support for IPv6.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPVersion6() {
        return ipVersion6;
    }

    /**
     * Sets the value of the ipVersion6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIPVersion6()
     */
    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    /**
     * Indicates support for dynamic DNS configuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynDNS() {
        return dynDNS;
    }

    /**
     * Sets the value of the dynDNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDynDNS()
     */
    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    /**
     * Indicates support for IEEE 802.11 configuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDot11Configuration() {
        return dot11Configuration;
    }

    /**
     * Sets the value of the dot11Configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDot11Configuration()
     */
    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    /**
     * Indicates the maximum number of Dot1X configurations supported by the
     *               device
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDot1XConfigurations() {
        return dot1XConfigurations;
    }

    /**
     * Sets the value of the dot1XConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDot1XConfigurations()
     */
    public void setDot1XConfigurations(Integer value) {
        this.dot1XConfigurations = value;
    }

    /**
     * Indicates support for retrieval of hostname from DHCP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostnameFromDHCP() {
        return hostnameFromDHCP;
    }

    /**
     * Sets the value of the hostnameFromDHCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHostnameFromDHCP()
     */
    public void setHostnameFromDHCP(Boolean value) {
        this.hostnameFromDHCP = value;
    }

    /**
     * Maximum number of NTP servers supported by the devices SetNTP
     *               command.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTP() {
        return ntp;
    }

    /**
     * Sets the value of the ntp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getNTP()
     */
    public void setNTP(Integer value) {
        this.ntp = value;
    }

    /**
     * Indicates support for Stateful IPv6 DHCP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHCPv6() {
        return dhcPv6;
    }

    /**
     * Sets the value of the dhcPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDHCPv6()
     */
    public void setDHCPv6(Boolean value) {
        this.dhcPv6 = value;
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
