
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SupportInformation;


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
 *         <element name="SupportInformation" type="{http://www.onvif.org/ver10/schema}SupportInformation"/>
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
    "supportInformation"
})
@XmlRootElement(name = "GetSystemSupportInformationResponse")
public class GetSystemSupportInformationResponse {

    /**
     * Contains the arbitary device diagnostics information.
     * 
     */
    @XmlElement(name = "SupportInformation", required = true)
    protected SupportInformation supportInformation;

    /**
     * Contains the arbitary device diagnostics information.
     * 
     * @return
     *     possible object is
     *     {@link SupportInformation }
     *     
     */
    public SupportInformation getSupportInformation() {
        return supportInformation;
    }

    /**
     * Sets the value of the supportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportInformation }
     *     
     * @see #getSupportInformation()
     */
    public void setSupportInformation(SupportInformation value) {
        this.supportInformation = value;
    }

}
