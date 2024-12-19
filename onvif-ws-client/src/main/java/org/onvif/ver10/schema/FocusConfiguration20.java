
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FocusConfiguration20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FocusConfiguration20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/>
 *         <element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20Extension" minOccurs="0"/>
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
@XmlType(name = "FocusConfiguration20", propOrder = {
    "autoFocusMode",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "extension"
})
public class FocusConfiguration20 {

    /**
     * Mode of auto focus.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;AUTO - The device automatically adjusts focus.&lt;/li&gt;&lt;li&gt;MANUAL - The device does not automatically adjust focus.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *             Note: for devices supporting both manual and auto operation at the same time manual
     *             operation may be supported even if the Mode parameter is set to Auto.
     * 
     */
    @XmlElement(name = "AutoFocusMode", required = true)
    @XmlSchemaType(name = "string")
    protected AutoFocusMode autoFocusMode;
    @XmlElement(name = "DefaultSpeed")
    protected Float defaultSpeed;
    /**
     * Parameter to set autofocus near limit (unit: meter).
     * 
     */
    @XmlElement(name = "NearLimit")
    protected Float nearLimit;
    /**
     * Parameter to set autofocus far limit (unit: meter).
     * 
     */
    @XmlElement(name = "FarLimit")
    protected Float farLimit;
    @XmlElement(name = "Extension")
    protected FocusConfiguration20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Mode of auto focus.
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;AUTO - The device automatically adjusts focus.&lt;/li&gt;&lt;li&gt;MANUAL - The device does not automatically adjust focus.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     *             Note: for devices supporting both manual and auto operation at the same time manual
     *             operation may be supported even if the Mode parameter is set to Auto.
     * 
     * @return
     *     possible object is
     *     {@link AutoFocusMode }
     *     
     */
    public AutoFocusMode getAutoFocusMode() {
        return autoFocusMode;
    }

    /**
     * Sets the value of the autoFocusMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoFocusMode }
     *     
     * @see #getAutoFocusMode()
     */
    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    /**
     * Gets the value of the defaultSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * Sets the value of the defaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultSpeed(Float value) {
        this.defaultSpeed = value;
    }

    /**
     * Parameter to set autofocus near limit (unit: meter).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNearLimit() {
        return nearLimit;
    }

    /**
     * Sets the value of the nearLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getNearLimit()
     */
    public void setNearLimit(Float value) {
        this.nearLimit = value;
    }

    /**
     * Parameter to set autofocus far limit (unit: meter).
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFarLimit() {
        return farLimit;
    }

    /**
     * Sets the value of the farLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getFarLimit()
     */
    public void setFarLimit(Float value) {
        this.farLimit = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public FocusConfiguration20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public void setExtension(FocusConfiguration20Extension value) {
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
