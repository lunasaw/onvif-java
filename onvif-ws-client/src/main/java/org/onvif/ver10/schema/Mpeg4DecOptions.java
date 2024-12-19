
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
 * <p>Java class for Mpeg4DecOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Mpeg4DecOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         <element name="SupportedMpeg4Profiles" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile" maxOccurs="unbounded"/>
 *         <element name="SupportedInputBitrate" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="SupportedFrameRate" type="{http://www.onvif.org/ver10/schema}IntRange"/>
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
@XmlType(name = "Mpeg4DecOptions", propOrder = {
    "resolutionsAvailable",
    "supportedMpeg4Profiles",
    "supportedInputBitrate",
    "supportedFrameRate",
    "any"
})
public class Mpeg4DecOptions {

    /**
     * List of supported Mpeg4 Video Resolutions
     * 
     */
    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    /**
     * List of supported Mpeg4 Profiles (either SP or ASP)
     * 
     */
    @XmlElement(name = "SupportedMpeg4Profiles", required = true)
    @XmlSchemaType(name = "string")
    protected List<Mpeg4Profile> supportedMpeg4Profiles;
    /**
     * Supported Mpeg4 bitrate range in kbps
     * 
     */
    @XmlElement(name = "SupportedInputBitrate", required = true)
    protected IntRange supportedInputBitrate;
    /**
     * Supported Mpeg4 framerate range in fps
     * 
     */
    @XmlElement(name = "SupportedFrameRate", required = true)
    protected IntRange supportedFrameRate;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * List of supported Mpeg4 Video Resolutions
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
     * {@link VideoResolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the resolutionsAvailable property.
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * List of supported Mpeg4 Profiles (either SP or ASP)
     * 
     * Gets the value of the supportedMpeg4Profiles property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMpeg4Profiles property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedMpeg4Profiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mpeg4Profile }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedMpeg4Profiles property.
     */
    public List<Mpeg4Profile> getSupportedMpeg4Profiles() {
        if (supportedMpeg4Profiles == null) {
            supportedMpeg4Profiles = new ArrayList<>();
        }
        return this.supportedMpeg4Profiles;
    }

    /**
     * Supported Mpeg4 bitrate range in kbps
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getSupportedInputBitrate() {
        return supportedInputBitrate;
    }

    /**
     * Sets the value of the supportedInputBitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getSupportedInputBitrate()
     */
    public void setSupportedInputBitrate(IntRange value) {
        this.supportedInputBitrate = value;
    }

    /**
     * Supported Mpeg4 framerate range in fps
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getSupportedFrameRate() {
        return supportedFrameRate;
    }

    /**
     * Sets the value of the supportedFrameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getSupportedFrameRate()
     */
    public void setSupportedFrameRate(IntRange value) {
        this.supportedFrameRate = value;
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
