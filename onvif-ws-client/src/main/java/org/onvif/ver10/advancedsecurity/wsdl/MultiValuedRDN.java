
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A multi-valued RDN
 * 
 * <p>Java class for MultiValuedRDN complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiValuedRDN">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Attribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeTypeAndValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiValuedRDN", propOrder = {
    "attribute"
})
public class MultiValuedRDN {

    /**
     * A list of types and values defining a multi-valued RDN
     * 
     */
    @XmlElement(name = "Attribute")
    protected List<DNAttributeTypeAndValue> attribute;

    /**
     * A list of types and values defining a multi-valued RDN
     * 
     * Gets the value of the attribute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttribute().add(newItem);
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
     *     The value of the attribute property.
     */
    public List<DNAttributeTypeAndValue> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<>();
        }
        return this.attribute;
    }

}
