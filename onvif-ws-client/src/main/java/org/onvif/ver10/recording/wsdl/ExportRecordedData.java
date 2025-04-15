
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.SearchScope;
import org.onvif.ver10.schema.StorageReferencePath;


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
 *         &amp;lt;element name="SearchScope" type="{http://www.onvif.org/ver10/schema}SearchScope"/&amp;gt;
 *         &amp;lt;element name="FileFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="StorageDestination" type="{http://www.onvif.org/ver10/schema}StorageReferencePath"/&amp;gt;
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
    "searchScope",
    "fileFormat",
    "storageDestination"
})
@XmlRootElement(name = "ExportRecordedData")
public class ExportRecordedData {

    @XmlElement(name = "SearchScope", required = true)
    protected SearchScope searchScope;
    @XmlElement(name = "FileFormat", required = true)
    protected String fileFormat;
    @XmlElement(name = "StorageDestination", required = true)
    protected StorageReferencePath storageDestination;

    /**
     * 获取searchScope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getSearchScope() {
        return searchScope;
    }

    /**
     * 设置searchScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     */
    public void setSearchScope(SearchScope value) {
        this.searchScope = value;
    }

    /**
     * 获取fileFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * 设置fileFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * 获取storageDestination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StorageReferencePath }
     *     
     */
    public StorageReferencePath getStorageDestination() {
        return storageDestination;
    }

    /**
     * 设置storageDestination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StorageReferencePath }
     *     
     */
    public void setStorageDestination(StorageReferencePath value) {
        this.storageDestination = value;
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
