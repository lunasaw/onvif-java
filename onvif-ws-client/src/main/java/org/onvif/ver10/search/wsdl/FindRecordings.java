
package org.onvif.ver10.search.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SearchScope;


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
 *         <element name="Scope" type="{http://www.onvif.org/ver10/schema}SearchScope"/>
 *         <element name="MaxMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="KeepAliveTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
    "scope",
    "maxMatches",
    "keepAliveTime"
})
@XmlRootElement(name = "FindRecordings")
public class FindRecordings {

    /**
     * Scope defines the dataset to consider for this search.
     * 
     */
    @XmlElement(name = "Scope", required = true)
    protected SearchScope scope;
    /**
     * The search will be completed after this many matches. If not
     *                   specified, the search will continue until reaching the endpoint or until the
     *                   session expires.
     * 
     */
    @XmlElement(name = "MaxMatches")
    protected Integer maxMatches;
    /**
     * The time the search session will be kept alive after responding to
     *                   this and subsequent requests. A device shall support at least values up to ten
     *                   seconds.
     * 
     */
    @XmlElement(name = "KeepAliveTime", required = true)
    protected Duration keepAliveTime;

    /**
     * Scope defines the dataset to consider for this search.
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     * @see #getScope()
     */
    public void setScope(SearchScope value) {
        this.scope = value;
    }

    /**
     * The search will be completed after this many matches. If not
     *                   specified, the search will continue until reaching the endpoint or until the
     *                   session expires.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMatches() {
        return maxMatches;
    }

    /**
     * Sets the value of the maxMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxMatches()
     */
    public void setMaxMatches(Integer value) {
        this.maxMatches = value;
    }

    /**
     * The time the search session will be kept alive after responding to
     *                   this and subsequent requests. A device shall support at least values up to ten
     *                   seconds.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Sets the value of the keepAliveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getKeepAliveTime()
     */
    public void setKeepAliveTime(Duration value) {
        this.keepAliveTime = value;
    }

}
