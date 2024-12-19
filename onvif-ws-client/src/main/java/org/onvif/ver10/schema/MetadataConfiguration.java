
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MetadataConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MetadataConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZFilter" minOccurs="0"/>
 *         <element name="Events" type="{http://www.onvif.org/ver10/schema}EventSubscription" minOccurs="0"/>
 *         <element name="Analytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/>
 *         <element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfiguration", propOrder = {
    "ptzStatus",
    "events",
    "analytics",
    "multicast",
    "sessionTimeout",
    "any",
    "analyticsEngineConfiguration",
    "extension"
})
public class MetadataConfiguration
    extends ConfigurationEntity
{

    /**
     * optional element to configure which PTZ related data is to include
     *                 in the metadata stream
     * 
     */
    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;
    /**
     * Optional element to configure the streaming of events. A tests
     *                 might be interested in receiving all,
     *                 none or some of the events produced by the device:
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;To get all events: Include the Events element but do not include a filter.
     *                   &lt;/li&gt;&lt;li&gt;To get no events: Do not include the Events element.&lt;/li&gt;&lt;li&gt;To get only some events: Include the Events element and include a filter in
     *                     the element.
     *                   &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "Events")
    protected EventSubscription events;
    /**
     * Defines whether the streamed metadata will include metadata from the
     *                 analytics engines (video, cell motion, audio etc.)
     * 
     */
    @XmlElement(name = "Analytics")
    protected Boolean analytics;
    /**
     * Defines the multicast settings that could be used for video
     *                 streaming.
     * 
     */
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    /**
     * The rtsp session timeout for the related audio stream
     * 
     */
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;
    /**
     * Optional parameter to configure compression type of Metadata payload.
     *               Use values from enumeration MetadataCompressionType.
     * 
     */
    @XmlAttribute(name = "CompressionType")
    protected String compressionType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * optional element to configure which PTZ related data is to include
     *                 in the metadata stream
     * 
     * @return
     *     possible object is
     *     {@link PTZFilter }
     *     
     */
    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZFilter }
     *     
     * @see #getPTZStatus()
     */
    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }

    /**
     * Optional element to configure the streaming of events. A tests
     *                 might be interested in receiving all,
     *                 none or some of the events produced by the device:
     *                 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;To get all events: Include the Events element but do not include a filter.
     *                   &lt;/li&gt;&lt;li&gt;To get no events: Do not include the Events element.&lt;/li&gt;&lt;li&gt;To get only some events: Include the Events element and include a filter in
     *                     the element.
     *                   &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link EventSubscription }
     *     
     */
    public EventSubscription getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSubscription }
     *     
     * @see #getEvents()
     */
    public void setEvents(EventSubscription value) {
        this.events = value;
    }

    /**
     * Defines whether the streamed metadata will include metadata from the
     *                 analytics engines (video, cell motion, audio etc.)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnalytics()
     */
    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }

    /**
     * Defines the multicast settings that could be used for video
     *                 streaming.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     * @see #getMulticast()
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * The rtsp session timeout for the related audio stream
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getSessionTimeout()
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets the value of the analyticsEngineConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }

    /**
     * Sets the value of the analyticsEngineConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public MetadataConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Optional parameter to configure compression type of Metadata payload.
     *               Use values from enumeration MetadataCompressionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompressionType()
     */
    public void setCompressionType(String value) {
        this.compressionType = value;
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

}
