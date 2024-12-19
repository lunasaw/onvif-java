
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
 * <p>Java class for VideoEncoder2ConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoEncoder2ConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="QualityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution2" maxOccurs="unbounded"/>
 *         <element name="BitrateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntAttrList" />
 *       <attribute name="FrameRatesSupported" type="{http://www.onvif.org/ver10/schema}FloatAttrList" />
 *       <attribute name="ProfilesSupported" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="ConstantBitRateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GuaranteedInstances" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoder2ConfigurationOptions", propOrder = {
    "encoding",
    "qualityRange",
    "resolutionsAvailable",
    "bitrateRange",
    "any"
})
public class VideoEncoder2ConfigurationOptions {

    /**
     * Mime name of the supported Video format. For name definitions see
     *             tt:VideoEncodingMimeNames and 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/media-types/media-types.xhtml"&gt;IANA Media
     *               Types&lt;/a&gt;
     * </pre>
     * .
     * 
     */
    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    /**
     * Range of the quality values. A high value means higher quality.
     * 
     */
    @XmlElement(name = "QualityRange", required = true)
    protected IntRange qualityRange;
    /**
     * List of supported image sizes.
     * 
     */
    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution2> resolutionsAvailable;
    /**
     * Supported range of encoded bitrate in kbps.
     * 
     */
    @XmlElement(name = "BitrateRange", required = true)
    protected IntRange bitrateRange;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Lower and Upper bounds for the supported group of Video frames length.
     *           This value typically corresponds to the I-Frame distance.
     * 
     */
    @XmlAttribute(name = "GovLengthRange")
    protected List<Integer> govLengthRange;
    /**
     * List of supported target frame rates in fps (frames per second). The list
     *           shall be sorted with highest values first.
     * 
     */
    @XmlAttribute(name = "FrameRatesSupported")
    protected List<Float> frameRatesSupported;
    /**
     * List of supported encoder profiles as defined in
     *           tt::VideoEncodingProfiles.
     * 
     */
    @XmlAttribute(name = "ProfilesSupported")
    protected List<String> profilesSupported;
    /**
     * Signal whether enforcing constant bitrate is supported.
     * 
     */
    @XmlAttribute(name = "ConstantBitRateSupported")
    protected Boolean constantBitRateSupported;
    /**
     * The minimum guaranteed number of encoder instances using this encoding for
     *           the associated VideoSourceConfiguration.
     * 
     */
    @XmlAttribute(name = "GuaranteedInstances")
    protected Integer guaranteedInstances;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Mime name of the supported Video format. For name definitions see
     *             tt:VideoEncodingMimeNames and 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://www.iana.org/assignments/media-types/media-types.xhtml"&gt;IANA Media
     *               Types&lt;/a&gt;
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
     * Range of the quality values. A high value means higher quality.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getQualityRange() {
        return qualityRange;
    }

    /**
     * Sets the value of the qualityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getQualityRange()
     */
    public void setQualityRange(IntRange value) {
        this.qualityRange = value;
    }

    /**
     * List of supported image sizes.
     * 
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the resolutionsAvailable property.
     */
    public List<VideoResolution2> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * Supported range of encoded bitrate in kbps.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getBitrateRange() {
        return bitrateRange;
    }

    /**
     * Sets the value of the bitrateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getBitrateRange()
     */
    public void setBitrateRange(IntRange value) {
        this.bitrateRange = value;
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
     * Lower and Upper bounds for the supported group of Video frames length.
     *           This value typically corresponds to the I-Frame distance.
     * 
     * Gets the value of the govLengthRange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govLengthRange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGovLengthRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the govLengthRange property.
     */
    public List<Integer> getGovLengthRange() {
        if (govLengthRange == null) {
            govLengthRange = new ArrayList<>();
        }
        return this.govLengthRange;
    }

    /**
     * List of supported target frame rates in fps (frames per second). The list
     *           shall be sorted with highest values first.
     * 
     * Gets the value of the frameRatesSupported property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameRatesSupported property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFrameRatesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * </p>
     * 
     * 
     * @return
     *     The value of the frameRatesSupported property.
     */
    public List<Float> getFrameRatesSupported() {
        if (frameRatesSupported == null) {
            frameRatesSupported = new ArrayList<>();
        }
        return this.frameRatesSupported;
    }

    /**
     * List of supported encoder profiles as defined in
     *           tt::VideoEncodingProfiles.
     * 
     * Gets the value of the profilesSupported property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profilesSupported property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfilesSupported().add(newItem);
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
     *     The value of the profilesSupported property.
     */
    public List<String> getProfilesSupported() {
        if (profilesSupported == null) {
            profilesSupported = new ArrayList<>();
        }
        return this.profilesSupported;
    }

    /**
     * Signal whether enforcing constant bitrate is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstantBitRateSupported() {
        return constantBitRateSupported;
    }

    /**
     * Sets the value of the constantBitRateSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConstantBitRateSupported()
     */
    public void setConstantBitRateSupported(Boolean value) {
        this.constantBitRateSupported = value;
    }

    /**
     * The minimum guaranteed number of encoder instances using this encoding for
     *           the associated VideoSourceConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuaranteedInstances() {
        return guaranteedInstances;
    }

    /**
     * Sets the value of the guaranteedInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getGuaranteedInstances()
     */
    public void setGuaranteedInstances(Integer value) {
        this.guaranteedInstances = value;
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
