
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         <element name="AccessPointToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/>
 *         <element name="CredentialToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/>
 *         <element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Decision" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}Decision"/>
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
    "accessPointToken",
    "credentialToken",
    "reason",
    "decision"
})
@XmlRootElement(name = "ExternalAuthorization")
public class ExternalAuthorization {

    /**
     * Token of the Access Point instance.
     * 
     */
    @XmlElement(name = "AccessPointToken", required = true)
    protected String accessPointToken;
    /**
     * Optional token of the Credential involved.
     * 
     */
    @XmlElement(name = "CredentialToken")
    protected String credentialToken;
    /**
     * Optional reason for decision.
     * 
     */
    @XmlElement(name = "Reason")
    protected String reason;
    /**
     * Decision - Granted or Denied.
     * 
     */
    @XmlElement(name = "Decision", required = true)
    @XmlSchemaType(name = "string")
    protected Decision decision;

    /**
     * Token of the Access Point instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPointToken() {
        return accessPointToken;
    }

    /**
     * Sets the value of the accessPointToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccessPointToken()
     */
    public void setAccessPointToken(String value) {
        this.accessPointToken = value;
    }

    /**
     * Optional token of the Credential involved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialToken() {
        return credentialToken;
    }

    /**
     * Sets the value of the credentialToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCredentialToken()
     */
    public void setCredentialToken(String value) {
        this.credentialToken = value;
    }

    /**
     * Optional reason for decision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReason()
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Decision - Granted or Denied.
     * 
     * @return
     *     possible object is
     *     {@link Decision }
     *     
     */
    public Decision getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decision }
     *     
     * @see #getDecision()
     */
    public void setDecision(Decision value) {
        this.decision = value;
    }

}
