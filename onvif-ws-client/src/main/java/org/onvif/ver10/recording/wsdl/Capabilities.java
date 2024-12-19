
package org.onvif.ver10.recording.wsdl;

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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Capabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Encoding" type="{http://www.onvif.org/ver10/recording/wsdl}EncodingTypes" />
 *       <attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="MaxTotalRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="MaxRecordings" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="MaxRecordingJobs" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MetadataRecording" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SupportedExportFileFormats" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indication if the device supports dynamic creation and deletion of
     *               recordings
     * 
     */
    @XmlAttribute(name = "DynamicRecordings")
    protected Boolean dynamicRecordings;
    /**
     * Indication if the device supports dynamic creation and deletion of
     *               tracks
     * 
     */
    @XmlAttribute(name = "DynamicTracks")
    protected Boolean dynamicTracks;
    /**
     * Indication which encodings are supported for recording. The list may
     *               contain one or more enumeration values of tt:VideoEncoding and tt:AudioEncoding. If
     *               device does not support audio recording tt:AudioEncoding shall not be listed.
     * 
     */
    @XmlAttribute(name = "Encoding")
    protected List<String> encoding;
    /**
     * Maximum supported bit rate for all tracks of a recording in kBit/s.
     * 
     */
    @XmlAttribute(name = "MaxRate")
    protected Float maxRate;
    /**
     * Maximum supported bit rate for all recordings in kBit/s.
     * 
     */
    @XmlAttribute(name = "MaxTotalRate")
    protected Float maxTotalRate;
    /**
     * Maximum number of recordings supported. (Integer values only.)
     * 
     */
    @XmlAttribute(name = "MaxRecordings")
    protected Float maxRecordings;
    /**
     * Maximum total number of supported recording jobs by the device.
     * 
     */
    @XmlAttribute(name = "MaxRecordingJobs")
    protected Integer maxRecordingJobs;
    /**
     * Indication if the device supports the GetRecordingOptions command.
     * 
     */
    @XmlAttribute(name = "Options")
    protected Boolean options;
    /**
     * Indication if the device supports recording metadata.
     * 
     */
    @XmlAttribute(name = "MetadataRecording")
    protected Boolean metadataRecording;
    /**
     * Indication that the device supports ExportRecordedData command for the listed export
     *               file formats.
     *               The list shall return at least one export file format value. The value of 'ONVIF'
     *               refers to
     *               ONVIF Export File Format specification.
     * 
     */
    @XmlAttribute(name = "SupportedExportFileFormats")
    protected List<String> supportedExportFileFormats;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Indication if the device supports dynamic creation and deletion of
     *               recordings
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * Sets the value of the dynamicRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDynamicRecordings()
     */
    public void setDynamicRecordings(Boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * Indication if the device supports dynamic creation and deletion of
     *               tracks
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * Sets the value of the dynamicTracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDynamicTracks()
     */
    public void setDynamicTracks(Boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * Indication which encodings are supported for recording. The list may
     *               contain one or more enumeration values of tt:VideoEncoding and tt:AudioEncoding. If
     *               device does not support audio recording tt:AudioEncoding shall not be listed.
     * 
     * Gets the value of the encoding property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encoding property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncoding().add(newItem);
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
     *     The value of the encoding property.
     */
    public List<String> getEncoding() {
        if (encoding == null) {
            encoding = new ArrayList<>();
        }
        return this.encoding;
    }

    /**
     * Maximum supported bit rate for all tracks of a recording in kBit/s.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRate() {
        return maxRate;
    }

    /**
     * Sets the value of the maxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxRate()
     */
    public void setMaxRate(Float value) {
        this.maxRate = value;
    }

    /**
     * Maximum supported bit rate for all recordings in kBit/s.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTotalRate() {
        return maxTotalRate;
    }

    /**
     * Sets the value of the maxTotalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxTotalRate()
     */
    public void setMaxTotalRate(Float value) {
        this.maxTotalRate = value;
    }

    /**
     * Maximum number of recordings supported. (Integer values only.)
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRecordings() {
        return maxRecordings;
    }

    /**
     * Sets the value of the maxRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaxRecordings()
     */
    public void setMaxRecordings(Float value) {
        this.maxRecordings = value;
    }

    /**
     * Maximum total number of supported recording jobs by the device.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecordingJobs() {
        return maxRecordingJobs;
    }

    /**
     * Sets the value of the maxRecordingJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxRecordingJobs()
     */
    public void setMaxRecordingJobs(Integer value) {
        this.maxRecordingJobs = value;
    }

    /**
     * Indication if the device supports the GetRecordingOptions command.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOptions()
     */
    public void setOptions(Boolean value) {
        this.options = value;
    }

    /**
     * Indication if the device supports recording metadata.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetadataRecording() {
        return metadataRecording;
    }

    /**
     * Sets the value of the metadataRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMetadataRecording()
     */
    public void setMetadataRecording(Boolean value) {
        this.metadataRecording = value;
    }

    /**
     * Indication that the device supports ExportRecordedData command for the listed export
     *               file formats.
     *               The list shall return at least one export file format value. The value of 'ONVIF'
     *               refers to
     *               ONVIF Export File Format specification.
     * 
     * Gets the value of the supportedExportFileFormats property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedExportFileFormats property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedExportFileFormats().add(newItem);
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
     *     The value of the supportedExportFileFormats property.
     */
    public List<String> getSupportedExportFileFormats() {
        if (supportedExportFileFormats == null) {
            supportedExportFileFormats = new ArrayList<>();
        }
        return this.supportedExportFileFormats;
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
