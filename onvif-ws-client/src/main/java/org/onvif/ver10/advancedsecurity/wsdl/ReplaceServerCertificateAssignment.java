
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element name="OldCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/&gt;
 *         &lt;element name="NewCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/&gt;
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
    "oldCertificationPathID",
    "newCertificationPathID"
})
@XmlRootElement(name = "ReplaceServerCertificateAssignment")
public class ReplaceServerCertificateAssignment {

    @XmlElement(name = "OldCertificationPathID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String oldCertificationPathID;
    @XmlElement(name = "NewCertificationPathID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String newCertificationPathID;

    /**
     * 获取oldCertificationPathID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCertificationPathID() {
        return oldCertificationPathID;
    }

    /**
     * 设置oldCertificationPathID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCertificationPathID(String value) {
        this.oldCertificationPathID = value;
    }

    /**
     * 获取newCertificationPathID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCertificationPathID() {
        return newCertificationPathID;
    }

    /**
     * 设置newCertificationPathID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCertificationPathID(String value) {
        this.newCertificationPathID = value;
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
