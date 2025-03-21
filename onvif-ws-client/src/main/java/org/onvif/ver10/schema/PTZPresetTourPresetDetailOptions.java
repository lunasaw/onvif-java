
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>PTZPresetTourPresetDetailOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourPresetDetailOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Home" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanTiltPositionSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" minOccurs="0"/&gt;
 *         &lt;element name="ZoomPositionSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetailOptionsExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZPresetTourPresetDetailOptions", propOrder = {
    "presetToken",
    "home",
    "panTiltPositionSpace",
    "zoomPositionSpace",
    "extension"
})
public class PTZPresetTourPresetDetailOptions {

    @XmlElement(name = "PresetToken")
    protected List<String> presetToken;
    @XmlElement(name = "Home")
    protected Boolean home;
    @XmlElement(name = "PanTiltPositionSpace")
    protected Space2DDescription panTiltPositionSpace;
    @XmlElement(name = "ZoomPositionSpace")
    protected Space1DDescription zoomPositionSpace;
    @XmlElement(name = "Extension")
    protected PTZPresetTourPresetDetailOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the presetToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the presetToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresetToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPresetToken() {
        if (presetToken == null) {
            presetToken = new ArrayList<String>();
        }
        return this.presetToken;
    }

    /**
     * 获取home属性的值。
     * This getter has been renamed from isHome() to getHome() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHome() {
        return home;
    }

    /**
     * 设置home属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHome(Boolean value) {
        this.home = value;
    }

    /**
     * 获取panTiltPositionSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Space2DDescription }
     *     
     */
    public Space2DDescription getPanTiltPositionSpace() {
        return panTiltPositionSpace;
    }

    /**
     * 设置panTiltPositionSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Space2DDescription }
     *     
     */
    public void setPanTiltPositionSpace(Space2DDescription value) {
        this.panTiltPositionSpace = value;
    }

    /**
     * 获取zoomPositionSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Space1DDescription }
     *     
     */
    public Space1DDescription getZoomPositionSpace() {
        return zoomPositionSpace;
    }

    /**
     * 设置zoomPositionSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Space1DDescription }
     *     
     */
    public void setZoomPositionSpace(Space1DDescription value) {
        this.zoomPositionSpace = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourPresetDetailOptionsExtension }
     *     
     */
    public PTZPresetTourPresetDetailOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourPresetDetailOptionsExtension }
     *     
     */
    public void setExtension(PTZPresetTourPresetDetailOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
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
