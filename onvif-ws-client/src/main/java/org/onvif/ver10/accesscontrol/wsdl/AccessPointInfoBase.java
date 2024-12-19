
package org.onvif.ver10.accesscontrol.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.pacs.DataEntity;


/**
 * Used as extension base for AccessPointInfo.
 * 
 * <p>Java class for AccessPointInfoBase complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessPointInfoBase">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/pacs}DataEntity">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/pacs}Name"/>
 *         <element name="Description" type="{http://www.onvif.org/ver10/pacs}Description" minOccurs="0"/>
 *         <element name="AreaFrom" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/>
 *         <element name="AreaTo" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/>
 *         <element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         <element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfoBase", propOrder = {
    "name",
    "description",
    "areaFrom",
    "areaTo",
    "entityType",
    "entity"
})
@XmlSeeAlso({
    AccessPointInfo.class
})
public class AccessPointInfoBase
    extends DataEntity
{

    /**
     * A user readable name. It shall be up to 64 characters.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Optional user readable description for the AccessPoint. It shall
     *                     be up to 1024 characters.
     * 
     */
    @XmlElement(name = "Description")
    protected String description;
    /**
     * Optional reference to the Area from which access is requested.
     * 
     */
    @XmlElement(name = "AreaFrom")
    protected String areaFrom;
    /**
     * Optional reference to the Area to which access is requested.
     * 
     */
    @XmlElement(name = "AreaTo")
    protected String areaTo;
    /**
     * Optional entity type; if missing, a Door type as defined by the
     *                     ONVIF DoorControl service should be assumed. This can also be represented by the
     *                     QName value "tdc:Door" - where tdc is the namespace of the Door Control service:
     *                     "http://www.onvif.org/ver10/doorcontrol/wsdl". This field is provided
     *                     for future extensions; it will allow an AccessPoint being extended to cover
     *                     entity types other than Doors as well.
     * 
     */
    @XmlElement(name = "EntityType")
    protected QName entityType;
    /**
     * Reference to the entity used to control access; the entity type
     *                     may be specified by the optional EntityType field explained below but is
     *                     typically a Door.
     * 
     */
    @XmlElement(name = "Entity", required = true)
    protected String entity;

    /**
     * A user readable name. It shall be up to 64 characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Optional user readable description for the AccessPoint. It shall
     *                     be up to 1024 characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Optional reference to the Area from which access is requested.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaFrom() {
        return areaFrom;
    }

    /**
     * Sets the value of the areaFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAreaFrom()
     */
    public void setAreaFrom(String value) {
        this.areaFrom = value;
    }

    /**
     * Optional reference to the Area to which access is requested.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTo() {
        return areaTo;
    }

    /**
     * Sets the value of the areaTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAreaTo()
     */
    public void setAreaTo(String value) {
        this.areaTo = value;
    }

    /**
     * Optional entity type; if missing, a Door type as defined by the
     *                     ONVIF DoorControl service should be assumed. This can also be represented by the
     *                     QName value "tdc:Door" - where tdc is the namespace of the Door Control service:
     *                     "http://www.onvif.org/ver10/doorcontrol/wsdl". This field is provided
     *                     for future extensions; it will allow an AccessPoint being extended to cover
     *                     entity types other than Doors as well.
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
     * Reference to the entity used to control access; the entity type
     *                     may be specified by the optional EntityType field explained below but is
     *                     typically a Door.
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

}
