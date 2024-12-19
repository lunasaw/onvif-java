
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver10.schema.TimeZone;


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
 *         <element name="DateTimeType" type="{http://www.onvif.org/ver10/schema}SetDateTimeType"/>
 *         <element name="DaylightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TimeZone" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0"/>
 *         <element name="UTCDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/>
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
    "dateTimeType",
    "daylightSavings",
    "timeZone",
    "utcDateTime"
})
@XmlRootElement(name = "SetSystemDateAndTime")
public class SetSystemDateAndTime {

    /**
     * Defines if the date and time is set via NTP or manually.
     * 
     */
    @XmlElement(name = "DateTimeType", required = true)
    @XmlSchemaType(name = "string")
    protected SetDateTimeType dateTimeType;
    /**
     * Automatically adjust Daylight savings if defined in TimeZone.
     * 
     */
    @XmlElement(name = "DaylightSavings")
    protected boolean daylightSavings;
    /**
     * The time zone in POSIX 1003.1 format
     * 
     */
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    /**
     * Date and time in UTC. If time is obtained via NTP, UTCDateTime has
     *                   no meaning
     * 
     */
    @XmlElement(name = "UTCDateTime")
    protected DateTime utcDateTime;

    /**
     * Defines if the date and time is set via NTP or manually.
     * 
     * @return
     *     possible object is
     *     {@link SetDateTimeType }
     *     
     */
    public SetDateTimeType getDateTimeType() {
        return dateTimeType;
    }

    /**
     * Sets the value of the dateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDateTimeType }
     *     
     * @see #getDateTimeType()
     */
    public void setDateTimeType(SetDateTimeType value) {
        this.dateTimeType = value;
    }

    /**
     * Automatically adjust Daylight savings if defined in TimeZone.
     * 
     */
    public boolean isDaylightSavings() {
        return daylightSavings;
    }

    /**
     * Sets the value of the daylightSavings property.
     * 
     */
    public void setDaylightSavings(boolean value) {
        this.daylightSavings = value;
    }

    /**
     * The time zone in POSIX 1003.1 format
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     * @see #getTimeZone()
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Date and time in UTC. If time is obtained via NTP, UTCDateTime has
     *                   no meaning
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getUTCDateTime() {
        return utcDateTime;
    }

    /**
     * Sets the value of the utcDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     * @see #getUTCDateTime()
     */
    public void setUTCDateTime(DateTime value) {
        this.utcDateTime = value;
    }

}
