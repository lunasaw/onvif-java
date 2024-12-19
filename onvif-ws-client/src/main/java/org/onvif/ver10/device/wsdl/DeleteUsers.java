
package org.onvif.ver10.device.wsdl;

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
 *         <element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "username"
})
@XmlRootElement(name = "DeleteUsers")
public class DeleteUsers {

    /**
     * Deletes users on an device and there may exist users that cannot
     *                   be deleted to ensure access to the unit. Either all users are deleted successfully
     *                   or a fault message MUST be returned and no users be deleted. If a username exists
     *                   multiple times in the request, then a fault message is returned.
     * 
     */
    @XmlElement(name = "Username", required = true)
    protected List<String> username;

    /**
     * Deletes users on an device and there may exist users that cannot
     *                   be deleted to ensure access to the unit. Either all users are deleted successfully
     *                   or a fault message MUST be returned and no users be deleted. If a username exists
     *                   multiple times in the request, then a fault message is returned.
     * 
     * Gets the value of the username property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the username property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsername().add(newItem);
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
     *     The value of the username property.
     */
    public List<String> getUsername() {
        if (username == null) {
            username = new ArrayList<>();
        }
        return this.username;
    }

}
