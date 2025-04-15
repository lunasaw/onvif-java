
package org.onvif.ver20.ptz.wsdl;

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
 * &lt;p&gt;Capabilities complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Capabilities"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="EFlip" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="Reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="GetCompatibleConfigurations" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="MoveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="StatusPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "EFlip")
    protected Boolean eFlip;
    @XmlAttribute(name = "Reverse")
    protected Boolean reverse;
    @XmlAttribute(name = "GetCompatibleConfigurations")
    protected Boolean getCompatibleConfigurations;
    @XmlAttribute(name = "MoveStatus")
    protected Boolean moveStatus;
    @XmlAttribute(name = "StatusPosition")
    protected Boolean statusPosition;
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
     * 获取eFlip属性的值。
     * This getter has been renamed from isEFlip() to getEFlip() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEFlip() {
        return eFlip;
    }

    /**
     * 设置eFlip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEFlip(Boolean value) {
        this.eFlip = value;
    }

    /**
     * 获取reverse属性的值。
     * This getter has been renamed from isReverse() to getReverse() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReverse() {
        return reverse;
    }

    /**
     * 设置reverse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

    /**
     * 获取getCompatibleConfigurations属性的值。
     * This getter has been renamed from isGetCompatibleConfigurations() to getGetCompatibleConfigurations() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGetCompatibleConfigurations() {
        return getCompatibleConfigurations;
    }

    /**
     * 设置getCompatibleConfigurations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetCompatibleConfigurations(Boolean value) {
        this.getCompatibleConfigurations = value;
    }

    /**
     * 获取moveStatus属性的值。
     * This getter has been renamed from isMoveStatus() to getMoveStatus() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMoveStatus() {
        return moveStatus;
    }

    /**
     * 设置moveStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoveStatus(Boolean value) {
        this.moveStatus = value;
    }

    /**
     * 获取statusPosition属性的值。
     * This getter has been renamed from isStatusPosition() to getStatusPosition() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStatusPosition() {
        return statusPosition;
    }

    /**
     * 设置statusPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPosition(Boolean value) {
        this.statusPosition = value;
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
