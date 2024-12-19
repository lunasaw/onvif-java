
package org.onvif.ver10.receiver.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverConfiguration;


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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}ReceiverConfiguration"/>
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
    "configuration"
})
@XmlRootElement(name = "CreateReceiver")
public class CreateReceiver {

    /**
     * The initial configuration for the new receiver.
     * 
     */
    @XmlElement(name = "Configuration", required = true)
    protected ReceiverConfiguration configuration;

    /**
     * The initial configuration for the new receiver.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverConfiguration }
     *     
     */
    public ReceiverConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverConfiguration }
     *     
     * @see #getConfiguration()
     */
    public void setConfiguration(ReceiverConfiguration value) {
        this.configuration = value;
    }

}
