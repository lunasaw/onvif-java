
package org.onvif.ver10.deviceio.wsdl;

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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayMode;


/**
 * <p>Java class for RelayOutputOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RelayOutputOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RelayMode" maxOccurs="unbounded"/>
 *         <element name="DelayTimes" type="{http://www.onvif.org/ver10/deviceIO/wsdl}DelayTimes" minOccurs="0"/>
 *         <element name="Discrete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/deviceIO/wsdl}RelayOutputOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayOutputOptions", propOrder = {
    "mode",
    "delayTimes",
    "discrete",
    "extension"
})
public class RelayOutputOptions {

    /**
     * Supported Modes.
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<RelayMode> mode;
    /**
     * Supported delay time range or discrete values in seconds. This
     *                 element must be present if MonoStable mode is supported.
     * 
     */
    @XmlList
    @XmlElement(name = "DelayTimes", type = Float.class)
    protected List<Float> delayTimes;
    /**
     * True if the relay only supports the exact values for the DelayTimes
     *                 listed. Default is false.
     * 
     */
    @XmlElement(name = "Discrete")
    protected Boolean discrete;
    @XmlElement(name = "Extension")
    protected RelayOutputOptionsExtension extension;
    /**
     * Token of the relay output.
     * 
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported Modes.
     * 
     * Gets the value of the mode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the mode property.
     */
    public List<RelayMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<>();
        }
        return this.mode;
    }

    /**
     * Supported delay time range or discrete values in seconds. This
     *                 element must be present if MonoStable mode is supported.
     * 
     * Gets the value of the delayTimes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delayTimes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDelayTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * </p>
     * 
     * 
     * @return
     *     The value of the delayTimes property.
     */
    public List<Float> getDelayTimes() {
        if (delayTimes == null) {
            delayTimes = new ArrayList<>();
        }
        return this.delayTimes;
    }

    /**
     * True if the relay only supports the exact values for the DelayTimes
     *                 listed. Default is false.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscrete() {
        return discrete;
    }

    /**
     * Sets the value of the discrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDiscrete()
     */
    public void setDiscrete(Boolean value) {
        this.discrete = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutputOptionsExtension }
     *     
     */
    public RelayOutputOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutputOptionsExtension }
     *     
     */
    public void setExtension(RelayOutputOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Token of the relay output.
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
