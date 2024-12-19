
package org.onvif.ver10.deviceio.wsdl;

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
 *         <element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
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
    "relayOutputToken"
})
@XmlRootElement(name = "GetRelayOutputOptions")
public class GetRelayOutputOptions {

    /**
     * Optional reference token to the relay for which the options are requested.
     * 
     */
    @XmlElement(name = "RelayOutputToken")
    protected String relayOutputToken;

    /**
     * Optional reference token to the relay for which the options are requested.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * Sets the value of the relayOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRelayOutputToken()
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

}
