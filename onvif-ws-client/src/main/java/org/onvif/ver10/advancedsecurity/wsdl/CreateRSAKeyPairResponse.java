
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/>
 *         <element name="EstimatedCreationTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
    "keyID",
    "estimatedCreationTime"
})
@XmlRootElement(name = "CreateRSAKeyPairResponse")
public class CreateRSAKeyPairResponse {

    /**
     * The key ID of the key pair being generated.
     * 
     */
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    /**
     * Best-effort estimate of how long the key generation will take.
     * 
     */
    @XmlElement(name = "EstimatedCreationTime", required = true)
    protected Duration estimatedCreationTime;

    /**
     * The key ID of the key pair being generated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyID()
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * Best-effort estimate of how long the key generation will take.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedCreationTime() {
        return estimatedCreationTime;
    }

    /**
     * Sets the value of the estimatedCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getEstimatedCreationTime()
     */
    public void setEstimatedCreationTime(Duration value) {
        this.estimatedCreationTime = value;
    }

}
