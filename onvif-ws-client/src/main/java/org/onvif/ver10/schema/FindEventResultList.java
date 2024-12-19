
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindEventResultList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindEventResultList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/>
 *         <element name="Result" type="{http://www.onvif.org/ver10/schema}FindEventResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindEventResultList", propOrder = {
    "searchState",
    "result"
})
public class FindEventResultList {

    /**
     * The state of the search when the result is returned. Indicates if there
     *             can be more results, or if the search is completed.
     * 
     */
    @XmlElement(name = "SearchState", required = true)
    @XmlSchemaType(name = "string")
    protected SearchState searchState;
    /**
     * A FindEventResult structure for each found event matching the search.
     * 
     */
    @XmlElement(name = "Result")
    protected List<FindEventResult> result;

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
     * A FindEventResult structure for each found event matching the search.
     * 
     * Gets the value of the result property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FindEventResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the result property.
     */
    public List<FindEventResult> getResult() {
        if (result == null) {
            result = new ArrayList<>();
        }
        return this.result;
    }

}
