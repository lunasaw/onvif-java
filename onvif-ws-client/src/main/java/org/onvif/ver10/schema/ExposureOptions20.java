
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureOptions20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExposureOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions20", propOrder = {
    "mode",
    "priority",
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
public class ExposureOptions20 {

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
    protected List<ExposureMode> mode;
    /**
     * The exposure priority mode (low noise/framerate).
     * 
     */
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected List<ExposurePriority> priority;
    /**
     * Valid range of the Minimum ExposureTime.
     * 
     */
    @XmlElement(name = "MinExposureTime")
    protected FloatRange minExposureTime;
    /**
     * Valid range of the Maximum ExposureTime.
     * 
     */
    @XmlElement(name = "MaxExposureTime")
    protected FloatRange maxExposureTime;
    /**
     * Valid range of the Minimum Gain.
     * 
     */
    @XmlElement(name = "MinGain")
    protected FloatRange minGain;
    /**
     * Valid range of the Maximum Gain.
     * 
     */
    @XmlElement(name = "MaxGain")
    protected FloatRange maxGain;
    /**
     * Valid range of the Minimum Iris.
     * 
     */
    @XmlElement(name = "MinIris")
    protected FloatRange minIris;
    /**
     * Valid range of the Maximum Iris.
     * 
     */
    @XmlElement(name = "MaxIris")
    protected FloatRange maxIris;
    /**
     * Valid range of the ExposureTime.
     * 
     */
    @XmlElement(name = "ExposureTime")
    protected FloatRange exposureTime;
    /**
     * Valid range of the Gain.
     * 
     */
    @XmlElement(name = "Gain")
    protected FloatRange gain;
    /**
     * Valid range of the Iris.
     * 
     */
    @XmlElement(name = "Iris")
    protected FloatRange iris;

    /**
     * Exposure Mode
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Auto – Enabled the exposure algorithm on the device.&lt;/li&gt;&lt;li&gt;Manual – Disabled exposure algorithm on the device.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * Gets the value of the mode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the mode property.
     */
    public List<ExposureMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<>();
        }
        return this.mode;
    }

    /**
     * The exposure priority mode (low noise/framerate).
     * 
     * Gets the value of the priority property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priority property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposurePriority }
     * </p>
     * 
     * 
     * @return
     *     The value of the priority property.
     */
    public List<ExposurePriority> getPriority() {
        if (priority == null) {
            priority = new ArrayList<>();
        }
        return this.priority;
    }

    /**
     * Valid range of the Minimum ExposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMinExposureTime()
     */
    public void setMinExposureTime(FloatRange value) {
        this.minExposureTime = value;
    }

    /**
     * Valid range of the Maximum ExposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMaxExposureTime()
     */
    public void setMaxExposureTime(FloatRange value) {
        this.maxExposureTime = value;
    }

    /**
     * Valid range of the Minimum Gain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMinGain()
     */
    public void setMinGain(FloatRange value) {
        this.minGain = value;
    }

    /**
     * Valid range of the Maximum Gain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMaxGain()
     */
    public void setMaxGain(FloatRange value) {
        this.maxGain = value;
    }

    /**
     * Valid range of the Minimum Iris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMinIris()
     */
    public void setMinIris(FloatRange value) {
        this.minIris = value;
    }

    /**
     * Valid range of the Maximum Iris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getMaxIris()
     */
    public void setMaxIris(FloatRange value) {
        this.maxIris = value;
    }

    /**
     * Valid range of the ExposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getExposureTime()
     */
    public void setExposureTime(FloatRange value) {
        this.exposureTime = value;
    }

    /**
     * Valid range of the Gain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getGain()
     */
    public void setGain(FloatRange value) {
        this.gain = value;
    }

    /**
     * Valid range of the Iris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getIris()
     */
    public void setIris(FloatRange value) {
        this.iris = value;
    }

}
