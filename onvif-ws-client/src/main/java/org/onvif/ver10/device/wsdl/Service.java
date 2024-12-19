
package org.onvif.ver10.device.wsdl;

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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OnvifVersion;
import org.w3c.dom.Element;


/**
 * <p>Java class for Service complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Service">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="Capabilities" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax'/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Version" type="{http://www.onvif.org/ver10/schema}OnvifVersion"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Service", propOrder = {
    "namespace",
    "xAddr",
    "capabilities",
    "version",
    "any"
})
public class Service {

    /**
     * Namespace of the service being described. This parameter allows to
     *                 match the service capabilities to the service. Note that only one set of
     *                 capabilities is supported per namespace.
     * 
     */
    @XmlElement(name = "Namespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String namespace;
    /**
     * The transport addresses where the service can be reached. The scheme
     *                 and IP part shall match the one used in the request (i.e. the GetServices request).
     * 
     */
    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "Capabilities")
    protected Service.Capabilities capabilities;
    /**
     * The version of the service (not the ONVIF core spec version).
     * 
     */
    @XmlElement(name = "Version", required = true)
    protected OnvifVersion version;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Namespace of the service being described. This parameter allows to
     *                 match the service capabilities to the service. Note that only one set of
     *                 capabilities is supported per namespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNamespace()
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * The transport addresses where the service can be reached. The scheme
     *                 and IP part shall match the one used in the request (i.e. the GetServices request).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * Sets the value of the xAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getXAddr()
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Service.Capabilities }
     *     
     */
    public Service.Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.Capabilities }
     *     
     */
    public void setCapabilities(Service.Capabilities value) {
        this.capabilities = value;
    }

    /**
     * The version of the service (not the ONVIF core spec version).
     * 
     * @return
     *     possible object is
     *     {@link OnvifVersion }
     *     
     */
    public OnvifVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnvifVersion }
     *     
     * @see #getVersion()
     */
    public void setVersion(OnvifVersion value) {
        this.version = value;
    }

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
     *         <any processContents='lax'/>
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
    public static class Capabilities {

        /**
         * The placeholder for the service capabilities. The service
         *                       capability element shall be returned here. For example for the device service
         *                       that would be the tds:DeviceServiceCapabilities element (not complextype).
         * 
         */
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * The placeholder for the service capabilities. The service
         *                       capability element shall be returned here. For example for the device service
         *                       that would be the tds:DeviceServiceCapabilities element (not complextype).
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         * @see #getAny()
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
