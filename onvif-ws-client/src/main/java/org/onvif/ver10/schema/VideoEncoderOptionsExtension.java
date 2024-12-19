
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
 * <p>Java class for VideoEncoderOptionsExtension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoEncoderOptionsExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions2" minOccurs="0"/>
 *         <element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options2" minOccurs="0"/>
 *         <element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options2" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderOptionsExtension", propOrder = {
    "any",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderOptionsExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Optional JPEG encoder settings ranges.
     * 
     */
    @XmlElement(name = "JPEG")
    protected JpegOptions2 jpeg;
    /**
     * Optional MPEG-4 encoder settings ranges.
     * 
     */
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options2 mpeg4;
    /**
     * Optional H.264 encoder settings ranges.
     * 
     */
    @XmlElement(name = "H264")
    protected H264Options2 h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension2 extension;

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
     * Optional JPEG encoder settings ranges.
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions2 }
     *     
     */
    public JpegOptions2 getJPEG() {
        return jpeg;
    }

    /**
     * Sets the value of the jpeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions2 }
     *     
     * @see #getJPEG()
     */
    public void setJPEG(JpegOptions2 value) {
        this.jpeg = value;
    }

    /**
     * Optional MPEG-4 encoder settings ranges.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options2 }
     *     
     */
    public Mpeg4Options2 getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options2 }
     *     
     * @see #getMPEG4()
     */
    public void setMPEG4(Mpeg4Options2 value) {
        this.mpeg4 = value;
    }

    /**
     * Optional H.264 encoder settings ranges.
     * 
     * @return
     *     possible object is
     *     {@link H264Options2 }
     *     
     */
    public H264Options2 getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options2 }
     *     
     * @see #getH264()
     */
    public void setH264(H264Options2 value) {
        this.h264 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public VideoEncoderOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension2 value) {
        this.extension = value;
    }

}
