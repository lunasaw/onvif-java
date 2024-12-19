
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
 *         <element name="MaxTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="MaxMessageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
    "maxTimeout",
    "maxMessageLimit",
    "any"
})
@XmlRootElement(name = "PullMessagesFaultResponse")
public class PullMessagesFaultResponse {

    /**
     * Maximum timeout supported by the device.
     * 
     */
    @XmlElement(name = "MaxTimeout", required = true)
    protected Duration maxTimeout;
    /**
     * Maximum message limit supported by the device.
     * 
     */
    @XmlElement(name = "MaxMessageLimit")
    protected int maxMessageLimit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Maximum timeout supported by the device.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxTimeout() {
        return maxTimeout;
    }

    /**
     * Sets the value of the maxTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getMaxTimeout()
     */
    public void setMaxTimeout(Duration value) {
        this.maxTimeout = value;
    }

    /**
     * Maximum message limit supported by the device.
     * 
     */
    public int getMaxMessageLimit() {
        return maxMessageLimit;
    }

    /**
     * Sets the value of the maxMessageLimit property.
     * 
     */
    public void setMaxMessageLimit(int value) {
        this.maxMessageLimit = value;
    }

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

}
