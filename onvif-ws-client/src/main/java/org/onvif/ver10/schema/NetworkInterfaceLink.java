
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;NetworkInterfaceLink complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NetworkInterfaceLink"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AdminSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/&amp;gt;
 *         &amp;lt;element name="OperSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/&amp;gt;
 *         &amp;lt;element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceLink", propOrder = {
    "adminSettings",
    "operSettings",
    "interfaceType"
})
public class NetworkInterfaceLink {

    @XmlElement(name = "AdminSettings", required = true)
    protected NetworkInterfaceConnectionSetting adminSettings;
    @XmlElement(name = "OperSettings", required = true)
    protected NetworkInterfaceConnectionSetting operSettings;
    @XmlElement(name = "InterfaceType")
    protected int interfaceType;

    /**
     * 获取adminSettings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getAdminSettings() {
        return adminSettings;
    }

    /**
     * 设置adminSettings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
        this.adminSettings = value;
    }

    /**
     * 获取operSettings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getOperSettings() {
        return operSettings;
    }

    /**
     * 设置operSettings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setOperSettings(NetworkInterfaceConnectionSetting value) {
        this.operSettings = value;
    }

    /**
     * 获取interfaceType属性的值。
     * 
     */
    public int getInterfaceType() {
        return interfaceType;
    }

    /**
     * 设置interfaceType属性的值。
     * 
     */
    public void setInterfaceType(int value) {
        this.interfaceType = value;
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
