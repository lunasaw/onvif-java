
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Time complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Time">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
    "hour",
    "minute",
    "second"
})
public class Time {

    /**
     * Range is 0 to 23.
     * 
     */
    @XmlElement(name = "Hour")
    protected int hour;
    /**
     * Range is 0 to 59.
     * 
     */
    @XmlElement(name = "Minute")
    protected int minute;
    /**
     * Range is 0 to 61 (typically 59).
     * 
     */
    @XmlElement(name = "Second")
    protected int second;

    /**
     * Range is 0 to 23.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Range is 0 to 59.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    /**
     * Range is 0 to 61 (typically 59).
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

}
