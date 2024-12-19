
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FocusOptions20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FocusOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoFocusModes" type="{http://www.onvif.org/ver10/schema}AutoFocusMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DefaultSpeed" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="NearLimit" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="FarLimit" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusOptions20Extension" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusOptions20", propOrder = {
    "autoFocusModes",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "extension"
})
public class FocusOptions20 {

    /**
     * Supported mode for auto focus.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;AUTO - The device supports automatic focus adjustment.&lt;/li&gt;&lt;li&gt;MANUAL - The device supports manual focus adjustment.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "AutoFocusModes")
    @XmlSchemaType(name = "string")
    protected List<AutoFocusMode> autoFocusModes;
    /**
     * Valid range of DefaultSpeed.
     * 
     */
    @XmlElement(name = "DefaultSpeed")
    protected FloatRange defaultSpeed;
    /**
     * Valid range of NearLimit.
     * 
     */
    @XmlElement(name = "NearLimit")
    protected FloatRange nearLimit;
    /**
     * Valid range of FarLimit.
     * 
     */
    @XmlElement(name = "FarLimit")
    protected FloatRange farLimit;
    @XmlElement(name = "Extension")
    protected FocusOptions20Extension extension;

    /**
     * Supported mode for auto focus.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;AUTO - The device supports automatic focus adjustment.&lt;/li&gt;&lt;li&gt;MANUAL - The device supports manual focus adjustment.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * Gets the value of the autoFocusModes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoFocusModes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAutoFocusModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoFocusMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the autoFocusModes property.
     */
    public List<AutoFocusMode> getAutoFocusModes() {
        if (autoFocusModes == null) {
            autoFocusModes = new ArrayList<>();
        }
        return this.autoFocusModes;
    }

    /**
     * Valid range of DefaultSpeed.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * Sets the value of the defaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getDefaultSpeed()
     */
    public void setDefaultSpeed(FloatRange value) {
        this.defaultSpeed = value;
    }

    /**
     * Valid range of NearLimit.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getNearLimit() {
        return nearLimit;
    }

    /**
     * Sets the value of the nearLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getNearLimit()
     */
    public void setNearLimit(FloatRange value) {
        this.nearLimit = value;
    }

    /**
     * Valid range of FarLimit.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getFarLimit() {
        return farLimit;
    }

    /**
     * Sets the value of the farLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getFarLimit()
     */
    public void setFarLimit(FloatRange value) {
        this.farLimit = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions20Extension }
     *     
     */
    public FocusOptions20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions20Extension }
     *     
     */
    public void setExtension(FocusOptions20Extension value) {
        this.extension = value;
    }

}
