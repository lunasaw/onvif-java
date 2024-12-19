
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveOptions20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MoveOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/>
 *         <element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions20" minOccurs="0"/>
 *         <element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions20", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class MoveOptions20 {

    /**
     * Valid ranges for the absolute control.
     * 
     */
    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;
    /**
     * Valid ranges for the relative control.
     * 
     */
    @XmlElement(name = "Relative")
    protected RelativeFocusOptions20 relative;
    /**
     * Valid ranges for the continuous control.
     * 
     */
    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    /**
     * Valid ranges for the absolute control.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public AbsoluteFocusOptions getAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocusOptions }
     *     
     * @see #getAbsolute()
     */
    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    /**
     * Valid ranges for the relative control.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocusOptions20 }
     *     
     */
    public RelativeFocusOptions20 getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocusOptions20 }
     *     
     * @see #getRelative()
     */
    public void setRelative(RelativeFocusOptions20 value) {
        this.relative = value;
    }

    /**
     * Valid ranges for the continuous control.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public ContinuousFocusOptions getContinuous() {
        return continuous;
    }

    /**
     * Sets the value of the continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocusOptions }
     *     
     * @see #getContinuous()
     */
    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }

}
