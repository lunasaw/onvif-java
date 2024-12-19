
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZSpeed;


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
 *         <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
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
    "presetToken",
    "speed"
})
@XmlRootElement(name = "GotoPreset")
public class GotoPreset {

    /**
     * A reference to the MediaProfile where the operation should take
     *                   place.
     * 
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * A requested preset token.
     * 
     */
    @XmlElement(name = "PresetToken", required = true)
    protected String presetToken;
    /**
     * A requested speed.The speed parameter can only be specified when
     *                   Speed Spaces are available for the PTZ Node.
     * 
     */
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;

    /**
     * A reference to the MediaProfile where the operation should take
     *                   place.
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
     * A requested preset token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetToken() {
        return presetToken;
    }

    /**
     * Sets the value of the presetToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPresetToken()
     */
    public void setPresetToken(String value) {
        this.presetToken = value;
    }

    /**
     * A requested speed.The speed parameter can only be specified when
     *                   Speed Spaces are available for the PTZ Node.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     * @see #getSpeed()
     */
    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

}
