
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="NodeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="DefaultAbsolutePantTiltPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultAbsoluteZoomPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultRelativePanTiltTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultRelativeZoomTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultContinuousPanTiltVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultContinuousZoomVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="DefaultPTZSpeed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="DefaultPTZTimeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="PanTiltLimits" type="{http://www.onvif.org/ver10/schema}PanTiltLimits" minOccurs="0"/>
 *         <element name="ZoomLimits" type="{http://www.onvif.org/ver10/schema}ZoomLimits" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MoveRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="PresetRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="PresetTourRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfiguration", propOrder = {
    "nodeToken",
    "defaultAbsolutePantTiltPositionSpace",
    "defaultAbsoluteZoomPositionSpace",
    "defaultRelativePanTiltTranslationSpace",
    "defaultRelativeZoomTranslationSpace",
    "defaultContinuousPanTiltVelocitySpace",
    "defaultContinuousZoomVelocitySpace",
    "defaultPTZSpeed",
    "defaultPTZTimeout",
    "panTiltLimits",
    "zoomLimits",
    "extension"
})
public class PTZConfiguration
    extends ConfigurationEntity
{

    /**
     * A mandatory reference to the PTZ Node that the PTZ Configuration belongs to.
     * 
     */
    @XmlElement(name = "NodeToken", required = true)
    protected String nodeToken;
    /**
     * If the PTZ Node supports absolute Pan/Tilt movements, it shall specify one Absolute
     *                 Pan/Tilt Position Space as default.
     * 
     */
    @XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsolutePantTiltPositionSpace;
    /**
     * If the PTZ Node supports absolute zoom movements, it shall specify one Absolute Zoom
     *                 Position Space as default.
     * 
     */
    @XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsoluteZoomPositionSpace;
    /**
     * If the PTZ Node supports relative Pan/Tilt movements, it shall specify one
     *                 RelativePan/Tilt Translation Space as default.
     * 
     */
    @XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativePanTiltTranslationSpace;
    /**
     * If the PTZ Node supports relative zoom movements, it shall specify one Relative Zoom
     *                 Translation Space as default.
     * 
     */
    @XmlElement(name = "DefaultRelativeZoomTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativeZoomTranslationSpace;
    /**
     * If the PTZ Node supports continuous Pan/Tilt movements, it shall specify one
     *                 Continuous Pan/Tilt Velocity Space as default.
     * 
     */
    @XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousPanTiltVelocitySpace;
    /**
     * If the PTZ Node supports continuous zoom movements, it shall specify one Continuous
     *                 Zoom Velocity Space as default.
     * 
     */
    @XmlElement(name = "DefaultContinuousZoomVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousZoomVelocitySpace;
    /**
     * If the PTZ Node supports absolute or relative PTZ movements, it shall specify
     *                 corresponding default Pan/Tilt and Zoom speeds.
     * 
     */
    @XmlElement(name = "DefaultPTZSpeed")
    protected PTZSpeed defaultPTZSpeed;
    /**
     * If the PTZ Node supports continuous movements, it shall specify a default timeout,
     *                 after which the movement stops.
     * 
     */
    @XmlElement(name = "DefaultPTZTimeout")
    protected Duration defaultPTZTimeout;
    /**
     * The Pan/Tilt limits element should be present for a PTZ Node that supports an
     *                 absolute Pan/Tilt. If the element is present it signals the support for configurable
     *                 Pan/Tilt limits. If limits are enabled, the Pan/Tilt movements shall always stay
     *                 within the specified range. The Pan/Tilt limits are disabled by setting the limits
     *                 to –INF or +INF.
     * 
     */
    @XmlElement(name = "PanTiltLimits")
    protected PanTiltLimits panTiltLimits;
    /**
     * The Zoom limits element should be present for a PTZ Node that supports absolute
     *                 zoom. If the element is present it signals the supports for configurable Zoom
     *                 limits. If limits are enabled the zoom movements shall always stay within the
     *                 specified range. The Zoom limits are disabled by settings the limits to -INF and
     *                 +INF.
     * 
     */
    @XmlElement(name = "ZoomLimits")
    protected ZoomLimits zoomLimits;
    @XmlElement(name = "Extension")
    protected PTZConfigurationExtension extension;
    /**
     * The optional acceleration ramp used by the device when moving.
     * 
     */
    @XmlAttribute(name = "MoveRamp")
    protected Integer moveRamp;
    /**
     * The optional acceleration ramp used by the device when recalling
     *               presets.
     * 
     */
    @XmlAttribute(name = "PresetRamp")
    protected Integer presetRamp;
    /**
     * The optional acceleration ramp used by the device when executing
     *               PresetTours.
     * 
     */
    @XmlAttribute(name = "PresetTourRamp")
    protected Integer presetTourRamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A mandatory reference to the PTZ Node that the PTZ Configuration belongs to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeToken() {
        return nodeToken;
    }

    /**
     * Sets the value of the nodeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNodeToken()
     */
    public void setNodeToken(String value) {
        this.nodeToken = value;
    }

    /**
     * If the PTZ Node supports absolute Pan/Tilt movements, it shall specify one Absolute
     *                 Pan/Tilt Position Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsolutePantTiltPositionSpace() {
        return defaultAbsolutePantTiltPositionSpace;
    }

    /**
     * Sets the value of the defaultAbsolutePantTiltPositionSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultAbsolutePantTiltPositionSpace()
     */
    public void setDefaultAbsolutePantTiltPositionSpace(String value) {
        this.defaultAbsolutePantTiltPositionSpace = value;
    }

    /**
     * If the PTZ Node supports absolute zoom movements, it shall specify one Absolute Zoom
     *                 Position Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsoluteZoomPositionSpace() {
        return defaultAbsoluteZoomPositionSpace;
    }

    /**
     * Sets the value of the defaultAbsoluteZoomPositionSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultAbsoluteZoomPositionSpace()
     */
    public void setDefaultAbsoluteZoomPositionSpace(String value) {
        this.defaultAbsoluteZoomPositionSpace = value;
    }

    /**
     * If the PTZ Node supports relative Pan/Tilt movements, it shall specify one
     *                 RelativePan/Tilt Translation Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativePanTiltTranslationSpace() {
        return defaultRelativePanTiltTranslationSpace;
    }

    /**
     * Sets the value of the defaultRelativePanTiltTranslationSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultRelativePanTiltTranslationSpace()
     */
    public void setDefaultRelativePanTiltTranslationSpace(String value) {
        this.defaultRelativePanTiltTranslationSpace = value;
    }

    /**
     * If the PTZ Node supports relative zoom movements, it shall specify one Relative Zoom
     *                 Translation Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativeZoomTranslationSpace() {
        return defaultRelativeZoomTranslationSpace;
    }

    /**
     * Sets the value of the defaultRelativeZoomTranslationSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultRelativeZoomTranslationSpace()
     */
    public void setDefaultRelativeZoomTranslationSpace(String value) {
        this.defaultRelativeZoomTranslationSpace = value;
    }

    /**
     * If the PTZ Node supports continuous Pan/Tilt movements, it shall specify one
     *                 Continuous Pan/Tilt Velocity Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousPanTiltVelocitySpace() {
        return defaultContinuousPanTiltVelocitySpace;
    }

    /**
     * Sets the value of the defaultContinuousPanTiltVelocitySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultContinuousPanTiltVelocitySpace()
     */
    public void setDefaultContinuousPanTiltVelocitySpace(String value) {
        this.defaultContinuousPanTiltVelocitySpace = value;
    }

    /**
     * If the PTZ Node supports continuous zoom movements, it shall specify one Continuous
     *                 Zoom Velocity Space as default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousZoomVelocitySpace() {
        return defaultContinuousZoomVelocitySpace;
    }

    /**
     * Sets the value of the defaultContinuousZoomVelocitySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultContinuousZoomVelocitySpace()
     */
    public void setDefaultContinuousZoomVelocitySpace(String value) {
        this.defaultContinuousZoomVelocitySpace = value;
    }

    /**
     * If the PTZ Node supports absolute or relative PTZ movements, it shall specify
     *                 corresponding default Pan/Tilt and Zoom speeds.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getDefaultPTZSpeed() {
        return defaultPTZSpeed;
    }

    /**
     * Sets the value of the defaultPTZSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     * @see #getDefaultPTZSpeed()
     */
    public void setDefaultPTZSpeed(PTZSpeed value) {
        this.defaultPTZSpeed = value;
    }

    /**
     * If the PTZ Node supports continuous movements, it shall specify a default timeout,
     *                 after which the movement stops.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultPTZTimeout() {
        return defaultPTZTimeout;
    }

    /**
     * Sets the value of the defaultPTZTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getDefaultPTZTimeout()
     */
    public void setDefaultPTZTimeout(Duration value) {
        this.defaultPTZTimeout = value;
    }

    /**
     * The Pan/Tilt limits element should be present for a PTZ Node that supports an
     *                 absolute Pan/Tilt. If the element is present it signals the support for configurable
     *                 Pan/Tilt limits. If limits are enabled, the Pan/Tilt movements shall always stay
     *                 within the specified range. The Pan/Tilt limits are disabled by setting the limits
     *                 to –INF or +INF.
     * 
     * @return
     *     possible object is
     *     {@link PanTiltLimits }
     *     
     */
    public PanTiltLimits getPanTiltLimits() {
        return panTiltLimits;
    }

    /**
     * Sets the value of the panTiltLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanTiltLimits }
     *     
     * @see #getPanTiltLimits()
     */
    public void setPanTiltLimits(PanTiltLimits value) {
        this.panTiltLimits = value;
    }

    /**
     * The Zoom limits element should be present for a PTZ Node that supports absolute
     *                 zoom. If the element is present it signals the supports for configurable Zoom
     *                 limits. If limits are enabled the zoom movements shall always stay within the
     *                 specified range. The Zoom limits are disabled by settings the limits to -INF and
     *                 +INF.
     * 
     * @return
     *     possible object is
     *     {@link ZoomLimits }
     *     
     */
    public ZoomLimits getZoomLimits() {
        return zoomLimits;
    }

    /**
     * Sets the value of the zoomLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomLimits }
     *     
     * @see #getZoomLimits()
     */
    public void setZoomLimits(ZoomLimits value) {
        this.zoomLimits = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public PTZConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public void setExtension(PTZConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * The optional acceleration ramp used by the device when moving.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoveRamp() {
        return moveRamp;
    }

    /**
     * Sets the value of the moveRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMoveRamp()
     */
    public void setMoveRamp(Integer value) {
        this.moveRamp = value;
    }

    /**
     * The optional acceleration ramp used by the device when recalling
     *               presets.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetRamp() {
        return presetRamp;
    }

    /**
     * Sets the value of the presetRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPresetRamp()
     */
    public void setPresetRamp(Integer value) {
        this.presetRamp = value;
    }

    /**
     * The optional acceleration ramp used by the device when executing
     *               PresetTours.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetTourRamp() {
        return presetTourRamp;
    }

    /**
     * Sets the value of the presetTourRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPresetTourRamp()
     */
    public void setPresetTourRamp(Integer value) {
        this.presetTourRamp = value;
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
