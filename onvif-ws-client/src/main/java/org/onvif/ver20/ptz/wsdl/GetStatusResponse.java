
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZStatus;


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
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZStatus"/>
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
    "ptzStatus"
})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    /**
     * The PTZStatus for the requested MediaProfile.
     * 
     */
    @XmlElement(name = "PTZStatus", required = true)
    protected PTZStatus ptzStatus;

    /**
     * The PTZStatus for the requested MediaProfile.
     * 
     * @return
     *     possible object is
     *     {@link PTZStatus }
     *     
     */
    public PTZStatus getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZStatus }
     *     
     * @see #getPTZStatus()
     */
    public void setPTZStatus(PTZStatus value) {
        this.ptzStatus = value;
    }

}
