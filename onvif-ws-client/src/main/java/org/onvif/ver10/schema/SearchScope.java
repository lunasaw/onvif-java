
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
import jakarta.xml.bind.annotation.XmlType;


/**
 * A structure for defining a limited scope when searching in recorded data.
 * 
 * <p>Java class for SearchScope complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncludedSources" type="{http://www.onvif.org/ver10/schema}SourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IncludedRecordings" type="{http://www.onvif.org/ver10/schema}RecordingReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RecordingInformationFilter" type="{http://www.onvif.org/ver10/schema}XPathExpression" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SearchScopeExtension" minOccurs="0"/>
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
@XmlType(name = "SearchScope", propOrder = {
    "includedSources",
    "includedRecordings",
    "recordingInformationFilter",
    "extension"
})
public class SearchScope {

    /**
     * A list of sources that are included in the scope. If this list is
     *             included, only data from one of these sources shall be searched.
     * 
     */
    @XmlElement(name = "IncludedSources")
    protected List<SourceReference> includedSources;
    /**
     * A list of recordings that are included in the scope. If this list is
     *             included, only data from one of these recordings shall be searched.
     * 
     */
    @XmlElement(name = "IncludedRecordings")
    protected List<String> includedRecordings;
    /**
     * An xpath expression used to specify what recordings to search. Only
     *             those recordings with an RecordingInformation structure that matches the filter shall be
     *             searched.
     * 
     */
    @XmlElement(name = "RecordingInformationFilter")
    protected String recordingInformationFilter;
    /**
     * Extension point
     * 
     */
    @XmlElement(name = "Extension")
    protected SearchScopeExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A list of sources that are included in the scope. If this list is
     *             included, only data from one of these sources shall be searched.
     * 
     * Gets the value of the includedSources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIncludedSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the includedSources property.
     */
    public List<SourceReference> getIncludedSources() {
        if (includedSources == null) {
            includedSources = new ArrayList<>();
        }
        return this.includedSources;
    }

    /**
     * A list of recordings that are included in the scope. If this list is
     *             included, only data from one of these recordings shall be searched.
     * 
     * Gets the value of the includedRecordings property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedRecordings property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIncludedRecordings().add(newItem);
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
     *     The value of the includedRecordings property.
     */
    public List<String> getIncludedRecordings() {
        if (includedRecordings == null) {
            includedRecordings = new ArrayList<>();
        }
        return this.includedRecordings;
    }

    /**
     * An xpath expression used to specify what recordings to search. Only
     *             those recordings with an RecordingInformation structure that matches the filter shall be
     *             searched.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingInformationFilter() {
        return recordingInformationFilter;
    }

    /**
     * Sets the value of the recordingInformationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecordingInformationFilter()
     */
    public void setRecordingInformationFilter(String value) {
        this.recordingInformationFilter = value;
    }

    /**
     * Extension point
     * 
     * @return
     *     possible object is
     *     {@link SearchScopeExtension }
     *     
     */
    public SearchScopeExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScopeExtension }
     *     
     * @see #getExtension()
     */
    public void setExtension(SearchScopeExtension value) {
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
