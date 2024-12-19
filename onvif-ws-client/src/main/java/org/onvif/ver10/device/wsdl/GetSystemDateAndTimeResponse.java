
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemDateTime;


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
 *         <element name="SystemDateAndTime" type="{http://www.onvif.org/ver10/schema}SystemDateTime"/>
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
    "systemDateAndTime"
})
@XmlRootElement(name = "GetSystemDateAndTimeResponse")
public class GetSystemDateAndTimeResponse {

    /**
     * Contains information whether system date and time are set manually
     *                   or by NTP, daylight savings is on or off, time zone in POSIX 1003.1 format and
     *                   system date and time in UTC and also local system date and time.
     * 
     */
    @XmlElement(name = "SystemDateAndTime", required = true)
    protected SystemDateTime systemDateAndTime;

    /**
     * Contains information whether system date and time are set manually
     *                   or by NTP, daylight savings is on or off, time zone in POSIX 1003.1 format and
     *                   system date and time in UTC and also local system date and time.
     * 
     * @return
     *     possible object is
     *     {@link SystemDateTime }
     *     
     */
    public SystemDateTime getSystemDateAndTime() {
        return systemDateAndTime;
    }

    /**
     * Sets the value of the systemDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDateTime }
     *     
     * @see #getSystemDateAndTime()
     */
    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }

}
