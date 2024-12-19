
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Space2DDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Space2DDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="XRange" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="YRange" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Space2DDescription", propOrder = {
    "uri",
    "xRange",
    "yRange"
})
public class Space2DDescription {

    /**
     * A URI of coordinate systems.
     * 
     */
    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    /**
     * A range of x-axis.
     * 
     */
    @XmlElement(name = "XRange", required = true)
    protected FloatRange xRange;
    /**
     * A range of y-axis.
     * 
     */
    @XmlElement(name = "YRange", required = true)
    protected FloatRange yRange;

    /**
     * A URI of coordinate systems.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getURI()
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * A range of x-axis.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getXRange() {
        return xRange;
    }

    /**
     * Sets the value of the xRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getXRange()
     */
    public void setXRange(FloatRange value) {
        this.xRange = value;
    }

    /**
     * A range of y-axis.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getYRange() {
        return yRange;
    }

    /**
     * Sets the value of the yRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getYRange()
     */
    public void setYRange(FloatRange value) {
        this.yRange = value;
    }

}
