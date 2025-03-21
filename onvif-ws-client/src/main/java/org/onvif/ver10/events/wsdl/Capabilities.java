
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Capabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaxNotificationProducers" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxPullPoints" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PersistentNotificationStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EventBrokerProtocols" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxEventBrokers" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MetadataOverMQTT" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "WSSubscriptionPolicySupport")
    protected Boolean wsSubscriptionPolicySupport;
    @XmlAttribute(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected Boolean wsPausableSubscriptionManagerInterfaceSupport;
    @XmlAttribute(name = "MaxNotificationProducers")
    protected Integer maxNotificationProducers;
    @XmlAttribute(name = "MaxPullPoints")
    protected Integer maxPullPoints;
    @XmlAttribute(name = "PersistentNotificationStorage")
    protected Boolean persistentNotificationStorage;
    @XmlAttribute(name = "EventBrokerProtocols")
    protected String eventBrokerProtocols;
    @XmlAttribute(name = "MaxEventBrokers")
    protected Integer maxEventBrokers;
    @XmlAttribute(name = "MetadataOverMQTT")
    protected Boolean metadataOverMQTT;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
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
     * 获取wsSubscriptionPolicySupport属性的值。
     * This getter has been renamed from isWSSubscriptionPolicySupport() to getWSSubscriptionPolicySupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    /**
     * 设置wsSubscriptionPolicySupport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSSubscriptionPolicySupport(Boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    /**
     * 获取wsPausableSubscriptionManagerInterfaceSupport属性的值。
     * This getter has been renamed from isWSPausableSubscriptionManagerInterfaceSupport() to getWSPausableSubscriptionManagerInterfaceSupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    /**
     * 设置wsPausableSubscriptionManagerInterfaceSupport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSPausableSubscriptionManagerInterfaceSupport(Boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
    }

    /**
     * 获取maxNotificationProducers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNotificationProducers() {
        return maxNotificationProducers;
    }

    /**
     * 设置maxNotificationProducers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNotificationProducers(Integer value) {
        this.maxNotificationProducers = value;
    }

    /**
     * 获取maxPullPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPullPoints() {
        return maxPullPoints;
    }

    /**
     * 设置maxPullPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPullPoints(Integer value) {
        this.maxPullPoints = value;
    }

    /**
     * 获取persistentNotificationStorage属性的值。
     * This getter has been renamed from isPersistentNotificationStorage() to getPersistentNotificationStorage() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPersistentNotificationStorage() {
        return persistentNotificationStorage;
    }

    /**
     * 设置persistentNotificationStorage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentNotificationStorage(Boolean value) {
        this.persistentNotificationStorage = value;
    }

    /**
     * 获取eventBrokerProtocols属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventBrokerProtocols() {
        return eventBrokerProtocols;
    }

    /**
     * 设置eventBrokerProtocols属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventBrokerProtocols(String value) {
        this.eventBrokerProtocols = value;
    }

    /**
     * 获取maxEventBrokers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEventBrokers() {
        return maxEventBrokers;
    }

    /**
     * 设置maxEventBrokers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEventBrokers(Integer value) {
        this.maxEventBrokers = value;
    }

    /**
     * 获取metadataOverMQTT属性的值。
     * This getter has been renamed from isMetadataOverMQTT() to getMetadataOverMQTT() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMetadataOverMQTT() {
        return metadataOverMQTT;
    }

    /**
     * 设置metadataOverMQTT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetadataOverMQTT(Boolean value) {
        this.metadataOverMQTT = value;
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
