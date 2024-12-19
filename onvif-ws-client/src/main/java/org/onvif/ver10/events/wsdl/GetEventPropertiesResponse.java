
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.oasis_open.docs.wsn.t_1.TopicSetType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TopicNamespaceLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}FixedTopicSet"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/t-1}TopicSet"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionDialect" maxOccurs="unbounded"/>
 *         <element name="MessageContentFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         <element name="ProducerPropertiesFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MessageContentSchemaLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topicNamespaceLocation",
    "fixedTopicSet",
    "topicSet",
    "topicExpressionDialect",
    "messageContentFilterDialect",
    "producerPropertiesFilterDialect",
    "messageContentSchemaLocation",
    "any"
})
@XmlRootElement(name = "GetEventPropertiesResponse")
public class GetEventPropertiesResponse {

    /**
     * List of topic namespaces supported.
     * 
     */
    @XmlElement(name = "TopicNamespaceLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicNamespaceLocation;
    /**
     * True when topicset is fixed for all times.
     * 
     */
    @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
    protected boolean fixedTopicSet;
    /**
     * Set of topics supported.
     * 
     */
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
    protected TopicSetType topicSet;
    /**
     * Defines the XPath expression syntax supported for matching topic expressions.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   The following TopicExpressionDialects are mandatory for an ONVIF compliant device
     *                   :
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;
    /**
     * Defines the XPath function set supported for message content filtering.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   The following MessageContentFilterDialects should be returned if a device supports
     *                   the message content filtering:
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/messageContentFilter/ItemFilter.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *                   A device that does not support any MessageContentFilterDialect returns a single
     *                   empty url.
     * 
     */
    @XmlElement(name = "MessageContentFilterDialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentFilterDialect;
    /**
     * Optional ProducerPropertiesDialects. Refer to 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://docs.oasis-open.org/wsn/wsn-ws_base_notification-1.3-spec-os.htm"&gt;Web
     *                   Services Base Notification 1.3 (WS-BaseNotification)
     *                 &lt;/a&gt;
     * </pre>
     *  for advanced filtering.
     * 
     */
    @XmlElement(name = "ProducerPropertiesFilterDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> producerPropertiesFilterDialect;
    /**
     * The Message Content Description Language allows referencing
     *                   of vendor-specific types. In order to ease the integration of such types into a
     *                   tests application,
     *                   the GetEventPropertiesResponse shall list all URI locations to schema files whose
     *                   types are
     *                   used in the description of notifications, with MessageContentSchemaLocation
     *                   elements.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   This list shall at least contain the URI of the ONVIF schema file.
     * 
     */
    @XmlElement(name = "MessageContentSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentSchemaLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * List of topic namespaces supported.
     * 
     * Gets the value of the topicNamespaceLocation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicNamespaceLocation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTopicNamespaceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the topicNamespaceLocation property.
     */
    public List<String> getTopicNamespaceLocation() {
        if (topicNamespaceLocation == null) {
            topicNamespaceLocation = new ArrayList<>();
        }
        return this.topicNamespaceLocation;
    }

    /**
     * True when topicset is fixed for all times.
     * 
     */
    public boolean isFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * Sets the value of the fixedTopicSet property.
     * 
     */
    public void setFixedTopicSet(boolean value) {
        this.fixedTopicSet = value;
    }

    /**
     * Set of topics supported.
     * 
     * @return
     *     possible object is
     *     {@link TopicSetType }
     *     
     */
    public TopicSetType getTopicSet() {
        return topicSet;
    }

    /**
     * Sets the value of the topicSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSetType }
     *     
     * @see #getTopicSet()
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

    /**
     * Defines the XPath expression syntax supported for matching topic expressions.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   The following TopicExpressionDialects are mandatory for an ONVIF compliant device
     *                   :
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * Gets the value of the topicExpressionDialect property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialect property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTopicExpressionDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the topicExpressionDialect property.
     */
    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<>();
        }
        return this.topicExpressionDialect;
    }

    /**
     * Defines the XPath function set supported for message content filtering.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   The following MessageContentFilterDialects should be returned if a device supports
     *                   the message content filtering:
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/messageContentFilter/ItemFilter.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *                   A device that does not support any MessageContentFilterDialect returns a single
     *                   empty url.
     * 
     * Gets the value of the messageContentFilterDialect property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentFilterDialect property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessageContentFilterDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the messageContentFilterDialect property.
     */
    public List<String> getMessageContentFilterDialect() {
        if (messageContentFilterDialect == null) {
            messageContentFilterDialect = new ArrayList<>();
        }
        return this.messageContentFilterDialect;
    }

    /**
     * Optional ProducerPropertiesDialects. Refer to 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="http://docs.oasis-open.org/wsn/wsn-ws_base_notification-1.3-spec-os.htm"&gt;Web
     *                   Services Base Notification 1.3 (WS-BaseNotification)
     *                 &lt;/a&gt;
     * </pre>
     *  for advanced filtering.
     * 
     * Gets the value of the producerPropertiesFilterDialect property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerPropertiesFilterDialect property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProducerPropertiesFilterDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the producerPropertiesFilterDialect property.
     */
    public List<String> getProducerPropertiesFilterDialect() {
        if (producerPropertiesFilterDialect == null) {
            producerPropertiesFilterDialect = new ArrayList<>();
        }
        return this.producerPropertiesFilterDialect;
    }

    /**
     * The Message Content Description Language allows referencing
     *                   of vendor-specific types. In order to ease the integration of such types into a
     *                   tests application,
     *                   the GetEventPropertiesResponse shall list all URI locations to schema files whose
     *                   types are
     *                   used in the description of notifications, with MessageContentSchemaLocation
     *                   elements.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   This list shall at least contain the URI of the ONVIF schema file.
     * 
     * Gets the value of the messageContentSchemaLocation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentSchemaLocation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessageContentSchemaLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the messageContentSchemaLocation property.
     */
    public List<String> getMessageContentSchemaLocation() {
        if (messageContentSchemaLocation == null) {
            messageContentSchemaLocation = new ArrayList<>();
        }
        return this.messageContentSchemaLocation;
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
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
