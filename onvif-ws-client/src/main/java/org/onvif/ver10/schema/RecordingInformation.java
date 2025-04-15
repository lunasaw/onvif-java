
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;RecordingInformation complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RecordingInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/&amp;gt;
 *         &amp;lt;element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingSourceInformation"/&amp;gt;
 *         &amp;lt;element name="EarliestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LatestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Content" type="{http://www.onvif.org/ver10/schema}Description"/&amp;gt;
 *         &amp;lt;element name="Track" type="{http://www.onvif.org/ver10/schema}TrackInformation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RecordingStatus" type="{http://www.onvif.org/ver10/schema}RecordingStatus"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingInformation", propOrder = {
    "recordingToken",
    "source",
    "earliestRecording",
    "latestRecording",
    "content",
    "track",
    "recordingStatus",
    "any"
})
public class RecordingInformation {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    @XmlElement(name = "Source", required = true)
    protected RecordingSourceInformation source;
    @XmlElement(name = "EarliestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestRecording;
    @XmlElement(name = "LatestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestRecording;
    @XmlElement(name = "Content", required = true)
    protected String content;
    @XmlElement(name = "Track")
    protected List<TrackInformation> track;
    @XmlElement(name = "RecordingStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RecordingStatus recordingStatus;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取recordingToken属性的值。
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
     * 设置recordingToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * 获取source属性的值。
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
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingSourceInformation }
     *     
     */
    public void setSource(RecordingSourceInformation value) {
        this.source = value;
    }

    /**
     * 获取earliestRecording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestRecording() {
        return earliestRecording;
    }

    /**
     * 设置earliestRecording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestRecording(XMLGregorianCalendar value) {
        this.earliestRecording = value;
    }

    /**
     * 获取latestRecording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestRecording() {
        return latestRecording;
    }

    /**
     * 设置latestRecording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestRecording(XMLGregorianCalendar value) {
        this.latestRecording = value;
    }

    /**
     * 获取content属性的值。
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
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the track property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTrack().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TrackInformation }
     * 
     * 
     */
    public List<TrackInformation> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackInformation>();
        }
        return this.track;
    }

    /**
     * 获取recordingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordingStatus }
     *     
     */
    public RecordingStatus getRecordingStatus() {
        return recordingStatus;
    }

    /**
     * 设置recordingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingStatus }
     *     
     */
    public void setRecordingStatus(RecordingStatus value) {
        this.recordingStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
