
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;ExposureOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExposureOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *         &amp;lt;element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions", propOrder = {
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
public class ExposureOptions {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExposureMode> mode;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExposurePriority> priority;
    @XmlElement(name = "MinExposureTime", required = true)
    protected FloatRange minExposureTime;
    @XmlElement(name = "MaxExposureTime", required = true)
    protected FloatRange maxExposureTime;
    @XmlElement(name = "MinGain", required = true)
    protected FloatRange minGain;
    @XmlElement(name = "MaxGain", required = true)
    protected FloatRange maxGain;
    @XmlElement(name = "MinIris", required = true)
    protected FloatRange minIris;
    @XmlElement(name = "MaxIris", required = true)
    protected FloatRange maxIris;
    @XmlElement(name = "ExposureTime", required = true)
    protected FloatRange exposureTime;
    @XmlElement(name = "Gain", required = true)
    protected FloatRange gain;
    @XmlElement(name = "Iris", required = true)
    protected FloatRange iris;

    /**
     * Gets the value of the mode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the mode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureMode }
     * 
     * 
     */
    public List<ExposureMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<ExposureMode>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the priority property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the priority property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPriority().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ExposurePriority }
     * 
     * 
     */
    public List<ExposurePriority> getPriority() {
        if (priority == null) {
            priority = new ArrayList<ExposurePriority>();
        }
        return this.priority;
    }

    /**
     * 获取minExposureTime属性的值。
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
     * 设置minExposureTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinExposureTime(FloatRange value) {
        this.minExposureTime = value;
    }

    /**
     * 获取maxExposureTime属性的值。
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
     * 设置maxExposureTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxExposureTime(FloatRange value) {
        this.maxExposureTime = value;
    }

    /**
     * 获取minGain属性的值。
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
     * 设置minGain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinGain(FloatRange value) {
        this.minGain = value;
    }

    /**
     * 获取maxGain属性的值。
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
     * 设置maxGain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxGain(FloatRange value) {
        this.maxGain = value;
    }

    /**
     * 获取minIris属性的值。
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
     * 设置minIris属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinIris(FloatRange value) {
        this.minIris = value;
    }

    /**
     * 获取maxIris属性的值。
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
     * 设置maxIris属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxIris(FloatRange value) {
        this.maxIris = value;
    }

    /**
     * 获取exposureTime属性的值。
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
     * 设置exposureTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setExposureTime(FloatRange value) {
        this.exposureTime = value;
    }

    /**
     * 获取gain属性的值。
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
     * 设置gain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setGain(FloatRange value) {
        this.gain = value;
    }

    /**
     * 获取iris属性的值。
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
     * 设置iris属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setIris(FloatRange value) {
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
