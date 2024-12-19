
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * An identifier of an algorithm.
 * 
 * <p>Java class for AlgorithmIdentifier complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlgorithmIdentifier">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="algorithm" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DotDecimalOID"/>
 *         <element name="parameters" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value" minOccurs="0"/>
 *         <element name="anyParameters" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "AlgorithmIdentifier", propOrder = {
    "algorithm",
    "parameters",
    "anyParameters"
})
public class AlgorithmIdentifier {

    /**
     * The OID of the algorithm in dot-decimal form.
     * 
     */
    @XmlElement(required = true)
    protected String algorithm;
    /**
     * Optional parameters of the algorithm (depending on the algorithm).
     * 
     */
    protected byte[] parameters;
    protected AlgorithmIdentifier.AnyParameters anyParameters;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The OID of the algorithm in dot-decimal form.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlgorithm()
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Optional parameters of the algorithm (depending on the algorithm).
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getParameters()
     */
    public void setParameters(byte[] value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the anyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier.AnyParameters }
     *     
     */
    public AlgorithmIdentifier.AnyParameters getAnyParameters() {
        return anyParameters;
    }

    /**
     * Sets the value of the anyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier.AnyParameters }
     *     
     */
    public void setAnyParameters(AlgorithmIdentifier.AnyParameters value) {
        this.anyParameters = value;
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
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class AnyParameters {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }

}
