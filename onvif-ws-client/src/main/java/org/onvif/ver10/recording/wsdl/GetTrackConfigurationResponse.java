
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.TrackConfiguration;


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
 *         <element name="TrackConfiguration" type="{http://www.onvif.org/ver10/schema}TrackConfiguration"/>
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
    "trackConfiguration"
})
@XmlRootElement(name = "GetTrackConfigurationResponse")
public class GetTrackConfigurationResponse {

    /**
     * Configuration of the track.
     * 
     */
    @XmlElement(name = "TrackConfiguration", required = true)
    protected TrackConfiguration trackConfiguration;

    /**
     * Configuration of the track.
     * 
     * @return
     *     possible object is
     *     {@link TrackConfiguration }
     *     
     */
    public TrackConfiguration getTrackConfiguration() {
        return trackConfiguration;
    }

    /**
     * Sets the value of the trackConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackConfiguration }
     *     
     * @see #getTrackConfiguration()
     */
    public void setTrackConfiguration(TrackConfiguration value) {
        this.trackConfiguration = value;
    }

}
