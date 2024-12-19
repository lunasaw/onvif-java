
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioSource;


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
 *         <element name="AudioSources" type="{http://www.onvif.org/ver10/schema}AudioSource" maxOccurs="unbounded" minOccurs="0"/>
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
    "audioSources"
})
@XmlRootElement(name = "GetAudioSourcesResponse")
public class GetAudioSourcesResponse {

    /**
     * List of existing Audio Sources
     * 
     */
    @XmlElement(name = "AudioSources")
    protected List<AudioSource> audioSources;

    /**
     * List of existing Audio Sources
     * 
     * Gets the value of the audioSources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioSources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAudioSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioSource }
     * </p>
     * 
     * 
     * @return
     *     The value of the audioSources property.
     */
    public List<AudioSource> getAudioSources() {
        if (audioSources == null) {
            audioSources = new ArrayList<>();
        }
        return this.audioSources;
    }

}
