
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingJobSource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingJobSource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SourceToken" type="{http://www.onvif.org/ver10/schema}SourceReference" minOccurs="0"/>
 *         <element name="AutoCreateReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Tracks" type="{http://www.onvif.org/ver10/schema}RecordingJobTrack" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobSourceExtension" minOccurs="0"/>
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
@XmlType(name = "RecordingJobSource", propOrder = {
    "sourceToken",
    "autoCreateReceiver",
    "tracks",
    "extension"
})
public class RecordingJobSource {

    /**
     * This field shall be a reference to the source of the data. The type of
     *             the source
     *             is determined by the attribute Type in the SourceToken structure. If Type is
     *             http://www.onvif.org/ver10/schema/Receiver, the token is a ReceiverReference. In this
     *             case
     *             the device shall receive the data over the network. If Type is
     *             http://www.onvif.org/ver10/schema/Profile, the token identifies a media profile,
     *             instructing the
     *             device to obtain data from a profile that exists on the local device.
     * 
     */
    @XmlElement(name = "SourceToken")
    protected SourceReference sourceToken;
    /**
     * If this field is TRUE, and if the SourceToken is omitted, the device
     *             shall create a receiver object (through the receiver service) and assign the
     *             ReceiverReference to the SourceToken field. When retrieving the
     *             RecordingJobConfiguration
     *             from the device, the AutoCreateReceiver field shall never be present.
     * 
     */
    @XmlElement(name = "AutoCreateReceiver")
    protected Boolean autoCreateReceiver;
    /**
     * List of tracks associated with the recording.
     * 
     */
    @XmlElement(name = "Tracks")
    protected List<RecordingJobTrack> tracks;
    @XmlElement(name = "Extension")
    protected RecordingJobSourceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * This field shall be a reference to the source of the data. The type of
     *             the source
     *             is determined by the attribute Type in the SourceToken structure. If Type is
     *             http://www.onvif.org/ver10/schema/Receiver, the token is a ReceiverReference. In this
     *             case
     *             the device shall receive the data over the network. If Type is
     *             http://www.onvif.org/ver10/schema/Profile, the token identifies a media profile,
     *             instructing the
     *             device to obtain data from a profile that exists on the local device.
     * 
     * @return
     *     possible object is
     *     {@link SourceReference }
     *     
     */
    public SourceReference getSourceToken() {
        return sourceToken;
    }

    /**
     * Sets the value of the sourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReference }
     *     
     * @see #getSourceToken()
     */
    public void setSourceToken(SourceReference value) {
        this.sourceToken = value;
    }

    /**
     * If this field is TRUE, and if the SourceToken is omitted, the device
     *             shall create a receiver object (through the receiver service) and assign the
     *             ReceiverReference to the SourceToken field. When retrieving the
     *             RecordingJobConfiguration
     *             from the device, the AutoCreateReceiver field shall never be present.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateReceiver() {
        return autoCreateReceiver;
    }

    /**
     * Sets the value of the autoCreateReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutoCreateReceiver()
     */
    public void setAutoCreateReceiver(Boolean value) {
        this.autoCreateReceiver = value;
    }

    /**
     * List of tracks associated with the recording.
     * 
     * Gets the value of the tracks property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracks property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTracks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingJobTrack }
     * </p>
     * 
     * 
     * @return
     *     The value of the tracks property.
     */
    public List<RecordingJobTrack> getTracks() {
        if (tracks == null) {
            tracks = new ArrayList<>();
        }
        return this.tracks;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobSourceExtension }
     *     
     */
    public RecordingJobSourceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobSourceExtension }
     *     
     */
    public void setExtension(RecordingJobSourceExtension value) {
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
