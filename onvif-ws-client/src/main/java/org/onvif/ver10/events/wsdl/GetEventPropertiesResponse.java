
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.oasis_open.docs.wsn.t_1.TopicSetType;


/**
 * &lt;p&gt;anonymous complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TopicNamespaceLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{http://docs.oasis-open.org/wsn/b-2}FixedTopicSet"/&amp;gt;
 *         &amp;lt;element ref="{http://docs.oasis-open.org/wsn/t-1}TopicSet"/&amp;gt;
 *         &amp;lt;element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionDialect" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="MessageContentFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="ProducerPropertiesFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MessageContentSchemaLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

    @XmlElement(name = "TopicNamespaceLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicNamespaceLocation;
    @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
    protected boolean fixedTopicSet;
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
    protected TopicSetType topicSet;
    @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;
    @XmlElement(name = "MessageContentFilterDialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentFilterDialect;
    @XmlElement(name = "ProducerPropertiesFilterDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> producerPropertiesFilterDialect;
    @XmlElement(name = "MessageContentSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentSchemaLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the topicNamespaceLocation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the topicNamespaceLocation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTopicNamespaceLocation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicNamespaceLocation() {
        if (topicNamespaceLocation == null) {
            topicNamespaceLocation = new ArrayList<String>();
        }
        return this.topicNamespaceLocation;
    }

    /**
     * True when topicset is fixed for all times.
     * This getter has been renamed from isFixedTopicSet() to getFixedTopicSet() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * 设置fixedTopicSet属性的值。
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
     * 设置topicSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSetType }
     *     
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

    /**
     * 
     *                   Defines the XPath expression syntax supported for matching topic expressions.
     *                   
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&amp;gt;
     * &lt;/pre&gt;
     * 
     *                   The following TopicExpressionDialects are mandatory for an ONVIF compliant device
     *                   :
     *                   
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&amp;gt;&amp;lt;li&amp;gt;http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet.&amp;lt;/li&amp;gt;&amp;lt;/ul&amp;gt;
     * &lt;/pre&gt;
     * Gets the value of the topicExpressionDialect property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the topicExpressionDialect property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTopicExpressionDialect().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<String>();
        }
        return this.topicExpressionDialect;
    }

    /**
     * Gets the value of the messageContentFilterDialect property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageContentFilterDialect property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageContentFilterDialect().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageContentFilterDialect() {
        if (messageContentFilterDialect == null) {
            messageContentFilterDialect = new ArrayList<String>();
        }
        return this.messageContentFilterDialect;
    }

    /**
     * Gets the value of the producerPropertiesFilterDialect property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the producerPropertiesFilterDialect property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getProducerPropertiesFilterDialect().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProducerPropertiesFilterDialect() {
        if (producerPropertiesFilterDialect == null) {
            producerPropertiesFilterDialect = new ArrayList<String>();
        }
        return this.producerPropertiesFilterDialect;
    }

    /**
     * Gets the value of the messageContentSchemaLocation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageContentSchemaLocation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageContentSchemaLocation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageContentSchemaLocation() {
        if (messageContentSchemaLocation == null) {
            messageContentSchemaLocation = new ArrayList<String>();
        }
        return this.messageContentSchemaLocation;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
