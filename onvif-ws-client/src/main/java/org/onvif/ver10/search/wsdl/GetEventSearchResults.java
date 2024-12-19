
package org.onvif.ver10.search.wsdl;

import javax.xml.datatype.Duration;
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
 *         <element name="MinResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
    "searchToken",
    "minResults",
    "maxResults",
    "waitTime"
})
@XmlRootElement(name = "GetEventSearchResults")
public class GetEventSearchResults {

    /**
     * The search session to get results from.
     * 
     */
    @XmlElement(name = "SearchToken", required = true)
    protected String searchToken;
    /**
     * The minimum number of results to return in one response.
     * 
     */
    @XmlElement(name = "MinResults")
    protected Integer minResults;
    /**
     * The maximum number of results to return in one response.
     * 
     */
    @XmlElement(name = "MaxResults")
    protected Integer maxResults;
    /**
     * The maximum time before responding to the request, even if the
     *                   MinResults parameter is not fulfilled.
     * 
     */
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;

    /**
     * The search session to get results from.
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

    /**
     * The minimum number of results to return in one response.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinResults() {
        return minResults;
    }

    /**
     * Sets the value of the minResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinResults()
     */
    public void setMinResults(Integer value) {
        this.minResults = value;
    }

    /**
     * The maximum number of results to return in one response.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxResults()
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * The maximum time before responding to the request, even if the
     *                   MinResults parameter is not fulfilled.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Sets the value of the waitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getWaitTime()
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

}
