
package org.onvif.ver20.ptz.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.PTZSpeed;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Velocity" type="{http://www.onvif.org/ver10/schema}PTZSpeed"/&gt;
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileToken",
    "velocity",
    "timeout"
})
@XmlRootElement(name = "ContinuousMove")
public class ContinuousMove {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    @XmlElement(name = "Velocity", required = true)
    protected PTZSpeed velocity;
    @XmlElement(name = "Timeout")
    protected Duration timeout;

    /**
     * 获取profileToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * 设置profileToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * 获取velocity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getVelocity() {
        return velocity;
    }

    /**
     * 设置velocity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setVelocity(PTZSpeed value) {
        this.velocity = value;
    }

    /**
     * 获取timeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * 设置timeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
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
