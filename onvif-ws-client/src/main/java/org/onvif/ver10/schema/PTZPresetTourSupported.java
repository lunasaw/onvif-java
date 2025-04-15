
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;PTZPresetTourSupported complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZPresetTourSupported"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MaximumNumberOfPresetTours" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="PTZPresetTourOperation" type="{http://www.onvif.org/ver10/schema}PTZPresetTourOperation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSupportedExtension" minOccurs="0"/&amp;gt;
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
@XmlType(name = "PTZPresetTourSupported", propOrder = {
    "maximumNumberOfPresetTours",
    "ptzPresetTourOperation",
    "extension"
})
public class PTZPresetTourSupported {

    @XmlElement(name = "MaximumNumberOfPresetTours")
    protected int maximumNumberOfPresetTours;
    @XmlElement(name = "PTZPresetTourOperation")
    @XmlSchemaType(name = "string")
    protected List<PTZPresetTourOperation> ptzPresetTourOperation;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSupportedExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取maximumNumberOfPresetTours属性的值。
     * 
     */
    public int getMaximumNumberOfPresetTours() {
        return maximumNumberOfPresetTours;
    }

    /**
     * 设置maximumNumberOfPresetTours属性的值。
     * 
     */
    public void setMaximumNumberOfPresetTours(int value) {
        this.maximumNumberOfPresetTours = value;
    }

    /**
     * Gets the value of the ptzPresetTourOperation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ptzPresetTourOperation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPTZPresetTourOperation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourOperation }
     * 
     * 
     */
    public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
        if (ptzPresetTourOperation == null) {
            ptzPresetTourOperation = new ArrayList<PTZPresetTourOperation>();
        }
        return this.ptzPresetTourOperation;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public PTZPresetTourSupportedExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public void setExtension(PTZPresetTourSupportedExtension value) {
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
