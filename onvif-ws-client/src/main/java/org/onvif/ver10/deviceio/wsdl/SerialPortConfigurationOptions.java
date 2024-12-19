
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
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FloatList;
import org.onvif.ver10.schema.IntList;
import org.w3c.dom.Element;


/**
 * The configuration options that relates to serial port.
 * 
 * <p>Java class for SerialPortConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SerialPortConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaudRateList" type="{http://www.onvif.org/ver10/schema}IntList"/>
 *         <element name="ParityBitList" type="{http://www.onvif.org/ver10/deviceIO/wsdl}ParityBitList"/>
 *         <element name="CharacterLengthList" type="{http://www.onvif.org/ver10/schema}IntList"/>
 *         <element name="StopBitList" type="{http://www.onvif.org/ver10/schema}FloatList"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialPortConfigurationOptions", propOrder = {
    "baudRateList",
    "parityBitList",
    "characterLengthList",
    "stopBitList",
    "any"
})
public class SerialPortConfigurationOptions {

    /**
     * The list of configurable transfer bitrate.
     * 
     */
    @XmlElement(name = "BaudRateList", required = true)
    protected IntList baudRateList;
    /**
     * The list of configurable parity for the data error detection.
     * 
     */
    @XmlElement(name = "ParityBitList", required = true)
    protected ParityBitList parityBitList;
    /**
     * The list of configurable bit length for each character.
     * 
     */
    @XmlElement(name = "CharacterLengthList", required = true)
    protected IntList characterLengthList;
    /**
     * The list of configurable number of stop bits used to terminate each
     *                 character.
     * 
     */
    @XmlElement(name = "StopBitList", required = true)
    protected FloatList stopBitList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The list of configurable transfer bitrate.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getBaudRateList() {
        return baudRateList;
    }

    /**
     * Sets the value of the baudRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     * @see #getBaudRateList()
     */
    public void setBaudRateList(IntList value) {
        this.baudRateList = value;
    }

    /**
     * The list of configurable parity for the data error detection.
     * 
     * @return
     *     possible object is
     *     {@link ParityBitList }
     *     
     */
    public ParityBitList getParityBitList() {
        return parityBitList;
    }

    /**
     * Sets the value of the parityBitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityBitList }
     *     
     * @see #getParityBitList()
     */
    public void setParityBitList(ParityBitList value) {
        this.parityBitList = value;
    }

    /**
     * The list of configurable bit length for each character.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getCharacterLengthList() {
        return characterLengthList;
    }

    /**
     * Sets the value of the characterLengthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     * @see #getCharacterLengthList()
     */
    public void setCharacterLengthList(IntList value) {
        this.characterLengthList = value;
    }

    /**
     * The list of configurable number of stop bits used to terminate each
     *                 character.
     * 
     * @return
     *     possible object is
     *     {@link FloatList }
     *     
     */
    public FloatList getStopBitList() {
        return stopBitList;
    }

    /**
     * Sets the value of the stopBitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatList }
     *     
     * @see #getStopBitList()
     */
    public void setStopBitList(FloatList value) {
        this.stopBitList = value;
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
