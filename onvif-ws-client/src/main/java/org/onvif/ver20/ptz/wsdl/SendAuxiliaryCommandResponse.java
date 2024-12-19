
package org.onvif.ver20.ptz.wsdl;

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
 *         <element name="AuxiliaryResponse" type="{http://www.onvif.org/ver10/schema}AuxiliaryData"/>
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
    "auxiliaryResponse"
})
@XmlRootElement(name = "SendAuxiliaryCommandResponse")
public class SendAuxiliaryCommandResponse {

    /**
     * The response contains the auxiliary response.
     * 
     */
    @XmlElement(name = "AuxiliaryResponse", required = true)
    protected String auxiliaryResponse;

    /**
     * The response contains the auxiliary response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryResponse() {
        return auxiliaryResponse;
    }

    /**
     * Sets the value of the auxiliaryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuxiliaryResponse()
     */
    public void setAuxiliaryResponse(String value) {
        this.auxiliaryResponse = value;
    }

}
