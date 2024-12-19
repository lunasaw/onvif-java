
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FindEventResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindEventResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="TrackToken" type="{http://www.onvif.org/ver10/schema}TrackReference"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Event" type="{http://docs.oasis-open.org/wsn/b-2}NotificationMessageHolderType"/>
 *         <element name="StartStateEvent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "FindEventResult", propOrder = {
    "recordingToken",
    "trackToken",
    "time",
    "event",
    "startStateEvent",
    "any"
})
public class FindEventResult {

    /**
     * The recording where this event was found. Empty string if no recording
     *             is associated with this event.
     * 
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    /**
     * A reference to the track where this event was found. Empty string if no
     *             track is associated with this event.
     * 
     */
    @XmlElement(name = "TrackToken", required = true)
    protected String trackToken;
    /**
     * The time when the event occured.
     * 
     */
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    /**
     * The description of the event.
     * 
     */
    @XmlElement(name = "Event", required = true)
    protected NotificationMessageHolderType event;
    /**
     * If true, indicates that the event is a virtual event generated for this
     *             particular search session to give the state of a property at the start time of the
     *             search.
     * 
     */
    @XmlElement(name = "StartStateEvent")
    protected boolean startStateEvent;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The recording where this event was found. Empty string if no recording
     *             is associated with this event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Sets the value of the recordingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecordingToken()
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * A reference to the track where this event was found. Empty string if no
     *             track is associated with this event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackToken() {
        return trackToken;
    }

    /**
     * Sets the value of the trackToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrackToken()
     */
    public void setTrackToken(String value) {
        this.trackToken = value;
    }

    /**
     * The time when the event occured.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTime()
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * The description of the event.
     * 
     * @return
     *     possible object is
     *     {@link NotificationMessageHolderType }
     *     
     */
    public NotificationMessageHolderType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMessageHolderType }
     *     
     * @see #getEvent()
     */
    public void setEvent(NotificationMessageHolderType value) {
        this.event = value;
    }

    /**
     * If true, indicates that the event is a virtual event generated for this
     *             particular search session to give the state of a property at the start time of the
     *             search.
     * 
     */
    public boolean isStartStateEvent() {
        return startStateEvent;
    }

    /**
     * Sets the value of the startStateEvent property.
     * 
     */
    public void setStartStateEvent(boolean value) {
        this.startStateEvent = value;
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
