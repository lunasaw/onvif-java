
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         <element name="OperationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="FileNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax'/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "operationToken",
    "fileNames",
    "extension"
})
@XmlRootElement(name = "ExportRecordedDataResponse")
public class ExportRecordedDataResponse {

    /**
     * Unique operation token for tests to associate the relevant
     *                   events.
     * 
     */
    @XmlElement(name = "OperationToken", required = true)
    protected String operationToken;
    /**
     * List of exported file names. The device can also use
     *                   AsyncronousOperationStatus event to publish this list.
     * 
     */
    @XmlElement(name = "FileNames")
    protected List<String> fileNames;
    @XmlElement(name = "Extension")
    protected ExportRecordedDataResponse.Extension extension;

    /**
     * Unique operation token for tests to associate the relevant
     *                   events.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationToken() {
        return operationToken;
    }

    /**
     * Sets the value of the operationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperationToken()
     */
    public void setOperationToken(String value) {
        this.operationToken = value;
    }

    /**
     * List of exported file names. The device can also use
     *                   AsyncronousOperationStatus event to publish this list.
     * 
     * Gets the value of the fileNames property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileNames property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the fileNames property.
     */
    public List<String> getFileNames() {
        if (fileNames == null) {
            fileNames = new ArrayList<>();
        }
        return this.fileNames;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExportRecordedDataResponse.Extension }
     *     
     */
    public ExportRecordedDataResponse.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportRecordedDataResponse.Extension }
     *     
     */
    public void setExtension(ExportRecordedDataResponse.Extension value) {
        this.extension = value;
    }


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
     *         <any processContents='lax'/>
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
        "any"
    })
    public static class Extension {

        /**
         * Extensibility point.
         * 
         */
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Extensibility point.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         * @see #getAny()
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
