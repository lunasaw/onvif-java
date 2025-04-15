
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.ArrayOfFileProgress;
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
 *         &amp;lt;element name="Progress" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
 *         &amp;lt;element name="FileProgressStatus" type="{http://www.onvif.org/ver10/schema}ArrayOfFileProgress"/&amp;gt;
 *         &amp;lt;any processContents='lax'/&amp;gt;
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
    "progress",
    "fileProgressStatus",
    "any"
})
@XmlRootElement(name = "StopExportRecordedDataResponse")
public class StopExportRecordedDataResponse {

    @XmlElement(name = "Progress")
    protected float progress;
    @XmlElement(name = "FileProgressStatus", required = true)
    protected ArrayOfFileProgress fileProgressStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * 获取progress属性的值。
     * 
     */
    public float getProgress() {
        return progress;
    }

    /**
     * 设置progress属性的值。
     * 
     */
    public void setProgress(float value) {
        this.progress = value;
    }

    /**
     * 获取fileProgressStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public ArrayOfFileProgress getFileProgressStatus() {
        return fileProgressStatus;
    }

    /**
     * 设置fileProgressStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public void setFileProgressStatus(ArrayOfFileProgress value) {
        this.fileProgressStatus = value;
    }

    /**
     * 获取any属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * 设置any属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
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
