
package org.onvif.ver10.media.wsdl;

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
 *         <element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="JPEG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="H264" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MPEG4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "totalNumber",
    "jpeg",
    "h264",
    "mpeg4"
})
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

    /**
     * The minimum guaranteed total number of encoder instances
     *                   (applications) per VideoSourceConfiguration. The device is able to deliver the
     *                   TotalNumber of streams
     * 
     */
    @XmlElement(name = "TotalNumber")
    protected int totalNumber;
    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many Jpeg streams can be set up
     *                   at the same time per VideoSource.
     * 
     */
    @XmlElement(name = "JPEG")
    protected Integer jpeg;
    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many H264 streams can be set up
     *                   at the same time per VideoSource.
     * 
     */
    @XmlElement(name = "H264")
    protected Integer h264;
    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many Mpeg4 streams can be set up
     *                   at the same time per VideoSource.
     * 
     */
    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;

    /**
     * The minimum guaranteed total number of encoder instances
     *                   (applications) per VideoSourceConfiguration. The device is able to deliver the
     *                   TotalNumber of streams
     * 
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     * Sets the value of the totalNumber property.
     * 
     */
    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many Jpeg streams can be set up
     *                   at the same time per VideoSource.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJPEG() {
        return jpeg;
    }

    /**
     * Sets the value of the jpeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getJPEG()
     */
    public void setJPEG(Integer value) {
        this.jpeg = value;
    }

    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many H264 streams can be set up
     *                   at the same time per VideoSource.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getH264()
     */
    public void setH264(Integer value) {
        this.h264 = value;
    }

    /**
     * If a device limits the number of instances for respective Video
     *                   Codecs the response contains the information how many Mpeg4 streams can be set up
     *                   at the same time per VideoSource.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMPEG4()
     */
    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
    }

}
