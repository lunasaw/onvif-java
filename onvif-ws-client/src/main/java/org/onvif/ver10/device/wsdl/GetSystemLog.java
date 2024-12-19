
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogType;


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
 *         <element name="LogType" type="{http://www.onvif.org/ver10/schema}SystemLogType"/>
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
    "logType"
})
@XmlRootElement(name = "GetSystemLog")
public class GetSystemLog {

    /**
     * Specifies the type of system log to get.
     * 
     */
    @XmlElement(name = "LogType", required = true)
    @XmlSchemaType(name = "string")
    protected SystemLogType logType;

    /**
     * Specifies the type of system log to get.
     * 
     * @return
     *     possible object is
     *     {@link SystemLogType }
     *     
     */
    public SystemLogType getLogType() {
        return logType;
    }

    /**
     * Sets the value of the logType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogType }
     *     
     * @see #getLogType()
     */
    public void setLogType(SystemLogType value) {
        this.logType = value;
    }

}
