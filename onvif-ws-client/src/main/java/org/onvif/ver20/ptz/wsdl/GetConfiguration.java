
package org.onvif.ver20.ptz.wsdl;

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
 *         <element name="PTZConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "ptzConfigurationToken"
})
@XmlRootElement(name = "GetConfiguration")
public class GetConfiguration {

    /**
     * Token of the requested PTZConfiguration.
     * 
     */
    @XmlElement(name = "PTZConfigurationToken", required = true)
    protected String ptzConfigurationToken;

    /**
     * Token of the requested PTZConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTZConfigurationToken() {
        return ptzConfigurationToken;
    }

    /**
     * Sets the value of the ptzConfigurationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPTZConfigurationToken()
     */
    public void setPTZConfigurationToken(String value) {
        this.ptzConfigurationToken = value;
    }

}
