
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoSourceExtension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoSourceExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingSettings20" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceExtension", propOrder = {
    "any",
    "imaging",
    "extension"
})
public class VideoSourceExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Optional configuration of the image sensor. To be used if imaging
     *             service 2.00 is supported.
     * 
     */
    @XmlElement(name = "Imaging")
    protected ImagingSettings20 imaging;
    @XmlElement(name = "Extension")
    protected VideoSourceExtension2 extension;

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Optional configuration of the image sensor. To be used if imaging
     *             service 2.00 is supported.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettings20 }
     *     
     */
    public ImagingSettings20 getImaging() {
        return imaging;
    }

    /**
     * Sets the value of the imaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettings20 }
     *     
     * @see #getImaging()
     */
    public void setImaging(ImagingSettings20 value) {
        this.imaging = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceExtension2 }
     *     
     */
    public VideoSourceExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceExtension2 }
     *     
     */
    public void setExtension(VideoSourceExtension2 value) {
        this.extension = value;
    }

}
