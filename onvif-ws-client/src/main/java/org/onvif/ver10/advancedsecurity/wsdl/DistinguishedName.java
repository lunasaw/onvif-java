
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DistinguishedName complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistinguishedName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Country" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Organization" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrganizationalUnit" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DistinguishedNameQualifier" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StateOrProvinceName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CommonName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SerialNumber" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Locality" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Title" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Surname" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GivenName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Initials" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Pseudonym" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GenerationQualifier" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GenericAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeTypeAndValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MultiValuedRDN" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}MultiValuedRDN" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="anyAttribute" minOccurs="0">
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
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistinguishedName", propOrder = {
    "country",
    "organization",
    "organizationalUnit",
    "distinguishedNameQualifier",
    "stateOrProvinceName",
    "commonName",
    "serialNumber",
    "locality",
    "title",
    "surname",
    "givenName",
    "initials",
    "pseudonym",
    "generationQualifier",
    "genericAttribute",
    "multiValuedRDN",
    "anyAttribute"
})
public class DistinguishedName {

    /**
     * A country name as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "Country")
    protected List<String> country;
    /**
     * An organization name as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "Organization")
    protected List<String> organization;
    /**
     * An organizational unit name as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "OrganizationalUnit")
    protected List<String> organizationalUnit;
    /**
     * A distinguished name qualifier as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "DistinguishedNameQualifier")
    protected List<String> distinguishedNameQualifier;
    /**
     * A state or province name as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "StateOrProvinceName")
    protected List<String> stateOrProvinceName;
    /**
     * A common name as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "CommonName")
    protected List<String> commonName;
    /**
     * A serial number as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "SerialNumber")
    protected List<String> serialNumber;
    /**
     * A locality as specified in X.500.
     * 
     */
    @XmlElement(name = "Locality")
    protected List<String> locality;
    /**
     * A title as specified in X.500.
     * 
     */
    @XmlElement(name = "Title")
    protected List<String> title;
    /**
     * A surname as specified in X.500.
     * 
     */
    @XmlElement(name = "Surname")
    protected List<String> surname;
    /**
     * A given name as specified in X.500.
     * 
     */
    @XmlElement(name = "GivenName")
    protected List<String> givenName;
    /**
     * Initials as specified in X.500.
     * 
     */
    @XmlElement(name = "Initials")
    protected List<String> initials;
    /**
     * A pseudonym as specified in X.500.
     * 
     */
    @XmlElement(name = "Pseudonym")
    protected List<String> pseudonym;
    /**
     * A generation qualifier as specified in
     *                 X.500.
     * 
     */
    @XmlElement(name = "GenerationQualifier")
    protected List<String> generationQualifier;
    /**
     * A generic type-value pair
     *                 attribute.
     * 
     */
    @XmlElement(name = "GenericAttribute")
    protected List<DNAttributeTypeAndValue> genericAttribute;
    /**
     * A multi-valued RDN
     * 
     */
    @XmlElement(name = "MultiValuedRDN")
    protected List<MultiValuedRDN> multiValuedRDN;
    /**
     * Required extension point. It is recommended to not use this element, and instead use
     *                 GenericAttribute and the numeric Distinguished Name Attribute Type.
     * 
     */
    protected DistinguishedName.AnyAttribute anyAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A country name as specified in
     *                 X.500.
     * 
     * Gets the value of the country property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCountry().add(newItem);
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
     *     The value of the country property.
     */
    public List<String> getCountry() {
        if (country == null) {
            country = new ArrayList<>();
        }
        return this.country;
    }

