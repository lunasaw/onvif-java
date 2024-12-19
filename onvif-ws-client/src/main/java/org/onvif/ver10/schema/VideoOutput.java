
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Representation of a physical video outputs.
 * 
 * <p>Java class for VideoOutput complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoOutput">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       <sequence>
 *         <element name="Layout" type="{http://www.onvif.org/ver10/schema}Layout"/>
 *         <element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution" minOccurs="0"/>
 *         <element name="RefreshRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoOutputExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoOutput", propOrder = {
    "layout",
    "resolution",
    "refreshRate",
    "aspectRatio",
    "extension"
})
public class VideoOutput
    extends DeviceEntity
{

    @XmlElement(name = "Layout", required = true)
    protected Layout layout;
    /**
     * Resolution of the display in Pixel.
     * 
     */
    @XmlElement(name = "Resolution")
    protected VideoResolution resolution;
    /**
     * Refresh rate of the display in Hertz.
     * 
     */
    @XmlElement(name = "RefreshRate")
    protected Float refreshRate;
    /**
     * Aspect ratio of the display as physical extent of width divided by
     *                 height.
     * 
     */
    @XmlElement(name = "AspectRatio")
    protected Float aspectRatio;
    @XmlElement(name = "Extension")
    protected VideoOutputExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Resolution of the display in Pixel.
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     * @see #getResolution()
     */
    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    /**
     * Refresh rate of the display in Hertz.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getRefreshRate()
     */
    public void setRefreshRate(Float value) {
        this.refreshRate = value;
    }

    /**
     * Aspect ratio of the display as physical extent of width divided by
     *                 height.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getAspectRatio()
     */
    public void setAspectRatio(Float value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoOutputExtension }
     *     
     */
    public VideoOutputExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoOutputExtension }
     *     
     */
    public void setExtension(VideoOutputExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
