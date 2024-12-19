
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FocusMove;


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
 *         <element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusMove"/>
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
    "focus"
})
@XmlRootElement(name = "Move")
public class Move {

    /**
     * Reference to the VideoSource for the requested move (focus) operation.
     * 
     */
    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;
    /**
     * Content of the requested move (focus) operation.
     * 
     */
    @XmlElement(name = "Focus", required = true)
    protected FocusMove focus;

    /**
     * Reference to the VideoSource for the requested move (focus) operation.
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
     * Content of the requested move (focus) operation.
     * 
     * @return
     *     possible object is
     *     {@link FocusMove }
     *     
     */
    public FocusMove getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusMove }
     *     
     * @see #getFocus()
     */
    public void setFocus(FocusMove value) {
        this.focus = value;
    }

}
