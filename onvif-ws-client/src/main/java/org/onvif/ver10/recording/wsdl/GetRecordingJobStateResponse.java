
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingJobStateInformation;


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
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}RecordingJobStateInformation"/>
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
    "state"
})
@XmlRootElement(name = "GetRecordingJobStateResponse")
public class GetRecordingJobStateResponse {

    /**
     * The current state of the recording job.
     * 
     */
    @XmlElement(name = "State", required = true)
    protected RecordingJobStateInformation state;

    /**
     * The current state of the recording job.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobStateInformation }
     *     
     */
    public RecordingJobStateInformation getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobStateInformation }
     *     
     * @see #getState()
     */
    public void setState(RecordingJobStateInformation value) {
        this.state = value;
    }

}
