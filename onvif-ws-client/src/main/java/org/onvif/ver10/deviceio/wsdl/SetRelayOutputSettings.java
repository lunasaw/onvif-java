
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayOutput;


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
 *         <element name="RelayOutput" type="{http://www.onvif.org/ver10/schema}RelayOutput"/>
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
    "relayOutput"
})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutput", required = true)
    protected RelayOutput relayOutput;

    /**
     * Gets the value of the relayOutput property.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutput }
     *     
     */
    public RelayOutput getRelayOutput() {
        return relayOutput;
    }

    /**
     * Sets the value of the relayOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutput }
     *     
     */
    public void setRelayOutput(RelayOutput value) {
        this.relayOutput = value;
    }

}
