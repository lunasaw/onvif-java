
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
 * A set of informative desciptions of a data source. The Search searvice allows a tests to
 *         filter on recordings based on information in this structure.
 * 
 * <p>Java class for RecordingSourceInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingSourceInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="Location" type="{http://www.onvif.org/ver10/schema}Description"/>
 *         <element name="Description" type="{http://www.onvif.org/ver10/schema}Description"/>
 *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
@XmlType(name = "RecordingSourceInformation", propOrder = {
    "sourceId",
    "name",
    "location",
    "description",
    "address",
    "any"
})
public class RecordingSourceInformation {

    /**
     * Identifier for the source chosen by the tests that creates the structure.
     *             This identifier is opaque to the device. Clients may use any type of URI for this field.
     *             A device shall support at least 128 characters.
     * 
     */
    @XmlElement(name = "SourceId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceId;
    /**
     * Informative user readable name of the source, e.g. "Camera23". A device
     *             shall support at least 20 characters.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Informative description of the physical location of the source, e.g. the
     *             coordinates on a map.
     * 
     */
    @XmlElement(name = "Location", required = true)
    protected String location;
    /**
     * Informative description of the source.
     * 
     */
    @XmlElement(name = "Description", required = true)
    protected String description;
    /**
     * URI provided by the service supplying data to be recorded. A device
     *             shall support at least 128 characters.
     * 
     */
    @XmlElement(name = "Address", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Identifier for the source chosen by the tests that creates the structure.
     *             This identifier is opaque to the device. Clients may use any type of URI for this field.
     *             A device shall support at least 128 characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceId()
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Informative user readable name of the source, e.g. "Camera23". A device
     *             shall support at least 20 characters.
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
     * Informative description of the physical location of the source, e.g. the
     *             coordinates on a map.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocation()
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Informative description of the source.
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

    /**
     * URI provided by the service supplying data to be recorded. A device
     *             shall support at least 128 characters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
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
