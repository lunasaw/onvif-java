
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
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
 *         <element name="OldCertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID"/>
 *         <element name="NewCertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID"/>
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
    "oldCertPathValidationPolicyID",
    "newCertPathValidationPolicyID"
})
@XmlRootElement(name = "ReplaceCertPathValidationPolicyAssignment")
public class ReplaceCertPathValidationPolicyAssignment {

    /**
     * The ID of the certification path validation policy to be de-assigned from the TLS
     *                   server.
     * 
     */
    @XmlElement(name = "OldCertPathValidationPolicyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String oldCertPathValidationPolicyID;
    /**
     * The ID of the certification path validation policy to assign to the TLS server.
     * 
     */
    @XmlElement(name = "NewCertPathValidationPolicyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String newCertPathValidationPolicyID;

    /**
     * The ID of the certification path validation policy to be de-assigned from the TLS
     *                   server.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCertPathValidationPolicyID() {
        return oldCertPathValidationPolicyID;
    }

    /**
     * Sets the value of the oldCertPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOldCertPathValidationPolicyID()
     */
    public void setOldCertPathValidationPolicyID(String value) {
        this.oldCertPathValidationPolicyID = value;
    }

    /**
     * The ID of the certification path validation policy to assign to the TLS server.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCertPathValidationPolicyID() {
        return newCertPathValidationPolicyID;
    }

    /**
     * Sets the value of the newCertPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNewCertPathValidationPolicyID()
     */
    public void setNewCertPathValidationPolicyID(String value) {
        this.newCertPathValidationPolicyID = value;
    }

}
