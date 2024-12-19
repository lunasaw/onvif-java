
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base type defining the common properties of a configuration.
 * 
 * <p>Java class for ConfigurationEntity complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConfigurationEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationEntity", propOrder = {
    "name",
    "useCount"
})
@XmlSeeAlso({
    VideoSourceConfiguration.class,
    AudioSourceConfiguration.class,
    VideoEncoderConfiguration.class,
    AudioEncoderConfiguration.class,
    VideoAnalyticsConfiguration.class,
    PTZConfiguration.class,
    MetadataConfiguration.class,
    AudioOutputConfiguration.class,
    AudioDecoderConfiguration.class,
    VideoEncoder2Configuration.class,
    AudioEncoder2Configuration.class,
    VideoOutputConfiguration.class,
    AnalyticsEngine.class,
    AnalyticsEngineInput.class,
    AnalyticsEngineControl.class
})
public class ConfigurationEntity {

    /**
     * User readable name. Length up to 64 characters.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Number of internal references currently using this configuration.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             This informational parameter is read-only. Deprecated for Media2 Service.
     * 
     */
    @XmlElement(name = "UseCount")
    protected int useCount;
    /**
     * Token that uniquely refernces this configuration. Length up to 64
     *           characters.
     * 
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;

    /**
     * User readable name. Length up to 64 characters.
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
     * Number of internal references currently using this configuration.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             This informational parameter is read-only. Deprecated for Media2 Service.
     * 
     */
    public int getUseCount() {
        return useCount;
    }

    /**
     * Sets the value of the useCount property.
     * 
     */
    public void setUseCount(int value) {
        this.useCount = value;
    }

    /**
     * Token that uniquely refernces this configuration. Length up to 64
     *           characters.
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

}
