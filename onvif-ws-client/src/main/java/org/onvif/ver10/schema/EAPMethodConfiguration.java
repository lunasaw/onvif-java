
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
 * <p>Java class for EAPMethodConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EAPMethodConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TLSConfiguration" type="{http://www.onvif.org/ver10/schema}TLSConfiguration" minOccurs="0"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}EapMethodExtension" minOccurs="0"/>
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
@XmlType(name = "EAPMethodConfiguration", propOrder = {
    "tlsConfiguration",
    "password",
    "extension"
})
public class EAPMethodConfiguration {

    /**
     * Confgiuration information for TLS Method.
     * 
     */
    @XmlElement(name = "TLSConfiguration")
    protected TLSConfiguration tlsConfiguration;
    /**
     * Password for those EAP Methods that require a password. The password
     *             shall never be returned on a get method.
     * 
     */
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Extension")
    protected EapMethodExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Confgiuration information for TLS Method.
     * 
     * @return
     *     possible object is
     *     {@link TLSConfiguration }
     *     
     */
    public TLSConfiguration getTLSConfiguration() {
        return tlsConfiguration;
    }

    /**
     * Sets the value of the tlsConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSConfiguration }
     *     
     * @see #getTLSConfiguration()
     */
    public void setTLSConfiguration(TLSConfiguration value) {
        this.tlsConfiguration = value;
    }

    /**
     * Password for those EAP Methods that require a password. The password
     *             shall never be returned on a get method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EapMethodExtension }
     *     
     */
    public EapMethodExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EapMethodExtension }
     *     
     */
    public void setExtension(EapMethodExtension value) {
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
