
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSDConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OSDConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="VideoSourceConfigurationToken" type="{http://www.onvif.org/ver10/schema}OSDReference"/>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType"/>
 *         <element name="Position" type="{http://www.onvif.org/ver10/schema}OSDPosConfiguration"/>
 *         <element name="TextString" type="{http://www.onvif.org/ver10/schema}OSDTextConfiguration" minOccurs="0"/>
 *         <element name="Image" type="{http://www.onvif.org/ver10/schema}OSDImgConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDConfiguration", propOrder = {
    "videoSourceConfigurationToken",
    "type",
    "position",
    "textString",
    "image",
    "extension"
})
public class OSDConfiguration
    extends DeviceEntity
{

    /**
     * Reference to the video source configuration.
     * 
     */
    @XmlElement(name = "VideoSourceConfigurationToken", required = true)
    protected OSDReference videoSourceConfigurationToken;
    /**
     * Type of OSD.
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OSDType type;
    /**
     * Position configuration of OSD.
     * 
     */
    @XmlElement(name = "Position", required = true)
    protected OSDPosConfiguration position;
    /**
     * Text configuration of OSD. It shall be present when the value of
     *                 Type field is Text.
     * 
     */
    @XmlElement(name = "TextString")
    protected OSDTextConfiguration textString;
    /**
     * Image configuration of OSD. It shall be present when the value of
     *                 Type field is Image
     * 
     */
    @XmlElement(name = "Image")
    protected OSDImgConfiguration image;
    @XmlElement(name = "Extension")
    protected OSDConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Reference to the video source configuration.
     * 
     * @return
     *     possible object is
     *     {@link OSDReference }
     *     
     */
    public OSDReference getVideoSourceConfigurationToken() {
        return videoSourceConfigurationToken;
    }

    /**
     * Sets the value of the videoSourceConfigurationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDReference }
     *     
     * @see #getVideoSourceConfigurationToken()
     */
    public void setVideoSourceConfigurationToken(OSDReference value) {
        this.videoSourceConfigurationToken = value;
    }

    /**
     * Type of OSD.
     * 
     * @return
     *     possible object is
     *     {@link OSDType }
     *     
     */
    public OSDType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDType }
     *     
     * @see #getType()
     */
    public void setType(OSDType value) {
        this.type = value;
    }

    /**
     * Position configuration of OSD.
     * 
     * @return
     *     possible object is
     *     {@link OSDPosConfiguration }
     *     
     */
    public OSDPosConfiguration getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDPosConfiguration }
     *     
     * @see #getPosition()
     */
    public void setPosition(OSDPosConfiguration value) {
        this.position = value;
    }

    /**
     * Text configuration of OSD. It shall be present when the value of
     *                 Type field is Text.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextConfiguration }
     *     
     */
    public OSDTextConfiguration getTextString() {
        return textString;
    }

    /**
     * Sets the value of the textString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextConfiguration }
     *     
     * @see #getTextString()
     */
    public void setTextString(OSDTextConfiguration value) {
        this.textString = value;
    }

    /**
     * Image configuration of OSD. It shall be present when the value of
     *                 Type field is Image
     * 
     * @return
     *     possible object is
     *     {@link OSDImgConfiguration }
     *     
     */
    public OSDImgConfiguration getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDImgConfiguration }
     *     
     * @see #getImage()
     */
    public void setImage(OSDImgConfiguration value) {
        this.image = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationExtension }
     *     
     */
    public OSDConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationExtension }
     *     
     */
    public void setExtension(OSDConfigurationExtension value) {
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
