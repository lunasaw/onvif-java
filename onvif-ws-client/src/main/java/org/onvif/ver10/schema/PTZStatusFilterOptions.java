
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
 * &lt;p&gt;PTZStatusFilterOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZStatusFilterOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="PanTiltStatusSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ZoomStatusSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PanTiltPositionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ZoomPositionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZStatusFilterOptionsExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "PTZStatusFilterOptions", propOrder = {
    "panTiltStatusSupported",
    "zoomStatusSupported",
    "any",
    "panTiltPositionSupported",
    "zoomPositionSupported",
    "extension"
})
public class PTZStatusFilterOptions {

    @XmlElement(name = "PanTiltStatusSupported")
    protected boolean panTiltStatusSupported;
    @XmlElement(name = "ZoomStatusSupported")
    protected boolean zoomStatusSupported;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "PanTiltPositionSupported")
    protected Boolean panTiltPositionSupported;
    @XmlElement(name = "ZoomPositionSupported")
    protected Boolean zoomPositionSupported;
    @XmlElement(name = "Extension")
    protected PTZStatusFilterOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取panTiltStatusSupported属性的值。
     * This getter has been renamed from isPanTiltStatusSupported() to getPanTiltStatusSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getPanTiltStatusSupported() {
        return panTiltStatusSupported;
    }

    /**
     * 设置panTiltStatusSupported属性的值。
     * 
     */
    public void setPanTiltStatusSupported(boolean value) {
        this.panTiltStatusSupported = value;
    }

    /**
     * 获取zoomStatusSupported属性的值。
     * This getter has been renamed from isZoomStatusSupported() to getZoomStatusSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getZoomStatusSupported() {
        return zoomStatusSupported;
    }

    /**
     * 设置zoomStatusSupported属性的值。
     * 
     */
    public void setZoomStatusSupported(boolean value) {
        this.zoomStatusSupported = value;
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
     * 获取panTiltPositionSupported属性的值。
     * This getter has been renamed from isPanTiltPositionSupported() to getPanTiltPositionSupported() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPanTiltPositionSupported() {
        return panTiltPositionSupported;
    }

    /**
     * 设置panTiltPositionSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPanTiltPositionSupported(Boolean value) {
        this.panTiltPositionSupported = value;
    }

    /**
     * 获取zoomPositionSupported属性的值。
     * This getter has been renamed from isZoomPositionSupported() to getZoomPositionSupported() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getZoomPositionSupported() {
        return zoomPositionSupported;
    }

    /**
     * 设置zoomPositionSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoomPositionSupported(Boolean value) {
        this.zoomPositionSupported = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZStatusFilterOptionsExtension }
     *     
     */
    public PTZStatusFilterOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZStatusFilterOptionsExtension }
     *     
     */
    public void setExtension(PTZStatusFilterOptionsExtension value) {
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
