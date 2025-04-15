
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;ImagingOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ImagingOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions"/&amp;gt;
 *         &amp;lt;element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions"/&amp;gt;
 *         &amp;lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions"/&amp;gt;
 *         &amp;lt;element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions"/&amp;gt;
 *         &amp;lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions", propOrder = {
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
    "any"
})
public class ImagingOptions {

    @XmlElement(name = "BacklightCompensation", required = true)
    protected BacklightCompensationOptions backlightCompensation;
    @XmlElement(name = "Brightness", required = true)
    protected FloatRange brightness;
    @XmlElement(name = "ColorSaturation", required = true)
    protected FloatRange colorSaturation;
    @XmlElement(name = "Contrast", required = true)
    protected FloatRange contrast;
    @XmlElement(name = "Exposure", required = true)
    protected ExposureOptions exposure;
    @XmlElement(name = "Focus", required = true)
    protected FocusOptions focus;
    @XmlElement(name = "IrCutFilterModes", required = true)
    @XmlSchemaType(name = "string")
    protected List<IrCutFilterMode> irCutFilterModes;
    @XmlElement(name = "Sharpness", required = true)
    protected FloatRange sharpness;
    @XmlElement(name = "WideDynamicRange", required = true)
    protected WideDynamicRangeOptions wideDynamicRange;
    @XmlElement(name = "WhiteBalance", required = true)
    protected WhiteBalanceOptions whiteBalance;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取backlightCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public BacklightCompensationOptions getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * 设置backlightCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public void setBacklightCompensation(BacklightCompensationOptions value) {
        this.backlightCompensation = value;
    }

    /**
     * 获取brightness属性的值。
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
     * 设置brightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    /**
     * 获取colorSaturation属性的值。
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
     * 设置colorSaturation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    /**
     * 获取contrast属性的值。
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
     * 设置contrast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    /**
     * 获取exposure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExposureOptions }
     *     
     */
    public ExposureOptions getExposure() {
        return exposure;
    }

    /**
     * 设置exposure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureOptions }
     *     
     */
    public void setExposure(ExposureOptions value) {
        this.exposure = value;
    }

    /**
     * 获取focus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions }
     *     
     */
    public FocusOptions getFocus() {
        return focus;
    }

    /**
     * 设置focus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions }
     *     
     */
    public void setFocus(FocusOptions value) {
        this.focus = value;
    }

    /**
     * Gets the value of the irCutFilterModes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the irCutFilterModes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIrCutFilterModes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link IrCutFilterMode }
     * 
     * 
     */
    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<IrCutFilterMode>();
        }
        return this.irCutFilterModes;
    }

    /**
     * 获取sharpness属性的值。
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
     * 设置sharpness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    /**
     * 获取wideDynamicRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public WideDynamicRangeOptions getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * 设置wideDynamicRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public void setWideDynamicRange(WideDynamicRangeOptions value) {
        this.wideDynamicRange = value;
    }

    /**
     * 获取whiteBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public WhiteBalanceOptions getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * 设置whiteBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public void setWhiteBalance(WhiteBalanceOptions value) {
        this.whiteBalance = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
