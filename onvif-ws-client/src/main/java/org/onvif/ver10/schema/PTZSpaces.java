
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
 * <p>Java class for PTZSpaces complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZSpaces">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AbsolutePanTiltPositionSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AbsoluteZoomPositionSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RelativePanTiltTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RelativeZoomTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ContinuousPanTiltVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ContinuousZoomVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PanTiltSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ZoomSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZSpacesExtension" minOccurs="0"/>
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
@XmlType(name = "PTZSpaces", propOrder = {
    "absolutePanTiltPositionSpace",
    "absoluteZoomPositionSpace",
    "relativePanTiltTranslationSpace",
    "relativeZoomTranslationSpace",
    "continuousPanTiltVelocitySpace",
    "continuousZoomVelocitySpace",
    "panTiltSpeedSpace",
    "zoomSpeedSpace",
    "extension"
})
public class PTZSpaces {

    /**
     * The Generic Pan/Tilt Position space is provided by every PTZ node that supports absolute
     *             Pan/Tilt, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full range of the PTZ unit normalized to the
     *             range -1 to 1 resulting in the following space description.
     * 
     */
    @XmlElement(name = "AbsolutePanTiltPositionSpace")
    protected List<Space2DDescription> absolutePanTiltPositionSpace;
    /**
     * The Generic Zoom Position Space is provided by every PTZ node that supports absolute
     *             Zoom, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full range of the Zoom normalized to the
     *             range 0 (wide) to 1 (tele).
     *             There is no assumption about how the generic zoom range is mapped to magnification, FOV
     *             or other physical zoom dimension.
     * 
     */
    @XmlElement(name = "AbsoluteZoomPositionSpace")
    protected List<Space1DDescription> absoluteZoomPositionSpace;
    /**
     * The Generic Pan/Tilt translation space is provided by every PTZ node that supports
     *             relative Pan/Tilt, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full positive and negative translation range
     *             of the PTZ unit normalized to the range -1 to 1,
     *             where positive translation would mean clockwise rotation or movement in right/up
     *             direction resulting in the following space description.
     * 
     */
    @XmlElement(name = "RelativePanTiltTranslationSpace")
    protected List<Space2DDescription> relativePanTiltTranslationSpace;
    /**
     * The Generic Zoom Translation Space is provided by every PTZ node that supports relative
     *             Zoom, since it does not relate to a specific physical range.
     *             Instead, the corresponding absolute range should be defined as the full positive and
     *             negative translation range of the Zoom normalized to the range -1 to1,
     *             where a positive translation maps to a movement in TELE direction. The translation is
     *             signed to indicate direction (negative is to wide, positive is to tele).
     *             There is no assumption about how the generic zoom range is mapped to magnification, FOV
     *             or other physical zoom dimension. This results in the following space description.
     * 
     */
    @XmlElement(name = "RelativeZoomTranslationSpace")
    protected List<Space1DDescription> relativeZoomTranslationSpace;
    /**
     * The generic Pan/Tilt velocity space shall be provided by every PTZ node, since it does
     *             not relate to a specific physical range.
     *             Instead, the range should be defined as a range of the PTZ unit’s speed normalized to
     *             the range -1 to 1, where a positive velocity would map to clockwise
     *             rotation or movement in the right/up direction. A signed speed can be independently
     *             specified for the pan and tilt component resulting in the following space description.
     * 
     */
    @XmlElement(name = "ContinuousPanTiltVelocitySpace")
    protected List<Space2DDescription> continuousPanTiltVelocitySpace;
    /**
     * The generic zoom velocity space specifies a zoom factor velocity without knowing the
     *             underlying physical model. The range should be normalized from -1 to 1,
     *             where a positive velocity would map to TELE direction. A generic zoom velocity space
     *             description resembles the following.
     * 
     */
    @XmlElement(name = "ContinuousZoomVelocitySpace")
    protected List<Space1DDescription> continuousZoomVelocitySpace;
    /**
     * The speed space specifies the speed for a Pan/Tilt movement when moving to an absolute
     *             position or to a relative translation.
     *             In contrast to the velocity spaces, speed spaces do not contain any directional
     *             information. The speed of a combined Pan/Tilt
     *             movement is represented by a single non-negative scalar value.
     * 
     */
    @XmlElement(name = "PanTiltSpeedSpace")
    protected List<Space1DDescription> panTiltSpeedSpace;
    /**
     * The speed space specifies the speed for a Zoom movement when moving to an absolute
     *             position or to a relative translation.
     *             In contrast to the velocity spaces, speed spaces do not contain any directional
     *             information.
     * 
     */
    @XmlElement(name = "ZoomSpeedSpace")
    protected List<Space1DDescription> zoomSpeedSpace;
    @XmlElement(name = "Extension")
    protected PTZSpacesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The Generic Pan/Tilt Position space is provided by every PTZ node that supports absolute
     *             Pan/Tilt, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full range of the PTZ unit normalized to the
     *             range -1 to 1 resulting in the following space description.
     * 
     * Gets the value of the absolutePanTiltPositionSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absolutePanTiltPositionSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbsolutePanTiltPositionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the absolutePanTiltPositionSpace property.
     */
    public List<Space2DDescription> getAbsolutePanTiltPositionSpace() {
        if (absolutePanTiltPositionSpace == null) {
            absolutePanTiltPositionSpace = new ArrayList<>();
        }
        return this.absolutePanTiltPositionSpace;
    }

