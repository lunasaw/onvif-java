
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingSourceInformation"/>
 *         <element name="Content" type="{http://www.onvif.org/ver10/schema}Description"/>
 *         <element name="MaximumRetentionTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
@XmlType(name = "RecordingConfiguration", propOrder = {
    "source",
    "content",
    "maximumRetentionTime",
    "any"
})
public class RecordingConfiguration {

    /**
     * Information about the source of the recording.
     * 
     */
    @XmlElement(name = "Source", required = true)
    protected RecordingSourceInformation source;
    /**
     * Informative description of the source.
     * 
     */
    @XmlElement(name = "Content", required = true)
    protected String content;
    /**
     * Sspecifies the maximum time that data in any track within the
     *             recording shall be stored. The device shall delete any data older than the maximum
     *             retention
     *             time. Such data shall not be accessible anymore. If the MaximumRetentionPeriod is set to
     *             0,
     *             the device shall not limit the retention time of stored data, except by resource
     *             constraints.
     *             Whatever the value of MaximumRetentionTime, the device may automatically delete
     *             recordings to free up storage space for new recordings.
     * 
     */
    @XmlElement(name = "MaximumRetentionTime", required = true)
    protected Duration maximumRetentionTime;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Information about the source of the recording.
     * 
     * @return
     *     possible object is
     *     {@link RecordingSourceInformation }
     *     
     */
    public RecordingSourceInformation getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingSourceInformation }
     *     
     * @see #getSource()
     */
    public void setSource(RecordingSourceInformation value) {
        this.source = value;
    }

    /**
     * Informative description of the source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContent()
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Sspecifies the maximum time that data in any track within the
     *             recording shall be stored. The device shall delete any data older than the maximum
     *             retention
     *             time. Such data shall not be accessible anymore. If the MaximumRetentionPeriod is set to
     *             0,
     *             the device shall not limit the retention time of stored data, except by resource
     *             constraints.
     *             Whatever the value of MaximumRetentionTime, the device may automatically delete
     *             recordings to free up storage space for new recordings.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRetentionTime() {
        return maximumRetentionTime;
    }

    /**
     * Sets the value of the maximumRetentionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getMaximumRetentionTime()
     */
    public void setMaximumRetentionTime(Duration value) {
        this.maximumRetentionTime = value;
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
