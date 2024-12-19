
package org.onvif.ver10.replay.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReplayConfiguration;


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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}ReplayConfiguration"/>
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
    "configuration"
})
@XmlRootElement(name = "SetReplayConfiguration")
public class SetReplayConfiguration {

    /**
     * Description of the new replay configuration parameters.
     * 
     */
    @XmlElement(name = "Configuration", required = true)
    protected ReplayConfiguration configuration;

    /**
     * Description of the new replay configuration parameters.
     * 
     * @return
     *     possible object is
     *     {@link ReplayConfiguration }
     *     
     */
    public ReplayConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplayConfiguration }
     *     
     * @see #getConfiguration()
     */
    public void setConfiguration(ReplayConfiguration value) {
        this.configuration = value;
    }

}
