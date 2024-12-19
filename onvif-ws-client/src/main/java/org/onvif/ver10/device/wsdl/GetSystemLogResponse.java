
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLog;


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
 *         <element name="SystemLog" type="{http://www.onvif.org/ver10/schema}SystemLog"/>
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
    "systemLog"
})
@XmlRootElement(name = "GetSystemLogResponse")
public class GetSystemLogResponse {

    /**
     * Contains the system log information.
     * 
     */
    @XmlElement(name = "SystemLog", required = true)
    protected SystemLog systemLog;

    /**
     * Contains the system log information.
     * 
     * @return
     *     possible object is
     *     {@link SystemLog }
     *     
     */
    public SystemLog getSystemLog() {
        return systemLog;
    }

    /**
     * Sets the value of the systemLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLog }
     *     
     * @see #getSystemLog()
     */
    public void setSystemLog(SystemLog value) {
        this.systemLog = value;
    }

}
