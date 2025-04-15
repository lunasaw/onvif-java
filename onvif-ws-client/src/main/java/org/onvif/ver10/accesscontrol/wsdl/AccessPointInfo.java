
package org.onvif.ver10.accesscontrol.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * 
 *             The AccessPointInfo structure contains basic information about an AccessPoint instance.
 *             An AccessPoint defines an entity a Credential can be granted or denied access to. The
 *             AccessPointInfo provides basic information on how access is controlled in one direction
 *             for a
 *             door (from which area to which area).
 *             &lt;/p&gt;&lt;p&gt;
 *             door is the typical device involved, but other type of
 *             devices may be supported as well.
 *             Multiple AccessPoints may cover the same Door.
 *             A typical case is one AccessPoint for entry and another for exit, both referencing
 *             the same Door.
 *             &lt;/p&gt;&lt;p&gt;
 * 
 *             An ONVIF compliant device shall provide the following fields for each AccessPoint
 *             instance:
 *           
 * 
 * &lt;p&gt;AccessPointInfo complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AccessPointInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointInfoBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Capabilities" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointCapabilities"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfo", propOrder = {
    "capabilities",
    "any"
})
public class AccessPointInfo
    extends AccessPointInfoBase
{

    @XmlElement(name = "Capabilities", required = true)
    protected AccessPointCapabilities capabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取capabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessPointCapabilities }
     *     
     */
    public AccessPointCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * 设置capabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointCapabilities }
     *     
     */
    public void setCapabilities(AccessPointCapabilities value) {
        this.capabilities = value;
    }

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
