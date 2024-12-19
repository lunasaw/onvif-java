
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkInterfaceConnectionSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkInterfaceConnectionSetting">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoNegotiation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Duplex" type="{http://www.onvif.org/ver10/schema}Duplex"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = {
    "autoNegotiation",
    "speed",
    "duplex"
})
public class NetworkInterfaceConnectionSetting {

    /**
     * Auto negotiation on/off.
     * 
     */
    @XmlElement(name = "AutoNegotiation")
    protected boolean autoNegotiation;
    /**
     * Speed.
     * 
     */
    @XmlElement(name = "Speed")
    protected int speed;
    /**
     * Duplex type, Half or Full.
     * 
     */
    @XmlElement(name = "Duplex", required = true)
    @XmlSchemaType(name = "string")
    protected Duplex duplex;

    /**
     * Auto negotiation on/off.
     * 
     */
    public boolean isAutoNegotiation() {
        return autoNegotiation;
    }

    /**
     * Sets the value of the autoNegotiation property.
     * 
     */
    public void setAutoNegotiation(boolean value) {
        this.autoNegotiation = value;
    }

    /**
     * Speed.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Duplex type, Half or Full.
     * 
     * @return
     *     possible object is
     *     {@link Duplex }
     *     
     */
    public Duplex getDuplex() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duplex }
     *     
     * @see #getDuplex()
     */
    public void setDuplex(Duplex value) {
        this.duplex = value;
    }

}
