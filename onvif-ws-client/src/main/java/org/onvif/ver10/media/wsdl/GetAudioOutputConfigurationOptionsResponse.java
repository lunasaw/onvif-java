
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioOutputConfigurationOptions;


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
 *         <element name="Options" type="{http://www.onvif.org/ver10/schema}AudioOutputConfigurationOptions"/>
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
    "options"
})
@XmlRootElement(name = "GetAudioOutputConfigurationOptionsResponse")
public class GetAudioOutputConfigurationOptionsResponse {

    /**
     * This message contains the audio output configuration options. If a
     *                   audio output configuration is specified, the options shall concern that particular
     *                   configuration. If a media profile is specified, the options shall be compatible
     *                   with that media profile. If no tokens are specified, the options shall be
     *                   considered generic for the device.
     * 
     */
    @XmlElement(name = "Options", required = true)
    protected AudioOutputConfigurationOptions options;

    /**
     * This message contains the audio output configuration options. If a
     *                   audio output configuration is specified, the options shall concern that particular
     *                   configuration. If a media profile is specified, the options shall be compatible
     *                   with that media profile. If no tokens are specified, the options shall be
     *                   considered generic for the device.
     * 
     * @return
     *     possible object is
     *     {@link AudioOutputConfigurationOptions }
     *     
     */
    public AudioOutputConfigurationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOutputConfigurationOptions }
     *     
     * @see #getOptions()
     */
    public void setOptions(AudioOutputConfigurationOptions value) {
        this.options = value;
    }

}
