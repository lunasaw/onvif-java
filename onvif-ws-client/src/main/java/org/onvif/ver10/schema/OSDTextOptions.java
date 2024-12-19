
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSDTextOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OSDTextOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="FontSizeRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDTextOptions", propOrder = {
    "type",
    "fontSizeRange",
    "dateFormat",
    "timeFormat",
    "fontColor",
    "backgroundColor",
    "extension"
})
public class OSDTextOptions {

    /**
     * List of supported OSD text type. When a device indicates the supported
     *             number relating to Text type in MaximumNumberOfOSDs, the type shall be presented.
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected List<String> type;
    /**
     * Range of the font size value.
     * 
     */
    @XmlElement(name = "FontSizeRange")
    protected IntRange fontSizeRange;
    /**
     * List of supported date format.
     * 
     */
    @XmlElement(name = "DateFormat")
    protected List<String> dateFormat;
    /**
     * List of supported time format.
     * 
     */
    @XmlElement(name = "TimeFormat")
    protected List<String> timeFormat;
    /**
     * List of supported font color.
     * 
     */
    @XmlElement(name = "FontColor")
    protected OSDColorOptions fontColor;
    /**
     * List of supported background color.
     * 
     */
    @XmlElement(name = "BackgroundColor")
    protected OSDColorOptions backgroundColor;
    @XmlElement(name = "Extension")
    protected OSDTextOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * List of supported OSD text type. When a device indicates the supported
     *             number relating to Text type in MaximumNumberOfOSDs, the type shall be presented.
     * 
     * Gets the value of the type property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the type property.
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
    }

    /**
     * Range of the font size value.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFontSizeRange() {
        return fontSizeRange;
    }

    /**
     * Sets the value of the fontSizeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getFontSizeRange()
     */
    public void setFontSizeRange(IntRange value) {
        this.fontSizeRange = value;
    }

    /**
     * List of supported date format.
     * 
     * Gets the value of the dateFormat property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateFormat property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDateFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the dateFormat property.
     */
    public List<String> getDateFormat() {
        if (dateFormat == null) {
            dateFormat = new ArrayList<>();
        }
        return this.dateFormat;
    }

    /**
     * List of supported time format.
     * 
     * Gets the value of the timeFormat property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeFormat property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTimeFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the timeFormat property.
     */
    public List<String> getTimeFormat() {
        if (timeFormat == null) {
            timeFormat = new ArrayList<>();
        }
        return this.timeFormat;
    }

    /**
     * List of supported font color.
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     * @see #getFontColor()
     */
    public void setFontColor(OSDColorOptions value) {
        this.fontColor = value;
    }

    /**
     * List of supported background color.
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     * @see #getBackgroundColor()
     */
    public void setBackgroundColor(OSDColorOptions value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public OSDTextOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public void setExtension(OSDTextOptionsExtension value) {
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