    /**
     * An organization name as specified in
     *                 X.500.
     * 
     * Gets the value of the organization property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganization().add(newItem);
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
     *     The value of the organization property.
     */
    public List<String> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<>();
        }
        return this.organization;
    }

    /**
     * An organizational unit name as specified in
     *                 X.500.
     * 
     * Gets the value of the organizationalUnit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationalUnit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganizationalUnit().add(newItem);
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
     *     The value of the organizationalUnit property.
     */
    public List<String> getOrganizationalUnit() {
        if (organizationalUnit == null) {
            organizationalUnit = new ArrayList<>();
        }
        return this.organizationalUnit;
    }

    /**
     * A distinguished name qualifier as specified in
     *                 X.500.
     * 
     * Gets the value of the distinguishedNameQualifier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distinguishedNameQualifier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistinguishedNameQualifier().add(newItem);
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
     *     The value of the distinguishedNameQualifier property.
     */
    public List<String> getDistinguishedNameQualifier() {
        if (distinguishedNameQualifier == null) {
            distinguishedNameQualifier = new ArrayList<>();
        }
        return this.distinguishedNameQualifier;
    }

    /**
     * A state or province name as specified in
     *                 X.500.
     * 
     * Gets the value of the stateOrProvinceName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateOrProvinceName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStateOrProvinceName().add(newItem);
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
     *     The value of the stateOrProvinceName property.
     */
    public List<String> getStateOrProvinceName() {
        if (stateOrProvinceName == null) {
            stateOrProvinceName = new ArrayList<>();
        }
        return this.stateOrProvinceName;
    }

    /**
     * A common name as specified in
     *                 X.500.
     * 
     * Gets the value of the commonName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommonName().add(newItem);
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
     *     The value of the commonName property.
     */
    public List<String> getCommonName() {
        if (commonName == null) {
            commonName = new ArrayList<>();
        }
        return this.commonName;
    }

    /**
     * A serial number as specified in
     *                 X.500.
     * 
     * Gets the value of the serialNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSerialNumber().add(newItem);
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
     *     The value of the serialNumber property.
     */
    public List<String> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<>();
        }
        return this.serialNumber;
    }

    /**
     * A locality as specified in X.500.
     * 
     * Gets the value of the locality property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locality property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLocality().add(newItem);
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
     *     The value of the locality property.
     */
    public List<String> getLocality() {
        if (locality == null) {
            locality = new ArrayList<>();
        }
        return this.locality;
    }

    /**
     * A title as specified in X.500.
     * 
     * Gets the value of the title property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTitle().add(newItem);
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
     *     The value of the title property.
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<>();
        }
        return this.title;
    }

    /**
     * A surname as specified in X.500.
     * 
     * Gets the value of the surname property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surname property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSurname().add(newItem);
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
     *     The value of the surname property.
     */
    public List<String> getSurname() {
        if (surname == null) {
            surname = new ArrayList<>();
        }
        return this.surname;
    }

    /**
     * A given name as specified in X.500.
     * 
     * Gets the value of the givenName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGivenName().add(newItem);
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
     *     The value of the givenName property.
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<>();
        }
        return this.givenName;
    }

    /**
     * Initials as specified in X.500.
     * 
     * Gets the value of the initials property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initials property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInitials().add(newItem);
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
     *     The value of the initials property.
     */
    public List<String> getInitials() {
        if (initials == null) {
            initials = new ArrayList<>();
        }
        return this.initials;
    }

    /**
     * A pseudonym as specified in X.500.
     * 
     * Gets the value of the pseudonym property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pseudonym property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPseudonym().add(newItem);
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
     *     The value of the pseudonym property.
     */
    public List<String> getPseudonym() {
        if (pseudonym == null) {
            pseudonym = new ArrayList<>();
        }
        return this.pseudonym;
    }

    /**
     * A generation qualifier as specified in
     *                 X.500.
     * 
     * Gets the value of the generationQualifier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationQualifier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGenerationQualifier().add(newItem);
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
     *     The value of the generationQualifier property.
     */
    public List<String> getGenerationQualifier() {
        if (generationQualifier == null) {
            generationQualifier = new ArrayList<>();
        }
        return this.generationQualifier;
    }

    /**
     * A generic type-value pair
     *                 attribute.
     * 
     * Gets the value of the genericAttribute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttribute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGenericAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNAttributeTypeAndValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the genericAttribute property.
     */
    public List<DNAttributeTypeAndValue> getGenericAttribute() {
        if (genericAttribute == null) {
            genericAttribute = new ArrayList<>();
        }
        return this.genericAttribute;
    }

    /**
     * A multi-valued RDN
     * 
     * Gets the value of the multiValuedRDN property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiValuedRDN property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMultiValuedRDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiValuedRDN }
     * </p>
     * 
     * 
     * @return
     *     The value of the multiValuedRDN property.
     */
    public List<MultiValuedRDN> getMultiValuedRDN() {
        if (multiValuedRDN == null) {
            multiValuedRDN = new ArrayList<>();
        }
        return this.multiValuedRDN;
    }

    /**
     * Required extension point. It is recommended to not use this element, and instead use
     *                 GenericAttribute and the numeric Distinguished Name Attribute Type.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName.AnyAttribute }
     *     
     */
    public DistinguishedName.AnyAttribute getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName.AnyAttribute }
     *     
     * @see #getAnyAttribute()
     */
    public void setAnyAttribute(DistinguishedName.AnyAttribute value) {
        this.anyAttribute = value;
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
    public static class AnyAttribute {

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
