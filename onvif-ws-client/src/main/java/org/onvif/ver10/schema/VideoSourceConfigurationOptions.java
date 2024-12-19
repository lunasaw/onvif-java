
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
 * <p>Java class for VideoSourceConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoSourceConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundsRange" type="{http://www.onvif.org/ver10/schema}IntRectangleRange"/>
 *         <element name="VideoSourceTokensAvailable" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "VideoSourceConfigurationOptions", propOrder = {
    "boundsRange",
    "videoSourceTokensAvailable",
    "extension"
})
public class VideoSourceConfigurationOptions {

    /**
     * Supported range for the capturing area.
     * 
     */
    @XmlElement(name = "BoundsRange", required = true)
    protected IntRectangleRange boundsRange;
    /**
     * List of physical inputs.
     * 
     */
    @XmlElement(name = "VideoSourceTokensAvailable", required = true)
    protected List<String> videoSourceTokensAvailable;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported range for the capturing area.
     * 
     * @return
     *     possible object is
     *     {@link IntRectangleRange }
     *     
     */
    public IntRectangleRange getBoundsRange() {
        return boundsRange;
    }

    /**
     * Sets the value of the boundsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRectangleRange }
     *     
     * @see #getBoundsRange()
     */
    public void setBoundsRange(IntRectangleRange value) {
        this.boundsRange = value;
    }

    /**
     * List of physical inputs.
     * 
     * Gets the value of the videoSourceTokensAvailable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoSourceTokensAvailable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVideoSourceTokensAvailable().add(newItem);
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
     *     The value of the videoSourceTokensAvailable property.
     */
    public List<String> getVideoSourceTokensAvailable() {
        if (videoSourceTokensAvailable == null) {
            videoSourceTokensAvailable = new ArrayList<>();
        }
        return this.videoSourceTokensAvailable;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationOptionsExtension }
     *     
     */
    public VideoSourceConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationOptionsExtension }
     *     
     */
    public void setExtension(VideoSourceConfigurationOptionsExtension value) {
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
