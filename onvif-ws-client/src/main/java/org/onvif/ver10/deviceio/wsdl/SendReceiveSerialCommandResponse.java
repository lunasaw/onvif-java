
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element name="SerialData" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialData" minOccurs="0"/&gt;
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
    "serialData"
})
@XmlRootElement(name = "SendReceiveSerialCommandResponse")
public class SendReceiveSerialCommandResponse {

    @XmlElement(name = "SerialData")
    protected SerialData serialData;

    /**
     * 获取serialData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SerialData }
     *     
     */
    public SerialData getSerialData() {
        return serialData;
    }

    /**
     * 设置serialData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SerialData }
     *     
     */
    public void setSerialData(SerialData value) {
        this.serialData = value;
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
