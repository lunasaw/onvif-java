
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
 * Describe the option of the color supported. Either list each color or define
 *         the range of color value. The following values are acceptable for Colourspace attribute.
 *         
 * &lt;pre&gt;
 * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;&amp;lt;li&amp;gt;http://www.onvif.org/ver10/colorspace/YCbCr - YCbCr colourspace&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;http://www.onvif.org/ver10/colorspace/CIELUV - CIE LUV&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;http://www.onvif.org/ver10/colorspace/CIELAB - CIE 1976 (L*a*b*)&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;http://www.onvif.org/ver10/colorspace/HSV - HSV colourspace&amp;lt;/li&amp;gt;&amp;lt;/ul&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 * &lt;p&gt;ColorOptions complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ColorOptions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="ColorList" type="{http://www.onvif.org/ver10/schema}Color" maxOccurs="unbounded"/&amp;gt;
 *           &amp;lt;element name="ColorspaceRange" type="{http://www.onvif.org/ver10/schema}ColorspaceRange" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
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
@XmlType(name = "ColorOptions", propOrder = {
    "colorList",
    "colorspaceRange"
})
public class ColorOptions {

    @XmlElement(name = "ColorList")
    protected List<Color> colorList;
    @XmlElement(name = "ColorspaceRange")
    protected List<ColorspaceRange> colorspaceRange;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the colorList property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the colorList property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getColorList().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Color }
     * 
     * 
     */
    public List<Color> getColorList() {
        if (colorList == null) {
            colorList = new ArrayList<Color>();
        }
        return this.colorList;
    }

    /**
     * Gets the value of the colorspaceRange property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the colorspaceRange property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getColorspaceRange().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ColorspaceRange }
     * 
     * 
     */
    public List<ColorspaceRange> getColorspaceRange() {
        if (colorspaceRange == null) {
            colorspaceRange = new ArrayList<ColorspaceRange>();
        }
        return this.colorspaceRange;
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
