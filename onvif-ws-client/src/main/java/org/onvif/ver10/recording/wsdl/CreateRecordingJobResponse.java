
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.RecordingJobConfiguration;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobToken" type="{http://www.onvif.org/ver10/schema}RecordingJobReference"/&gt;
 *         &lt;element name="JobConfiguration" type="{http://www.onvif.org/ver10/schema}RecordingJobConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobToken",
    "jobConfiguration"
})
@XmlRootElement(name = "CreateRecordingJobResponse")
public class CreateRecordingJobResponse {

    @XmlElement(name = "JobToken", required = true)
    protected String jobToken;
    @XmlElement(name = "JobConfiguration", required = true)
    protected RecordingJobConfiguration jobConfiguration;

    /**
     * 获取jobToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobToken() {
        return jobToken;
    }

    /**
     * 设置jobToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobToken(String value) {
        this.jobToken = value;
    }

    /**
     * 获取jobConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobConfiguration }
     *     
     */
    public RecordingJobConfiguration getJobConfiguration() {
        return jobConfiguration;
    }

    /**
     * 设置jobConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobConfiguration }
     *     
     */
    public void setJobConfiguration(RecordingJobConfiguration value) {
        this.jobConfiguration = value;
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
