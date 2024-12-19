
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Scope;


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
 *         <element name="Scopes" type="{http://www.onvif.org/ver10/schema}Scope" maxOccurs="unbounded"/>
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
    "scopes"
})
@XmlRootElement(name = "GetScopesResponse")
public class GetScopesResponse {

    /**
     * Contains a list of URI definining the device scopes. Scope
     *                   parameters can be of two types: fixed and configurable. Fixed parameters can not
     *                   be altered.
     * 
     */
    @XmlElement(name = "Scopes", required = true)
    protected List<Scope> scopes;

    /**
     * Contains a list of URI definining the device scopes. Scope
     *                   parameters can be of two types: fixed and configurable. Fixed parameters can not
     *                   be altered.
     * 
     * Gets the value of the scopes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scope }
     * </p>
     * 
     * 
     * @return
     *     The value of the scopes property.
     */
    public List<Scope> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<>();
        }
        return this.scopes;
    }

}
