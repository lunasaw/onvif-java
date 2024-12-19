
package org.onvif.ver10.pacs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.accesscontrol.wsdl.AccessPointInfoBase;
import org.onvif.ver10.accesscontrol.wsdl.AreaInfoBase;


/**
 * General datastructure referenced by a token.
 *         Should be used as extension base.
 * 
 * <p>Java class for DataEntity complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataEntity")
@XmlSeeAlso({
    AccessPointInfoBase.class,
    AreaInfoBase.class
})
public class DataEntity {

    /**
     * A service-unique identifier of the item.
     * 
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;

    /**
     * A service-unique identifier of the item.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

}
