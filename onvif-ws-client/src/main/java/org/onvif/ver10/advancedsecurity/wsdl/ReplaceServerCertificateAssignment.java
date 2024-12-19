
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element name="OldCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/>
 *         <element name="NewCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/>
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
     * Gets the value of the oldCertificationPathID property.
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
     * Sets the value of the oldCertificationPathID property.
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
     * Gets the value of the newCertificationPathID property.
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
     * Sets the value of the newCertificationPathID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCertificationPathID(String value) {
        this.newCertificationPathID = value;
    }

}
