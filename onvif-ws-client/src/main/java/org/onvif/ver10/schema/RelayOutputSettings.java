
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;RelayOutputSettings complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelayOutputSettings"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}RelayMode"/&amp;gt;
 *         &amp;lt;element name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}duration"/&amp;gt;
 *         &amp;lt;element name="IdleState" type="{http://www.onvif.org/ver10/schema}RelayIdleState"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayOutputSettings", propOrder = {
    "mode",
    "delayTime",
    "idleState"
})
public class RelayOutputSettings {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected RelayMode mode;
    @XmlElement(name = "DelayTime", required = true)
    protected Duration delayTime;
    @XmlElement(name = "IdleState", required = true)
    @XmlSchemaType(name = "string")
    protected RelayIdleState idleState;

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelayMode }
     *     
     */
    public RelayMode getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelayMode }
     *     
     */
    public void setMode(RelayMode value) {
        this.mode = value;
    }

    /**
     * 获取delayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelayTime() {
        return delayTime;
    }

    /**
     * 设置delayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelayTime(Duration value) {
        this.delayTime = value;
    }

    /**
     * 获取idleState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelayIdleState }
     *     
     */
    public RelayIdleState getIdleState() {
        return idleState;
    }

    /**
     * 设置idleState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelayIdleState }
     *     
     */
    public void setIdleState(RelayIdleState value) {
        this.idleState = value;
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
