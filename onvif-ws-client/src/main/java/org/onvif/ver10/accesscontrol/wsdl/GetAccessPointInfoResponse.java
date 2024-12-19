
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         <element name="AccessPointInfo" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "accessPointInfo"
})
@XmlRootElement(name = "GetAccessPointInfoResponse")
public class GetAccessPointInfoResponse {

    /**
     * List of AccessPointInfo items.
     * 
     */
    @XmlElement(name = "AccessPointInfo")
    protected List<AccessPointInfo> accessPointInfo;

    /**
     * List of AccessPointInfo items.
     * 
     * Gets the value of the accessPointInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessPointInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessPointInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessPointInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the accessPointInfo property.
     */
    public List<AccessPointInfo> getAccessPointInfo() {
        if (accessPointInfo == null) {
            accessPointInfo = new ArrayList<>();
        }
        return this.accessPointInfo;
    }

}
