
package org.onvif.ver10.receiver.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverMode;


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
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ReceiverMode"/>
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
    "mode"
})
@XmlRootElement(name = "SetReceiverMode")
public class SetReceiverMode {

    /**
     * The token of the receiver to be changed.
     * 
     */
    @XmlElement(name = "ReceiverToken", required = true)
    protected String receiverToken;
    /**
     * The new receiver mode. Options available are:
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiverMode mode;

    /**
     * The token of the receiver to be changed.
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
     * The new receiver mode. Options available are:
     * 
     * @return
     *     possible object is
     *     {@link ReceiverMode }
     *     
     */
    public ReceiverMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverMode }
     *     
     * @see #getMode()
     */
    public void setMode(ReceiverMode value) {
        this.mode = value;
    }

}
