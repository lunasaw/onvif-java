
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DiscoveryMode;


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
 *         <element name="DiscoveryMode" type="{http://www.onvif.org/ver10/schema}DiscoveryMode"/>
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
    "discoveryMode"
})
@XmlRootElement(name = "GetDiscoveryModeResponse")
public class GetDiscoveryModeResponse {

    /**
     * Indicator of discovery mode: Discoverable, NonDiscoverable.
     * 
     */
    @XmlElement(name = "DiscoveryMode", required = true)
    @XmlSchemaType(name = "string")
    protected DiscoveryMode discoveryMode;

    /**
     * Indicator of discovery mode: Discoverable, NonDiscoverable.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryMode }
     *     
     */
    public DiscoveryMode getDiscoveryMode() {
        return discoveryMode;
    }

    /**
     * Sets the value of the discoveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryMode }
     *     
     * @see #getDiscoveryMode()
     */
    public void setDiscoveryMode(DiscoveryMode value) {
        this.discoveryMode = value;
    }

}
