
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type describing whether BLC mode is enabled or disabled (on/off).
 * 
 * <p>Java class for BacklightCompensation20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BacklightCompensation20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}BacklightCompensationMode"/>
 *         <element name="Level" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BacklightCompensation20", propOrder = {
    "mode",
    "level"
})
public class BacklightCompensation20 {

    /**
     * Backlight compensation mode (on/off).
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected BacklightCompensationMode mode;
    /**
     * Optional level parameter (unit unspecified).
     * 
     */
    @XmlElement(name = "Level")
    protected Float level;

    /**
     * Backlight compensation mode (on/off).
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationMode }
     *     
     */
    public BacklightCompensationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationMode }
     *     
     * @see #getMode()
     */
    public void setMode(BacklightCompensationMode value) {
        this.mode = value;
    }

    /**
     * Optional level parameter (unit unspecified).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getLevel()
     */
    public void setLevel(Float value) {
        this.level = value;
    }

}
