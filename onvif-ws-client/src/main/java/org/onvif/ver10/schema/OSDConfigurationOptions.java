
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSDConfigurationOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OSDConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaximumNumberOfOSDs" type="{http://www.onvif.org/ver10/schema}MaximumNumberOfOSDs"/>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType" maxOccurs="unbounded"/>
 *         <element name="PositionOption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="TextOption" type="{http://www.onvif.org/ver10/schema}OSDTextOptions" minOccurs="0"/>
 *         <element name="ImageOption" type="{http://www.onvif.org/ver10/schema}OSDImgOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "OSDConfigurationOptions", propOrder = {
    "maximumNumberOfOSDs",
    "type",
    "positionOption",
    "textOption",
    "imageOption",
    "extension"
})
public class OSDConfigurationOptions {

    /**
     * The maximum number of OSD configurations supported for the specificate
     *             video source configuration. If a device limits the number of instances by OSDType, it
     *             should indicate the supported number via the related attribute.
     * 
     */
    @XmlElement(name = "MaximumNumberOfOSDs", required = true)
    protected MaximumNumberOfOSDs maximumNumberOfOSDs;
    /**
     * List supported type of OSD configuration. When a device indicates the
     *             supported number for each types in MaximumNumberOfOSDs, related type shall be presented.
     *             A device shall return Option element relating to listed type.
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected List<OSDType> type;
    /**
     * List available OSD position type. Following are the pre-defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;UpperLeft&lt;/li&gt;&lt;li&gt;UpperRight&lt;/li&gt;&lt;li&gt;LowerLeft&lt;/li&gt;&lt;li&gt;LowerRight&lt;/li&gt;&lt;li&gt;Custom&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "PositionOption", required = true)
    protected List<String> positionOption;
    /**
     * Option of the OSD text configuration. This element shall be returned if
     *             the device is signaling the support for Text.
     * 
     */
    @XmlElement(name = "TextOption")
    protected OSDTextOptions textOption;
    /**
     * Option of the OSD image configuration. This element shall be returned if
     *             the device is signaling the support for Image.
     * 
     */
    @XmlElement(name = "ImageOption")
    protected OSDImgOptions imageOption;
    @XmlElement(name = "Extension")
    protected OSDConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The maximum number of OSD configurations supported for the specificate
     *             video source configuration. If a device limits the number of instances by OSDType, it
     *             should indicate the supported number via the related attribute.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberOfOSDs }
     *     
     */
    public MaximumNumberOfOSDs getMaximumNumberOfOSDs() {
        return maximumNumberOfOSDs;
    }

    /**
     * Sets the value of the maximumNumberOfOSDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberOfOSDs }
     *     
     * @see #getMaximumNumberOfOSDs()
     */
    public void setMaximumNumberOfOSDs(MaximumNumberOfOSDs value) {
        this.maximumNumberOfOSDs = value;
    }

    /**
     * List supported type of OSD configuration. When a device indicates the
     *             supported number for each types in MaximumNumberOfOSDs, related type shall be presented.
     *             A device shall return Option element relating to listed type.
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
     * {@link OSDType }
     * </p>
     * 
     * 
     * @return
     *     The value of the type property.
     */
    public List<OSDType> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
    }

    /**
     * List available OSD position type. Following are the pre-defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;UpperLeft&lt;/li&gt;&lt;li&gt;UpperRight&lt;/li&gt;&lt;li&gt;LowerLeft&lt;/li&gt;&lt;li&gt;LowerRight&lt;/li&gt;&lt;li&gt;Custom&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * Gets the value of the positionOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPositionOption().add(newItem);
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
     *     The value of the positionOption property.
     */
    public List<String> getPositionOption() {
        if (positionOption == null) {
            positionOption = new ArrayList<>();
        }
        return this.positionOption;
    }

    /**
     * Option of the OSD text configuration. This element shall be returned if
     *             the device is signaling the support for Text.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptions }
     *     
     */
    public OSDTextOptions getTextOption() {
        return textOption;
    }

    /**
     * Sets the value of the textOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptions }
     *     
     * @see #getTextOption()
     */
    public void setTextOption(OSDTextOptions value) {
        this.textOption = value;
    }

    /**
     * Option of the OSD image configuration. This element shall be returned if
     *             the device is signaling the support for Image.
     * 
     * @return
     *     possible object is
     *     {@link OSDImgOptions }
     *     
     */
    public OSDImgOptions getImageOption() {
        return imageOption;
    }

    /**
     * Sets the value of the imageOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDImgOptions }
     *     
     * @see #getImageOption()
     */
    public void setImageOption(OSDImgOptions value) {
        this.imageOption = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public OSDConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public void setExtension(OSDConfigurationOptionsExtension value) {
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
