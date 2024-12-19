
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
 *         <element name="AreaInfo" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AreaInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "areaInfo"
})
@XmlRootElement(name = "GetAreaInfoResponse")
public class GetAreaInfoResponse {

    /**
     * List of AreaInfo items.
     * 
     */
    @XmlElement(name = "AreaInfo")
    protected List<AreaInfo> areaInfo;

    /**
     * List of AreaInfo items.
     * 
     * Gets the value of the areaInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAreaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the areaInfo property.
     */
    public List<AreaInfo> getAreaInfo() {
        if (areaInfo == null) {
            areaInfo = new ArrayList<>();
        }
        return this.areaInfo;
    }

}
