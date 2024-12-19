
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
 * An X.509v3 extension field as specified in RFC 5280
 * 
 * <p>Java class for X509v3Extension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="X509v3Extension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="extnOID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DotDecimalOID"/>
 *         <element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="extnValue" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/>
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
@XmlType(name = "X509v3Extension", propOrder = {
    "extnOID",
    "critical",
    "extnValue",
    "any"
})
public class X509V3Extension {

    /**
     * The OID of the extension field.
     * 
     */
    @XmlElement(required = true)
    protected String extnOID;
    /**
     * True if and only if the extension is critical.
     * 
     */
    @XmlElement(defaultValue = "false")
    protected boolean critical;
    /**
     * The value of the extension field as a base64-encoded DER
     *                 representation of an ASN.1 value.
     * 
     */
    @XmlElement(required = true)
    protected byte[] extnValue;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The OID of the extension field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnOID() {
        return extnOID;
    }

    /**
     * Sets the value of the extnOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExtnOID()
     */
    public void setExtnOID(String value) {
        this.extnOID = value;
    }

    /**
     * True if and only if the extension is critical.
     * 
     */
    public boolean isCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     */
    public void setCritical(boolean value) {
        this.critical = value;
    }

    /**
     * The value of the extension field as a base64-encoded DER
     *                 representation of an ASN.1 value.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExtnValue() {
        return extnValue;
    }

    /**
     * Sets the value of the extnValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getExtnValue()
     */
    public void setExtnValue(byte[] value) {
        this.extnValue = value;
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
