
package org.onvif.ver10.recording.wsdl;

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
 *         <element name="Options" type="{http://www.onvif.org/ver10/recording/wsdl}RecordingOptions"/>
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
@XmlRootElement(name = "GetRecordingOptionsResponse")
public class GetRecordingOptionsResponse {

    /**
     * Configuration of the recording.
     * 
     */
    @XmlElement(name = "Options", required = true)
    protected RecordingOptions options;

    /**
     * Configuration of the recording.
     * 
     * @return
     *     possible object is
     *     {@link RecordingOptions }
     *     
     */
    public RecordingOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingOptions }
     *     
     * @see #getOptions()
     */
    public void setOptions(RecordingOptions value) {
        this.options = value;
    }

}
