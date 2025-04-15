
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.PaneConfiguration;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;anonymous complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="VideoOutput" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&amp;gt;
 *         &amp;lt;element name="PaneConfiguration" type="{http://www.onvif.org/ver10/schema}PaneConfiguration"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "videoOutput",
    "paneConfiguration",
    "any"
})
@XmlRootElement(name = "SetPaneConfiguration")
public class SetPaneConfiguration {

    @XmlElement(name = "VideoOutput", required = true)
    protected String videoOutput;
    @XmlElement(name = "PaneConfiguration", required = true)
    protected PaneConfiguration paneConfiguration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 获取videoOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutput() {
        return videoOutput;
    }

    /**
     * 设置videoOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutput(String value) {
        this.videoOutput = value;
    }

    /**
     * 获取paneConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaneConfiguration }
     *     
     */
    public PaneConfiguration getPaneConfiguration() {
        return paneConfiguration;
    }

    /**
     * 设置paneConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaneConfiguration }
     *     
     */
    public void setPaneConfiguration(PaneConfiguration value) {
        this.paneConfiguration = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
