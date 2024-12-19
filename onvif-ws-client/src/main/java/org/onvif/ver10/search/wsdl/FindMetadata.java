
package org.onvif.ver10.search.wsdl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MetadataFilter;
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
 *         <element name="StartPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="EndPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Scope" type="{http://www.onvif.org/ver10/schema}SearchScope"/>
 *         <element name="MetadataFilter" type="{http://www.onvif.org/ver10/schema}MetadataFilter"/>
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
    "startPoint",
    "endPoint",
    "scope",
    "metadataFilter",
    "maxMatches",
    "keepAliveTime"
})
@XmlRootElement(name = "FindMetadata")
public class FindMetadata {

    /**
     * The point of time where the search will start.
     * 
     */
    @XmlElement(name = "StartPoint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startPoint;
    /**
     * The point of time where the search will stop. This can be a time
     *                   before the StartPoint, in which case the search is performed backwards in time.
     * 
     */
    @XmlElement(name = "EndPoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endPoint;
    @XmlElement(name = "Scope", required = true)
    protected SearchScope scope;
    @XmlElement(name = "MetadataFilter", required = true)
    protected MetadataFilter metadataFilter;
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
     * The point of time where the search will start.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartPoint()
     */
    public void setStartPoint(XMLGregorianCalendar value) {
        this.startPoint = value;
    }

    /**
     * The point of time where the search will stop. This can be a time
     *                   before the StartPoint, in which case the search is performed backwards in time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndPoint()
     */
    public void setEndPoint(XMLGregorianCalendar value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the scope property.
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
     */
    public void setScope(SearchScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the metadataFilter property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataFilter }
     *     
     */
    public MetadataFilter getMetadataFilter() {
        return metadataFilter;
    }

    /**
     * Sets the value of the metadataFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataFilter }
     *     
     */
    public void setMetadataFilter(MetadataFilter value) {
        this.metadataFilter = value;
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
