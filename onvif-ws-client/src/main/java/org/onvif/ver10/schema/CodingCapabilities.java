
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
 * This type contains the Audio and Video coding capabilities of a display
 *         service.
 * 
 * <p>Java class for CodingCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CodingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudioEncodingCapabilities" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfigurationOptions" minOccurs="0"/>
 *         <element name="AudioDecodingCapabilities" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfigurationOptions" minOccurs="0"/>
 *         <element name="VideoDecodingCapabilities" type="{http://www.onvif.org/ver10/schema}VideoDecoderConfigurationOptions"/>
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
@XmlType(name = "CodingCapabilities", propOrder = {
    "audioEncodingCapabilities",
    "audioDecodingCapabilities",
    "videoDecodingCapabilities",
    "any"
})
public class CodingCapabilities {

    /**
     * If the device supports audio encoding this section describes the
     *             supported codecs and their configuration.
     * 
     */
    @XmlElement(name = "AudioEncodingCapabilities")
    protected AudioEncoderConfigurationOptions audioEncodingCapabilities;
    /**
     * If the device supports audio decoding this section describes the
     *             supported codecs and their settings.
     * 
     */
    @XmlElement(name = "AudioDecodingCapabilities")
    protected AudioDecoderConfigurationOptions audioDecodingCapabilities;
    /**
     * This section describes the supported video codesc and their
     *             configuration.
     * 
     */
    @XmlElement(name = "VideoDecodingCapabilities", required = true)
    protected VideoDecoderConfigurationOptions videoDecodingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * If the device supports audio encoding this section describes the
     *             supported codecs and their configuration.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoderConfigurationOptions }
     *     
     */
    public AudioEncoderConfigurationOptions getAudioEncodingCapabilities() {
        return audioEncodingCapabilities;
    }

    /**
     * Sets the value of the audioEncodingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoderConfigurationOptions }
     *     
     * @see #getAudioEncodingCapabilities()
     */
    public void setAudioEncodingCapabilities(AudioEncoderConfigurationOptions value) {
        this.audioEncodingCapabilities = value;
    }

    /**
     * If the device supports audio decoding this section describes the
     *             supported codecs and their settings.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfigurationOptions }
     *     
     */
    public AudioDecoderConfigurationOptions getAudioDecodingCapabilities() {
        return audioDecodingCapabilities;
    }

    /**
     * Sets the value of the audioDecodingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfigurationOptions }
     *     
     * @see #getAudioDecodingCapabilities()
     */
    public void setAudioDecodingCapabilities(AudioDecoderConfigurationOptions value) {
        this.audioDecodingCapabilities = value;
    }

    /**
     * This section describes the supported video codesc and their
     *             configuration.
     * 
     * @return
     *     possible object is
     *     {@link VideoDecoderConfigurationOptions }
     *     
     */
    public VideoDecoderConfigurationOptions getVideoDecodingCapabilities() {
        return videoDecodingCapabilities;
    }

    /**
     * Sets the value of the videoDecodingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDecoderConfigurationOptions }
     *     
     * @see #getVideoDecodingCapabilities()
     */
    public void setVideoDecodingCapabilities(VideoDecoderConfigurationOptions value) {
        this.videoDecodingCapabilities = value;
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
