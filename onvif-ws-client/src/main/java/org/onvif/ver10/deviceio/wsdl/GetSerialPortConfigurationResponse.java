
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;anonymous complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SerialPortConfiguration" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfiguration"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serialPortConfiguration"
})
@XmlRootElement(name = "GetSerialPortConfigurationResponse")
public class GetSerialPortConfigurationResponse {

    @XmlElement(name = "SerialPortConfiguration", required = true)
    protected SerialPortConfiguration serialPortConfiguration;

    /**
     * 获取serialPortConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public SerialPortConfiguration getSerialPortConfiguration() {
        return serialPortConfiguration;
    }

    /**
     * 设置serialPortConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public void setSerialPortConfiguration(SerialPortConfiguration value) {
        this.serialPortConfiguration = value;
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
