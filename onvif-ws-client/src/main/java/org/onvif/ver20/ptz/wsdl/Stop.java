
package org.onvif.ver20.ptz.wsdl;

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
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="PanTilt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "profileToken",
    "panTilt",
    "zoom"
})
@XmlRootElement(name = "Stop")
public class Stop {

    /**
     * A reference to the MediaProfile that indicate what should be
     *                   stopped.
     * 
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * Set true when we want to stop ongoing pan and tilt movements.If
     *                   PanTilt arguments are not present, this command stops these movements.
     * 
     */
    @XmlElement(name = "PanTilt")
    protected Boolean panTilt;
    /**
     * Set true when we want to stop ongoing zoom movement.If Zoom
     *                   arguments are not present, this command stops ongoing zoom movement.
     * 
     */
    @XmlElement(name = "Zoom")
    protected Boolean zoom;

    /**
     * A reference to the MediaProfile that indicate what should be
     *                   stopped.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Sets the value of the profileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileToken()
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * Set true when we want to stop ongoing pan and tilt movements.If
     *                   PanTilt arguments are not present, this command stops these movements.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPanTilt() {
        return panTilt;
    }

    /**
     * Sets the value of the panTilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPanTilt()
     */
    public void setPanTilt(Boolean value) {
        this.panTilt = value;
    }

    /**
     * Set true when we want to stop ongoing zoom movement.If Zoom
     *                   arguments are not present, this command stops ongoing zoom movement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isZoom()
     */
    public void setZoom(Boolean value) {
        this.zoom = value;
    }

}
