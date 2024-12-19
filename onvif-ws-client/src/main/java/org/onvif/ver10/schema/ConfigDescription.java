
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConfigDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemListDescription"/>
 *         <element name="Messages" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.onvif.org/ver10/schema}MessageDescription">
 *                 <sequence>
 *                   <element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *                 <anyAttribute processContents='lax'/>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ConfigDescriptionExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigDescription", propOrder = {
    "parameters",
    "messages",
    "extension"
})
public class ConfigDescription {

    /**
     * List describing the configuration parameters. The names of the parameters must be
     *             unique. If possible SimpleItems
     *             should be used to transport the information to ease parsing of dynamically defined
     *             messages by a tests
     *             application.
     * 
     */
    @XmlElement(name = "Parameters", required = true)
    protected ItemListDescription parameters;
    /**
     * The analytics modules and rule engine produce Events, which must be listed within the
     *             Analytics Module Description. In order to do so
     *             the structure of the Message is defined and consists of three groups: Source, Key, and
     *             Data. It is recommended to use SimpleItemDescriptions wherever applicable.
     *             The name of all Items must be unique within all Items contained in any group of this
     *             Message.
     *             Depending on the component multiple parameters or none may be needed to identify the
     *             component uniquely.
     * 
     */
    @XmlElement(name = "Messages")
    protected List<ConfigDescription.Messages> messages;
    @XmlElement(name = "Extension")
    protected ConfigDescriptionExtension extension;
    /**
     * XML Type of the Configuration (e.g. "tt::LineDetector").
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected QName name;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * List describing the configuration parameters. The names of the parameters must be
     *             unique. If possible SimpleItems
     *             should be used to transport the information to ease parsing of dynamically defined
     *             messages by a tests
     *             application.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     * @see #getParameters()
     */
    public void setParameters(ItemListDescription value) {
        this.parameters = value;
    }

    /**
     * The analytics modules and rule engine produce Events, which must be listed within the
     *             Analytics Module Description. In order to do so
     *             the structure of the Message is defined and consists of three groups: Source, Key, and
     *             Data. It is recommended to use SimpleItemDescriptions wherever applicable.
     *             The name of all Items must be unique within all Items contained in any group of this
     *             Message.
     *             Depending on the component multiple parameters or none may be needed to identify the
     *             component uniquely.
     * 
     * Gets the value of the messages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigDescription.Messages }
     * </p>
     * 
     * 
     * @return
     *     The value of the messages property.
     */
    public List<ConfigDescription.Messages> getMessages() {
        if (messages == null) {
            messages = new ArrayList<>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigDescriptionExtension }
     *     
     */
    public ConfigDescriptionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigDescriptionExtension }
     *     
     */
    public void setExtension(ConfigDescriptionExtension value) {
        this.extension = value;
    }

    /**
     * XML Type of the Configuration (e.g. "tt::LineDetector").
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     * @see #getName()
     */
    public void setName(QName value) {
        this.name = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.onvif.org/ver10/schema}MessageDescription">
     *       <sequence>
     *         <element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       </sequence>
     *       <anyAttribute processContents='lax'/>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parentTopic"
    })
    public static class Messages
        extends MessageDescription
    {

        /**
         * The ParentTopic labels the message (e.g. "nn:RuleEngine/LineCrossing"). The
         *                       real message can extend the ParentTopic
         *                       by for example the name of the instaniated rule (e.g.
         *                       "nn:RuleEngine/LineCrossing/corssMyFirstLine").
         *                       Even without knowing the complete topic name, the subscriber will be able to
         *                       distiguish the
         *                       messages produced by different rule instances of the same type via the Source
         *                       fields of the message.
         *                       There the name of the rule instance, which produced the message, must be
         *                       listed.
         * 
         */
        @XmlElement(name = "ParentTopic", required = true)
        protected String parentTopic;

        /**
         * The ParentTopic labels the message (e.g. "nn:RuleEngine/LineCrossing"). The
         *                       real message can extend the ParentTopic
         *                       by for example the name of the instaniated rule (e.g.
         *                       "nn:RuleEngine/LineCrossing/corssMyFirstLine").
         *                       Even without knowing the complete topic name, the subscriber will be able to
         *                       distiguish the
         *                       messages produced by different rule instances of the same type via the Source
         *                       fields of the message.
         *                       There the name of the rule instance, which produced the message, must be
         *                       listed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentTopic() {
            return parentTopic;
        }

        /**
         * Sets the value of the parentTopic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getParentTopic()
         */
        public void setParentTopic(String value) {
            this.parentTopic = value;
        }

    }

}
