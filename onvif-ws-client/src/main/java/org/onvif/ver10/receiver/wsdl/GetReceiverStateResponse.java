
package org.onvif.ver10.receiver.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverStateInformation;


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
 *         <element name="ReceiverState" type="{http://www.onvif.org/ver10/schema}ReceiverStateInformation"/>
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
    "receiverState"
})
@XmlRootElement(name = "GetReceiverStateResponse")
public class GetReceiverStateResponse {

    /**
     * Description of the current receiver state.
     * 
     */
    @XmlElement(name = "ReceiverState", required = true)
    protected ReceiverStateInformation receiverState;

    /**
     * Description of the current receiver state.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverStateInformation }
     *     
     */
    public ReceiverStateInformation getReceiverState() {
        return receiverState;
    }

    /**
     * Sets the value of the receiverState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverStateInformation }
     *     
     * @see #getReceiverState()
     */
    public void setReceiverState(ReceiverStateInformation value) {
        this.receiverState = value;
    }

}
