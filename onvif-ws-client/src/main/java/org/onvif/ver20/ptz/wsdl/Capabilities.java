
package org.onvif.ver20.ptz.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Capabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="EFlip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GetCompatibleConfigurations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MoveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StatusPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates whether or not EFlip is supported.
     * 
     */
    @XmlAttribute(name = "EFlip")
    protected Boolean eFlip;
    /**
     * Indicates whether or not reversing of PT control direction is
     *               supported.
     * 
     */
    @XmlAttribute(name = "Reverse")
    protected Boolean reverse;
    /**
     * Indicates support for the GetCompatibleConfigurations command.
     * 
     */
    @XmlAttribute(name = "GetCompatibleConfigurations")
    protected Boolean getCompatibleConfigurations;
    /**
     * Indicates that the PTZVector includes MoveStatus information.
     * 
     */
    @XmlAttribute(name = "MoveStatus")
    protected Boolean moveStatus;
    /**
     * Indicates that the PTZVector includes Position information.
     * 
     */
    @XmlAttribute(name = "StatusPosition")
    protected Boolean statusPosition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Indicates whether or not EFlip is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEFlip() {
        return eFlip;
    }

    /**
     * Sets the value of the eFlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEFlip()
     */
    public void setEFlip(Boolean value) {
        this.eFlip = value;
    }

    /**
     * Indicates whether or not reversing of PT control direction is
     *               supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverse() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReverse()
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

    /**
     * Indicates support for the GetCompatibleConfigurations command.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetCompatibleConfigurations() {
        return getCompatibleConfigurations;
    }

    /**
     * Sets the value of the getCompatibleConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGetCompatibleConfigurations()
     */
    public void setGetCompatibleConfigurations(Boolean value) {
        this.getCompatibleConfigurations = value;
    }

    /**
     * Indicates that the PTZVector includes MoveStatus information.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoveStatus() {
        return moveStatus;
    }

    /**
     * Sets the value of the moveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMoveStatus()
     */
    public void setMoveStatus(Boolean value) {
        this.moveStatus = value;
    }

    /**
     * Indicates that the PTZVector includes Position information.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPosition() {
        return statusPosition;
    }

    /**
     * Sets the value of the statusPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isStatusPosition()
     */
    public void setStatusPosition(Boolean value) {
        this.statusPosition = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
