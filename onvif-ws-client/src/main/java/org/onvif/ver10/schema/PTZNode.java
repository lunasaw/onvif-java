
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;PTZNode complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZNode"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupportedPTZSpaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/&amp;gt;
 *         &amp;lt;element name="MaximumNumberOfPresets" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="HomeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="AuxiliaryCommands" type="{http://www.onvif.org/ver10/schema}AuxiliaryData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZNodeExtension" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="FixedHomePosition" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZNode", propOrder = {
    "name",
    "supportedPTZSpaces",
    "maximumNumberOfPresets",
    "homeSupported",
    "auxiliaryCommands",
    "extension"
})
public class PTZNode
    extends DeviceEntity
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SupportedPTZSpaces", required = true)
    protected PTZSpaces supportedPTZSpaces;
    @XmlElement(name = "MaximumNumberOfPresets")
    protected int maximumNumberOfPresets;
    @XmlElement(name = "HomeSupported")
    protected boolean homeSupported;
    @XmlElement(name = "AuxiliaryCommands")
    protected List<String> auxiliaryCommands;
    @XmlElement(name = "Extension")
    protected PTZNodeExtension extension;
    @XmlAttribute(name = "FixedHomePosition")
    protected Boolean fixedHomePosition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取supportedPTZSpaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSupportedPTZSpaces() {
        return supportedPTZSpaces;
    }

    /**
     * 设置supportedPTZSpaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     */
    public void setSupportedPTZSpaces(PTZSpaces value) {
        this.supportedPTZSpaces = value;
    }

    /**
     * 获取maximumNumberOfPresets属性的值。
     * 
     */
    public int getMaximumNumberOfPresets() {
        return maximumNumberOfPresets;
    }

    /**
     * 设置maximumNumberOfPresets属性的值。
     * 
     */
    public void setMaximumNumberOfPresets(int value) {
        this.maximumNumberOfPresets = value;
    }

    /**
     * 获取homeSupported属性的值。
     * This getter has been renamed from isHomeSupported() to getHomeSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getHomeSupported() {
        return homeSupported;
    }

    /**
     * 设置homeSupported属性的值。
     * 
     */
    public void setHomeSupported(boolean value) {
        this.homeSupported = value;
    }

    /**
     * Gets the value of the auxiliaryCommands property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the auxiliaryCommands property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAuxiliaryCommands().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuxiliaryCommands() {
        if (auxiliaryCommands == null) {
            auxiliaryCommands = new ArrayList<String>();
        }
        return this.auxiliaryCommands;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZNodeExtension }
     *     
     */
    public PTZNodeExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNodeExtension }
     *     
     */
    public void setExtension(PTZNodeExtension value) {
        this.extension = value;
    }

    /**
     * 获取fixedHomePosition属性的值。
     * This getter has been renamed from isFixedHomePosition() to getFixedHomePosition() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFixedHomePosition() {
        return fixedHomePosition;
    }

    /**
     * 设置fixedHomePosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedHomePosition(Boolean value) {
        this.fixedHomePosition = value;
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
