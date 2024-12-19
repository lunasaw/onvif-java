
package org.onvif.ver10.accessrules.wsdl;

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
 *         <element name="NextStartReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AccessProfile" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfile" maxOccurs="unbounded" minOccurs="0"/>
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
    "nextStartReference",
    "accessProfile"
})
@XmlRootElement(name = "GetAccessProfileListResponse")
public class GetAccessProfileListResponse {

    /**
     * StartReference to use in next call to get the following items. If
     *                   absent, no more items to get.
     * 
     */
    @XmlElement(name = "NextStartReference")
    protected String nextStartReference;
    /**
     * List of Access Profile items.
     * 
     */
    @XmlElement(name = "AccessProfile")
    protected List<AccessProfile> accessProfile;

    /**
     * StartReference to use in next call to get the following items. If
     *                   absent, no more items to get.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStartReference() {
        return nextStartReference;
    }

    /**
     * Sets the value of the nextStartReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNextStartReference()
     */
    public void setNextStartReference(String value) {
        this.nextStartReference = value;
    }

    /**
     * List of Access Profile items.
     * 
     * Gets the value of the accessProfile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessProfile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the accessProfile property.
     */
    public List<AccessProfile> getAccessProfile() {
        if (accessProfile == null) {
            accessProfile = new ArrayList<>();
        }
        return this.accessProfile;
    }

}
