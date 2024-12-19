
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.pacs.DataEntity;


/**
 * Used as extension base.
 * 
 * <p>Java class for DoorInfoBase complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DoorInfoBase">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/pacs}DataEntity">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/pacs}Name"/>
 *         <element name="Description" type="{http://www.onvif.org/ver10/pacs}Description" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoorInfoBase", propOrder = {
    "name",
    "description"
})
@XmlSeeAlso({
    DoorInfo.class
})
public class DoorInfoBase
    extends DataEntity
{

    /**
     * A user readable name. It shall be up to 64 characters.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * A user readable description. It shall be up to 1024
     *                     characters.
     * 
     */
    @XmlElement(name = "Description")
    protected String description;

    /**
     * A user readable name. It shall be up to 64 characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * A user readable description. It shall be up to 1024
     *                     characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
