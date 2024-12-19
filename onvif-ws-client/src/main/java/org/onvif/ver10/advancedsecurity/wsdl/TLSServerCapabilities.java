
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The capabilities of a TLS server implementation on a device.
 * 
 * <p>Java class for TLSServerCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TLSServerCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TLSServerSupported" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}TLSVersions" />
 *       <attribute name="MaximumNumberOfTLSCertificationPaths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="TLSClientAuthSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MaximumNumberOfTLSCertificationPathValidationPolicies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLSServerCapabilities", propOrder = {
    "any"
})
public class TLSServerCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates which TLS versions are supported by the device.
     * 
     */
    @XmlAttribute(name = "TLSServerSupported")
    protected List<String> tlsServerSupported;
    /**
     * Indicates the maximum number of certification paths that may be
     *               assigned to the TLS server simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPaths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfTLSCertificationPaths;
    /**
     * Indicates whether the device supports TLS tests authentication.
     * 
     */
    @XmlAttribute(name = "TLSClientAuthSupported")
    protected Boolean tlsClientAuthSupported;
    /**
     * Indicates the maximum number of certification path validation policies
     *               that may be assigned to the TLS server simultaneously.
     * 
     */
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPathValidationPolicies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfTLSCertificationPathValidationPolicies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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

    /**
     * Indicates which TLS versions are supported by the device.
     * 
     * Gets the value of the tlsServerSupported property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tlsServerSupported property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTLSServerSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the tlsServerSupported property.
     */
    public List<String> getTLSServerSupported() {
        if (tlsServerSupported == null) {
            tlsServerSupported = new ArrayList<>();
        }
        return this.tlsServerSupported;
    }

    /**
     * Indicates the maximum number of certification paths that may be
     *               assigned to the TLS server simultaneously.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPaths() {
        return maximumNumberOfTLSCertificationPaths;
    }

    /**
     * Sets the value of the maximumNumberOfTLSCertificationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfTLSCertificationPaths()
     */
    public void setMaximumNumberOfTLSCertificationPaths(BigInteger value) {
        this.maximumNumberOfTLSCertificationPaths = value;
    }

    /**
     * Indicates whether the device supports TLS tests authentication.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLSClientAuthSupported() {
        return tlsClientAuthSupported;
    }

    /**
     * Sets the value of the tlsClientAuthSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTLSClientAuthSupported()
     */
    public void setTLSClientAuthSupported(Boolean value) {
        this.tlsClientAuthSupported = value;
    }

    /**
     * Indicates the maximum number of certification path validation policies
     *               that may be assigned to the TLS server simultaneously.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPathValidationPolicies() {
        return maximumNumberOfTLSCertificationPathValidationPolicies;
    }

    /**
     * Sets the value of the maximumNumberOfTLSCertificationPathValidationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumNumberOfTLSCertificationPathValidationPolicies()
     */
    public void setMaximumNumberOfTLSCertificationPathValidationPolicies(BigInteger value) {
        this.maximumNumberOfTLSCertificationPathValidationPolicies = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