    /**
     * The Generic Zoom Position Space is provided by every PTZ node that supports absolute
     *             Zoom, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full range of the Zoom normalized to the
     *             range 0 (wide) to 1 (tele).
     *             There is no assumption about how the generic zoom range is mapped to magnification, FOV
     *             or other physical zoom dimension.
     * 
     * Gets the value of the absoluteZoomPositionSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absoluteZoomPositionSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbsoluteZoomPositionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the absoluteZoomPositionSpace property.
     */
    public List<Space1DDescription> getAbsoluteZoomPositionSpace() {
        if (absoluteZoomPositionSpace == null) {
            absoluteZoomPositionSpace = new ArrayList<>();
        }
        return this.absoluteZoomPositionSpace;
    }

    /**
     * The Generic Pan/Tilt translation space is provided by every PTZ node that supports
     *             relative Pan/Tilt, since it does not relate to a specific physical range.
     *             Instead, the range should be defined as the full positive and negative translation range
     *             of the PTZ unit normalized to the range -1 to 1,
     *             where positive translation would mean clockwise rotation or movement in right/up
     *             direction resulting in the following space description.
     * 
     * Gets the value of the relativePanTiltTranslationSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativePanTiltTranslationSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelativePanTiltTranslationSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the relativePanTiltTranslationSpace property.
     */
    public List<Space2DDescription> getRelativePanTiltTranslationSpace() {
        if (relativePanTiltTranslationSpace == null) {
            relativePanTiltTranslationSpace = new ArrayList<>();
        }
        return this.relativePanTiltTranslationSpace;
    }

    /**
     * The Generic Zoom Translation Space is provided by every PTZ node that supports relative
     *             Zoom, since it does not relate to a specific physical range.
     *             Instead, the corresponding absolute range should be defined as the full positive and
     *             negative translation range of the Zoom normalized to the range -1 to1,
     *             where a positive translation maps to a movement in TELE direction. The translation is
     *             signed to indicate direction (negative is to wide, positive is to tele).
     *             There is no assumption about how the generic zoom range is mapped to magnification, FOV
     *             or other physical zoom dimension. This results in the following space description.
     * 
     * Gets the value of the relativeZoomTranslationSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeZoomTranslationSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelativeZoomTranslationSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the relativeZoomTranslationSpace property.
     */
    public List<Space1DDescription> getRelativeZoomTranslationSpace() {
        if (relativeZoomTranslationSpace == null) {
            relativeZoomTranslationSpace = new ArrayList<>();
        }
        return this.relativeZoomTranslationSpace;
    }

    /**
     * The generic Pan/Tilt velocity space shall be provided by every PTZ node, since it does
     *             not relate to a specific physical range.
     *             Instead, the range should be defined as a range of the PTZ unit’s speed normalized to
     *             the range -1 to 1, where a positive velocity would map to clockwise
     *             rotation or movement in the right/up direction. A signed speed can be independently
     *             specified for the pan and tilt component resulting in the following space description.
     * 
     * Gets the value of the continuousPanTiltVelocitySpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuousPanTiltVelocitySpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContinuousPanTiltVelocitySpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the continuousPanTiltVelocitySpace property.
     */
    public List<Space2DDescription> getContinuousPanTiltVelocitySpace() {
        if (continuousPanTiltVelocitySpace == null) {
            continuousPanTiltVelocitySpace = new ArrayList<>();
        }
        return this.continuousPanTiltVelocitySpace;
    }

    /**
     * The generic zoom velocity space specifies a zoom factor velocity without knowing the
     *             underlying physical model. The range should be normalized from -1 to 1,
     *             where a positive velocity would map to TELE direction. A generic zoom velocity space
     *             description resembles the following.
     * 
     * Gets the value of the continuousZoomVelocitySpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuousZoomVelocitySpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContinuousZoomVelocitySpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the continuousZoomVelocitySpace property.
     */
    public List<Space1DDescription> getContinuousZoomVelocitySpace() {
        if (continuousZoomVelocitySpace == null) {
            continuousZoomVelocitySpace = new ArrayList<>();
        }
        return this.continuousZoomVelocitySpace;
    }

    /**
     * The speed space specifies the speed for a Pan/Tilt movement when moving to an absolute
     *             position or to a relative translation.
     *             In contrast to the velocity spaces, speed spaces do not contain any directional
     *             information. The speed of a combined Pan/Tilt
     *             movement is represented by a single non-negative scalar value.
     * 
     * Gets the value of the panTiltSpeedSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panTiltSpeedSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPanTiltSpeedSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the panTiltSpeedSpace property.
     */
    public List<Space1DDescription> getPanTiltSpeedSpace() {
        if (panTiltSpeedSpace == null) {
            panTiltSpeedSpace = new ArrayList<>();
        }
        return this.panTiltSpeedSpace;
    }

    /**
     * The speed space specifies the speed for a Zoom movement when moving to an absolute
     *             position or to a relative translation.
     *             In contrast to the velocity spaces, speed spaces do not contain any directional
     *             information.
     * 
     * Gets the value of the zoomSpeedSpace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoomSpeedSpace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZoomSpeedSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the zoomSpeedSpace property.
     */
    public List<Space1DDescription> getZoomSpeedSpace() {
        if (zoomSpeedSpace == null) {
            zoomSpeedSpace = new ArrayList<>();
        }
        return this.zoomSpeedSpace;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public PTZSpacesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public void setExtension(PTZSpacesExtension value) {
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
