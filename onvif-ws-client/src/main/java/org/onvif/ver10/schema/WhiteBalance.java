
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WhiteBalance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WhiteBalance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode"/>
 *         <element name="CrGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="CbGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "WhiteBalance", propOrder = {
    "mode",
    "crGain",
    "cbGain",
    "any"
})
public class WhiteBalance {

    /**
     * Auto whitebalancing mode (auto/manual).
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected WhiteBalanceMode mode;
    /**
     * Rgain (unitless).
     * 
     */
    @XmlElement(name = "CrGain")
    protected float crGain;
    /**
     * Bgain (unitless).
     * 
     */
    @XmlElement(name = "CbGain")
    protected float cbGain;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Auto whitebalancing mode (auto/manual).
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceMode }
     *     
     */
    public WhiteBalanceMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceMode }
     *     
     * @see #getMode()
     */
    public void setMode(WhiteBalanceMode value) {
        this.mode = value;
    }

    /**
     * Rgain (unitless).
     * 
     */
    public float getCrGain() {
        return crGain;
    }

    /**
     * Sets the value of the crGain property.
     * 
     */
    public void setCrGain(float value) {
        this.crGain = value;
    }

    /**
     * Bgain (unitless).
     * 
     */
    public float getCbGain() {
        return cbGain;
    }

    /**
     * Sets the value of the cbGain property.
     * 
     */
    public void setCbGain(float value) {
        this.cbGain = value;
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
