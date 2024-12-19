
package org.onvif.ver10.deviceio.wsdl;

import java.math.BigInteger;
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
 *         <element name="SerialData" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialData" minOccurs="0"/>
 *         <element name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="DataLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "serialData",
    "timeOut",
    "dataLength",
    "delimiter"
})
@XmlRootElement(name = "SendReceiveSerialCommand")
public class SendReceiveSerialCommand {

    /**
     * The serial port data.
     * 
     */
    @XmlElement(name = "SerialData")
    protected SerialData serialData;
    /**
     * Indicates that the command should be responded back within the
     *                   specified period of time.
     * 
     */
    @XmlElement(name = "TimeOut")
    protected Duration timeOut;
    /**
     * This element may be put in the case that data length returned from
     *                   the connected serial device is already determined as some fixed bytes length. It
     *                   indicates the length of received data which can be regarded as available.
     * 
     */
    @XmlElement(name = "DataLength")
    protected BigInteger dataLength;
    /**
     * This element may be put in the case that the delimiter codes
     *                   returned from the connected serial device is already known. It indicates the
     *                   termination data sequence of the responded data. In case the string has more than
     *                   one character a device shall interpret the whole string as a single delimiter.
     *                   Furthermore a device shall return the delimiter character(s) to the tests.
     * 
     */
    @XmlElement(name = "Delimiter")
    protected String delimiter;

    /**
     * The serial port data.
     * 
     * @return
     *     possible object is
     *     {@link SerialData }
     *     
     */
    public SerialData getSerialData() {
        return serialData;
    }

    /**
     * Sets the value of the serialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialData }
     *     
     * @see #getSerialData()
     */
    public void setSerialData(SerialData value) {
        this.serialData = value;
    }

    /**
     * Indicates that the command should be responded back within the
     *                   specified period of time.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getTimeOut()
     */
    public void setTimeOut(Duration value) {
        this.timeOut = value;
    }

    /**
     * This element may be put in the case that data length returned from
     *                   the connected serial device is already determined as some fixed bytes length. It
     *                   indicates the length of received data which can be regarded as available.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLength() {
        return dataLength;
    }

    /**
     * Sets the value of the dataLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDataLength()
     */
    public void setDataLength(BigInteger value) {
        this.dataLength = value;
    }

    /**
     * This element may be put in the case that the delimiter codes
     *                   returned from the connected serial device is already known. It indicates the
     *                   termination data sequence of the responded data. In case the string has more than
     *                   one character a device shall interpret the whole string as a single delimiter.
     *                   Furthermore a device shall return the delimiter character(s) to the tests.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDelimiter()
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

}
