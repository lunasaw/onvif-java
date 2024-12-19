
package org.onvif.ver10.deviceio.wsdl;

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
 *         <element name="DigitalInputOptions" type="{http://www.onvif.org/ver10/deviceIO/wsdl}DigitalInputConfigurationInputOptions"/>
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
    "digitalInputOptions"
})
@XmlRootElement(name = "GetDigitalInputConfigurationOptionsResponse")
public class GetDigitalInputConfigurationOptionsResponse {

    @XmlElement(name = "DigitalInputOptions", required = true)
    protected DigitalInputConfigurationInputOptions digitalInputOptions;

    /**
     * Gets the value of the digitalInputOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalInputConfigurationInputOptions }
     *     
     */
    public DigitalInputConfigurationInputOptions getDigitalInputOptions() {
        return digitalInputOptions;
    }

    /**
     * Sets the value of the digitalInputOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalInputConfigurationInputOptions }
     *     
     */
    public void setDigitalInputOptions(DigitalInputConfigurationInputOptions value) {
        this.digitalInputOptions = value;
    }

}
