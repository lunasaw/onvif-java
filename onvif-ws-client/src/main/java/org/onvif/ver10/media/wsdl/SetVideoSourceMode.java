
package org.onvif.ver10.media.wsdl;

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
 *         <element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="VideoSourceModeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "videoSourceToken",
    "videoSourceModeToken"
})
@XmlRootElement(name = "SetVideoSourceMode")
public class SetVideoSourceMode {

    /**
     * Contains a video source reference for which a video source mode is
     *                   requested.
     * 
     */
    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;
    /**
     * Indicate video source mode.
     * 
     */
    @XmlElement(name = "VideoSourceModeToken", required = true)
    protected String videoSourceModeToken;

    /**
     * Contains a video source reference for which a video source mode is
     *                   requested.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceToken() {
        return videoSourceToken;
    }

    /**
     * Sets the value of the videoSourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVideoSourceToken()
     */
    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    /**
     * Indicate video source mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceModeToken() {
        return videoSourceModeToken;
    }

    /**
     * Sets the value of the videoSourceModeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVideoSourceModeToken()
     */
    public void setVideoSourceModeToken(String value) {
        this.videoSourceModeToken = value;
    }

}
