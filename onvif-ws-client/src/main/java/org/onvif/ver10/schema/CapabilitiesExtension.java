
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;CapabilitiesExtension complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CapabilitiesExtension"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeviceIO" type="{http://www.onvif.org/ver10/schema}DeviceIOCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Display" type="{http://www.onvif.org/ver10/schema}DisplayCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Recording" type="{http://www.onvif.org/ver10/schema}RecordingCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Search" type="{http://www.onvif.org/ver10/schema}SearchCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Replay" type="{http://www.onvif.org/ver10/schema}ReplayCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Receiver" type="{http://www.onvif.org/ver10/schema}ReceiverCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AnalyticsDevice" type="{http://www.onvif.org/ver10/schema}AnalyticsDeviceCapabilities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.onvif.org/ver10/schema}CapabilitiesExtension2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesExtension", propOrder = {
    "any",
    "deviceIO",
    "display",
    "recording",
    "search",
    "replay",
    "receiver",
    "analyticsDevice",
    "extensions"
})
public class CapabilitiesExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "DeviceIO")
    protected DeviceIOCapabilities deviceIO;
    @XmlElement(name = "Display")
    protected DisplayCapabilities display;
    @XmlElement(name = "Recording")
    protected RecordingCapabilities recording;
    @XmlElement(name = "Search")
    protected SearchCapabilities search;
    @XmlElement(name = "Replay")
    protected ReplayCapabilities replay;
    @XmlElement(name = "Receiver")
    protected ReceiverCapabilities receiver;
    @XmlElement(name = "AnalyticsDevice")
    protected AnalyticsDeviceCapabilities analyticsDevice;
    @XmlElement(name = "Extensions")
    protected CapabilitiesExtension2 extensions;

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
     * 获取deviceIO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeviceIOCapabilities }
     *     
     */
    public DeviceIOCapabilities getDeviceIO() {
        return deviceIO;
    }

    /**
     * 设置deviceIO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIOCapabilities }
     *     
     */
    public void setDeviceIO(DeviceIOCapabilities value) {
        this.deviceIO = value;
    }

    /**
     * 获取display属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DisplayCapabilities }
     *     
     */
    public DisplayCapabilities getDisplay() {
        return display;
    }

    /**
     * 设置display属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCapabilities }
     *     
     */
    public void setDisplay(DisplayCapabilities value) {
        this.display = value;
    }

    /**
     * 获取recording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordingCapabilities }
     *     
     */
    public RecordingCapabilities getRecording() {
        return recording;
    }

    /**
     * 设置recording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingCapabilities }
     *     
     */
    public void setRecording(RecordingCapabilities value) {
        this.recording = value;
    }

    /**
     * 获取search属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchCapabilities }
     *     
     */
    public SearchCapabilities getSearch() {
        return search;
    }

    /**
     * 设置search属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCapabilities }
     *     
     */
    public void setSearch(SearchCapabilities value) {
        this.search = value;
    }

    /**
     * 获取replay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReplayCapabilities }
     *     
     */
    public ReplayCapabilities getReplay() {
        return replay;
    }

    /**
     * 设置replay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReplayCapabilities }
     *     
     */
    public void setReplay(ReplayCapabilities value) {
        this.replay = value;
    }

    /**
     * 获取receiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiverCapabilities }
     *     
     */
    public ReceiverCapabilities getReceiver() {
        return receiver;
    }

    /**
     * 设置receiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverCapabilities }
     *     
     */
    public void setReceiver(ReceiverCapabilities value) {
        this.receiver = value;
    }

    /**
     * 获取analyticsDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsDeviceCapabilities }
     *     
     */
    public AnalyticsDeviceCapabilities getAnalyticsDevice() {
        return analyticsDevice;
    }

    /**
     * 设置analyticsDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsDeviceCapabilities }
     *     
     */
    public void setAnalyticsDevice(AnalyticsDeviceCapabilities value) {
        this.analyticsDevice = value;
    }

    /**
     * 获取extensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesExtension2 }
     *     
     */
    public CapabilitiesExtension2 getExtensions() {
        return extensions;
    }

    /**
     * 设置extensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesExtension2 }
     *     
     */
    public void setExtensions(CapabilitiesExtension2 value) {
        this.extensions = value;
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
