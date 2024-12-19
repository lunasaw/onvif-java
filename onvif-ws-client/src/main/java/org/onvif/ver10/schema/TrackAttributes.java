
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
 * <p>Java class for TrackAttributes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TrackAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrackInformation" type="{http://www.onvif.org/ver10/schema}TrackInformation"/>
 *         <element name="VideoAttributes" type="{http://www.onvif.org/ver10/schema}VideoAttributes" minOccurs="0"/>
 *         <element name="AudioAttributes" type="{http://www.onvif.org/ver10/schema}AudioAttributes" minOccurs="0"/>
 *         <element name="MetadataAttributes" type="{http://www.onvif.org/ver10/schema}MetadataAttributes" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}TrackAttributesExtension" minOccurs="0"/>
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
@XmlType(name = "TrackAttributes", propOrder = {
    "trackInformation",
    "videoAttributes",
    "audioAttributes",
    "metadataAttributes",
    "extension"
})
public class TrackAttributes {

    /**
     * The basic information about the track. Note that a track may represent a
     *             single contiguous time span or consist of multiple slices.
     * 
     */
    @XmlElement(name = "TrackInformation", required = true)
    protected TrackInformation trackInformation;
    /**
     * If the track is a video track, exactly one of this structure shall be
     *             present and contain the video attributes.
     * 
     */
    @XmlElement(name = "VideoAttributes")
    protected VideoAttributes videoAttributes;
    /**
     * If the track is an audio track, exactly one of this structure shall be
     *             present and contain the audio attributes.
     * 
     */
    @XmlElement(name = "AudioAttributes")
    protected AudioAttributes audioAttributes;
    /**
     * If the track is an metadata track, exactly one of this structure shall
     *             be present and contain the metadata attributes.
     * 
     */
    @XmlElement(name = "MetadataAttributes")
    protected MetadataAttributes metadataAttributes;
    @XmlElement(name = "Extension")
    protected TrackAttributesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The basic information about the track. Note that a track may represent a
     *             single contiguous time span or consist of multiple slices.
     * 
     * @return
     *     possible object is
     *     {@link TrackInformation }
     *     
     */
    public TrackInformation getTrackInformation() {
        return trackInformation;
    }

    /**
     * Sets the value of the trackInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackInformation }
     *     
     * @see #getTrackInformation()
     */
    public void setTrackInformation(TrackInformation value) {
        this.trackInformation = value;
    }

    /**
     * If the track is a video track, exactly one of this structure shall be
     *             present and contain the video attributes.
     * 
     * @return
     *     possible object is
     *     {@link VideoAttributes }
     *     
     */
    public VideoAttributes getVideoAttributes() {
        return videoAttributes;
    }

    /**
     * Sets the value of the videoAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAttributes }
     *     
     * @see #getVideoAttributes()
     */
    public void setVideoAttributes(VideoAttributes value) {
        this.videoAttributes = value;
    }

    /**
     * If the track is an audio track, exactly one of this structure shall be
     *             present and contain the audio attributes.
     * 
     * @return
     *     possible object is
     *     {@link AudioAttributes }
     *     
     */
    public AudioAttributes getAudioAttributes() {
        return audioAttributes;
    }

    /**
     * Sets the value of the audioAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioAttributes }
     *     
     * @see #getAudioAttributes()
     */
    public void setAudioAttributes(AudioAttributes value) {
        this.audioAttributes = value;
    }

    /**
     * If the track is an metadata track, exactly one of this structure shall
     *             be present and contain the metadata attributes.
     * 
     * @return
     *     possible object is
     *     {@link MetadataAttributes }
     *     
     */
    public MetadataAttributes getMetadataAttributes() {
        return metadataAttributes;
    }

    /**
     * Sets the value of the metadataAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataAttributes }
     *     
     * @see #getMetadataAttributes()
     */
    public void setMetadataAttributes(MetadataAttributes value) {
        this.metadataAttributes = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public TrackAttributesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public void setExtension(TrackAttributesExtension value) {
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
