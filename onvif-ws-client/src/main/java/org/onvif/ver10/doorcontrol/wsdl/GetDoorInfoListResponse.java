
package org.onvif.ver10.doorcontrol.wsdl;

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
 *         <element name="DoorInfo" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "doorInfo"
})
@XmlRootElement(name = "GetDoorInfoListResponse")
public class GetDoorInfoListResponse {

    /**
     * StartReference to use in next call to get the following items. If
     *                   absent, no more items to get.
     * 
     */
    @XmlElement(name = "NextStartReference")
    protected String nextStartReference;
    /**
     * List of DoorInfo items.
     * 
     */
    @XmlElement(name = "DoorInfo")
    protected List<DoorInfo> doorInfo;

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
     * List of DoorInfo items.
     * 
     * Gets the value of the doorInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doorInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDoorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoorInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the doorInfo property.
     */
    public List<DoorInfo> getDoorInfo() {
        if (doorInfo == null) {
            doorInfo = new ArrayList<>();
        }
        return this.doorInfo;
    }

}
