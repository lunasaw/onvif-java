
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;ClassDescriptor complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ClassDescriptor"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ClassCandidate" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/&amp;gt;
 *                   &amp;lt;element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ClassDescriptorExtension" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptor", propOrder = {
    "classCandidate",
    "extension"
})
public class ClassDescriptor {

    @XmlElement(name = "ClassCandidate")
    protected List<ClassDescriptor.ClassCandidate> classCandidate;
    @XmlElement(name = "Extension")
    protected ClassDescriptorExtension extension;

    /**
     * Gets the value of the classCandidate property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the classCandidate property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClassCandidate().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDescriptor.ClassCandidate }
     * 
     * 
     */
    public List<ClassDescriptor.ClassCandidate> getClassCandidate() {
        if (classCandidate == null) {
            classCandidate = new ArrayList<ClassDescriptor.ClassCandidate>();
        }
        return this.classCandidate;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassDescriptorExtension }
     *     
     */
    public ClassDescriptorExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescriptorExtension }
     *     
     */
    public void setExtension(ClassDescriptorExtension value) {
        this.extension = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }


    /**
     * &lt;p&gt;anonymous complex type的 Java 类。
     * 
     * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/&amp;gt;
     *         &amp;lt;element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "likelihood"
    })
    public static class ClassCandidate {

        @XmlElement(name = "Type", required = true)
        @XmlSchemaType(name = "string")
        protected ClassType type;
        @XmlElement(name = "Likelihood")
        protected float likelihood;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ClassType }
         *     
         */
        public ClassType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ClassType }
         *     
         */
        public void setType(ClassType value) {
            this.type = value;
        }

        /**
         * 获取likelihood属性的值。
         * 
         */
        public float getLikelihood() {
            return likelihood;
        }

        /**
         * 设置likelihood属性的值。
         * 
         */
        public void setLikelihood(float value) {
            this.likelihood = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }

}
