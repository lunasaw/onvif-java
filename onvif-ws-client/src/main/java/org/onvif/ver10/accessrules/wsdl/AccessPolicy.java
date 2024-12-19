
package org.onvif.ver10.accessrules.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The access policy is an association of an access point and a schedule. It defines when
 *             an access
 *             point can be accessed using an access profile which contains this access policy. If an
 *             access
 *             profile contains several access policies specifying different schedules for the same
 *             access
 *             point will result in a union of the schedules.
 * 
 * <p>Java class for AccessPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessPolicy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ScheduleToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/>
 *         <element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/>
 *         <element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessPolicyExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPolicy", propOrder = {
    "scheduleToken",
    "entity",
    "entityType",
    "extension"
})
public class AccessPolicy {

    /**
     * Reference to the schedule used by the access policy
     * 
     */
    @XmlElement(name = "ScheduleToken", required = true)
    protected String scheduleToken;
    /**
     * Reference to the entity used by the rule engine, the entity type may be specified by
     *                 the
     *                 optional EntityType field explained below but is typically an access point.
     * 
     */
    @XmlElement(name = "Entity", required = true)
    protected String entity;
    /**
     * Optional entity type; if missing, an access point type as defined by the ONVIF
     *                 Access
     *                 Control service should be assumed. This can also be represented by the QName value
     *                 “tac:AccessPoint” where tac is the namespace of Access Control Service
     *                 Specification.
     *                 This field is provided for future extensions; it will allow an access policy being
     *                 extended to cover entity types other than access points as well.
     * 
     */
    @XmlElement(name = "EntityType")
    protected QName entityType;
    @XmlElement(name = "Extension")
    protected AccessPolicyExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Reference to the schedule used by the access policy
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleToken() {
        return scheduleToken;
    }

    /**
     * Sets the value of the scheduleToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getScheduleToken()
     */
    public void setScheduleToken(String value) {
        this.scheduleToken = value;
    }

    /**
     * Reference to the entity used by the rule engine, the entity type may be specified by
     *                 the
     *                 optional EntityType field explained below but is typically an access point.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEntity()
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Optional entity type; if missing, an access point type as defined by the ONVIF
     *                 Access
     *                 Control service should be assumed. This can also be represented by the QName value
     *                 “tac:AccessPoint” where tac is the namespace of Access Control Service
     *                 Specification.
     *                 This field is provided for future extensions; it will allow an access policy being
     *                 extended to cover entity types other than access points as well.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     * @see #getEntityType()
     */
    public void setEntityType(QName value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPolicyExtension }
     *     
     */
    public AccessPolicyExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPolicyExtension }
     *     
     */
    public void setExtension(AccessPolicyExtension value) {
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

}
