
package org.onvif.ver10.accessrules.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * 
 *             The service capabilities reflect optional functionality of a service. The information is
 *             static
 *             and does not change during device operation. The following capabilities are available:
 *           
 * 
 * &lt;p&gt;ServiceCapabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceCapabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="MaxLimit" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="MaxAccessProfiles" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="MaxAccessPoliciesPerAccessProfile" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="MultipleSchedulesPerAccessPointSupported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCapabilities", propOrder = {
    "any"
})
public class ServiceCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "MaxLimit", required = true)
    protected long maxLimit;
    @XmlAttribute(name = "MaxAccessProfiles", required = true)
    protected long maxAccessProfiles;
    @XmlAttribute(name = "MaxAccessPoliciesPerAccessProfile", required = true)
    protected long maxAccessPoliciesPerAccessProfile;
    @XmlAttribute(name = "MultipleSchedulesPerAccessPointSupported", required = true)
    protected boolean multipleSchedulesPerAccessPointSupported;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * 获取maxLimit属性的值。
     * 
     */
    public long getMaxLimit() {
        return maxLimit;
    }

    /**
     * 设置maxLimit属性的值。
     * 
     */
    public void setMaxLimit(long value) {
        this.maxLimit = value;
    }

    /**
     * 获取maxAccessProfiles属性的值。
     * 
     */
    public long getMaxAccessProfiles() {
        return maxAccessProfiles;
    }

    /**
     * 设置maxAccessProfiles属性的值。
     * 
     */
    public void setMaxAccessProfiles(long value) {
        this.maxAccessProfiles = value;
    }

    /**
     * 获取maxAccessPoliciesPerAccessProfile属性的值。
     * 
     */
    public long getMaxAccessPoliciesPerAccessProfile() {
        return maxAccessPoliciesPerAccessProfile;
    }

    /**
     * 设置maxAccessPoliciesPerAccessProfile属性的值。
     * 
     */
    public void setMaxAccessPoliciesPerAccessProfile(long value) {
        this.maxAccessPoliciesPerAccessProfile = value;
    }

    /**
     * 获取multipleSchedulesPerAccessPointSupported属性的值。
     * This getter has been renamed from isMultipleSchedulesPerAccessPointSupported() to getMultipleSchedulesPerAccessPointSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getMultipleSchedulesPerAccessPointSupported() {
        return multipleSchedulesPerAccessPointSupported;
    }

    /**
     * 设置multipleSchedulesPerAccessPointSupported属性的值。
     * 
     */
    public void setMultipleSchedulesPerAccessPointSupported(boolean value) {
        this.multipleSchedulesPerAccessPointSupported = value;
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
