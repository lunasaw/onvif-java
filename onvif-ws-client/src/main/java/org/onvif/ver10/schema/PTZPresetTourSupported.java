
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZPresetTourSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourSupported">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaximumNumberOfPresetTours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PTZPresetTourOperation" type="{http://www.onvif.org/ver10/schema}PTZPresetTourOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSupportedExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourSupported", propOrder = {
    "maximumNumberOfPresetTours",
    "ptzPresetTourOperation",
    "extension"
})
public class PTZPresetTourSupported {

    /**
     * Indicates number of preset tours that can be created. Required preset
     *             tour operations shall be available for this PTZ Node if one or more preset tour is
     *             supported.
     * 
     */
    @XmlElement(name = "MaximumNumberOfPresetTours")
    protected int maximumNumberOfPresetTours;
    /**
     * Indicates which preset tour operations are available for this PTZ
     *             Node.
     * 
     */
    @XmlElement(name = "PTZPresetTourOperation")
    @XmlSchemaType(name = "string")
    protected List<PTZPresetTourOperation> ptzPresetTourOperation;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSupportedExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates number of preset tours that can be created. Required preset
     *             tour operations shall be available for this PTZ Node if one or more preset tour is
     *             supported.
     * 
     */
    public int getMaximumNumberOfPresetTours() {
        return maximumNumberOfPresetTours;
    }

    /**
     * Sets the value of the maximumNumberOfPresetTours property.
     * 
     */
    public void setMaximumNumberOfPresetTours(int value) {
        this.maximumNumberOfPresetTours = value;
    }

    /**
     * Indicates which preset tour operations are available for this PTZ
     *             Node.
     * 
     * Gets the value of the ptzPresetTourOperation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzPresetTourOperation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPTZPresetTourOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourOperation }
     * </p>
     * 
     * 
     * @return
     *     The value of the ptzPresetTourOperation property.
     */
    public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
        if (ptzPresetTourOperation == null) {
            ptzPresetTourOperation = new ArrayList<>();
        }
        return this.ptzPresetTourOperation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public PTZPresetTourSupportedExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public void setExtension(PTZPresetTourSupportedExtension value) {
        this.extension = value;
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
