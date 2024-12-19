
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ImagingStatus20;


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
 *         <element name="Status" type="{http://www.onvif.org/ver10/schema}ImagingStatus20"/>
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
    "status"
})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    /**
     * Requested imaging status.
     * 
     */
    @XmlElement(name = "Status", required = true)
    protected ImagingStatus20 status;

    /**
     * Requested imaging status.
     * 
     * @return
     *     possible object is
     *     {@link ImagingStatus20 }
     *     
     */
    public ImagingStatus20 getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingStatus20 }
     *     
     * @see #getStatus()
     */
    public void setStatus(ImagingStatus20 value) {
        this.status = value;
    }

}
