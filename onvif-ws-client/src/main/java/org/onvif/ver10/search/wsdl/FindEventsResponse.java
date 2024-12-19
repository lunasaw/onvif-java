
package org.onvif.ver10.search.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchToken" type="{http://www.onvif.org/ver10/schema}JobToken"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchToken"
})
@XmlRootElement(name = "FindEventsResponse")
public class FindEventsResponse {

    /**
     * A unique reference to the search session created by this
     *                   request.
     * 
     */
    @XmlElement(name = "SearchToken", required = true)
    protected String searchToken;

    /**
     * A unique reference to the search session created by this
     *                   request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchToken() {
        return searchToken;
    }

    /**
     * Sets the value of the searchToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearchToken()
     */
    public void setSearchToken(String value) {
        this.searchToken = value;
    }

}
