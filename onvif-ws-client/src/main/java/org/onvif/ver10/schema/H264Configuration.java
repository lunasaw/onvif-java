
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for H264Configuration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="H264Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="H264Profile" type="{http://www.onvif.org/ver10/schema}H264Profile"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Configuration", propOrder = {
    "govLength",
    "h264Profile"
})
public class H264Configuration {

    /**
     * Group of Video frames length. Determines typically the interval in which
     *             the I-Frames will be coded. An entry of 1 indicates I-Frames are continuously generated.
     *             An entry of 2 indicates that every 2nd image is an I-Frame, and 3 only every 3rd frame,
     *             etc. The frames in between are coded as P or B Frames.
     * 
     */
    @XmlElement(name = "GovLength")
    protected int govLength;
    /**
     * the H.264 profile, either baseline, main, extended or high
     * 
     */
    @XmlElement(name = "H264Profile", required = true)
    @XmlSchemaType(name = "string")
    protected H264Profile h264Profile;

    /**
     * Group of Video frames length. Determines typically the interval in which
     *             the I-Frames will be coded. An entry of 1 indicates I-Frames are continuously generated.
     *             An entry of 2 indicates that every 2nd image is an I-Frame, and 3 only every 3rd frame,
     *             etc. The frames in between are coded as P or B Frames.
     * 
     */
    public int getGovLength() {
        return govLength;
    }

    /**
     * Sets the value of the govLength property.
     * 
     */
    public void setGovLength(int value) {
        this.govLength = value;
    }

    /**
     * the H.264 profile, either baseline, main, extended or high
     * 
     * @return
     *     possible object is
     *     {@link H264Profile }
     *     
     */
    public H264Profile getH264Profile() {
        return h264Profile;
    }

    /**
     * Sets the value of the h264Profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link H264Profile }
     *     
     * @see #getH264Profile()
     */
    public void setH264Profile(H264Profile value) {
        this.h264Profile = value;
    }

}
