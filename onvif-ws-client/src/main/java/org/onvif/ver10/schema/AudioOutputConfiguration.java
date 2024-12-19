
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
 * <p>Java class for AudioOutputConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AudioOutputConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="OutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="SendPrimacy" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="OutputLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioOutputConfiguration", propOrder = {
    "outputToken",
    "sendPrimacy",
    "outputLevel",
    "any"
})
public class AudioOutputConfiguration
    extends ConfigurationEntity
{

    /**
     * Token of the phsycial Audio output.
     * 
     */
    @XmlElement(name = "OutputToken", required = true)
    protected String outputToken;
    /**
     * An audio channel MAY support different types of audio transmission. While for full
     *                 duplex
     *                 operation no special handling is required, in half duplex operation the transmission
     *                 direction
     *                 needs to be switched.
     *                 The optional SendPrimacy parameter inside the AudioOutputConfiguration indicates
     *                 which
     *                 direction is currently active. An NVC can switch between different modes by setting
     *                 the
     *                 AudioOutputConfiguration.
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                 The following modes for the Send-Primacy are defined:
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Server
     *                       The server is allowed to send audio data to the tests. The tests shall not
     *                       send
     *                       audio data via the backchannel to the NVT in this mode.
     *                   &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Client
     *                     The tests is allowed to send audio data via the backchannel to the server. The
     *                     NVT shall not send audio data to the tests in this mode.
     *                   &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Auto
     *                     It is up to the device how to deal with sending and receiving audio data.
     *                   &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *                 Acoustic echo cancellation is out of ONVIF scope.
     * 
     */
    @XmlElement(name = "SendPrimacy")
    @XmlSchemaType(name = "anyURI")
    protected String sendPrimacy;
    /**
     * Volume setting of the output. The applicable range is defined via
     *                 the option AudioOutputOptions.OutputLevelRange.
     * 
     */
    @XmlElement(name = "OutputLevel")
    protected int outputLevel;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Token of the phsycial Audio output.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputToken() {
        return outputToken;
    }

    /**
     * Sets the value of the outputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOutputToken()
     */
    public void setOutputToken(String value) {
        this.outputToken = value;
    }

    /**
     * An audio channel MAY support different types of audio transmission. While for full
     *                 duplex
     *                 operation no special handling is required, in half duplex operation the transmission
     *                 direction
     *                 needs to be switched.
     *                 The optional SendPrimacy parameter inside the AudioOutputConfiguration indicates
     *                 which
     *                 direction is currently active. An NVC can switch between different modes by setting
     *                 the
     *                 AudioOutputConfiguration.
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                 The following modes for the Send-Primacy are defined:
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Server
     *                       The server is allowed to send audio data to the tests. The tests shall not
     *                       send
     *                       audio data via the backchannel to the NVT in this mode.
     *                   &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Client
     *                     The tests is allowed to send audio data via the backchannel to the server. The
     *                     NVT shall not send audio data to the tests in this mode.
     *                   &lt;/li&gt;&lt;li&gt;www.onvif.org/ver20/HalfDuplex/Auto
     *                     It is up to the device how to deal with sending and receiving audio data.
     *                   &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *                 Acoustic echo cancellation is out of ONVIF scope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendPrimacy() {
        return sendPrimacy;
    }

    /**
     * Sets the value of the sendPrimacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSendPrimacy()
     */
    public void setSendPrimacy(String value) {
        this.sendPrimacy = value;
    }

    /**
     * Volume setting of the output. The applicable range is defined via
     *                 the option AudioOutputOptions.OutputLevelRange.
     * 
     */
    public int getOutputLevel() {
        return outputLevel;
    }

    /**
     * Sets the value of the outputLevel property.
     * 
     */
    public void setOutputLevel(int value) {
        this.outputLevel = value;
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
