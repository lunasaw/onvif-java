
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AudioOutputConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AudioOutputConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutputTokensAvailable" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         <element name="SendPrimacyOptions" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OutputLevelRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
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
@XmlType(name = "AudioOutputConfigurationOptions", propOrder = {
    "outputTokensAvailable",
    "sendPrimacyOptions",
    "outputLevelRange",
    "any"
})
public class AudioOutputConfigurationOptions {

    /**
     * Tokens of the physical Audio outputs (typically one).
     * 
     */
    @XmlElement(name = "OutputTokensAvailable", required = true)
    protected List<String> outputTokensAvailable;
    /**
     * An 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;audio&lt;/b&gt;
     * </pre>
     *  channel MAY support different types of audio transmission. While for
     *             full duplex
     *             operation no special handling is required, in half duplex operation the transmission
     *             direction
     *             needs to be switched.
     *             The optional SendPrimacy parameter inside the AudioOutputConfiguration indicates which
     *             direction is currently active. An NVC can switch between different modes by setting the
     *             AudioOutputConfiguration.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             The following modes for the Send-Primacy are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Server
     *                   The server is allowed to send audio data to the tests. The tests shall not send
     *                   audio data via the backchannel to the NVT in this mode.
     *               &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Client
     *                 The tests is allowed to send audio data via the backchannel to the server. The
     *                 NVT shall not send audio data to the tests in this mode.
     *               &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Auto
     *                 It is up to the device how to deal with sending and receiving audio data.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *             Acoustic echo cancellation is out of ONVIF scope.
     * 
     */
    @XmlElement(name = "SendPrimacyOptions")
    @XmlSchemaType(name = "anyURI")
    protected List<String> sendPrimacyOptions;
    /**
     * Minimum and maximum level range supported for this Output.
     * 
     */
    @XmlElement(name = "OutputLevelRange", required = true)
    protected IntRange outputLevelRange;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Tokens of the physical Audio outputs (typically one).
     * 
     * Gets the value of the outputTokensAvailable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputTokensAvailable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOutputTokensAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the outputTokensAvailable property.
     */
    public List<String> getOutputTokensAvailable() {
        if (outputTokensAvailable == null) {
            outputTokensAvailable = new ArrayList<>();
        }
        return this.outputTokensAvailable;
    }

    /**
     * An 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;audio&lt;/b&gt;
     * </pre>
     *  channel MAY support different types of audio transmission. While for
     *             full duplex
     *             operation no special handling is required, in half duplex operation the transmission
     *             direction
     *             needs to be switched.
     *             The optional SendPrimacy parameter inside the AudioOutputConfiguration indicates which
     *             direction is currently active. An NVC can switch between different modes by setting the
     *             AudioOutputConfiguration.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             The following modes for the Send-Primacy are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Server
     *                   The server is allowed to send audio data to the tests. The tests shall not send
     *                   audio data via the backchannel to the NVT in this mode.
     *               &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Client
     *                 The tests is allowed to send audio data via the backchannel to the server. The
     *                 NVT shall not send audio data to the tests in this mode.
     *               &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Auto
     *                 It is up to the device how to deal with sending and receiving audio data.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *             Acoustic echo cancellation is out of ONVIF scope.
     * 
     * Gets the value of the sendPrimacyOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendPrimacyOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSendPrimacyOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the sendPrimacyOptions property.
     */
    public List<String> getSendPrimacyOptions() {
        if (sendPrimacyOptions == null) {
            sendPrimacyOptions = new ArrayList<>();
        }
        return this.sendPrimacyOptions;
    }

    /**
     * Minimum and maximum level range supported for this Output.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getOutputLevelRange() {
        return outputLevelRange;
    }

    /**
     * Sets the value of the outputLevelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getOutputLevelRange()
     */
    public void setOutputLevelRange(IntRange value) {
        this.outputLevelRange = value;
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
