
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
 *         <element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "receiverToken",
    "configuration"
})
@XmlRootElement(name = "ConfigureReceiver")
public class ConfigureReceiver {

    /**
     * The token of the receiver to be configured.
     * 
     */
    @XmlElement(name = "ReceiverToken", required = true)
    protected String receiverToken;
    /**
     * The new configuration for the receiver.
     * 
     */
    @XmlElement(name = "Configuration", required = true)
    protected ReceiverConfiguration configuration;

    /**
     * The token of the receiver to be configured.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverToken() {
        return receiverToken;
    }

    /**
     * Sets the value of the receiverToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReceiverToken()
     */
    public void setReceiverToken(String value) {
        this.receiverToken = value;
    }

    /**
     * The new configuration for the receiver.
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
