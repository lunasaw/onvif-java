
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;RecordingCapabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RecordingCapabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="ReceiverSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="MediaProfileSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
@XmlType(name = "RecordingCapabilities", propOrder = {
    "xAddr",
    "receiverSource",
    "mediaProfileSource",
    "dynamicRecordings",
    "dynamicTracks",
    "maxStringLength",
    "any"
})
public class RecordingCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "ReceiverSource")
    protected boolean receiverSource;
    @XmlElement(name = "MediaProfileSource")
    protected boolean mediaProfileSource;
    @XmlElement(name = "DynamicRecordings")
    protected boolean dynamicRecordings;
    @XmlElement(name = "DynamicTracks")
    protected boolean dynamicTracks;
    @XmlElement(name = "MaxStringLength")
    protected int maxStringLength;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
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
     * 获取receiverSource属性的值。
     * This getter has been renamed from isReceiverSource() to getReceiverSource() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getReceiverSource() {
        return receiverSource;
    }

    /**
     * 设置receiverSource属性的值。
     * 
     */
    public void setReceiverSource(boolean value) {
        this.receiverSource = value;
    }

    /**
     * 获取mediaProfileSource属性的值。
     * This getter has been renamed from isMediaProfileSource() to getMediaProfileSource() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getMediaProfileSource() {
        return mediaProfileSource;
    }

    /**
     * 设置mediaProfileSource属性的值。
     * 
     */
    public void setMediaProfileSource(boolean value) {
        this.mediaProfileSource = value;
    }

    /**
     * 获取dynamicRecordings属性的值。
     * This getter has been renamed from isDynamicRecordings() to getDynamicRecordings() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * 设置dynamicRecordings属性的值。
     * 
     */
    public void setDynamicRecordings(boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * 获取dynamicTracks属性的值。
     * This getter has been renamed from isDynamicTracks() to getDynamicTracks() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * 设置dynamicTracks属性的值。
     * 
     */
    public void setDynamicTracks(boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * 获取maxStringLength属性的值。
     * 
     */
    public int getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * 设置maxStringLength属性的值。
     * 
     */
    public void setMaxStringLength(int value) {
        this.maxStringLength = value;
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
