
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IPAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}IPType"/>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", propOrder = {
    "type",
    "iPv4Address",
    "iPv6Address"
})
public class IPAddress {

    /**
     * Indicates if the address is an IPv4 or IPv6 address.
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected IPType type;
    /**
     * IPv4 address.
     * 
     */
    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv4Address;
    /**
     * IPv6 address
     * 
     */
    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv6Address;

    /**
     * Indicates if the address is an IPv4 or IPv6 address.
     * 
     * @return
     *     possible object is
     *     {@link IPType }
     *     
     */
    public IPType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPType }
     *     
     * @see #getType()
     */
    public void setType(IPType value) {
        this.type = value;
    }

    /**
     * IPv4 address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv4Address() {
        return iPv4Address;
    }

    /**
     * Sets the value of the iPv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIPv4Address()
     */
    public void setIPv4Address(String value) {
        this.iPv4Address = value;
    }

    /**
     * IPv6 address
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6Address() {
        return iPv6Address;
    }

    /**
     * Sets the value of the iPv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIPv6Address()
     */
    public void setIPv6Address(String value) {
        this.iPv6Address = value;
    }

}
