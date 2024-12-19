
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IPv4Configuration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPv4Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         <element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "IPv4Configuration", propOrder = {
    "manual",
    "linkLocal",
    "fromDHCP",
    "dhcp",
    "any"
})
public class IPv4Configuration {

    /**
     * List of manually added IPv4 addresses.
     * 
     */
    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;
    /**
     * Link local address.
     * 
     */
    @XmlElement(name = "LinkLocal")
    protected PrefixedIPv4Address linkLocal;
    /**
     * IPv4 address configured by using DHCP.
     * 
     */
    @XmlElement(name = "FromDHCP")
    protected PrefixedIPv4Address fromDHCP;
    /**
     * Indicates whether or not DHCP is used.
     * 
     */
    @XmlElement(name = "DHCP")
    protected boolean dhcp;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * List of manually added IPv4 addresses.
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
     * {@link PrefixedIPv4Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the manual property.
     */
    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<>();
        }
        return this.manual;
    }

    /**
     * Link local address.
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getLinkLocal() {
        return linkLocal;
    }

    /**
     * Sets the value of the linkLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     * @see #getLinkLocal()
     */
    public void setLinkLocal(PrefixedIPv4Address value) {
        this.linkLocal = value;
    }

    /**
     * IPv4 address configured by using DHCP.
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getFromDHCP() {
        return fromDHCP;
    }

    /**
     * Sets the value of the fromDHCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     * @see #getFromDHCP()
     */
    public void setFromDHCP(PrefixedIPv4Address value) {
        this.fromDHCP = value;
    }

    /**
     * Indicates whether or not DHCP is used.
     * 
     */
    public boolean isDHCP() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     */
    public void setDHCP(boolean value) {
        this.dhcp = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
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
