
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SearchScope;
import org.onvif.ver10.schema.StorageReferencePath;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchScope" type="{http://www.onvif.org/ver10/schema}SearchScope"/>
 *         <element name="FileFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StorageDestination" type="{http://www.onvif.org/ver10/schema}StorageReferencePath"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

    /**
     * Indicates the selection criterion on the existing recordings. .
     * 
     */
    @XmlElement(name = "SearchScope", required = true)
    protected SearchScope searchScope;
    /**
     * Indicates which export file format to be used.
     * 
     */
    @XmlElement(name = "FileFormat", required = true)
    protected String fileFormat;
    /**
     * Indicates the target storage and relative directory path.
     * 
     */
    @XmlElement(name = "StorageDestination", required = true)
    protected StorageReferencePath storageDestination;

    /**
     * Indicates the selection criterion on the existing recordings. .
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
     * Sets the value of the searchScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     * @see #getSearchScope()
     */
    public void setSearchScope(SearchScope value) {
        this.searchScope = value;
    }

    /**
     * Indicates which export file format to be used.
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
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileFormat()
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * Indicates the target storage and relative directory path.
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
     * Sets the value of the storageDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageReferencePath }
     *     
     * @see #getStorageDestination()
     */
    public void setStorageDestination(StorageReferencePath value) {
        this.storageDestination = value;
    }

}
