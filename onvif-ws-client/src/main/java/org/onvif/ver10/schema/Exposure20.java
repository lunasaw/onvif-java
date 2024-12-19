
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type describing the exposure settings.
 * 
 * <p>Java class for Exposure20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Exposure20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" minOccurs="0"/>
 *         <element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle" minOccurs="0"/>
 *         <element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure20", propOrder = {
    "mode",
    "priority",
    "window",
    "minExposureTime",
    "maxExposureTime",
    "minGain",
    "maxGain",
    "minIris",
    "maxIris",
    "exposureTime",
    "gain",
    "iris"
})
public class Exposure20 {

    /**
     * Exposure Mode
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Auto – Enabled the exposure algorithm on the device.&lt;/li&gt;&lt;li&gt;Manual – Disabled exposure algorithm on the device.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureMode mode;
    /**
     * The exposure priority mode (low noise/framerate).
     * 
     */
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    /**
     * Rectangular exposure mask.
     * 
     */
    @XmlElement(name = "Window")
    protected Rectangle window;
    /**
     * Minimum value of exposure time range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinExposureTime")
    protected Float minExposureTime;
    /**
     * Maximum value of exposure time range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxExposureTime")
    protected Float maxExposureTime;
    /**
     * Minimum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinGain")
    protected Float minGain;
    /**
     * Maximum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxGain")
    protected Float maxGain;
    /**
     * Minimum value of the iris range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinIris")
    protected Float minIris;
    /**
     * Maximum value of the iris range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxIris")
    protected Float maxIris;
    /**
     * The fixed exposure time used by the image sensor (μs).
     * 
     */
    @XmlElement(name = "ExposureTime")
    protected Float exposureTime;
    /**
     * The fixed gain used by the image sensor (dB).
     * 
     */
    @XmlElement(name = "Gain")
    protected Float gain;
    /**
     * The fixed attenuation of input light affected by the iris (dB). 0dB maps to a fully
     *             opened iris.
     * 
     */
    @XmlElement(name = "Iris")
    protected Float iris;

    /**
     * Exposure Mode
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Auto – Enabled the exposure algorithm on the device.&lt;/li&gt;&lt;li&gt;Manual – Disabled exposure algorithm on the device.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link ExposureMode }
     *     
     */
    public ExposureMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMode }
     *     
     * @see #getMode()
     */
    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    /**
     * The exposure priority mode (low noise/framerate).
     * 
     * @return
     *     possible object is
     *     {@link ExposurePriority }
     *     
     */
    public ExposurePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposurePriority }
     *     
     * @see #getPriority()
     */
    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    /**
     * Rectangular exposure mask.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     * @see #getWindow()
     */
    public void setWindow(Rectangle value) {
        this.window = value;
    }

    /**
     * Minimum value of exposure time range allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMinExposureTime()
     */
    public void setMinExposureTime(Float value) {
        this.minExposureTime = value;
    }

    /**
     * Maximum value of exposure time range allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxExposureTime()
     */
    public void setMaxExposureTime(Float value) {
        this.maxExposureTime = value;
    }

    /**
     * Minimum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMinGain()
     */
    public void setMinGain(Float value) {
        this.minGain = value;
    }

    /**
     * Maximum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxGain()
     */
    public void setMaxGain(Float value) {
        this.maxGain = value;
    }

    /**
     * Minimum value of the iris range allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMinIris()
     */
    public void setMinIris(Float value) {
        this.minIris = value;
    }

    /**
     * Maximum value of the iris range allowed to be used by the algorithm.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxIris()
     */
    public void setMaxIris(Float value) {
        this.maxIris = value;
    }

    /**
     * The fixed exposure time used by the image sensor (μs).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getExposureTime()
     */
    public void setExposureTime(Float value) {
        this.exposureTime = value;
    }

    /**
     * The fixed gain used by the image sensor (dB).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getGain()
     */
    public void setGain(Float value) {
        this.gain = value;
    }

    /**
     * The fixed attenuation of input light affected by the iris (dB). 0dB maps to a fully
     *             opened iris.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getIris()
     */
    public void setIris(Float value) {
        this.iris = value;
    }

}
