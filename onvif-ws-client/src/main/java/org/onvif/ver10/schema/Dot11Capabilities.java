
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Dot11Capabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Dot11Capabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TKIP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ScanAvailableNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="MultipleConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="AdHocStationMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="WEP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Dot11Capabilities", propOrder = {
    "tkip",
    "scanAvailableNetworks",
    "multipleConfiguration",
    "adHocStationMode",
    "wep",
    "any"
})
public class Dot11Capabilities {

    @XmlElement(name = "TKIP")
    protected boolean tkip;
    @XmlElement(name = "ScanAvailableNetworks")
    protected boolean scanAvailableNetworks;
    @XmlElement(name = "MultipleConfiguration")
    protected boolean multipleConfiguration;
    @XmlElement(name = "AdHocStationMode")
    protected boolean adHocStationMode;
    @XmlElement(name = "WEP")
    protected boolean wep;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取tkip属性的值。
     * This getter has been renamed from isTKIP() to getTKIP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTKIP() {
        return tkip;
    }

    /**
     * 设置tkip属性的值。
     * 
     */
    public void setTKIP(boolean value) {
        this.tkip = value;
    }

    /**
     * 获取scanAvailableNetworks属性的值。
     * This getter has been renamed from isScanAvailableNetworks() to getScanAvailableNetworks() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getScanAvailableNetworks() {
        return scanAvailableNetworks;
    }

    /**
     * 设置scanAvailableNetworks属性的值。
     * 
     */
    public void setScanAvailableNetworks(boolean value) {
        this.scanAvailableNetworks = value;
    }

    /**
     * 获取multipleConfiguration属性的值。
     * This getter has been renamed from isMultipleConfiguration() to getMultipleConfiguration() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getMultipleConfiguration() {
        return multipleConfiguration;
    }

    /**
     * 设置multipleConfiguration属性的值。
     * 
     */
    public void setMultipleConfiguration(boolean value) {
        this.multipleConfiguration = value;
    }

    /**
     * 获取adHocStationMode属性的值。
     * This getter has been renamed from isAdHocStationMode() to getAdHocStationMode() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAdHocStationMode() {
        return adHocStationMode;
    }

    /**
     * 设置adHocStationMode属性的值。
     * 
     */
    public void setAdHocStationMode(boolean value) {
        this.adHocStationMode = value;
    }

    /**
     * 获取wep属性的值。
     * This getter has been renamed from isWEP() to getWEP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getWEP() {
        return wep;
    }

    /**
     * 设置wep属性的值。
     * 
     */
    public void setWEP(boolean value) {
        this.wep = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
