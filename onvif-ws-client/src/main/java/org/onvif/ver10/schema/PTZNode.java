
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZNode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZNode">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/>
 *         <element name="SupportedPTZSpaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/>
 *         <element name="MaximumNumberOfPresets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HomeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AuxiliaryCommands" type="{http://www.onvif.org/ver10/schema}AuxiliaryData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZNodeExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="FixedHomePosition" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZNode", propOrder = {
    "name",
    "supportedPTZSpaces",
    "maximumNumberOfPresets",
    "homeSupported",
    "auxiliaryCommands",
    "extension"
})
public class PTZNode
    extends DeviceEntity
{

    /**
     * A unique identifier that is used to reference PTZ Nodes.
     * 
     */
    @XmlElement(name = "Name")
    protected String name;
    /**
     * A list of Coordinate Systems available for the PTZ Node. For each Coordinate System,
     *                 the PTZ Node MUST specify its allowed range.
     * 
     */
    @XmlElement(name = "SupportedPTZSpaces", required = true)
    protected PTZSpaces supportedPTZSpaces;
    /**
     * All preset operations MUST be available for this PTZ Node if one preset is
     *                 supported.
     * 
     */
    @XmlElement(name = "MaximumNumberOfPresets")
    protected int maximumNumberOfPresets;
    /**
     * A boolean operator specifying the availability of a home position. If set to true,
     *                 the Home Position Operations MUST be available for this PTZ Node.
     * 
     */
    @XmlElement(name = "HomeSupported")
    protected boolean homeSupported;
    /**
     * A list of supported Auxiliary commands. If the list is not empty, the Auxiliary
     *                 Operations MUST be available for this PTZ Node.
     * 
     */
    @XmlElement(name = "AuxiliaryCommands")
    protected List<String> auxiliaryCommands;
    @XmlElement(name = "Extension")
    protected PTZNodeExtension extension;
    /**
     * Indication whether the HomePosition of a Node is fixed or it can be changed via the
     *               SetHomePosition command.
     * 
     */
    @XmlAttribute(name = "FixedHomePosition")
    protected Boolean fixedHomePosition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A unique identifier that is used to reference PTZ Nodes.
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
     * A list of Coordinate Systems available for the PTZ Node. For each Coordinate System,
     *                 the PTZ Node MUST specify its allowed range.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSupportedPTZSpaces() {
        return supportedPTZSpaces;
    }

    /**
     * Sets the value of the supportedPTZSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     * @see #getSupportedPTZSpaces()
     */
    public void setSupportedPTZSpaces(PTZSpaces value) {
        this.supportedPTZSpaces = value;
    }

    /**
     * All preset operations MUST be available for this PTZ Node if one preset is
     *                 supported.
     * 
     */
    public int getMaximumNumberOfPresets() {
        return maximumNumberOfPresets;
    }

    /**
     * Sets the value of the maximumNumberOfPresets property.
     * 
     */
    public void setMaximumNumberOfPresets(int value) {
        this.maximumNumberOfPresets = value;
    }

    /**
     * A boolean operator specifying the availability of a home position. If set to true,
     *                 the Home Position Operations MUST be available for this PTZ Node.
     * 
     */
    public boolean isHomeSupported() {
        return homeSupported;
    }

    /**
     * Sets the value of the homeSupported property.
     * 
     */
    public void setHomeSupported(boolean value) {
        this.homeSupported = value;
    }

    /**
     * A list of supported Auxiliary commands. If the list is not empty, the Auxiliary
     *                 Operations MUST be available for this PTZ Node.
     * 
     * Gets the value of the auxiliaryCommands property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxiliaryCommands property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAuxiliaryCommands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the auxiliaryCommands property.
     */
    public List<String> getAuxiliaryCommands() {
        if (auxiliaryCommands == null) {
            auxiliaryCommands = new ArrayList<>();
        }
        return this.auxiliaryCommands;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZNodeExtension }
     *     
     */
    public PTZNodeExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNodeExtension }
     *     
     */
    public void setExtension(PTZNodeExtension value) {
        this.extension = value;
    }

    /**
     * Indication whether the HomePosition of a Node is fixed or it can be changed via the
     *               SetHomePosition command.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedHomePosition() {
        return fixedHomePosition;
    }

    /**
     * Sets the value of the fixedHomePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFixedHomePosition()
     */
    public void setFixedHomePosition(Boolean value) {
        this.fixedHomePosition = value;
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
