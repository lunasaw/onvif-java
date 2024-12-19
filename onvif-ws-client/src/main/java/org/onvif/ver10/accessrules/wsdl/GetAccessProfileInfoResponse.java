
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
    "accessProfileInfo"
})
@XmlRootElement(name = "GetAccessProfileInfoResponse")
public class GetAccessProfileInfoResponse {

    /**
     * List of AccessProfileInfo items.
     * 
     */
    @XmlElement(name = "AccessProfileInfo")
    protected List<AccessProfileInfo> accessProfileInfo;

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
