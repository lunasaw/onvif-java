
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Configuration of the streaming and coding settings of a Video window.
 * 
 * <p>Java class for PaneConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaneConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="AudioSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="AudioEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfiguration" minOccurs="0"/>
 *         <element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
@XmlType(name = "PaneConfiguration", propOrder = {
    "paneName",
    "audioOutputToken",
    "audioSourceToken",
    "audioEncoderConfiguration",
    "receiverToken",
    "token",
    "any"
})
public class PaneConfiguration {

    /**
     * Optional name of the pane configuration.
     * 
     */
    @XmlElement(name = "PaneName")
    protected String paneName;
    /**
     * If the device has audio outputs, this element contains a pointer to the
     *             audio output that is associated with the pane. A tests
     *             can retrieve the available audio outputs of a device using the GetAudioOutputs command
     *             of the DeviceIO service.
     * 
     */
    @XmlElement(name = "AudioOutputToken")
    protected String audioOutputToken;
    /**
     * If the device has audio sources, this element contains a pointer to the
     *             audio source that is associated with this pane.
     *             The audio connection from a decoder device to the NVT is established using the
     *             backchannel mechanism. A tests can retrieve the available audio sources of a device
     *             using the GetAudioSources command of the
     *             DeviceIO service.
     * 
     */
    @XmlElement(name = "AudioSourceToken")
    protected String audioSourceToken;
    /**
     * The configuration of the audio encoder including codec, bitrate
     *             and sample rate.
     * 
     */
    @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;
    /**
     * A pointer to a Receiver that has the necessary information to receive
     *             data from a Transmitter. This Receiver can be connected and the network video decoder
     *             displays the received data on the specified outputs. A tests can retrieve the available
     *             Receivers using the
     *             GetReceivers command of the Receiver Service.
     * 
     */
    @XmlElement(name = "ReceiverToken")
    protected String receiverToken;
    /**
     * A unique identifier in the display device.
     * 
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Optional name of the pane configuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaneName() {
        return paneName;
    }

    /**
     * Sets the value of the paneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaneName()
     */
    public void setPaneName(String value) {
        this.paneName = value;
    }

    /**
     * If the device has audio outputs, this element contains a pointer to the
     *             audio output that is associated with the pane. A tests
     *             can retrieve the available audio outputs of a device using the GetAudioOutputs command
     *             of the DeviceIO service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioOutputToken() {
        return audioOutputToken;
    }

    /**
     * Sets the value of the audioOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAudioOutputToken()
     */
    public void setAudioOutputToken(String value) {
        this.audioOutputToken = value;
    }

    /**
     * If the device has audio sources, this element contains a pointer to the
     *             audio source that is associated with this pane.
     *             The audio connection from a decoder device to the NVT is established using the
     *             backchannel mechanism. A tests can retrieve the available audio sources of a device
     *             using the GetAudioSources command of the
     *             DeviceIO service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioSourceToken() {
        return audioSourceToken;
    }

    /**
     * Sets the value of the audioSourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAudioSourceToken()
     */
    public void setAudioSourceToken(String value) {
        this.audioSourceToken = value;
    }

    /**
     * The configuration of the audio encoder including codec, bitrate
     *             and sample rate.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public AudioEncoderConfiguration getAudioEncoderConfiguration() {
        return audioEncoderConfiguration;
    }

    /**
     * Sets the value of the audioEncoderConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoderConfiguration }
     *     
     * @see #getAudioEncoderConfiguration()
     */
    public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        this.audioEncoderConfiguration = value;
    }

    /**
     * A pointer to a Receiver that has the necessary information to receive
     *             data from a Transmitter. This Receiver can be connected and the network video decoder
     *             displays the received data on the specified outputs. A tests can retrieve the available
     *             Receivers using the
     *             GetReceivers command of the Receiver Service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverToken() {
        return receiverToken;
    }

    /**
     * Sets the value of the receiverToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReceiverToken()
     */
    public void setReceiverToken(String value) {
        this.receiverToken = value;
    }

    /**
     * A unique identifier in the display device.
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
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
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
