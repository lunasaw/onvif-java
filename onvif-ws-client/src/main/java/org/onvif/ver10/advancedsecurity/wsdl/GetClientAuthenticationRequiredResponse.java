
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="clientAuthenticationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "clientAuthenticationRequired"
})
@XmlRootElement(name = "GetClientAuthenticationRequiredResponse")
public class GetClientAuthenticationRequiredResponse {

    protected boolean clientAuthenticationRequired;

    /**
     * Gets the value of the clientAuthenticationRequired property.
     * 
     */
    public boolean isClientAuthenticationRequired() {
        return clientAuthenticationRequired;
    }

    /**
     * Sets the value of the clientAuthenticationRequired property.
     * 
     */
    public void setClientAuthenticationRequired(boolean value) {
        this.clientAuthenticationRequired = value;
    }

}
