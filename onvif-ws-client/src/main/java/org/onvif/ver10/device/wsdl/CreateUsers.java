
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.User;


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
 *         <element name="User" type="{http://www.onvif.org/ver10/schema}User" maxOccurs="unbounded"/>
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
    "user"
})
@XmlRootElement(name = "CreateUsers")
public class CreateUsers {

    /**
     * Creates new device users and corresponding credentials. Each user
     *                   entry includes: username, password and user level. Either all users are created
     *                   successfully or a fault message MUST be returned without creating any user. If
     *                   trying to create several users with exactly the same username the request is
     *                   rejected and no users are created. If password is missing, then fault message Too
     *                   weak password is returned.
     * 
     */
    @XmlElement(name = "User", required = true)
    protected List<User> user;

    /**
     * Creates new device users and corresponding credentials. Each user
     *                   entry includes: username, password and user level. Either all users are created
     *                   successfully or a fault message MUST be returned without creating any user. If
     *                   trying to create several users with exactly the same username the request is
     *                   rejected and no users are created. If password is missing, then fault message Too
     *                   weak password is returned.
     * 
     * Gets the value of the user property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * </p>
     * 
     * 
     * @return
     *     The value of the user property.
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<>();
        }
        return this.user;
    }

}
