
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPv6NetworkInterfaceSetConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPv6NetworkInterfaceSetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AcceptRouterAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.onvif.org/ver10/schema}IPv6DHCPConfiguration" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv6NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "acceptRouterAdvert",
    "manual",
    "dhcp"
})
public class IPv6NetworkInterfaceSetConfiguration {

    /**
     * Indicates whether or not IPv6 is enabled.
     * 
     */
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    /**
     * Indicates whether router advertisment is used.
     * 
     */
    @XmlElement(name = "AcceptRouterAdvert")
    protected Boolean acceptRouterAdvert;
    /**
     * List of manually added IPv6 addresses.
     * 
     */
    @XmlElement(name = "Manual")
    protected List<PrefixedIPv6Address> manual;
    /**
     * DHCP configuration.
     * 
     */
    @XmlElement(name = "DHCP")
    @XmlSchemaType(name = "string")
    protected IPv6DHCPConfiguration dhcp;

    /**
     * Indicates whether or not IPv6 is enabled.
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
     * Indicates whether router advertisment is used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptRouterAdvert() {
        return acceptRouterAdvert;
    }

    /**
     * Sets the value of the acceptRouterAdvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAcceptRouterAdvert()
     */
    public void setAcceptRouterAdvert(Boolean value) {
        this.acceptRouterAdvert = value;
    }

    /**
     * List of manually added IPv6 addresses.
     * 
     * Gets the value of the manual property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manual property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the manual property.
     */
    public List<PrefixedIPv6Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<>();
        }
        return this.manual;
    }

    /**
     * DHCP configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv6DHCPConfiguration }
     *     
     */
    public IPv6DHCPConfiguration getDHCP() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6DHCPConfiguration }
     *     
     * @see #getDHCP()
     */
    public void setDHCP(IPv6DHCPConfiguration value) {
        this.dhcp = value;
    }

}
