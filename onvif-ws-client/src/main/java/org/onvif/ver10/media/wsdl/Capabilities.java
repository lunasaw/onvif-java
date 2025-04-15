
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Capabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Capabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ProfileCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}ProfileCapabilities"/&amp;gt;
 *         &amp;lt;element name="StreamingCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}StreamingCapabilities"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="SnapshotUri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="VideoSourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="OSD" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="EXICompression" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "profileCapabilities",
    "streamingCapabilities",
    "any"
})
public class Capabilities {

    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;
    @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;
    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;
    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;
    @XmlAttribute(name = "OSD")
    protected Boolean osd;
    @XmlAttribute(name = "EXICompression")
    protected Boolean exiCompression;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取profileCapabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProfileCapabilities }
     *     
     */
    public ProfileCapabilities getProfileCapabilities() {
        return profileCapabilities;
    }

    /**
     * 设置profileCapabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCapabilities }
     *     
     */
    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    /**
     * 获取streamingCapabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StreamingCapabilities }
     *     
     */
    public StreamingCapabilities getStreamingCapabilities() {
        return streamingCapabilities;
    }

    /**
     * 设置streamingCapabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingCapabilities }
     *     
     */
    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * 获取snapshotUri属性的值。
     * This getter has been renamed from isSnapshotUri() to getSnapshotUri() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSnapshotUri() {
        return snapshotUri;
    }

    /**
     * 设置snapshotUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    /**
     * 获取rotation属性的值。
     * This getter has been renamed from isRotation() to getRotation() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRotation() {
        return rotation;
    }

    /**
     * 设置rotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    /**
     * 获取videoSourceMode属性的值。
     * This getter has been renamed from isVideoSourceMode() to getVideoSourceMode() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVideoSourceMode() {
        return videoSourceMode;
    }

    /**
     * 设置videoSourceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    /**
     * 获取osd属性的值。
     * This getter has been renamed from isOSD() to getOSD() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOSD() {
        return osd;
    }

    /**
     * 设置osd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOSD(Boolean value) {
        this.osd = value;
    }

    /**
     * 获取exiCompression属性的值。
     * This getter has been renamed from isEXICompression() to getEXICompression() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEXICompression() {
        return exiCompression;
    }

    /**
     * 设置exiCompression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXICompression(Boolean value) {
        this.exiCompression = value;
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
