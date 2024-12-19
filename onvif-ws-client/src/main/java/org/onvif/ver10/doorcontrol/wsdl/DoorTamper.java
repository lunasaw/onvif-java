
package org.onvif.ver10.doorcontrol.wsdl;

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
import org.w3c.dom.Element;


/**
 * Tampering information for a Door.
 * 
 * <p>Java class for DoorTamper complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DoorTamper">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="State" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorTamperState"/>
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
@XmlType(name = "DoorTamper", propOrder = {
    "reason",
    "state",
    "any"
})
public class DoorTamper {

    /**
     * Optional field; Details describing tampering state change (e.g.,
     *                 reason, place and time).
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:pt="http://www.onvif.org/ver10/pacs" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tdc="http://www.onvif.org/ver10/doorcontrol/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * NOTE: All fields (including this one) which are
     *                 designed to give end-user prompts can be localized to the customers's native
     *                 language.
     * 
     */
    @XmlElement(name = "Reason")
    protected String reason;
    /**
     * State of the tamper detector; it is of type DoorTamperState.
     * 
     */
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected DoorTamperState state;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Optional field; Details describing tampering state change (e.g.,
     *                 reason, place and time).
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:pt="http://www.onvif.org/ver10/pacs" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tdc="http://www.onvif.org/ver10/doorcontrol/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * NOTE: All fields (including this one) which are
     *                 designed to give end-user prompts can be localized to the customers's native
     *                 language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReason()
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * State of the tamper detector; it is of type DoorTamperState.
     * 
     * @return
     *     possible object is
     *     {@link DoorTamperState }
     *     
     */
    public DoorTamperState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTamperState }
     *     
     * @see #getState()
     */
    public void setState(DoorTamperState value) {
        this.state = value;
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
