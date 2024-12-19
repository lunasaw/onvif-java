
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoSourceConfigurationOptions;


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
 *         <element name="Options" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationOptions"/>
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
@XmlRootElement(name = "GetVideoSourceConfigurationOptionsResponse")
public class GetVideoSourceConfigurationOptionsResponse {

    /**
     * This message contains the video source configuration options. If a
     *                   video source configuration is specified, the options shall concern that particular
     *                   configuration. If a media profile is specified, the options shall be compatible
     *                   with that media profile. If no tokens are specified, the options shall be
     *                   considered generic for the device.
     * 
     */
    @XmlElement(name = "Options", required = true)
    protected VideoSourceConfigurationOptions options;

    /**
     * This message contains the video source configuration options. If a
     *                   video source configuration is specified, the options shall concern that particular
     *                   configuration. If a media profile is specified, the options shall be compatible
     *                   with that media profile. If no tokens are specified, the options shall be
     *                   considered generic for the device.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationOptions }
     *     
     */
    public VideoSourceConfigurationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationOptions }
     *     
     * @see #getOptions()
     */
    public void setOptions(VideoSourceConfigurationOptions value) {
        this.options = value;
    }

}
