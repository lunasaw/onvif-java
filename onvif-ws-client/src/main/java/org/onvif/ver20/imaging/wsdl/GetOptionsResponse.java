
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ImagingOptions20;


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
 *         <element name="ImagingOptions" type="{http://www.onvif.org/ver10/schema}ImagingOptions20"/>
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
    "imagingOptions"
})
@XmlRootElement(name = "GetOptionsResponse")
public class GetOptionsResponse {

    /**
     * Valid ranges for the imaging parameters that are categorized as device specific.
     * 
     */
    @XmlElement(name = "ImagingOptions", required = true)
    protected ImagingOptions20 imagingOptions;

    /**
     * Valid ranges for the imaging parameters that are categorized as device specific.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20 }
     *     
     */
    public ImagingOptions20 getImagingOptions() {
        return imagingOptions;
    }

    /**
     * Sets the value of the imagingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20 }
     *     
     * @see #getImagingOptions()
     */
    public void setImagingOptions(ImagingOptions20 value) {
        this.imagingOptions = value;
    }

}
