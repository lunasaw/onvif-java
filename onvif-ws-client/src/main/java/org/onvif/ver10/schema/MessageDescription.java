
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MessageDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/>
 *         <element name="Key" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/>
 *         <element name="Data" type="{http://www.onvif.org/ver10/schema}ItemListDescription" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MessageDescriptionExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="IsProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDescription", propOrder = {
    "source",
    "key",
    "data",
    "extension"
})
@XmlSeeAlso({
    org.onvif.ver10.schema.ConfigDescription.Messages.class
})
public class MessageDescription {

    /**
     * Set of tokens producing this message. The list may only contain
     *             SimpleItemDescription items.
     *             The set of tokens identify the component within the WS-Endpoint, which is responsible
     *             for the producing the message.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             For analytics events the token set shall include the VideoSourceConfigurationToken, the
     *             VideoAnalyticsConfigurationToken
     *             and the name of the analytics module or rule.
     * 
     */
    @XmlElement(name = "Source")
    protected ItemListDescription source;
    /**
     * Describes optional message payload parameters that may be used as key.
     *             E.g. object IDs of tracked objects are conveyed as key.
     * 
     */
    @XmlElement(name = "Key")
    protected ItemListDescription key;
    /**
     * Describes the payload of the message.
     * 
     */
    @XmlElement(name = "Data")
    protected ItemListDescription data;
    @XmlElement(name = "Extension")
    protected MessageDescriptionExtension extension;
    /**
     * Must be set to true when the described Message relates to a property. An
     *           alternative term of "property" is a "state" in contrast to a pure event, which contains
     *           relevant information for only a single point in time.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * Default is false.
     * 
     */
    @XmlAttribute(name = "IsProperty")
    protected Boolean isProperty;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Set of tokens producing this message. The list may only contain
     *             SimpleItemDescription items.
     *             The set of tokens identify the component within the WS-Endpoint, which is responsible
     *             for the producing the message.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             For analytics events the token set shall include the VideoSourceConfigurationToken, the
     *             VideoAnalyticsConfigurationToken
     *             and the name of the analytics module or rule.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     * @see #getSource()
     */
    public void setSource(ItemListDescription value) {
        this.source = value;
    }

    /**
     * Describes optional message payload parameters that may be used as key.
     *             E.g. object IDs of tracked objects are conveyed as key.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     * @see #getKey()
     */
    public void setKey(ItemListDescription value) {
        this.key = value;
    }

    /**
     * Describes the payload of the message.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     * @see #getData()
     */
    public void setData(ItemListDescription value) {
        this.data = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDescriptionExtension }
     *     
     */
    public MessageDescriptionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDescriptionExtension }
     *     
     */
    public void setExtension(MessageDescriptionExtension value) {
        this.extension = value;
    }

    /**
     * Must be set to true when the described Message relates to a property. An
     *           alternative term of "property" is a "state" in contrast to a pure event, which contains
     *           relevant information for only a single point in time.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * Default is false.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProperty() {
        return isProperty;
    }

    /**
     * Sets the value of the isProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsProperty()
     */
    public void setIsProperty(Boolean value) {
        this.isProperty = value;
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
