
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>SystemCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SystemCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SupportedVersions" type="{http://www.onvif.org/ver10/schema}OnvifVersion" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "SystemCapabilities", propOrder = {
    "discoveryResolve",
    "discoveryBye",
    "remoteDiscovery",
    "systemBackup",
    "systemLogging",
    "firmwareUpgrade",
    "supportedVersions",
    "extension"
})
public class SystemCapabilities {

    @XmlElement(name = "DiscoveryResolve")
    protected boolean discoveryResolve;
    @XmlElement(name = "DiscoveryBye")
    protected boolean discoveryBye;
    @XmlElement(name = "RemoteDiscovery")
    protected boolean remoteDiscovery;
    @XmlElement(name = "SystemBackup")
    protected boolean systemBackup;
    @XmlElement(name = "SystemLogging")
    protected boolean systemLogging;
    @XmlElement(name = "FirmwareUpgrade")
    protected boolean firmwareUpgrade;
    @XmlElement(name = "SupportedVersions", required = true)
    protected List<OnvifVersion> supportedVersions;
    @XmlElement(name = "Extension")
    protected SystemCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取discoveryResolve属性的值。
     * This getter has been renamed from isDiscoveryResolve() to getDiscoveryResolve() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * 设置discoveryResolve属性的值。
     * 
     */
    public void setDiscoveryResolve(boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * 获取discoveryBye属性的值。
     * This getter has been renamed from isDiscoveryBye() to getDiscoveryBye() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * 设置discoveryBye属性的值。
     * 
     */
    public void setDiscoveryBye(boolean value) {
        this.discoveryBye = value;
    }

    /**
     * 获取remoteDiscovery属性的值。
     * This getter has been renamed from isRemoteDiscovery() to getRemoteDiscovery() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * 设置remoteDiscovery属性的值。
     * 
     */
    public void setRemoteDiscovery(boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * 获取systemBackup属性的值。
     * This getter has been renamed from isSystemBackup() to getSystemBackup() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSystemBackup() {
        return systemBackup;
    }

    /**
     * 设置systemBackup属性的值。
     * 
     */
    public void setSystemBackup(boolean value) {
        this.systemBackup = value;
    }

    /**
     * 获取systemLogging属性的值。
     * This getter has been renamed from isSystemLogging() to getSystemLogging() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSystemLogging() {
        return systemLogging;
    }

    /**
     * 设置systemLogging属性的值。
     * 
     */
    public void setSystemLogging(boolean value) {
        this.systemLogging = value;
    }

    /**
     * 获取firmwareUpgrade属性的值。
     * This getter has been renamed from isFirmwareUpgrade() to getFirmwareUpgrade() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    /**
     * 设置firmwareUpgrade属性的值。
     * 
     */
    public void setFirmwareUpgrade(boolean value) {
        this.firmwareUpgrade = value;
    }

    /**
     * Gets the value of the supportedVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnvifVersion }
     * 
     * 
     */
    public List<OnvifVersion> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new ArrayList<OnvifVersion>();
        }
        return this.supportedVersions;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilitiesExtension }
     *     
     */
    public SystemCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilitiesExtension }
     *     
     */
    public void setExtension(SystemCapabilitiesExtension value) {
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
