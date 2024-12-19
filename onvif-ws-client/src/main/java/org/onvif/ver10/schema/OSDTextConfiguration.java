
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
 * <p>Java class for OSDTextConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OSDTextConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/>
 *         <element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "OSDTextConfiguration", propOrder = {
    "type",
    "dateFormat",
    "timeFormat",
    "fontSize",
    "fontColor",
    "backgroundColor",
    "plainText",
    "extension"
})
public class OSDTextConfiguration {

    /**
     * The following OSD Text Type are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Plain - The Plain type means the OSD is shown as a text string which defined in
     *                 the "PlainText" item.
     *               &lt;/li&gt;&lt;li&gt;Date - The Date type means the OSD is shown as a date, format of which should be
     *                 present in the "DateFormat" item.
     *               &lt;/li&gt;&lt;li&gt;Time - The Time type means the OSD is shown as a time, format of which should be
     *                 present in the "TimeFormat" item.
     *               &lt;/li&gt;&lt;li&gt;DateAndTime - The DateAndTime type means the OSD is shown as date and time, format
     *                 of which should be present in the "DateFormat" and the "TimeFormat" item.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * List of supported OSD date formats. This element shall be present when the value of Type
     *             field has Date or DateAndTime. The following DateFormat are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;M/d/yyyy - e.g. 3/6/2013&lt;/li&gt;&lt;li&gt;MM/dd/yyyy - e.g. 03/06/2013&lt;/li&gt;&lt;li&gt;dd/MM/yyyy - e.g. 06/03/2013&lt;/li&gt;&lt;li&gt;yyyy/MM/dd - e.g. 2013/03/06&lt;/li&gt;&lt;li&gt;yyyy-MM-dd - e.g. 2013-06-03&lt;/li&gt;&lt;li&gt;dddd, MMMM dd, yyyy - e.g. Wednesday, March 06, 2013&lt;/li&gt;&lt;li&gt;MMMM dd, yyyy - e.g. March 06, 2013&lt;/li&gt;&lt;li&gt;dd MMMM, yyyy - e.g. 06 March, 2013&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "DateFormat")
    protected String dateFormat;
    /**
     * List of supported OSD time formats. This element shall be present when the value of Type
     *             field has Time or DateAndTime. The following TimeFormat are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;h:mm:ss tt - e.g. 2:14:21 PM&lt;/li&gt;&lt;li&gt;hh:mm:ss tt - e.g. 02:14:21 PM&lt;/li&gt;&lt;li&gt;H:mm:ss - e.g. 14:14:21&lt;/li&gt;&lt;li&gt;HH:mm:ss - e.g. 14:14:21&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "TimeFormat")
    protected String timeFormat;
    /**
     * Font size of the text in pt.
     * 
     */
    @XmlElement(name = "FontSize")
    protected Integer fontSize;
    /**
     * Font color of the text.
     * 
     */
    @XmlElement(name = "FontColor")
    protected OSDColor fontColor;
    /**
     * Background color of the text.
     * 
     */
    @XmlElement(name = "BackgroundColor")
    protected OSDColor backgroundColor;
    /**
     * The content of text to be displayed.
     * 
     */
    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "Extension")
    protected OSDTextConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The following OSD Text Type are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Plain - The Plain type means the OSD is shown as a text string which defined in
     *                 the "PlainText" item.
     *               &lt;/li&gt;&lt;li&gt;Date - The Date type means the OSD is shown as a date, format of which should be
     *                 present in the "DateFormat" item.
     *               &lt;/li&gt;&lt;li&gt;Time - The Time type means the OSD is shown as a time, format of which should be
     *                 present in the "TimeFormat" item.
     *               &lt;/li&gt;&lt;li&gt;DateAndTime - The DateAndTime type means the OSD is shown as date and time, format
     *                 of which should be present in the "DateFormat" and the "TimeFormat" item.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * List of supported OSD date formats. This element shall be present when the value of Type
     *             field has Date or DateAndTime. The following DateFormat are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;M/d/yyyy - e.g. 3/6/2013&lt;/li&gt;&lt;li&gt;MM/dd/yyyy - e.g. 03/06/2013&lt;/li&gt;&lt;li&gt;dd/MM/yyyy - e.g. 06/03/2013&lt;/li&gt;&lt;li&gt;yyyy/MM/dd - e.g. 2013/03/06&lt;/li&gt;&lt;li&gt;yyyy-MM-dd - e.g. 2013-06-03&lt;/li&gt;&lt;li&gt;dddd, MMMM dd, yyyy - e.g. Wednesday, March 06, 2013&lt;/li&gt;&lt;li&gt;MMMM dd, yyyy - e.g. March 06, 2013&lt;/li&gt;&lt;li&gt;dd MMMM, yyyy - e.g. 06 March, 2013&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDateFormat()
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * List of supported OSD time formats. This element shall be present when the value of Type
     *             field has Time or DateAndTime. The following TimeFormat are defined:
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;h:mm:ss tt - e.g. 2:14:21 PM&lt;/li&gt;&lt;li&gt;hh:mm:ss tt - e.g. 02:14:21 PM&lt;/li&gt;&lt;li&gt;H:mm:ss - e.g. 14:14:21&lt;/li&gt;&lt;li&gt;HH:mm:ss - e.g. 14:14:21&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTimeFormat()
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Font size of the text in pt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFontSize()
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    /**
     * Font color of the text.
     * 
     * @return
     *     possible object is
     *     {@link OSDColor }
     *     
     */
    public OSDColor getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColor }
     *     
     * @see #getFontColor()
     */
    public void setFontColor(OSDColor value) {
        this.fontColor = value;
    }

    /**
     * Background color of the text.
     * 
     * @return
     *     possible object is
     *     {@link OSDColor }
     *     
     */
    public OSDColor getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColor }
     *     
     * @see #getBackgroundColor()
     */
    public void setBackgroundColor(OSDColor value) {
        this.backgroundColor = value;
    }

    /**
     * The content of text to be displayed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Sets the value of the plainText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlainText()
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextConfigurationExtension }
     *     
     */
    public OSDTextConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextConfigurationExtension }
     *     
     */
    public void setExtension(OSDTextConfigurationExtension value) {
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
