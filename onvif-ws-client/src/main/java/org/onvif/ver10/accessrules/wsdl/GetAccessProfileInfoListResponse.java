
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
 *         <element name="AccessProfileInfo" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfileInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "accessProfileInfo"
})
@XmlRootElement(name = "GetAccessProfileInfoListResponse")
public class GetAccessProfileInfoListResponse {

    /**
     * StartReference to use in next call to get the following items. If
     *                   absent, no more items to get.
     * 
     */
    @XmlElement(name = "NextStartReference")
    protected String nextStartReference;
    /**
     * List of AccessProfileInfo items.
     * 
     */
    @XmlElement(name = "AccessProfileInfo")
    protected List<AccessProfileInfo> accessProfileInfo;

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
     * List of AccessProfileInfo items.
     * 
     * Gets the value of the accessProfileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessProfileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessProfileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the accessProfileInfo property.
     */
    public List<AccessProfileInfo> getAccessProfileInfo() {
        if (accessProfileInfo == null) {
            accessProfileInfo = new ArrayList<>();
        }
        return this.accessProfileInfo;
    }

}
