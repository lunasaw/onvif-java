
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FactoryDefaultType;


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
 *         <element name="FactoryDefault" type="{http://www.onvif.org/ver10/schema}FactoryDefaultType"/>
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
    "factoryDefault"
})
@XmlRootElement(name = "SetSystemFactoryDefault")
public class SetSystemFactoryDefault {

    /**
     * Specifies the factory default action type.
     * 
     */
    @XmlElement(name = "FactoryDefault", required = true)
    @XmlSchemaType(name = "string")
    protected FactoryDefaultType factoryDefault;

    /**
     * Specifies the factory default action type.
     * 
     * @return
     *     possible object is
     *     {@link FactoryDefaultType }
     *     
     */
    public FactoryDefaultType getFactoryDefault() {
        return factoryDefault;
    }

    /**
     * Sets the value of the factoryDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactoryDefaultType }
     *     
     * @see #getFactoryDefault()
     */
    public void setFactoryDefault(FactoryDefaultType value) {
        this.factoryDefault = value;
    }

}
