
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
 * <p>Java class for ImagingSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImagingSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensation" minOccurs="0"/>
 *         <element name="Brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ColorSaturation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Contrast" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Exposure" type="{http://www.onvif.org/ver10/schema}Exposure" minOccurs="0"/>
 *         <element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusConfiguration" minOccurs="0"/>
 *         <element name="IrCutFilter" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" minOccurs="0"/>
 *         <element name="Sharpness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRange" minOccurs="0"/>
 *         <element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalance" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension" minOccurs="0"/>
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
@XmlType(name = "ImagingSettings", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilter",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "extension"
})
public class ImagingSettings {

    /**
     * Enabled/disabled BLC mode (on/off).
     * 
     */
    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensation backlightCompensation;
    /**
     * Image brightness (unit unspecified).
     * 
     */
    @XmlElement(name = "Brightness")
    protected Float brightness;
    /**
     * Color saturation of the image (unit unspecified).
     * 
     */
    @XmlElement(name = "ColorSaturation")
    protected Float colorSaturation;
    /**
     * Contrast of the image (unit unspecified).
     * 
     */
    @XmlElement(name = "Contrast")
    protected Float contrast;
    /**
     * Exposure mode of the device.
     * 
     */
    @XmlElement(name = "Exposure")
    protected Exposure exposure;
    /**
     * Focus configuration.
     * 
     */
    @XmlElement(name = "Focus")
    protected FocusConfiguration focus;
    /**
     * Infrared Cutoff Filter settings.
     * 
     */
    @XmlElement(name = "IrCutFilter")
    @XmlSchemaType(name = "string")
    protected IrCutFilterMode irCutFilter;
    /**
     * Sharpness of the Video image.
     * 
     */
    @XmlElement(name = "Sharpness")
    protected Float sharpness;
    /**
     * WDR settings.
     * 
     */
    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRange wideDynamicRange;
    /**
     * White balance settings.
     * 
     */
    @XmlElement(name = "WhiteBalance")
    protected WhiteBalance whiteBalance;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Enabled/disabled BLC mode (on/off).
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensation }
     *     
     */
    public BacklightCompensation getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * Sets the value of the backlightCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensation }
     *     
     * @see #getBacklightCompensation()
     */
    public void setBacklightCompensation(BacklightCompensation value) {
        this.backlightCompensation = value;
    }

    /**
     * Image brightness (unit unspecified).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getBrightness()
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * Color saturation of the image (unit unspecified).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getColorSaturation() {
        return colorSaturation;
    }

    /**
     * Sets the value of the colorSaturation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getColorSaturation()
     */
    public void setColorSaturation(Float value) {
        this.colorSaturation = value;
    }

    /**
     * Contrast of the image (unit unspecified).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getContrast()
     */
    public void setContrast(Float value) {
        this.contrast = value;
    }

    /**
     * Exposure mode of the device.
     * 
     * @return
     *     possible object is
     *     {@link Exposure }
     *     
     */
    public Exposure getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exposure }
     *     
     * @see #getExposure()
     */
    public void setExposure(Exposure value) {
        this.exposure = value;
    }

    /**
     * Focus configuration.
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration }
     *     
     */
    public FocusConfiguration getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration }
     *     
     * @see #getFocus()
     */
    public void setFocus(FocusConfiguration value) {
        this.focus = value;
    }

    /**
     * Infrared Cutoff Filter settings.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterMode }
     *     
     */
    public IrCutFilterMode getIrCutFilter() {
        return irCutFilter;
    }

    /**
     * Sets the value of the irCutFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterMode }
     *     
     * @see #getIrCutFilter()
     */
    public void setIrCutFilter(IrCutFilterMode value) {
        this.irCutFilter = value;
    }

    /**
     * Sharpness of the Video image.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSharpness() {
        return sharpness;
    }

    /**
     * Sets the value of the sharpness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getSharpness()
     */
    public void setSharpness(Float value) {
        this.sharpness = value;
    }

    /**
     * WDR settings.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRange }
     *     
     */
    public WideDynamicRange getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * Sets the value of the wideDynamicRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRange }
     *     
     * @see #getWideDynamicRange()
     */
    public void setWideDynamicRange(WideDynamicRange value) {
        this.wideDynamicRange = value;
    }

    /**
     * White balance settings.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance }
     *     
     */
    public WhiteBalance getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Sets the value of the whiteBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance }
     *     
     * @see #getWhiteBalance()
     */
    public void setWhiteBalance(WhiteBalance value) {
        this.whiteBalance = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension }
     *     
     */
    public ImagingSettingsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension }
     *     
     */
    public void setExtension(ImagingSettingsExtension value) {
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
