
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element name="CertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID" maxOccurs="unbounded" minOccurs="0"/>
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
    "certPathValidationPolicyID"
})
@XmlRootElement(name = "GetAssignedCertPathValidationPoliciesResponse")
public class GetAssignedCertPathValidationPoliciesResponse {

    /**
     * A list of IDs of the certification path validation policies that are assigned to
     *                   the TLS server.
     * 
     */
    @XmlElementRef(name = "CertPathValidationPolicyID", namespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", type = JAXBElement.class, required = false)
    protected List<JAXBElement<String>> certPathValidationPolicyID;

    /**
     * A list of IDs of the certification path validation policies that are assigned to
     *                   the TLS server.
     * 
     * Gets the value of the certPathValidationPolicyID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certPathValidationPolicyID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertPathValidationPolicyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the certPathValidationPolicyID property.
     */
    public List<JAXBElement<String>> getCertPathValidationPolicyID() {
        if (certPathValidationPolicyID == null) {
            certPathValidationPolicyID = new ArrayList<>();
        }
        return this.certPathValidationPolicyID;
    }

}
