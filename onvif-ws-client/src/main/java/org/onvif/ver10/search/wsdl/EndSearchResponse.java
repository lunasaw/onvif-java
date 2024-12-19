
package org.onvif.ver10.search.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="Endpoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "endpoint"
})
@XmlRootElement(name = "EndSearchResponse")
public class EndSearchResponse {

    /**
     * The point of time the search had reached when it was ended. It is
     *                   equal to the EndPoint specified in Find-operation if the search was completed.
     * 
     */
    @XmlElement(name = "Endpoint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endpoint;

    /**
     * The point of time the search had reached when it was ended. It is
     *                   equal to the EndPoint specified in Find-operation if the search was completed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndpoint()
     */
    public void setEndpoint(XMLGregorianCalendar value) {
        this.endpoint = value;
    }

}
