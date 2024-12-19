
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationParameters"/>
 *         <element name="TrustAnchor" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}TrustAnchor" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = {
    "alias",
    "parameters",
    "trustAnchor",
    "anyParameters"
})
@XmlRootElement(name = "CreateCertPathValidationPolicy")
public class CreateCertPathValidationPolicy {

    /**
     * The alias to assign to the created certification path validation policy.
     * 
     */
    @XmlElement(name = "Alias")
    protected String alias;
    /**
     * The parameters of the certification path validation policy to be created.
     * 
     */
    @XmlElement(name = "Parameters", required = true)
    protected CertPathValidationParameters parameters;
    /**
     * The trust anchors of the certification path validation policy to be created.
     * 
     */
    @XmlElement(name = "TrustAnchor", required = true)
    protected List<TrustAnchor> trustAnchor;
    protected CreateCertPathValidationPolicy.AnyParameters anyParameters;

    /**
     * The alias to assign to the created certification path validation policy.
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

    /**
     * The parameters of the certification path validation policy to be created.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationParameters }
     *     
     */
    public CertPathValidationParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationParameters }
     *     
     * @see #getParameters()
     */
    public void setParameters(CertPathValidationParameters value) {
        this.parameters = value;
    }

    /**
     * The trust anchors of the certification path validation policy to be created.
     * 
     * Gets the value of the trustAnchor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustAnchor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrustAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrustAnchor }
     * </p>
     * 
     * 
     * @return
     *     The value of the trustAnchor property.
     */
    public List<TrustAnchor> getTrustAnchor() {
        if (trustAnchor == null) {
            trustAnchor = new ArrayList<>();
        }
        return this.trustAnchor;
    }

    /**
     * Gets the value of the anyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCertPathValidationPolicy.AnyParameters }
     *     
     */
    public CreateCertPathValidationPolicy.AnyParameters getAnyParameters() {
        return anyParameters;
    }

    /**
     * Sets the value of the anyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCertPathValidationPolicy.AnyParameters }
     *     
     */
    public void setAnyParameters(CreateCertPathValidationPolicy.AnyParameters value) {
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
