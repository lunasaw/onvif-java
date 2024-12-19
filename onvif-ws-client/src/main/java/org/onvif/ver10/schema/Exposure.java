
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exposure complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Exposure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority"/>
 *         <element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle"/>
 *         <element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure", propOrder = {
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
public class Exposure {

    /**
     * Exposure Mode
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Auto – Enabled the exposure algorithm on the NVT.&lt;/li&gt;&lt;li&gt;Manual – Disabled exposure algorithm on the NVT.&lt;/li&gt;&lt;/ul&gt;
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
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    /**
     * Rectangular exposure mask.
     * 
     */
    @XmlElement(name = "Window", required = true)
    protected Rectangle window;
    /**
     * Minimum value of exposure time range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinExposureTime")
    protected float minExposureTime;
    /**
     * Maximum value of exposure time range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxExposureTime")
    protected float maxExposureTime;
    /**
     * Minimum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinGain")
    protected float minGain;
    /**
     * Maximum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxGain")
    protected float maxGain;
    /**
     * Minimum value of the iris range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MinIris")
    protected float minIris;
    /**
     * Maximum value of the iris range allowed to be used by the algorithm.
     * 
     */
    @XmlElement(name = "MaxIris")
    protected float maxIris;
    /**
     * The fixed exposure time used by the image sensor (μs).
     * 
     */
    @XmlElement(name = "ExposureTime")
    protected float exposureTime;
    /**
     * The fixed gain used by the image sensor (dB).
     * 
     */
    @XmlElement(name = "Gain")
    protected float gain;
    /**
     * The fixed attenuation of input light affected by the iris (dB). 0dB maps to a fully
     *             opened iris.
     * 
     */
    @XmlElement(name = "Iris")
    protected float iris;

    /**
     * Exposure Mode
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Auto – Enabled the exposure algorithm on the NVT.&lt;/li&gt;&lt;li&gt;Manual – Disabled exposure algorithm on the NVT.&lt;/li&gt;&lt;/ul&gt;
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
     */
    public float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     */
    public void setMinExposureTime(float value) {
        this.minExposureTime = value;
    }

    /**
     * Maximum value of exposure time range allowed to be used by the algorithm.
     * 
     */
    public float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     */
    public void setMaxExposureTime(float value) {
        this.maxExposureTime = value;
    }

    /**
     * Minimum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    public float getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     */
    public void setMinGain(float value) {
        this.minGain = value;
    }

    /**
     * Maximum value of the sensor gain range that is allowed to be used by the algorithm.
     * 
     */
    public float getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     */
    public void setMaxGain(float value) {
        this.maxGain = value;
    }

    /**
     * Minimum value of the iris range allowed to be used by the algorithm.
     * 
     */
    public float getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     */
    public void setMinIris(float value) {
        this.minIris = value;
    }

    /**
     * Maximum value of the iris range allowed to be used by the algorithm.
     * 
     */
    public float getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     */
    public void setMaxIris(float value) {
        this.maxIris = value;
    }

    /**
     * The fixed exposure time used by the image sensor (μs).
     * 
     */
    public float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     */
    public void setExposureTime(float value) {
        this.exposureTime = value;
    }

    /**
     * The fixed gain used by the image sensor (dB).
     * 
     */
    public float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     */
    public void setGain(float value) {
        this.gain = value;
    }

    /**
     * The fixed attenuation of input light affected by the iris (dB). 0dB maps to a fully
     *             opened iris.
     * 
     */
    public float getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     */
    public void setIris(float value) {
        this.iris = value;
    }

}
