
package org.onvif.ver10.advancedsecurity.wsdl;

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
 *         <element name="KeyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "keyStatus"
})
@XmlRootElement(name = "GetKeyStatusResponse")
public class GetKeyStatusResponse {

    /**
     * Status of the requested key. The value should be one of the values
     *                   in the tas:KeyStatus enumeration.
     * 
     */
    @XmlElement(name = "KeyStatus", required = true)
    protected String keyStatus;

    /**
     * Status of the requested key. The value should be one of the values
     *                   in the tas:KeyStatus enumeration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStatus() {
        return keyStatus;
    }

    /**
     * Sets the value of the keyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyStatus()
     */
    public void setKeyStatus(String value) {
        this.keyStatus = value;
    }

}
