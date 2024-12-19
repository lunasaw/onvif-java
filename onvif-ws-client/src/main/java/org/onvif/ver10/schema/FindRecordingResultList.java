
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindRecordingResultList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindRecordingResultList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/>
 *         <element name="RecordingInformation" type="{http://www.onvif.org/ver10/schema}RecordingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRecordingResultList", propOrder = {
    "searchState",
    "recordingInformation"
})
public class FindRecordingResultList {

    /**
     * The state of the search when the result is returned. Indicates if there
     *             can be more results, or if the search is completed.
     * 
     */
    @XmlElement(name = "SearchState", required = true)
    @XmlSchemaType(name = "string")
    protected SearchState searchState;
    /**
     * A RecordingInformation structure for each found recording matching the
     *             search.
     * 
     */
    @XmlElement(name = "RecordingInformation")
    protected List<RecordingInformation> recordingInformation;

    /**
     * The state of the search when the result is returned. Indicates if there
     *             can be more results, or if the search is completed.
     * 
     * @return
     *     possible object is
     *     {@link SearchState }
     *     
     */
    public SearchState getSearchState() {
        return searchState;
    }

    /**
     * Sets the value of the searchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchState }
     *     
     * @see #getSearchState()
     */
    public void setSearchState(SearchState value) {
        this.searchState = value;
    }

    /**
     * A RecordingInformation structure for each found recording matching the
     *             search.
     * 
     * Gets the value of the recordingInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordingInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecordingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the recordingInformation property.
     */
    public List<RecordingInformation> getRecordingInformation() {
        if (recordingInformation == null) {
            recordingInformation = new ArrayList<>();
        }
        return this.recordingInformation;
    }

}
