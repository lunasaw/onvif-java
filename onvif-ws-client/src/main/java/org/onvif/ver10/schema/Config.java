
package org.onvif.ver10.schema;

import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Config complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Config">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemList"/>
 *       </sequence>
 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Config", propOrder = {
    "parameters"
})
public class Config {

    /**
     * List of configuration parameters as defined in the correspding
     *             description.
     * 
     */
    @XmlElement(name = "Parameters", required = true)
    protected ItemList parameters;
    /**
     * Name of the configuration.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * Type of the configuration represented by a unique QName. The Type
     *           characterizes a ConfigDescription defining the Parameters.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected QName type;

    /**
     * List of configuration parameters as defined in the correspding
     *             description.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     * @see #getParameters()
     */
    public void setParameters(ItemList value) {
        this.parameters = value;
    }

    /**
     * Name of the configuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Type of the configuration represented by a unique QName. The Type
     *           characterizes a ConfigDescription defining the Parameters.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     * @see #getType()
     */
    public void setType(QName value) {
        this.type = value;
    }

}
