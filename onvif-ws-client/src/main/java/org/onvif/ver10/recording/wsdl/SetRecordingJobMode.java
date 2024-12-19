
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
 *         <element name="JobToken" type="{http://www.onvif.org/ver10/schema}RecordingJobReference"/>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RecordingJobMode"/>
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
    "jobToken",
    "mode"
})
@XmlRootElement(name = "SetRecordingJobMode")
public class SetRecordingJobMode {

    /**
     * Token of the recording job.
     * 
     */
    @XmlElement(name = "JobToken", required = true)
    protected String jobToken;
    /**
     * The new mode for the recording job.
     * 
     */
    @XmlElement(name = "Mode", required = true)
    protected String mode;

    /**
     * Token of the recording job.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobToken() {
        return jobToken;
    }

    /**
     * Sets the value of the jobToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getJobToken()
     */
    public void setJobToken(String value) {
        this.jobToken = value;
    }

    /**
     * The new mode for the recording job.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMode()
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
