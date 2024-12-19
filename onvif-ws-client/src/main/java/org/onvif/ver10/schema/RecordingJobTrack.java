
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
 * <p>Java class for RecordingJobTrack complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingJobTrack">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SourceTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Destination" type="{http://www.onvif.org/ver10/schema}TrackReference"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RecordingJobTrack", propOrder = {
    "sourceTag",
    "destination",
    "any"
})
public class RecordingJobTrack {

    /**
     * If the received RTSP stream contains multiple tracks of the same type,
     *             the
     *             SourceTag differentiates between those Tracks. This field can be ignored in case of
     *             recording a local source.
     * 
     */
    @XmlElement(name = "SourceTag", required = true)
    protected String sourceTag;
    /**
     * The destination is the tracktoken of the track to which the device shall
     *             store the
     *             received data.
     * 
     */
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * If the received RTSP stream contains multiple tracks of the same type,
     *             the
     *             SourceTag differentiates between those Tracks. This field can be ignored in case of
     *             recording a local source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTag() {
        return sourceTag;
    }

    /**
     * Sets the value of the sourceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceTag()
     */
    public void setSourceTag(String value) {
        this.sourceTag = value;
    }

    /**
     * The destination is the tracktoken of the track to which the device shall
     *             store the
     *             received data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
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
