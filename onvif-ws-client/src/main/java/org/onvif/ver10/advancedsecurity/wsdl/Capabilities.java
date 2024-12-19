
package org.onvif.ver10.advancedsecurity.wsdl;

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
 * The capabilities of an Advanced Security Service implementation on a
 *             device.
 * 
 * <p>Java class for Capabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeystoreCapabilities" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeystoreCapabilities"/>
 *         <element name="TLSServerCapabilities" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}TLSServerCapabilities"/>
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
@XmlType(name = "Capabilities", propOrder = {
    "keystoreCapabilities",
    "tlsServerCapabilities",
    "any"
})
public class Capabilities {

    /**
     * The capabilities of the keystore implementation.
     * 
     */
    @XmlElement(name = "KeystoreCapabilities", required = true)
    protected KeystoreCapabilities keystoreCapabilities;
    /**
     * The capabilities of the TLS server implementation.
     * 
     */
    @XmlElement(name = "TLSServerCapabilities", required = true)
    protected TLSServerCapabilities tlsServerCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The capabilities of the keystore implementation.
     * 
     * @return
     *     possible object is
     *     {@link KeystoreCapabilities }
     *     
     */
    public KeystoreCapabilities getKeystoreCapabilities() {
        return keystoreCapabilities;
    }

    /**
     * Sets the value of the keystoreCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeystoreCapabilities }
     *     
     * @see #getKeystoreCapabilities()
     */
    public void setKeystoreCapabilities(KeystoreCapabilities value) {
        this.keystoreCapabilities = value;
    }

    /**
     * The capabilities of the TLS server implementation.
     * 
     * @return
     *     possible object is
     *     {@link TLSServerCapabilities }
     *     
     */
    public TLSServerCapabilities getTLSServerCapabilities() {
        return tlsServerCapabilities;
    }

    /**
     * Sets the value of the tlsServerCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSServerCapabilities }
     *     
     * @see #getTLSServerCapabilities()
     */
    public void setTLSServerCapabilities(TLSServerCapabilities value) {
        this.tlsServerCapabilities = value;
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
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
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
