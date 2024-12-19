
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
 *         <element name="Passphrase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PassphraseAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "passphrase",
    "passphraseAlias"
})
@XmlRootElement(name = "UploadPassphrase")
public class UploadPassphrase {

    /**
     * The passphrase to upload.
     * 
     */
    @XmlElement(name = "Passphrase", required = true)
    protected String passphrase;
    /**
     * The alias for the passphrase to upload.
     * 
     */
    @XmlElement(name = "PassphraseAlias")
    protected String passphraseAlias;

    /**
     * The passphrase to upload.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * Sets the value of the passphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassphrase()
     */
    public void setPassphrase(String value) {
        this.passphrase = value;
    }

    /**
     * The alias for the passphrase to upload.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphraseAlias() {
        return passphraseAlias;
    }

    /**
     * Sets the value of the passphraseAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassphraseAlias()
     */
    public void setPassphraseAlias(String value) {
        this.passphraseAlias = value;
    }

}
