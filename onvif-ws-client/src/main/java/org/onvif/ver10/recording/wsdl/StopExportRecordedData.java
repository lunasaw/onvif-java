
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
    "operationToken"
})
@XmlRootElement(name = "StopExportRecordedData")
public class StopExportRecordedData {

    /**
     * Unique ExportRecordedData operation token
     * 
     */
    @XmlElement(name = "OperationToken", required = true)
    protected String operationToken;

    /**
     * Unique ExportRecordedData operation token
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

}
