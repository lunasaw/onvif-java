
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of parameters according to the corresponding ItemListDescription.
 *         Each item in the list shall have a unique name.
 * 
 * <p>Java class for ItemList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ItemList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SimpleItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ElementItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any/>
 *                 </sequence>
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ItemListExtension" minOccurs="0"/>
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
@XmlType(name = "ItemList", propOrder = {
    "simpleItem",
    "elementItem",
    "extension"
})
public class ItemList {

    /**
     * Value name pair as defined by the corresponding description.
     * 
     */
    @XmlElement(name = "SimpleItem")
    protected List<ItemList.SimpleItem> simpleItem;
    /**
     * Complex value structure.
     * 
     */
    @XmlElement(name = "ElementItem")
    protected List<ItemList.ElementItem> elementItem;
    @XmlElement(name = "Extension")
    protected ItemListExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Value name pair as defined by the corresponding description.
     * 
     * Gets the value of the simpleItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSimpleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemList.SimpleItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the simpleItem property.
     */
    public List<ItemList.SimpleItem> getSimpleItem() {
        if (simpleItem == null) {
            simpleItem = new ArrayList<>();
        }
        return this.simpleItem;
    }

    /**
     * Complex value structure.
     * 
     * Gets the value of the elementItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemList.ElementItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the elementItem property.
     */
    public List<ItemList.ElementItem> getElementItem() {
        if (elementItem == null) {
            elementItem = new ArrayList<>();
        }
        return this.elementItem;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListExtension }
     *     
     */
    public ItemListExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListExtension }
     *     
     */
    public void setExtension(ItemListExtension value) {
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
     *       <sequence>
     *         <any/>
     *       </sequence>
     *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ElementItem {

        /**
         * XML tree contiaing the element value as defined in the
         *                   corresponding description.
         * 
         */
        @XmlAnyElement(lax = true)
        protected java.lang.Object any;
        /**
         * Item name.
         * 
         */
        @XmlAttribute(name = "Name", required = true)
        protected String name;

        /**
         * XML tree contiaing the element value as defined in the
         *                   corresponding description.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.Object }
         *     
         */
        public java.lang.Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.Object }
         *     
         * @see #getAny()
         */
        public void setAny(java.lang.Object value) {
            this.any = value;
        }

        /**
         * Item name.
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
     *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleItem {

        /**
         * Item name.
         * 
         */
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        /**
         * Item value. The type is defined in the corresponding description.
         * 
         */
        @XmlAttribute(name = "Value", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;

        /**
         * Item name.
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
         * Item value. The type is defined in the corresponding description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
