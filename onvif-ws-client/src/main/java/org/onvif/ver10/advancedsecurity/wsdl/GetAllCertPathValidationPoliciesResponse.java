
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
 *         <element name="CertPathValidationPolicy" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicy" maxOccurs="unbounded" minOccurs="0"/>
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
    "certPathValidationPolicy"
})
@XmlRootElement(name = "GetAllCertPathValidationPoliciesResponse")
public class GetAllCertPathValidationPoliciesResponse {

    /**
     * A list of all certification path validation policies that are stored in the
     *                   keystore on the device.
     * 
     */
    @XmlElement(name = "CertPathValidationPolicy")
    protected List<CertPathValidationPolicy> certPathValidationPolicy;

    /**
     * A list of all certification path validation policies that are stored in the
     *                   keystore on the device.
     * 
     * Gets the value of the certPathValidationPolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certPathValidationPolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertPathValidationPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertPathValidationPolicy }
     * </p>
     * 
     * 
     * @return
     *     The value of the certPathValidationPolicy property.
     */
    public List<CertPathValidationPolicy> getCertPathValidationPolicy() {
        if (certPathValidationPolicy == null) {
            certPathValidationPolicy = new ArrayList<>();
        }
        return this.certPathValidationPolicy;
    }

}
