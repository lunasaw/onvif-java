
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.PTZConfigurationOptions;


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
 *         &lt;element name="PTZConfigurationOptions" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions"/&gt;
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
    "ptzConfigurationOptions"
})
@XmlRootElement(name = "GetConfigurationOptionsResponse")
public class GetConfigurationOptionsResponse {

    @XmlElement(name = "PTZConfigurationOptions", required = true)
    protected PTZConfigurationOptions ptzConfigurationOptions;

    /**
     * 获取ptzConfigurationOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationOptions }
     *     
     */
    public PTZConfigurationOptions getPTZConfigurationOptions() {
        return ptzConfigurationOptions;
    }

    /**
     * 设置ptzConfigurationOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationOptions }
     *     
     */
    public void setPTZConfigurationOptions(PTZConfigurationOptions value) {
        this.ptzConfigurationOptions = value;
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
