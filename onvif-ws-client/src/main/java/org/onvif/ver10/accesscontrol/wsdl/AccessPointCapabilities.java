
package org.onvif.ver10.accesscontrol.wsdl;

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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The AccessPoint capabilities reflect optional functionality of a particular physical
 *             entity.
 *             Different AccessPoint instances may have different set of capabilities. This information
 *             may
 *             change during device operation, e.g. if hardware settings are changed.
 *             The following capabilities are available:
 * 
 * <p>Java class for AccessPointCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessPointCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="DisableAccessPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Duress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AccessTaken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ExternalAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointCapabilities", propOrder = {
    "any"
})
public class AccessPointCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates whether or not this AccessPoint instance supports
     *               EnableAccessPoint and DisableAccessPoint commands.
     * 
     */
    @XmlAttribute(name = "DisableAccessPoint", required = true)
    protected boolean disableAccessPoint;
    /**
     * Indicates whether or not this AccessPoint instance supports generation
     *               of duress events.
     * 
     */
    @XmlAttribute(name = "Duress")
    protected Boolean duress;
    /**
     * Indicates whether or not this AccessPoint has a REX switch or other
     *               input that allows anonymous access.
     * 
     */
    @XmlAttribute(name = "AnonymousAccess")
    protected Boolean anonymousAccess;
    /**
     * Indicates whether or not this AccessPoint instance supports generation
     *               of AccessTaken and AccessNotTaken events. If AnonymousAccess and AccessTaken are both
     *               true, it indicates that the Anonymous versions of AccessTaken and AccessNotTaken are
     *               supported.
     * 
     */
    @XmlAttribute(name = "AccessTaken")
    protected Boolean accessTaken;
    /**
     * Indicates whether or not this AccessPoint instance supports the
     *               ExternalAuthorization operation and the generation of Request events. If
     *               AnonymousAccess and ExternalAuthorization are both true, it indicates that the
     *               Anonymous version is supported as well.
     * 
     */
    @XmlAttribute(name = "ExternalAuthorization")
    protected Boolean externalAuthorization;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Indicates whether or not this AccessPoint instance supports
     *               EnableAccessPoint and DisableAccessPoint commands.
     * 
     */
    public boolean isDisableAccessPoint() {
        return disableAccessPoint;
    }

    /**
     * Sets the value of the disableAccessPoint property.
     * 
     */
    public void setDisableAccessPoint(boolean value) {
        this.disableAccessPoint = value;
    }

    /**
     * Indicates whether or not this AccessPoint instance supports generation
     *               of duress events.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuress() {
        return duress;
    }

    /**
     * Sets the value of the duress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDuress()
     */
    public void setDuress(Boolean value) {
        this.duress = value;
    }

    /**
     * Indicates whether or not this AccessPoint has a REX switch or other
     *               input that allows anonymous access.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymousAccess() {
        return anonymousAccess;
    }

    /**
     * Sets the value of the anonymousAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnonymousAccess()
     */
    public void setAnonymousAccess(Boolean value) {
        this.anonymousAccess = value;
    }

    /**
     * Indicates whether or not this AccessPoint instance supports generation
     *               of AccessTaken and AccessNotTaken events. If AnonymousAccess and AccessTaken are both
     *               true, it indicates that the Anonymous versions of AccessTaken and AccessNotTaken are
     *               supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessTaken() {
        return accessTaken;
    }

    /**
     * Sets the value of the accessTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccessTaken()
     */
    public void setAccessTaken(Boolean value) {
        this.accessTaken = value;
    }

    /**
     * Indicates whether or not this AccessPoint instance supports the
     *               ExternalAuthorization operation and the generation of Request events. If
     *               AnonymousAccess and ExternalAuthorization are both true, it indicates that the
     *               Anonymous version is supported as well.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalAuthorization() {
        return externalAuthorization;
    }

    /**
     * Sets the value of the externalAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExternalAuthorization()
     */
    public void setExternalAuthorization(Boolean value) {
        this.externalAuthorization = value;
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
