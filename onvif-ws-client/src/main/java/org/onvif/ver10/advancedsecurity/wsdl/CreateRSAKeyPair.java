
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "keyLength",
    "alias"
})
@XmlRootElement(name = "CreateRSAKeyPair")
public class CreateRSAKeyPair {

    /**
     * The length of the key to be created.
     * 
     */
    @XmlElement(name = "KeyLength", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger keyLength;
    /**
     * The tests-defined alias of the key.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;

    /**
     * The length of the key to be created.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getKeyLength()
     */
    public void setKeyLength(BigInteger value) {
        this.keyLength = value;
    }

    /**
     * The tests-defined alias of the key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlias()
     */
    public void setAlias(String value) {
        this.alias = value;
    }

}
