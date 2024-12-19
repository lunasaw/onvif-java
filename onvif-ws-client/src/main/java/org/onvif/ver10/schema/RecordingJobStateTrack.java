
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
 * <p>Java class for RecordingJobStateTrack complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingJobStateTrack">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SourceTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Destination" type="{http://www.onvif.org/ver10/schema}TrackReference"/>
 *         <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}RecordingJobState"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RecordingJobStateTrack", propOrder = {
    "sourceTag",
    "destination",
    "error",
    "state",
    "any"
})
public class RecordingJobStateTrack {

    /**
     * Identifies the track of the data source that provides the data.
     * 
     */
    @XmlElement(name = "SourceTag", required = true)
    protected String sourceTag;
    /**
     * Indicates the destination track.
     * 
     */
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    /**
     * Optionally holds an implementation defined string value that describes
     *             the error.
     *             The string should be in the English language.
     * 
     */
    @XmlElement(name = "Error")
    protected String error;
    /**
     * Provides the job state of the track. The valid
     *             values of state shall be “Idle”, “Active” and “Error”. If state equals “Error”, the
     *             Error field may be filled in with an implementation defined value.
     * 
     */
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Identifies the track of the data source that provides the data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTag() {
        return sourceTag;
    }

    /**
     * Sets the value of the sourceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceTag()
     */
    public void setSourceTag(String value) {
        this.sourceTag = value;
    }

    /**
     * Indicates the destination track.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Optionally holds an implementation defined string value that describes
     *             the error.
     *             The string should be in the English language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getError()
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Provides the job state of the track. The valid
     *             values of state shall be “Idle”, “Active” and “Error”. If state equals “Error”, the
     *             Error field may be filled in with an implementation defined value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getState()
     */
    public void setState(String value) {
        this.state = value;
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
