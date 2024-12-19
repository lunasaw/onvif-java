
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="PassphraseAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
    "passphraseAttribute"
})
@XmlRootElement(name = "GetAllPassphrasesResponse")
public class GetAllPassphrasesResponse {

    /**
     * Information about a passphrase in the keystore.
     * 
     */
    @XmlElement(name = "PassphraseAttribute")
    protected List<PassphraseAttribute> passphraseAttribute;

    /**
     * Information about a passphrase in the keystore.
     * 
     * Gets the value of the passphraseAttribute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passphraseAttribute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassphraseAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassphraseAttribute }
     * </p>
     * 
     * 
     * @return
     *     The value of the passphraseAttribute property.
     */
    public List<PassphraseAttribute> getPassphraseAttribute() {
        if (passphraseAttribute == null) {
            passphraseAttribute = new ArrayList<>();
        }
        return this.passphraseAttribute;
    }

}
