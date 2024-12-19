
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImagingOptions20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImagingOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions20" minOccurs="0"/>
 *         <element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions20" minOccurs="0"/>
 *         <element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions20" minOccurs="0"/>
 *         <element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions20" minOccurs="0"/>
 *         <element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions20" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension" minOccurs="0"/>
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
@XmlType(name = "ImagingOptions20", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilterModes",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "extension"
})
public class ImagingOptions20 {

    /**
     * Valid range of Backlight Compensation.
     * 
     */
    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensationOptions20 backlightCompensation;
    /**
     * Valid range of Brightness.
     * 
     */
    @XmlElement(name = "Brightness")
    protected FloatRange brightness;
    /**
     * Valid range of Color Saturation.
     * 
     */
    @XmlElement(name = "ColorSaturation")
    protected FloatRange colorSaturation;
    /**
     * Valid range of Contrast.
     * 
     */
    @XmlElement(name = "Contrast")
    protected FloatRange contrast;
    /**
     * Valid range of Exposure.
     * 
     */
    @XmlElement(name = "Exposure")
    protected ExposureOptions20 exposure;
    /**
     * Valid range of Focus.
     * 
     */
    @XmlElement(name = "Focus")
    protected FocusOptions20 focus;
    /**
     * Valid range of IrCutFilterModes.
     * 
     */
    @XmlElement(name = "IrCutFilterModes")
    @XmlSchemaType(name = "string")
    protected List<IrCutFilterMode> irCutFilterModes;
    /**
     * Valid range of Sharpness.
     * 
     */
    @XmlElement(name = "Sharpness")
    protected FloatRange sharpness;
    /**
     * Valid range of WideDynamicRange.
     * 
     */
    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRangeOptions20 wideDynamicRange;
    /**
     * Valid range of WhiteBalance.
     * 
     */
    @XmlElement(name = "WhiteBalance")
    protected WhiteBalanceOptions20 whiteBalance;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Valid range of Backlight Compensation.
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationOptions20 }
     *     
     */
    public BacklightCompensationOptions20 getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * Sets the value of the backlightCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationOptions20 }
     *     
     * @see #getBacklightCompensation()
     */
    public void setBacklightCompensation(BacklightCompensationOptions20 value) {
        this.backlightCompensation = value;
    }

    /**
     * Valid range of Brightness.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getBrightness()
     */
    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    /**
     * Valid range of Color Saturation.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getColorSaturation() {
        return colorSaturation;
    }

    /**
     * Sets the value of the colorSaturation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getColorSaturation()
     */
    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    /**
     * Valid range of Contrast.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getContrast()
     */
    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    /**
     * Valid range of Exposure.
     * 
     * @return
     *     possible object is
     *     {@link ExposureOptions20 }
     *     
     */
    public ExposureOptions20 getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureOptions20 }
     *     
     * @see #getExposure()
     */
    public void setExposure(ExposureOptions20 value) {
        this.exposure = value;
    }

    /**
     * Valid range of Focus.
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions20 }
     *     
     */
    public FocusOptions20 getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions20 }
     *     
     * @see #getFocus()
     */
    public void setFocus(FocusOptions20 value) {
        this.focus = value;
    }

    /**
     * Valid range of IrCutFilterModes.
     * 
     * Gets the value of the irCutFilterModes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irCutFilterModes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIrCutFilterModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrCutFilterMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the irCutFilterModes property.
     */
    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<>();
        }
        return this.irCutFilterModes;
    }

    /**
     * Valid range of Sharpness.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getSharpness() {
        return sharpness;
    }

    /**
     * Sets the value of the sharpness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getSharpness()
     */
    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    /**
     * Valid range of WideDynamicRange.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRangeOptions20 }
     *     
     */
    public WideDynamicRangeOptions20 getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * Sets the value of the wideDynamicRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRangeOptions20 }
     *     
     * @see #getWideDynamicRange()
     */
    public void setWideDynamicRange(WideDynamicRangeOptions20 value) {
        this.wideDynamicRange = value;
    }

    /**
     * Valid range of WhiteBalance.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceOptions20 }
     *     
     */
    public WhiteBalanceOptions20 getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Sets the value of the whiteBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceOptions20 }
     *     
     * @see #getWhiteBalance()
     */
    public void setWhiteBalance(WhiteBalanceOptions20 value) {
        this.whiteBalance = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension }
     *     
     */
    public ImagingOptions20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension }
     *     
     */
    public void setExtension(ImagingOptions20Extension value) {
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
