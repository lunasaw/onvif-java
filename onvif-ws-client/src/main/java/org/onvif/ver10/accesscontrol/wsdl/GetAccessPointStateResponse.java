
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         &lt;element name="AccessPointState" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointState"/&gt;
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
    "accessPointState"
})
@XmlRootElement(name = "GetAccessPointStateResponse")
public class GetAccessPointStateResponse {

    @XmlElement(name = "AccessPointState", required = true)
    protected AccessPointState accessPointState;

    /**
     * 获取accessPointState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessPointState }
     *     
     */
    public AccessPointState getAccessPointState() {
        return accessPointState;
    }

    /**
     * 设置accessPointState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointState }
     *     
     */
    public void setAccessPointState(AccessPointState value) {
        this.accessPointState = value;
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
