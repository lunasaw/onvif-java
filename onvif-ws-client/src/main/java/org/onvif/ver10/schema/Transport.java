
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Transport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/>
 *         <element name="Tunnel" type="{http://www.onvif.org/ver10/schema}Transport" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = {
    "protocol",
    "tunnel"
})
public class Transport {

    /**
     * Defines the network protocol for streaming, either UDP=RTP/UDP,
     *             RTSP=RTP/RTSP/TCP or HTTP=RTP/RTSP/HTTP/TCP
     * 
     */
    @XmlElement(name = "Protocol", required = true)
    @XmlSchemaType(name = "string")
    protected TransportProtocol protocol;
    /**
     * Optional element to describe further tunnel options. This element is
     *             normally not needed
     * 
     */
    @XmlElement(name = "Tunnel")
    protected Transport tunnel;

    /**
     * Defines the network protocol for streaming, either UDP=RTP/UDP,
     *             RTSP=RTP/RTSP/TCP or HTTP=RTP/RTSP/HTTP/TCP
     * 
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *     
     */
    public TransportProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *     
     * @see #getProtocol()
     */
    public void setProtocol(TransportProtocol value) {
        this.protocol = value;
    }

    /**
     * Optional element to describe further tunnel options. This element is
     *             normally not needed
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTunnel() {
        return tunnel;
    }

    /**
     * Sets the value of the tunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     * @see #getTunnel()
     */
    public void setTunnel(Transport value) {
        this.tunnel = value;
    }

}
