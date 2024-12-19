
package org.onvif.ver10.accessrules.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The access profile structure contains information about the collection of access
 *             policies. The
 *             device shall include all properties of the AccessProfileInfo structure and also a list
 *             of access
 *             policies.
 * 
 * <p>Java class for AccessProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessProfile">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfileInfo">
 *       <sequence>
 *         <element name="AccessPolicy" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfileExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessProfile", propOrder = {
    "accessPolicy",
    "extension"
})
public class AccessProfile
    extends AccessProfileInfo
{

    /**
     * A list of access policy structures, where each access policy
     *                     defines during which schedule an access point can be accessed.
     * 
     */
    @XmlElement(name = "AccessPolicy")
    protected List<AccessPolicy> accessPolicy;
    @XmlElement(name = "Extension")
    protected AccessProfileExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A list of access policy structures, where each access policy
     *                     defines during which schedule an access point can be accessed.
     * 
     * Gets the value of the accessPolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessPolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessPolicy }
     * </p>
     * 
     * 
     * @return
     *     The value of the accessPolicy property.
     */
    public List<AccessPolicy> getAccessPolicy() {
        if (accessPolicy == null) {
            accessPolicy = new ArrayList<>();
        }
        return this.accessPolicy;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AccessProfileExtension }
     *     
     */
    public AccessProfileExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessProfileExtension }
     *     
     */
    public void setExtension(AccessProfileExtension value) {
        this.extension = value;
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
