
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes a list of items. Each item in the list shall have a unique name.
 *         The list is designed as linear structure without optional or unbounded elements.
 *         Use ElementItems only when complex structures are inevitable.
 * 
 * <p>Java class for ItemListDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ItemListDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SimpleItemDescription" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ElementItemDescription" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ItemListDescriptionExtension" minOccurs="0"/>
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
@XmlType(name = "ItemListDescription", propOrder = {
    "simpleItemDescription",
    "elementItemDescription",
    "extension"
})
public class ItemListDescription {

    /**
     * Description of a simple item. The type must be of cathegory simpleType
     *             (xs:string, xs:integer, xs:float, ...).
     * 
     */
    @XmlElement(name = "SimpleItemDescription")
    protected List<ItemListDescription.SimpleItemDescription> simpleItemDescription;
    /**
     * Description of a complex type. The Type must reference a defined type.
     * 
     */
    @XmlElement(name = "ElementItemDescription")
    protected List<ItemListDescription.ElementItemDescription> elementItemDescription;
    @XmlElement(name = "Extension")
    protected ItemListDescriptionExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Description of a simple item. The type must be of cathegory simpleType
     *             (xs:string, xs:integer, xs:float, ...).
     * 
     * Gets the value of the simpleItemDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleItemDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSimpleItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemListDescription.SimpleItemDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the simpleItemDescription property.
     */
    public List<ItemListDescription.SimpleItemDescription> getSimpleItemDescription() {
        if (simpleItemDescription == null) {
            simpleItemDescription = new ArrayList<>();
        }
        return this.simpleItemDescription;
    }

    /**
     * Description of a complex type. The Type must reference a defined type.
     * 
     * Gets the value of the elementItemDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementItemDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElementItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemListDescription.ElementItemDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the elementItemDescription property.
     */
    public List<ItemListDescription.ElementItemDescription> getElementItemDescription() {
        if (elementItemDescription == null) {
            elementItemDescription = new ArrayList<>();
        }
        return this.elementItemDescription;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescriptionExtension }
     *     
     */
    public ItemListDescriptionExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescriptionExtension }
     *     
     */
    public void setExtension(ItemListDescriptionExtension value) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
    @XmlType(name = "")
    public static class ElementItemDescription {

        /**
         * Item name. Must be unique within a list.
         * 
         */
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        /**
         * The type of the item. The Type must reference a defined type.
         * 
         */
        @XmlAttribute(name = "Type", required = true)
        protected QName type;

        /**
         * Item name. Must be unique within a list.
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
         * The type of the item. The Type must reference a defined type.
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
    @XmlType(name = "")
    public static class SimpleItemDescription {

        /**
         * Item name. Must be unique within a list.
         * 
         */
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Type", required = true)
        protected QName type;

        /**
         * Item name. Must be unique within a list.
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
         * Gets the value of the type property.
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
         */
        public void setType(QName value) {
            this.type = value;
        }

    }

}
