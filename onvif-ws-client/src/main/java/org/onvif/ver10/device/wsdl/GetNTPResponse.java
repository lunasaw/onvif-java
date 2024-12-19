
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NTPInformation;


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
 *         <element name="NTPInformation" type="{http://www.onvif.org/ver10/schema}NTPInformation"/>
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
    "ntpInformation"
})
@XmlRootElement(name = "GetNTPResponse")
public class GetNTPResponse {

    /**
     * NTP information.
     * 
     */
    @XmlElement(name = "NTPInformation", required = true)
    protected NTPInformation ntpInformation;

    /**
     * NTP information.
     * 
     * @return
     *     possible object is
     *     {@link NTPInformation }
     *     
     */
    public NTPInformation getNTPInformation() {
        return ntpInformation;
    }

    /**
     * Sets the value of the ntpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NTPInformation }
     *     
     * @see #getNTPInformation()
     */
    public void setNTPInformation(NTPInformation value) {
        this.ntpInformation = value;
    }

}
