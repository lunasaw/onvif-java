
package org.onvif.ver10.deviceio.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioSourceConfigurationOptions;
import org.w3c.dom.Element;


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
 *         <element name="AudioSourceOptions" type="{http://www.onvif.org/ver10/schema}AudioSourceConfigurationOptions"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
    "audioSourceOptions",
    "any"
})
@XmlRootElement(name = "GetAudioSourceConfigurationOptionsResponse")
public class GetAudioSourceConfigurationOptionsResponse {

    /**
     * Returns the AudioSourceToken available.
     * 
     */
    @XmlElement(name = "AudioSourceOptions", required = true)
    protected AudioSourceConfigurationOptions audioSourceOptions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Returns the AudioSourceToken available.
     * 
     * @return
     *     possible object is
     *     {@link AudioSourceConfigurationOptions }
     *     
     */
    public AudioSourceConfigurationOptions getAudioSourceOptions() {
        return audioSourceOptions;
    }

    /**
     * Sets the value of the audioSourceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSourceConfigurationOptions }
     *     
     * @see #getAudioSourceOptions()
     */
    public void setAudioSourceOptions(AudioSourceConfigurationOptions value) {
        this.audioSourceOptions = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
