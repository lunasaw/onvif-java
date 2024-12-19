
package org.onvif.ver10.advancedsecurity.wsdl;

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
 *         <element name="PassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID"/>
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
    "passphraseID"
})
@XmlRootElement(name = "UploadPassphraseResponse")
public class UploadPassphraseResponse {

    /**
     * The PassphraseID of the uploaded passphrase.
     * 
     */
    @XmlElement(name = "PassphraseID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String passphraseID;

    /**
     * The PassphraseID of the uploaded passphrase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphraseID() {
        return passphraseID;
    }

    /**
     * Sets the value of the passphraseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassphraseID()
     */
    public void setPassphraseID(String value) {
        this.passphraseID = value;
    }

}
