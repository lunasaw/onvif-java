
package org.onvif.ver10.replay.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.StreamSetup;


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
 *         <element name="StreamSetup" type="{http://www.onvif.org/ver10/schema}StreamSetup"/>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "streamSetup",
    "recordingToken"
})
@XmlRootElement(name = "GetReplayUri")
public class GetReplayUri {

    /**
     * Specifies the connection parameters to be used for the stream. The
     *                   URI that is returned may depend on these parameters.
     * 
     */
    @XmlElement(name = "StreamSetup", required = true)
    protected StreamSetup streamSetup;
    /**
     * The identifier of the recording to be streamed.
     * 
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;

    /**
     * Specifies the connection parameters to be used for the stream. The
     *                   URI that is returned may depend on these parameters.
     * 
     * @return
     *     possible object is
     *     {@link StreamSetup }
     *     
     */
    public StreamSetup getStreamSetup() {
        return streamSetup;
    }

    /**
     * Sets the value of the streamSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamSetup }
     *     
     * @see #getStreamSetup()
     */
    public void setStreamSetup(StreamSetup value) {
        this.streamSetup = value;
    }

    /**
     * The identifier of the recording to be streamed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Sets the value of the recordingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecordingToken()
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

}
