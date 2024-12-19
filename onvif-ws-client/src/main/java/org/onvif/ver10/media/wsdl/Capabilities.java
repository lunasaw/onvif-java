
package org.onvif.ver10.media.wsdl;

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
import org.w3c.dom.Element;


/**
 * <p>Java class for Capabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfileCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}ProfileCapabilities"/>
 *         <element name="StreamingCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}StreamingCapabilities"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SnapshotUri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="VideoSourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OSD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="EXICompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "profileCapabilities",
    "streamingCapabilities",
    "any"
})
public class Capabilities {

    /**
     * Media profile capabilities.
     * 
     */
    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;
    /**
     * Streaming capabilities.
     * 
     */
    @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates if GetSnapshotUri is supported.
     * 
     */
    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;
    /**
     * Indicates whether or not Rotation feature is supported.
     * 
     */
    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;
    /**
     * Indicates the support for changing video source mode.
     * 
     */
    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;
    /**
     * Indicates if OSD is supported.
     * 
     */
    @XmlAttribute(name = "OSD")
    protected Boolean osd;
    /**
     * Indicates the support for the Efficient XML Interchange (EXI) binary
     *               XML format.
     * 
     */
    @XmlAttribute(name = "EXICompression")
    protected Boolean exiCompression;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Media profile capabilities.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCapabilities }
     *     
     */
    public ProfileCapabilities getProfileCapabilities() {
        return profileCapabilities;
    }

    /**
     * Sets the value of the profileCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCapabilities }
     *     
     * @see #getProfileCapabilities()
     */
    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    /**
     * Streaming capabilities.
     * 
     * @return
     *     possible object is
     *     {@link StreamingCapabilities }
     *     
     */
    public StreamingCapabilities getStreamingCapabilities() {
        return streamingCapabilities;
    }

    /**
     * Sets the value of the streamingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingCapabilities }
     *     
     * @see #getStreamingCapabilities()
     */
    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
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
     * Indicates if GetSnapshotUri is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnapshotUri() {
        return snapshotUri;
    }

    /**
     * Sets the value of the snapshotUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSnapshotUri()
     */
    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    /**
     * Indicates whether or not Rotation feature is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRotation()
     */
    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    /**
     * Indicates the support for changing video source mode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVideoSourceMode() {
        return videoSourceMode;
    }

    /**
     * Sets the value of the videoSourceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVideoSourceMode()
     */
    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    /**
     * Indicates if OSD is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOSD()
     */
    public void setOSD(Boolean value) {
        this.osd = value;
    }

    /**
     * Indicates the support for the Efficient XML Interchange (EXI) binary
     *               XML format.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEXICompression() {
        return exiCompression;
    }

    /**
     * Sets the value of the exiCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEXICompression()
     */
    public void setEXICompression(Boolean value) {
        this.exiCompression = value;
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
