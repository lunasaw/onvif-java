
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Exposure complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Exposure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority"/&gt;
 *         &lt;element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureMode mode;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    @XmlElement(name = "Window", required = true)
    protected Rectangle window;
    @XmlElement(name = "MinExposureTime")
    protected float minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected float maxExposureTime;
    @XmlElement(name = "MinGain")
    protected float minGain;
    @XmlElement(name = "MaxGain")
    protected float maxGain;
    @XmlElement(name = "MinIris")
    protected float minIris;
    @XmlElement(name = "MaxIris")
    protected float maxIris;
    @XmlElement(name = "ExposureTime")
    protected float exposureTime;
    @XmlElement(name = "Gain")
    protected float gain;
    @XmlElement(name = "Iris")
    protected float iris;

    /**
     * 获取mode属性的值。
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
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMode }
     *     
     */
    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    /**
     * 获取priority属性的值。
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
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExposurePriority }
     *     
     */
    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    /**
     * 获取window属性的值。
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
     * 设置window属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setWindow(Rectangle value) {
        this.window = value;
    }

    /**
     * 获取minExposureTime属性的值。
     * 
     */
    public float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * 设置minExposureTime属性的值。
     * 
     */
    public void setMinExposureTime(float value) {
        this.minExposureTime = value;
    }

    /**
     * 获取maxExposureTime属性的值。
     * 
     */
    public float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * 设置maxExposureTime属性的值。
     * 
     */
    public void setMaxExposureTime(float value) {
        this.maxExposureTime = value;
    }

    /**
     * 获取minGain属性的值。
     * 
     */
    public float getMinGain() {
        return minGain;
    }

    /**
     * 设置minGain属性的值。
     * 
     */
    public void setMinGain(float value) {
        this.minGain = value;
    }

    /**
     * 获取maxGain属性的值。
     * 
     */
    public float getMaxGain() {
        return maxGain;
    }

    /**
     * 设置maxGain属性的值。
     * 
     */
    public void setMaxGain(float value) {
        this.maxGain = value;
    }

    /**
     * 获取minIris属性的值。
     * 
     */
    public float getMinIris() {
        return minIris;
    }

    /**
     * 设置minIris属性的值。
     * 
     */
    public void setMinIris(float value) {
        this.minIris = value;
    }

    /**
     * 获取maxIris属性的值。
     * 
     */
    public float getMaxIris() {
        return maxIris;
    }

    /**
     * 设置maxIris属性的值。
     * 
     */
    public void setMaxIris(float value) {
        this.maxIris = value;
    }

    /**
     * 获取exposureTime属性的值。
     * 
     */
    public float getExposureTime() {
        return exposureTime;
    }

    /**
     * 设置exposureTime属性的值。
     * 
     */
    public void setExposureTime(float value) {
        this.exposureTime = value;
    }

    /**
     * 获取gain属性的值。
     * 
     */
    public float getGain() {
        return gain;
    }

    /**
     * 设置gain属性的值。
     * 
     */
    public void setGain(float value) {
        this.gain = value;
    }

    /**
     * 获取iris属性的值。
     * 
     */
    public float getIris() {
        return iris;
    }

    /**
     * 设置iris属性的值。
     * 
     */
    public void setIris(float value) {
        this.iris = value;
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
