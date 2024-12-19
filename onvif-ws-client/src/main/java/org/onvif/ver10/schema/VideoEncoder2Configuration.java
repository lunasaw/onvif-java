
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoEncoder2Configuration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoEncoder2Configuration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution2"/>
 *         <element name="RateControl" type="{http://www.onvif.org/ver10/schema}VideoRateControl2" minOccurs="0"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration" minOccurs="0"/>
 *         <element name="Quality" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoder2Configuration", propOrder = {
    "encoding",
    "resolution",
    "rateControl",
    "multicast",
    "quality",
    "any"
})
public class VideoEncoder2Configuration
    extends ConfigurationEntity
{

    /**
     * Mime name of the supported audio format. For name definitions see
     *                 tt:VideoEncodingMimeNames and 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/media-types/media-types.xhtml"&gt;IANA Media
     *                   Types&lt;/a&gt;
     * </pre>
     * .
     * 
     */
    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    /**
     * Configured video resolution
     * 
     */
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution2 resolution;
    /**
     * Optional element to configure rate control related parameters.
     * 
     */
    @XmlElement(name = "RateControl")
    protected VideoRateControl2 rateControl;
    /**
     * Defines the multicast settings that could be used for video
     *                 streaming.
     * 
     */
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    /**
     * Relative value for the video quantizers and the quality of the
     *                 video. A high value within supported quality range means higher quality
     * 
     */
    @XmlElement(name = "Quality")
    protected float quality;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Group of Video frames length. Determines typically the interval in
     *               which the I-Frames will be coded. An entry of 1 indicates I-Frames are continuously
     *               generated. An entry of 2 indicates that every 2nd image is an I-Frame, and 3 only
     *               every 3rd frame, etc. The frames in between are coded as P or B Frames.
     * 
     */
    @XmlAttribute(name = "GovLength")
    protected Integer govLength;
    /**
     * The encoder profile as defined in tt:VideoEncodingProfiles.
     * 
     */
    @XmlAttribute(name = "Profile")
    protected String profile;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Mime name of the supported audio format. For name definitions see
     *                 tt:VideoEncodingMimeNames and 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/media-types/media-types.xhtml"&gt;IANA Media
     *                   Types&lt;/a&gt;
     * </pre>
     * .
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEncoding()
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Configured video resolution
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution2 }
     *     
     */
    public VideoResolution2 getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution2 }
     *     
     * @see #getResolution()
     */
    public void setResolution(VideoResolution2 value) {
        this.resolution = value;
    }

    /**
     * Optional element to configure rate control related parameters.
     * 
     * @return
     *     possible object is
     *     {@link VideoRateControl2 }
     *     
     */
    public VideoRateControl2 getRateControl() {
        return rateControl;
    }

    /**
     * Sets the value of the rateControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRateControl2 }
     *     
     * @see #getRateControl()
     */
    public void setRateControl(VideoRateControl2 value) {
        this.rateControl = value;
    }

    /**
     * Defines the multicast settings that could be used for video
     *                 streaming.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     * @see #getMulticast()
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * Relative value for the video quantizers and the quality of the
     *                 video. A high value within supported quality range means higher quality
     * 
     */
    public float getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     */
    public void setQuality(float value) {
        this.quality = value;
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
     * Group of Video frames length. Determines typically the interval in
     *               which the I-Frames will be coded. An entry of 1 indicates I-Frames are continuously
     *               generated. An entry of 2 indicates that every 2nd image is an I-Frame, and 3 only
     *               every 3rd frame, etc. The frames in between are coded as P or B Frames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGovLength() {
        return govLength;
    }

    /**
     * Sets the value of the govLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getGovLength()
     */
    public void setGovLength(Integer value) {
        this.govLength = value;
    }

    /**
     * The encoder profile as defined in tt:VideoEncodingProfiles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfile()
     */
    public void setProfile(String value) {
        this.profile = value;
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
