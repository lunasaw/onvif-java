
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
 *         <element name="hasPrivateKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "hasPrivateKey"
})
@XmlRootElement(name = "GetPrivateKeyStatusResponse")
public class GetPrivateKeyStatusResponse {

    /**
     * True if and only if the key pair contains a private key.
     * 
     */
    protected boolean hasPrivateKey;

    /**
     * True if and only if the key pair contains a private key.
     * 
     */
    public boolean isHasPrivateKey() {
        return hasPrivateKey;
    }

    /**
     * Sets the value of the hasPrivateKey property.
     * 
     */
    public void setHasPrivateKey(boolean value) {
        this.hasPrivateKey = value;
    }

}
