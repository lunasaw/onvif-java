
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="Token" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/>
 *         <element name="UseExtendedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="OpenTooLongTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="PreAlarmTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}AccessDoorExtension" minOccurs="0"/>
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
    "token",
    "useExtendedTime",
    "accessTime",
    "openTooLongTime",
    "preAlarmTime",
    "extension"
})
@XmlRootElement(name = "AccessDoor")
public class AccessDoor {

    /**
     * Token of the Door instance to control.
     * 
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    /**
     * Optional - Indicates that the configured extended time should be
     *                   used.
     * 
     */
    @XmlElement(name = "UseExtendedTime")
    protected Boolean useExtendedTime;
    /**
     * Optional - overrides AccessTime if specified.
     * 
     */
    @XmlElement(name = "AccessTime")
    protected Duration accessTime;
    /**
     * Optional - overrides OpenTooLongTime if specified (DOTL).
     * 
     */
    @XmlElement(name = "OpenTooLongTime")
    protected Duration openTooLongTime;
    /**
     * Optional - overrides PreAlarmTime if specified.
     * 
     */
    @XmlElement(name = "PreAlarmTime")
    protected Duration preAlarmTime;
    /**
     * Future extension.
     * 
     */
    @XmlElement(name = "Extension")
    protected AccessDoorExtension extension;

    /**
     * Token of the Door instance to control.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Optional - Indicates that the configured extended time should be
     *                   used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExtendedTime() {
        return useExtendedTime;
    }

    /**
     * Sets the value of the useExtendedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUseExtendedTime()
     */
    public void setUseExtendedTime(Boolean value) {
        this.useExtendedTime = value;
    }

    /**
     * Optional - overrides AccessTime if specified.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the value of the accessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getAccessTime()
     */
    public void setAccessTime(Duration value) {
        this.accessTime = value;
    }

    /**
     * Optional - overrides OpenTooLongTime if specified (DOTL).
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenTooLongTime() {
        return openTooLongTime;
    }

    /**
     * Sets the value of the openTooLongTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getOpenTooLongTime()
     */
    public void setOpenTooLongTime(Duration value) {
        this.openTooLongTime = value;
    }

    /**
     * Optional - overrides PreAlarmTime if specified.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreAlarmTime() {
        return preAlarmTime;
    }

    /**
     * Sets the value of the preAlarmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getPreAlarmTime()
     */
    public void setPreAlarmTime(Duration value) {
        this.preAlarmTime = value;
    }

    /**
     * Future extension.
     * 
     * @return
     *     possible object is
     *     {@link AccessDoorExtension }
     *     
     */
    public AccessDoorExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDoorExtension }
     *     
     * @see #getExtension()
     */
    public void setExtension(AccessDoorExtension value) {
        this.extension = value;
    }

}
