
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * The attributes of a key in the keystore.
 * 
 * <p>Java class for KeyAttribute complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KeyAttribute">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasPrivateKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="KeyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="externallyGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="securelyStored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' namespace='http://www.onvif.org/ver10/advancedsecurity/wsdl' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "KeyAttribute", propOrder = {
    "keyID",
    "alias",
    "hasPrivateKey",
    "keyStatus",
    "any",
    "externallyGenerated",
    "securelyStored",
    "extension"
})
public class KeyAttribute {

    /**
     * The ID of the key.
     * 
     */
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    /**
     * The tests-defined alias of the key.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;
    /**
     * Absent if the key is not a key pair. True if and only if the key is
     *                 a key pair and contains a private key. False if and only if the key is a key pair
     *                 and does not contain a private key.
     * 
     */
    protected Boolean hasPrivateKey;
    /**
     * The status of the key. The value should be one of the values in the
     *                 tas:KeyStatus enumeration.
     * 
     */
    @XmlElement(name = "KeyStatus", required = true)
    protected String keyStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * True if and only if the key was generated outside the device.
     * 
     */
    protected Boolean externallyGenerated;
    /**
     * True if and only if the key is stored in a specially protected
     *                 hardware component inside the device.
     * 
     */
    protected Boolean securelyStored;
    @XmlElement(name = "Extension")
    protected KeyAttribute.Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The ID of the key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyID()
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * The tests-defined alias of the key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlias()
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Absent if the key is not a key pair. True if and only if the key is
     *                 a key pair and contains a private key. False if and only if the key is a key pair
     *                 and does not contain a private key.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPrivateKey() {
        return hasPrivateKey;
    }

    /**
     * Sets the value of the hasPrivateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasPrivateKey()
     */
    public void setHasPrivateKey(Boolean value) {
        this.hasPrivateKey = value;
    }

    /**
     * The status of the key. The value should be one of the values in the
     *                 tas:KeyStatus enumeration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStatus() {
        return keyStatus;
    }

    /**
     * Sets the value of the keyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyStatus()
     */
    public void setKeyStatus(String value) {
        this.keyStatus = value;
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
     * True if and only if the key was generated outside the device.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternallyGenerated() {
        return externallyGenerated;
    }

    /**
     * Sets the value of the externallyGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExternallyGenerated()
     */
    public void setExternallyGenerated(Boolean value) {
        this.externallyGenerated = value;
    }

    /**
     * True if and only if the key is stored in a specially protected
     *                 hardware component inside the device.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurelyStored() {
        return securelyStored;
    }

    /**
     * Sets the value of the securelyStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSecurelyStored()
     */
    public void setSecurelyStored(Boolean value) {
        this.securelyStored = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link KeyAttribute.Extension }
     *     
     */
    public KeyAttribute.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyAttribute.Extension }
     *     
     */
    public void setExtension(KeyAttribute.Extension value) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <any processContents='lax' namespace='http://www.onvif.org/ver10/advancedsecurity/wsdl' maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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

    }

}
