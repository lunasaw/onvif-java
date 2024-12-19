
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZSpeed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTZSpeed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = {
    "panTilt",
    "zoom"
})
public class PTZSpeed {

    /**
     * Pan and tilt speed. The x component corresponds to pan and the y
     *             component to tilt. If omitted in a request, the current (if any) PanTilt movement should
     *             not be affected.
     * 
     */
    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;
    /**
     * A zoom speed. If omitted in a request, the current (if any) Zoom movement should not be
     *             affected.
     * 
     */
    @XmlElement(name = "Zoom")
    protected Vector1D zoom;

    /**
     * Pan and tilt speed. The x component corresponds to pan and the y
     *             component to tilt. If omitted in a request, the current (if any) PanTilt movement should
     *             not be affected.
     * 
     * @return
     *     possible object is
     *     {@link Vector2D }
     *     
     */
    public Vector2D getPanTilt() {
        return panTilt;
    }

    /**
     * Sets the value of the panTilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector2D }
     *     
     * @see #getPanTilt()
     */
    public void setPanTilt(Vector2D value) {
        this.panTilt = value;
    }

    /**
     * A zoom speed. If omitted in a request, the current (if any) Zoom movement should not be
     *             affected.
     * 
     * @return
     *     possible object is
     *     {@link Vector1D }
     *     
     */
    public Vector1D getZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector1D }
     *     
     * @see #getZoom()
     */
    public void setZoom(Vector1D value) {
        this.zoom = value;
    }

}
