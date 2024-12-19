
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CertificateWithPrivateKey;


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
 *         <element name="CertificateWithPrivateKey" type="{http://www.onvif.org/ver10/schema}CertificateWithPrivateKey" maxOccurs="unbounded"/>
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
    "certificateWithPrivateKey"
})
@XmlRootElement(name = "LoadCertificateWithPrivateKey")
public class LoadCertificateWithPrivateKey {

    @XmlElement(name = "CertificateWithPrivateKey", required = true)
    protected List<CertificateWithPrivateKey> certificateWithPrivateKey;

    /**
     * Gets the value of the certificateWithPrivateKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateWithPrivateKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificateWithPrivateKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateWithPrivateKey }
     * </p>
     * 
     * 
     * @return
     *     The value of the certificateWithPrivateKey property.
     */
    public List<CertificateWithPrivateKey> getCertificateWithPrivateKey() {
        if (certificateWithPrivateKey == null) {
            certificateWithPrivateKey = new ArrayList<>();
        }
        return this.certificateWithPrivateKey;
    }

}
