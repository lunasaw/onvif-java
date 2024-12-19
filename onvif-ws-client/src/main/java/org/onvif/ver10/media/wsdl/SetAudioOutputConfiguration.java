
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioOutputConfiguration;


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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}AudioOutputConfiguration"/>
 *         <element name="ForcePersistence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "configuration",
    "forcePersistence"
})
@XmlRootElement(name = "SetAudioOutputConfiguration")
public class SetAudioOutputConfiguration {

    /**
     * Contains the modified audio output configuration. The
     *                   configuration shall exist in the device.
     * 
     */
    @XmlElement(name = "Configuration", required = true)
    protected AudioOutputConfiguration configuration;
    /**
     * The ForcePersistence element is obsolete and should always be
     *                   assumed to be true.
     * 
     */
    @XmlElement(name = "ForcePersistence")
    protected boolean forcePersistence;

    /**
     * Contains the modified audio output configuration. The
     *                   configuration shall exist in the device.
     * 
     * @return
     *     possible object is
     *     {@link AudioOutputConfiguration }
     *     
     */
    public AudioOutputConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOutputConfiguration }
     *     
     * @see #getConfiguration()
     */
    public void setConfiguration(AudioOutputConfiguration value) {
        this.configuration = value;
    }

    /**
     * The ForcePersistence element is obsolete and should always be
     *                   assumed to be true.
     * 
     */
    public boolean isForcePersistence() {
        return forcePersistence;
    }

    /**
     * Sets the value of the forcePersistence property.
     * 
     */
    public void setForcePersistence(boolean value) {
        this.forcePersistence = value;
    }

}
