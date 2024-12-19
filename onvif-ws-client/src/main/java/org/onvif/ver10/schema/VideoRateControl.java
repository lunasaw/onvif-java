
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoRateControl complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoRateControl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    /**
     * Maximum output framerate in fps. If an EncodingInterval is provided the
     *             resulting encoded framerate will be reduced by the given factor.
     * 
     */
    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    /**
     * Interval at which images are encoded and transmitted. (A value of 1
     *             means that every frame is encoded, a value of 2 means that every 2nd frame is encoded
     *             ...)
     * 
     */
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    /**
     * the maximum output bitrate in kbps
     * 
     */
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * Maximum output framerate in fps. If an EncodingInterval is provided the
     *             resulting encoded framerate will be reduced by the given factor.
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Sets the value of the frameRateLimit property.
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * Interval at which images are encoded and transmitted. (A value of 1
     *             means that every frame is encoded, a value of 2 means that every 2nd frame is encoded
     *             ...)
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * Sets the value of the encodingInterval property.
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * the maximum output bitrate in kbps
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Sets the value of the bitrateLimit property.
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}
