
package org.onvif.ver10.accessrules.wsdl;

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
 *         <element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StartReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "limit",
    "startReference"
})
@XmlRootElement(name = "GetAccessProfileList")
public class GetAccessProfileList {

    /**
     * Maximum number of entries to return. If not specified, less than
     *                   one
     *                   or higher than what the device supports, the number of items is determined by the
     *                   device.
     * 
     */
    @XmlElement(name = "Limit")
    protected Integer limit;
    /**
     * Start returning entries from this start reference. If not
     *                   specified,
     *                   entries shall start from the beginning of the dataset.
     * 
     */
    @XmlElement(name = "StartReference")
    protected String startReference;

    /**
     * Maximum number of entries to return. If not specified, less than
     *                   one
     *                   or higher than what the device supports, the number of items is determined by the
     *                   device.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLimit()
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Start returning entries from this start reference. If not
     *                   specified,
     *                   entries shall start from the beginning of the dataset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartReference() {
        return startReference;
    }

    /**
     * Sets the value of the startReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartReference()
     */
    public void setStartReference(String value) {
        this.startReference = value;
    }

}
