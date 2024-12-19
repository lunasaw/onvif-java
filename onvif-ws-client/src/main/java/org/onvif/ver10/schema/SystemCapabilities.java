
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


/**
 * <p>Java class for SystemCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SystemCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedVersions" type="{http://www.onvif.org/ver10/schema}OnvifVersion" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension" minOccurs="0"/>
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

    /**
     * Indicates whether or not WS Discovery resolve requests are supported.
     * 
     */
    @XmlElement(name = "DiscoveryResolve")
    protected boolean discoveryResolve;
    /**
     * Indicates whether or not WS-Discovery Bye is supported.
     * 
     */
    @XmlElement(name = "DiscoveryBye")
    protected boolean discoveryBye;
    /**
     * Indicates whether or not remote discovery is supported.
     * 
     */
    @XmlElement(name = "RemoteDiscovery")
    protected boolean remoteDiscovery;
    /**
     * Indicates whether or not system backup is supported.
     * 
     */
    @XmlElement(name = "SystemBackup")
    protected boolean systemBackup;
    /**
     * Indicates whether or not system logging is supported.
     * 
     */
    @XmlElement(name = "SystemLogging")
    protected boolean systemLogging;
    /**
     * Indicates whether or not firmware upgrade is supported.
     * 
     */
    @XmlElement(name = "FirmwareUpgrade")
    protected boolean firmwareUpgrade;
    /**
     * Indicates supported ONVIF version(s).
     * 
     */
    @XmlElement(name = "SupportedVersions", required = true)
    protected List<OnvifVersion> supportedVersions;
    @XmlElement(name = "Extension")
    protected SystemCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not WS Discovery resolve requests are supported.
     * 
     */
    public boolean isDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * Sets the value of the discoveryResolve property.
     * 
     */
    public void setDiscoveryResolve(boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * Indicates whether or not WS-Discovery Bye is supported.
     * 
     */
    public boolean isDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * Sets the value of the discoveryBye property.
     * 
     */
    public void setDiscoveryBye(boolean value) {
        this.discoveryBye = value;
    }

    /**
     * Indicates whether or not remote discovery is supported.
     * 
     */
    public boolean isRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * Sets the value of the remoteDiscovery property.
     * 
     */
    public void setRemoteDiscovery(boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * Indicates whether or not system backup is supported.
     * 
     */
    public boolean isSystemBackup() {
        return systemBackup;
    }

    /**
     * Sets the value of the systemBackup property.
     * 
     */
    public void setSystemBackup(boolean value) {
        this.systemBackup = value;
    }

    /**
     * Indicates whether or not system logging is supported.
     * 
     */
    public boolean isSystemLogging() {
        return systemLogging;
    }

    /**
     * Sets the value of the systemLogging property.
     * 
     */
    public void setSystemLogging(boolean value) {
        this.systemLogging = value;
    }

    /**
     * Indicates whether or not firmware upgrade is supported.
     * 
     */
    public boolean isFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    /**
     * Sets the value of the firmwareUpgrade property.
     * 
     */
    public void setFirmwareUpgrade(boolean value) {
        this.firmwareUpgrade = value;
    }

    /**
     * Indicates supported ONVIF version(s).
     * 
     * Gets the value of the supportedVersions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnvifVersion }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedVersions property.
     */
    public List<OnvifVersion> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new ArrayList<>();
        }
        return this.supportedVersions;
    }

    /**
     * Gets the value of the extension property.
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
     * Sets the value of the extension property.
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

}
