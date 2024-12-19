
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MediaUri complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MediaUri">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="InvalidAfterConnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="InvalidAfterReboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
@XmlType(name = "MediaUri", propOrder = {
    "uri",
    "invalidAfterConnect",
    "invalidAfterReboot",
    "timeout",
    "any"
})
public class MediaUri {

    /**
     * Stable Uri to be used for requesting the media stream
     * 
     */
    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    /**
     * Indicates if the Uri is only valid until the connection is established.
     *             The value shall be set to "false".
     * 
     */
    @XmlElement(name = "InvalidAfterConnect")
    protected boolean invalidAfterConnect;
    /**
     * Indicates if the Uri is invalid after a reboot of the device. The value
     *             shall be set to "false".
     * 
     */
    @XmlElement(name = "InvalidAfterReboot")
    protected boolean invalidAfterReboot;
    /**
     * Duration how long the Uri is valid. This parameter shall be set to PT0S
     *             to indicate that this stream URI is indefinitely valid even if the profile changes
     * 
     */
    @XmlElement(name = "Timeout", required = true)
    protected Duration timeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Stable Uri to be used for requesting the media stream
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUri()
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Indicates if the Uri is only valid until the connection is established.
     *             The value shall be set to "false".
     * 
     */
    public boolean isInvalidAfterConnect() {
        return invalidAfterConnect;
    }

    /**
     * Sets the value of the invalidAfterConnect property.
     * 
     */
    public void setInvalidAfterConnect(boolean value) {
        this.invalidAfterConnect = value;
    }

    /**
     * Indicates if the Uri is invalid after a reboot of the device. The value
     *             shall be set to "false".
     * 
     */
    public boolean isInvalidAfterReboot() {
        return invalidAfterReboot;
    }

    /**
     * Sets the value of the invalidAfterReboot property.
     * 
     */
    public void setInvalidAfterReboot(boolean value) {
        this.invalidAfterReboot = value;
    }

    /**
     * Duration how long the Uri is valid. This parameter shall be set to PT0S
     *             to indicate that this stream URI is indefinitely valid even if the profile changes
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getTimeout()
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
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
