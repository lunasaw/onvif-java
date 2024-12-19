
package org.onvif.ver10.accessrules.wsdl;

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
 *         <element name="AccessProfile" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfile"/>
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
    "accessProfile"
})
@XmlRootElement(name = "ModifyAccessProfile")
public class ModifyAccessProfile {

    /**
     * The details of Access Profile
     * 
     */
    @XmlElement(name = "AccessProfile", required = true)
    protected AccessProfile accessProfile;

    /**
     * The details of Access Profile
     * 
     * @return
     *     possible object is
     *     {@link AccessProfile }
     *     
     */
    public AccessProfile getAccessProfile() {
        return accessProfile;
    }

    /**
     * Sets the value of the accessProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessProfile }
     *     
     * @see #getAccessProfile()
     */
    public void setAccessProfile(AccessProfile value) {
        this.accessProfile = value;
    }

}
