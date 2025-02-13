
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>RecordingOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecordingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Job" type="{http://www.onvif.org/ver10/recording/wsdl}JobOptions"/&gt;
 *         &lt;element name="Track" type="{http://www.onvif.org/ver10/recording/wsdl}TrackOptions"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingOptions", propOrder = {
    "job",
    "track",
    "any"
})
public class RecordingOptions {

    @XmlElement(name = "Job", required = true)
    protected JobOptions job;
    @XmlElement(name = "Track", required = true)
    protected TrackOptions track;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 获取job属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobOptions }
     *     
     */
    public JobOptions getJob() {
        return job;
    }

    /**
     * 设置job属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobOptions }
     *     
     */
    public void setJob(JobOptions value) {
        this.job = value;
    }

    /**
     * 获取track属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackOptions }
     *     
     */
    public TrackOptions getTrack() {
        return track;
    }

    /**
     * 设置track属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackOptions }
     *     
     */
    public void setTrack(TrackOptions value) {
        this.track = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
