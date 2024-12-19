
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
 *         <element name="KeyAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
    "keyAttribute"
})
@XmlRootElement(name = "GetAllKeysResponse")
public class GetAllKeysResponse {

    /**
     * Information about a key in the keystore.
     * 
     */
    @XmlElement(name = "KeyAttribute")
    protected List<KeyAttribute> keyAttribute;

    /**
     * Information about a key in the keystore.
     * 
     * Gets the value of the keyAttribute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyAttribute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeyAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAttribute }
     * </p>
     * 
     * 
     * @return
     *     The value of the keyAttribute property.
     */
    public List<KeyAttribute> getKeyAttribute() {
        if (keyAttribute == null) {
            keyAttribute = new ArrayList<>();
        }
        return this.keyAttribute;
    }

}
