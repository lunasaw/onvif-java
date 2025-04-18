
package org.onvif.ver10.accessrules.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * 
 *             The access policy is an association of an access point and a schedule. It defines when
 *             an access
 *             point can be accessed using an access profile which contains this access policy. If an
 *             access
 *             profile contains several access policies specifying different schedules for the same
 *             access
 *             point will result in a union of the schedules.
 *           
 * 
 * <p>AccessPolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccessPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScheduleToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessPolicyExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

    @XmlElement(name = "ScheduleToken", required = true)
    protected String scheduleToken;
    @XmlElement(name = "Entity", required = true)
    protected String entity;
    @XmlElement(name = "EntityType")
    protected QName entityType;
    @XmlElement(name = "Extension")
    protected AccessPolicyExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取scheduleToken属性的值。
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
     * 设置scheduleToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleToken(String value) {
        this.scheduleToken = value;
    }

    /**
     * 获取entity属性的值。
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
     * 设置entity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * 获取entityType属性的值。
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
     * 设置entityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setEntityType(QName value) {
        this.entityType = value;
    }

    /**
     * 获取extension属性的值。
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
     * 设置extension属性的值。
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
