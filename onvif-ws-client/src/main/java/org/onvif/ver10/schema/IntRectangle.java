
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Rectangle defined by lower left corner position and size. Units are pixel.
 *       
 * 
 * &lt;p&gt;IntRectangle complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IntRectangle"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangle")
public class IntRectangle {

    @XmlAttribute(name = "x", required = true)
    protected int x;
    @XmlAttribute(name = "y", required = true)
    protected int y;
    @XmlAttribute(name = "width", required = true)
    protected int width;
    @XmlAttribute(name = "height", required = true)
    protected int height;

    /**
     * 获取x属性的值。
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * 设置x属性的值。
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * 获取y属性的值。
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * 设置y属性的值。
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * 获取width属性的值。
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     */
    public void setHeight(int value) {
        this.height = value;
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
