
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CertPathValidationParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CertPathValidationParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RequireTLSWWWClientAuthExtendedKeyUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="UseDeltaCRLs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="anyParameters" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertPathValidationParameters", propOrder = {
    "requireTLSWWWClientAuthExtendedKeyUsage",
    "useDeltaCRLs",
    "anyParameters"
})
public class CertPathValidationParameters {

    /**
     * True if and only if the TLS server shall not authenticate tests
     *                 certificates that do not contain the TLS WWW tests authentication key usage
     *                 extension as specified in RFC 5280, Sect. 4.2.1.12.
     * 
     */
    @XmlElement(name = "RequireTLSWWWClientAuthExtendedKeyUsage", defaultValue = "false")
    protected Boolean requireTLSWWWClientAuthExtendedKeyUsage;
    /**
     * True if and only if delta CRLs, if available, shall be applied to
     *                 CRLs.
     * 
     */
    @XmlElement(name = "UseDeltaCRLs", defaultValue = "false")
    protected Boolean useDeltaCRLs;
    protected CertPathValidationParameters.AnyParameters anyParameters;

    /**
     * True if and only if the TLS server shall not authenticate tests
     *                 certificates that do not contain the TLS WWW tests authentication key usage
     *                 extension as specified in RFC 5280, Sect. 4.2.1.12.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireTLSWWWClientAuthExtendedKeyUsage() {
        return requireTLSWWWClientAuthExtendedKeyUsage;
    }

    /**
     * Sets the value of the requireTLSWWWClientAuthExtendedKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRequireTLSWWWClientAuthExtendedKeyUsage()
     */
    public void setRequireTLSWWWClientAuthExtendedKeyUsage(Boolean value) {
        this.requireTLSWWWClientAuthExtendedKeyUsage = value;
    }

    /**
     * True if and only if delta CRLs, if available, shall be applied to
     *                 CRLs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDeltaCRLs() {
        return useDeltaCRLs;
    }

    /**
     * Sets the value of the useDeltaCRLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUseDeltaCRLs()
     */
    public void setUseDeltaCRLs(Boolean value) {
        this.useDeltaCRLs = value;
    }

    /**
     * Gets the value of the anyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public CertPathValidationParameters.AnyParameters getAnyParameters() {
        return anyParameters;
    }

    /**
     * Sets the value of the anyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public void setAnyParameters(CertPathValidationParameters.AnyParameters value) {
        this.anyParameters = value;
    }


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
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class AnyParameters {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }

}
