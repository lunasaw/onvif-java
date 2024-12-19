
package org.onvif.ver10.deviceio.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The parameters for configuring the serial port.
 * 
 * <p>Java class for SerialPortConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SerialPortConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaudRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ParityBit" type="{http://www.onvif.org/ver10/deviceIO/wsdl}ParityBit"/>
 *         <element name="CharacterLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="StopBit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="type" use="required" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortType" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialPortConfiguration", propOrder = {
    "baudRate",
    "parityBit",
    "characterLength",
    "stopBit",
    "any"
})
public class SerialPortConfiguration {

    /**
     * The transfer bitrate.
     * 
     */
    @XmlElement(name = "BaudRate")
    protected int baudRate;
    /**
     * The parity for the data error detection.
     * 
     */
    @XmlElement(name = "ParityBit", required = true)
    @XmlSchemaType(name = "string")
    protected ParityBit parityBit;
    /**
     * The bit length for each character.
     * 
     */
    @XmlElement(name = "CharacterLength")
    protected int characterLength;
    /**
     * The number of stop bits used to terminate each character.
     * 
     */
    @XmlElement(name = "StopBit")
    protected float stopBit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAttribute(name = "type", required = true)
    protected SerialPortType type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The transfer bitrate.
     * 
     */
    public int getBaudRate() {
        return baudRate;
    }

    /**
     * Sets the value of the baudRate property.
     * 
     */
    public void setBaudRate(int value) {
        this.baudRate = value;
    }

    /**
     * The parity for the data error detection.
     * 
     * @return
     *     possible object is
     *     {@link ParityBit }
     *     
     */
    public ParityBit getParityBit() {
        return parityBit;
    }

    /**
     * Sets the value of the parityBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityBit }
     *     
     * @see #getParityBit()
     */
    public void setParityBit(ParityBit value) {
        this.parityBit = value;
    }

    /**
     * The bit length for each character.
     * 
     */
    public int getCharacterLength() {
        return characterLength;
    }

    /**
     * Sets the value of the characterLength property.
     * 
     */
    public void setCharacterLength(int value) {
        this.characterLength = value;
    }

    /**
     * The number of stop bits used to terminate each character.
     * 
     */
    public float getStopBit() {
        return stopBit;
    }

    /**
     * Sets the value of the stopBit property.
     * 
     */
    public void setStopBit(float value) {
        this.stopBit = value;
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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortType }
     *     
     */
    public SerialPortType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortType }
     *     
     */
    public void setType(SerialPortType value) {
        this.type = value;
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
