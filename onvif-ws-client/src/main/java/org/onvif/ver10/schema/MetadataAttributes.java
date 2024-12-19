
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MetadataAttributes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MetadataAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CanContainPTZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainAnalytics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PtzSpaces" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataAttributes", propOrder = {
    "canContainPTZ",
    "canContainAnalytics",
    "canContainNotifications",
    "any"
})
public class MetadataAttributes {

    /**
     * Indicates that there can be PTZ data in the metadata track in the
     *             specified time interval.
     * 
     */
    @XmlElement(name = "CanContainPTZ")
    protected boolean canContainPTZ;
    /**
     * Indicates that there can be analytics data in the metadata track in the
     *             specified time interval.
     * 
     */
    @XmlElement(name = "CanContainAnalytics")
    protected boolean canContainAnalytics;
    /**
     * Indicates that there can be notifications in the metadata track in the
     *             specified time interval.
     * 
     */
    @XmlElement(name = "CanContainNotifications")
    protected boolean canContainNotifications;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * List of all PTZ spaces active for recording. Note that events are only
     *           recorded on position changes and the actual point of recording may not necessarily contain
     *           an event of the specified type.
     * 
     */
    @XmlAttribute(name = "PtzSpaces")
    protected List<String> ptzSpaces;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates that there can be PTZ data in the metadata track in the
     *             specified time interval.
     * 
     */
    public boolean isCanContainPTZ() {
        return canContainPTZ;
    }

    /**
     * Sets the value of the canContainPTZ property.
     * 
     */
    public void setCanContainPTZ(boolean value) {
        this.canContainPTZ = value;
    }

    /**
     * Indicates that there can be analytics data in the metadata track in the
     *             specified time interval.
     * 
     */
    public boolean isCanContainAnalytics() {
        return canContainAnalytics;
    }

    /**
     * Sets the value of the canContainAnalytics property.
     * 
     */
    public void setCanContainAnalytics(boolean value) {
        this.canContainAnalytics = value;
    }

    /**
     * Indicates that there can be notifications in the metadata track in the
     *             specified time interval.
     * 
     */
    public boolean isCanContainNotifications() {
        return canContainNotifications;
    }

    /**
     * Sets the value of the canContainNotifications property.
     * 
     */
    public void setCanContainNotifications(boolean value) {
        this.canContainNotifications = value;
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
     * List of all PTZ spaces active for recording. Note that events are only
     *           recorded on position changes and the actual point of recording may not necessarily contain
     *           an event of the specified type.
     * 
     * Gets the value of the ptzSpaces property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzSpaces property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPtzSpaces().add(newItem);
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
     *     The value of the ptzSpaces property.
     */
    public List<String> getPtzSpaces() {
        if (ptzSpaces == null) {
            ptzSpaces = new ArrayList<>();
        }
        return this.ptzSpaces;
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
