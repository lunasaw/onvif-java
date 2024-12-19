
package org.onvif.ver10.recording.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TrackOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="SpareTotal" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="SpareVideo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="SpareAudio" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="SpareMetadata" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackOptions")
public class TrackOptions {

    /**
     * Total spare number of tracks that can be added to this recording.
     * 
     */
    @XmlAttribute(name = "SpareTotal")
    protected Integer spareTotal;
    /**
     * Number of spare Video tracks that can be added to this recording.
     * 
     */
    @XmlAttribute(name = "SpareVideo")
    protected Integer spareVideo;
    /**
     * Number of spare Aduio tracks that can be added to this recording.
     * 
     */
    @XmlAttribute(name = "SpareAudio")
    protected Integer spareAudio;
    /**
     * Number of spare Metadata tracks that can be added to this recording.
     * 
     */
    @XmlAttribute(name = "SpareMetadata")
    protected Integer spareMetadata;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Total spare number of tracks that can be added to this recording.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareTotal() {
        return spareTotal;
    }

    /**
     * Sets the value of the spareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpareTotal()
     */
    public void setSpareTotal(Integer value) {
        this.spareTotal = value;
    }

    /**
     * Number of spare Video tracks that can be added to this recording.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareVideo() {
        return spareVideo;
    }

    /**
     * Sets the value of the spareVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpareVideo()
     */
    public void setSpareVideo(Integer value) {
        this.spareVideo = value;
    }

    /**
     * Number of spare Aduio tracks that can be added to this recording.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareAudio() {
        return spareAudio;
    }

    /**
     * Sets the value of the spareAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpareAudio()
     */
    public void setSpareAudio(Integer value) {
        this.spareAudio = value;
    }

    /**
     * Number of spare Metadata tracks that can be added to this recording.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareMetadata() {
        return spareMetadata;
    }

    /**
     * Sets the value of the spareMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpareMetadata()
     */
    public void setSpareMetadata(Integer value) {
        this.spareMetadata = value;
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
