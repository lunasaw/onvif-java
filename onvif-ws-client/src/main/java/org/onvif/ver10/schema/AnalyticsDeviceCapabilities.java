
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;AnalyticsDeviceCapabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnalyticsDeviceCapabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="RuleSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}AnalyticsDeviceExtension" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsDeviceCapabilities", propOrder = {
    "xAddr",
    "ruleSupport",
    "extension"
})
public class AnalyticsDeviceCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "RuleSupport")
    protected Boolean ruleSupport;
    @XmlElement(name = "Extension")
    protected AnalyticsDeviceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取xAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * 设置xAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * 获取ruleSupport属性的值。
     * This getter has been renamed from isRuleSupport() to getRuleSupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRuleSupport() {
        return ruleSupport;
    }

    /**
     * 设置ruleSupport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleSupport(Boolean value) {
        this.ruleSupport = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsDeviceExtension }
     *     
     */
    public AnalyticsDeviceExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsDeviceExtension }
     *     
     */
    public void setExtension(AnalyticsDeviceExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
