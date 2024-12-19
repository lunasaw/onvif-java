
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Range of a rectangle. The rectangle itself is defined by lower left corner
 *         position and size. Units are pixel.
 * 
 * <p>Java class for IntRectangleRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IntRectangleRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="YRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="WidthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="HeightRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangleRange", propOrder = {
    "xRange",
    "yRange",
    "widthRange",
    "heightRange"
})
public class IntRectangleRange {

    /**
     * Range of X-axis.
     * 
     */
    @XmlElement(name = "XRange", required = true)
    protected IntRange xRange;
    /**
     * Range of Y-axis.
     * 
     */
    @XmlElement(name = "YRange", required = true)
    protected IntRange yRange;
    /**
     * Range of width.
     * 
     */
    @XmlElement(name = "WidthRange", required = true)
    protected IntRange widthRange;
    /**
     * Range of height.
     * 
     */
    @XmlElement(name = "HeightRange", required = true)
    protected IntRange heightRange;

    /**
     * Range of X-axis.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getXRange() {
        return xRange;
    }

    /**
     * Sets the value of the xRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getXRange()
     */
    public void setXRange(IntRange value) {
        this.xRange = value;
    }

    /**
     * Range of Y-axis.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getYRange() {
        return yRange;
    }

    /**
     * Sets the value of the yRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getYRange()
     */
    public void setYRange(IntRange value) {
        this.yRange = value;
    }

    /**
     * Range of width.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getWidthRange() {
        return widthRange;
    }

    /**
     * Sets the value of the widthRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getWidthRange()
     */
    public void setWidthRange(IntRange value) {
        this.widthRange = value;
    }

    /**
     * Range of height.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getHeightRange() {
        return heightRange;
    }

    /**
     * Sets the value of the heightRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getHeightRange()
     */
    public void setHeightRange(IntRange value) {
        this.heightRange = value;
    }

}
