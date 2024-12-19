
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZPresetTourPresetDetail complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourPresetDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *           <element name="Home" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="PTZPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *           <element name="TypeExtension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourTypeExtension"/>
 *         </choice>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZPresetTourPresetDetail", propOrder = {
    "presetToken",
    "home",
    "ptzPosition",
    "typeExtension",
    "any"
})
public class PTZPresetTourPresetDetail {

    /**
     * Option to specify the preset position with Preset Token defined in
     *               advance.
     * 
     */
    @XmlElement(name = "PresetToken")
    protected String presetToken;
    /**
     * Option to specify the preset position with the home position of this
     *               PTZ Node. "False" to this parameter shall be treated as an invalid argument.
     * 
     */
    @XmlElement(name = "Home")
    protected Boolean home;
    /**
     * Option to specify the preset position with vector of PTZ node
     *               directly.
     * 
     */
    @XmlElement(name = "PTZPosition")
    protected PTZVector ptzPosition;
    @XmlElement(name = "TypeExtension")
    protected PTZPresetTourTypeExtension typeExtension;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Option to specify the preset position with Preset Token defined in
     *               advance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetToken() {
        return presetToken;
    }

    /**
     * Sets the value of the presetToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPresetToken()
     */
    public void setPresetToken(String value) {
        this.presetToken = value;
    }

    /**
     * Option to specify the preset position with the home position of this
     *               PTZ Node. "False" to this parameter shall be treated as an invalid argument.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHome()
     */
    public void setHome(Boolean value) {
        this.home = value;
    }

    /**
     * Option to specify the preset position with vector of PTZ node
     *               directly.
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getPTZPosition() {
        return ptzPosition;
    }

    /**
     * Sets the value of the ptzPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     * @see #getPTZPosition()
     */
    public void setPTZPosition(PTZVector value) {
        this.ptzPosition = value;
    }

    /**
     * Gets the value of the typeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourTypeExtension }
     *     
     */
    public PTZPresetTourTypeExtension getTypeExtension() {
        return typeExtension;
    }

    /**
     * Sets the value of the typeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourTypeExtension }
     *     
     */
    public void setTypeExtension(PTZPresetTourTypeExtension value) {
        this.typeExtension = value;
    }

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
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
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
