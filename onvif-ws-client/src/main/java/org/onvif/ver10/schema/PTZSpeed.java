
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;PTZSpeed complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PTZSpeed"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = {
    "panTilt",
    "zoom"
})
public class PTZSpeed {

    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;
    @XmlElement(name = "Zoom")
    protected Vector1D zoom;

    /**
     * 获取panTilt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vector2D }
     *     
     */
    public Vector2D getPanTilt() {
        return panTilt;
    }

    /**
     * 设置panTilt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vector2D }
     *     
     */
    public void setPanTilt(Vector2D value) {
        this.panTilt = value;
    }

    /**
     * 获取zoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vector1D }
     *     
     */
    public Vector1D getZoom() {
        return zoom;
    }

    /**
     * 设置zoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vector1D }
     *     
     */
    public void setZoom(Vector1D value) {
        this.zoom = value;
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
