
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImagingSettingsExtension203 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImagingSettingsExtension203">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ToneCompensation" type="{http://www.onvif.org/ver10/schema}ToneCompensation" minOccurs="0"/>
 *         <element name="Defogging" type="{http://www.onvif.org/ver10/schema}Defogging" minOccurs="0"/>
 *         <element name="NoiseReduction" type="{http://www.onvif.org/ver10/schema}NoiseReduction" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension204" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension203", propOrder = {
    "toneCompensation",
    "defogging",
    "noiseReduction",
    "extension"
})
public class ImagingSettingsExtension203 {

    /**
     * Optional element to configure Image Contrast Compensation.
     * 
     */
    @XmlElement(name = "ToneCompensation")
    protected ToneCompensation toneCompensation;
    /**
     * Optional element to configure Image Defogging.
     * 
     */
    @XmlElement(name = "Defogging")
    protected Defogging defogging;
    /**
     * Optional element to configure Image Noise Reduction.
     * 
     */
    @XmlElement(name = "NoiseReduction")
    protected NoiseReduction noiseReduction;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension204 extension;

    /**
     * Optional element to configure Image Contrast Compensation.
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensation }
     *     
     */
    public ToneCompensation getToneCompensation() {
        return toneCompensation;
    }

    /**
     * Sets the value of the toneCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensation }
     *     
     * @see #getToneCompensation()
     */
    public void setToneCompensation(ToneCompensation value) {
        this.toneCompensation = value;
    }

    /**
     * Optional element to configure Image Defogging.
     * 
     * @return
     *     possible object is
     *     {@link Defogging }
     *     
     */
    public Defogging getDefogging() {
        return defogging;
    }

    /**
     * Sets the value of the defogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Defogging }
     *     
     * @see #getDefogging()
     */
    public void setDefogging(Defogging value) {
        this.defogging = value;
    }

    /**
     * Optional element to configure Image Noise Reduction.
     * 
     * @return
     *     possible object is
     *     {@link NoiseReduction }
     *     
     */
    public NoiseReduction getNoiseReduction() {
        return noiseReduction;
    }

    /**
     * Sets the value of the noiseReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReduction }
     *     
     * @see #getNoiseReduction()
     */
    public void setNoiseReduction(NoiseReduction value) {
        this.noiseReduction = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public ImagingSettingsExtension204 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public void setExtension(ImagingSettingsExtension204 value) {
        this.extension = value;
    }

}
