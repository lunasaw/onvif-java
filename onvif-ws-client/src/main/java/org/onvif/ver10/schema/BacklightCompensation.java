
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>BacklightCompensation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BacklightCompensation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}BacklightCompensationMode"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BacklightCompensation", propOrder = {
    "mode",
    "level"
})
public class BacklightCompensation {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected BacklightCompensationMode mode;
    @XmlElement(name = "Level")
    protected float level;

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationMode }
     *     
     */
    public BacklightCompensationMode getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationMode }
     *     
     */
    public void setMode(BacklightCompensationMode value) {
        this.mode = value;
    }

    /**
     * 获取level属性的值。
     * 
     */
    public float getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     */
    public void setLevel(float value) {
        this.level = value;
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
