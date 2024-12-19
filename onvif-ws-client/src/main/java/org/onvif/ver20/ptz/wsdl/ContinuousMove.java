
package org.onvif.ver20.ptz.wsdl;

import javax.xml.datatype.Duration;
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
 *         <element name="Velocity" type="{http://www.onvif.org/ver10/schema}PTZSpeed"/>
 *         <element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
    "velocity",
    "timeout"
})
@XmlRootElement(name = "ContinuousMove")
public class ContinuousMove {

    /**
     * A reference to the MediaProfile.
     * 
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * A Velocity vector specifying the velocity of pan, tilt and zoom.
     * 
     */
    @XmlElement(name = "Velocity", required = true)
    protected PTZSpeed velocity;
    /**
     * An optional Timeout parameter.
     * 
     */
    @XmlElement(name = "Timeout")
    protected Duration timeout;

    /**
     * A reference to the MediaProfile.
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
     * A Velocity vector specifying the velocity of pan, tilt and zoom.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getVelocity() {
        return velocity;
    }

    /**
     * Sets the value of the velocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     * @see #getVelocity()
     */
    public void setVelocity(PTZSpeed value) {
        this.velocity = value;
    }

    /**
     * An optional Timeout parameter.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getTimeout()
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

}
