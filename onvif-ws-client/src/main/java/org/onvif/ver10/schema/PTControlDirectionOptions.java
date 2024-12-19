
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTControlDirectionOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTControlDirectionOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EFlip" type="{http://www.onvif.org/ver10/schema}EFlipOptions" minOccurs="0"/>
 *         <element name="Reverse" type="{http://www.onvif.org/ver10/schema}ReverseOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTControlDirectionOptions", propOrder = {
    "eFlip",
    "reverse",
    "extension"
})
public class PTControlDirectionOptions {

    /**
     * Supported options for EFlip feature.
     * 
     */
    @XmlElement(name = "EFlip")
    protected EFlipOptions eFlip;
    /**
     * Supported options for Reverse feature.
     * 
     */
    @XmlElement(name = "Reverse")
    protected ReverseOptions reverse;
    @XmlElement(name = "Extension")
    protected PTControlDirectionOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported options for EFlip feature.
     * 
     * @return
     *     possible object is
     *     {@link EFlipOptions }
     *     
     */
    public EFlipOptions getEFlip() {
        return eFlip;
    }

    /**
     * Sets the value of the eFlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFlipOptions }
     *     
     * @see #getEFlip()
     */
    public void setEFlip(EFlipOptions value) {
        this.eFlip = value;
    }

    /**
     * Supported options for Reverse feature.
     * 
     * @return
     *     possible object is
     *     {@link ReverseOptions }
     *     
     */
    public ReverseOptions getReverse() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseOptions }
     *     
     * @see #getReverse()
     */
    public void setReverse(ReverseOptions value) {
        this.reverse = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionOptionsExtension }
     *     
     */
    public PTControlDirectionOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionOptionsExtension }
     *     
     */
    public void setExtension(PTControlDirectionOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
