
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;PTZSpaces complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZSpaces"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AbsolutePanTiltPositionSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AbsoluteZoomPositionSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RelativePanTiltTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RelativeZoomTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContinuousPanTiltVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContinuousZoomVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PanTiltSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ZoomSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZSpacesExtension" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpaces", propOrder = {
    "absolutePanTiltPositionSpace",
    "absoluteZoomPositionSpace",
    "relativePanTiltTranslationSpace",
    "relativeZoomTranslationSpace",
    "continuousPanTiltVelocitySpace",
    "continuousZoomVelocitySpace",
    "panTiltSpeedSpace",
    "zoomSpeedSpace",
    "extension"
})
public class PTZSpaces {

    @XmlElement(name = "AbsolutePanTiltPositionSpace")
    protected List<Space2DDescription> absolutePanTiltPositionSpace;
    @XmlElement(name = "AbsoluteZoomPositionSpace")
    protected List<Space1DDescription> absoluteZoomPositionSpace;
    @XmlElement(name = "RelativePanTiltTranslationSpace")
    protected List<Space2DDescription> relativePanTiltTranslationSpace;
    @XmlElement(name = "RelativeZoomTranslationSpace")
    protected List<Space1DDescription> relativeZoomTranslationSpace;
    @XmlElement(name = "ContinuousPanTiltVelocitySpace")
    protected List<Space2DDescription> continuousPanTiltVelocitySpace;
    @XmlElement(name = "ContinuousZoomVelocitySpace")
    protected List<Space1DDescription> continuousZoomVelocitySpace;
    @XmlElement(name = "PanTiltSpeedSpace")
    protected List<Space1DDescription> panTiltSpeedSpace;
    @XmlElement(name = "ZoomSpeedSpace")
    protected List<Space1DDescription> zoomSpeedSpace;
    @XmlElement(name = "Extension")
    protected PTZSpacesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the absolutePanTiltPositionSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the absolutePanTiltPositionSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAbsolutePanTiltPositionSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getAbsolutePanTiltPositionSpace() {
        if (absolutePanTiltPositionSpace == null) {
            absolutePanTiltPositionSpace = new ArrayList<Space2DDescription>();
        }
        return this.absolutePanTiltPositionSpace;
    }

    /**
     * Gets the value of the absoluteZoomPositionSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the absoluteZoomPositionSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAbsoluteZoomPositionSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getAbsoluteZoomPositionSpace() {
        if (absoluteZoomPositionSpace == null) {
            absoluteZoomPositionSpace = new ArrayList<Space1DDescription>();
        }
        return this.absoluteZoomPositionSpace;
    }

    /**
     * Gets the value of the relativePanTiltTranslationSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relativePanTiltTranslationSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelativePanTiltTranslationSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getRelativePanTiltTranslationSpace() {
        if (relativePanTiltTranslationSpace == null) {
            relativePanTiltTranslationSpace = new ArrayList<Space2DDescription>();
        }
        return this.relativePanTiltTranslationSpace;
    }

    /**
     * Gets the value of the relativeZoomTranslationSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relativeZoomTranslationSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelativeZoomTranslationSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getRelativeZoomTranslationSpace() {
        if (relativeZoomTranslationSpace == null) {
            relativeZoomTranslationSpace = new ArrayList<Space1DDescription>();
        }
        return this.relativeZoomTranslationSpace;
    }

    /**
     * Gets the value of the continuousPanTiltVelocitySpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the continuousPanTiltVelocitySpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContinuousPanTiltVelocitySpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getContinuousPanTiltVelocitySpace() {
        if (continuousPanTiltVelocitySpace == null) {
            continuousPanTiltVelocitySpace = new ArrayList<Space2DDescription>();
        }
        return this.continuousPanTiltVelocitySpace;
    }

    /**
     * Gets the value of the continuousZoomVelocitySpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the continuousZoomVelocitySpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContinuousZoomVelocitySpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getContinuousZoomVelocitySpace() {
        if (continuousZoomVelocitySpace == null) {
            continuousZoomVelocitySpace = new ArrayList<Space1DDescription>();
        }
        return this.continuousZoomVelocitySpace;
    }

    /**
     * Gets the value of the panTiltSpeedSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the panTiltSpeedSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPanTiltSpeedSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getPanTiltSpeedSpace() {
        if (panTiltSpeedSpace == null) {
            panTiltSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.panTiltSpeedSpace;
    }

    /**
     * Gets the value of the zoomSpeedSpace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the zoomSpeedSpace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getZoomSpeedSpace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getZoomSpeedSpace() {
        if (zoomSpeedSpace == null) {
            zoomSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.zoomSpeedSpace;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public PTZSpacesExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public void setExtension(PTZSpacesExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
