
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mpeg4Configuration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Mpeg4Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Mpeg4Profile" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Configuration", propOrder = {
    "govLength",
    "mpeg4Profile"
})
public class Mpeg4Configuration {

    /**
     * Determines the interval in which the I-Frames will be coded. An entry of
     *             1 indicates I-Frames are continuously generated. An entry of 2 indicates that every 2nd
     *             image is an I-Frame, and 3 only every 3rd frame, etc. The frames in between are coded as
     *             P or B Frames.
     * 
     */
    @XmlElement(name = "GovLength")
    protected int govLength;
    /**
     * the Mpeg4 profile, either simple profile (SP) or advanced simple profile
     *             (ASP)
     * 
     */
    @XmlElement(name = "Mpeg4Profile", required = true)
    @XmlSchemaType(name = "string")
    protected Mpeg4Profile mpeg4Profile;

    /**
     * Determines the interval in which the I-Frames will be coded. An entry of
     *             1 indicates I-Frames are continuously generated. An entry of 2 indicates that every 2nd
     *             image is an I-Frame, and 3 only every 3rd frame, etc. The frames in between are coded as
     *             P or B Frames.
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
     * the Mpeg4 profile, either simple profile (SP) or advanced simple profile
     *             (ASP)
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Profile }
     *     
     */
    public Mpeg4Profile getMpeg4Profile() {
        return mpeg4Profile;
    }

    /**
     * Sets the value of the mpeg4Profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Profile }
     *     
     * @see #getMpeg4Profile()
     */
    public void setMpeg4Profile(Mpeg4Profile value) {
        this.mpeg4Profile = value;
    }

}
