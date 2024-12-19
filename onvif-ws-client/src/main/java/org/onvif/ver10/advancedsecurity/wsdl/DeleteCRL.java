
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="CrlID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CRLID"/>
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
    "crlID"
})
@XmlRootElement(name = "DeleteCRL")
public class DeleteCRL {

    /**
     * The ID of the CRL to be deleted.
     * 
     */
    @XmlElement(name = "CrlID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String crlID;

    /**
     * The ID of the CRL to be deleted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrlID() {
        return crlID;
    }

    /**
     * Sets the value of the crlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCrlID()
     */
    public void setCrlID(String value) {
        this.crlID = value;
    }

}
