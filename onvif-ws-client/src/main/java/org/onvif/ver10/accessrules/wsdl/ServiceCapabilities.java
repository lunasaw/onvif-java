
package org.onvif.ver10.accessrules.wsdl;

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
 * The service capabilities reflect optional functionality of a service. The information is
 *             static
 *             and does not change during device operation. The following capabilities are available:
 * 
 * <p>Java class for ServiceCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MaxLimit" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             <minInclusive value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MaxAccessProfiles" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             <minInclusive value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MaxAccessPoliciesPerAccessProfile" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             <minInclusive value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MultipleSchedulesPerAccessPointSupported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCapabilities", propOrder = {
    "any"
})
public class ServiceCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * The maximum number of entries returned by a single Get<Entity>List or Get<Entity>
     *               request. The device shall never return more than this number of entities in a single
     *               response.
     * 
     */
    @XmlAttribute(name = "MaxLimit", required = true)
    protected long maxLimit;
    /**
     * Indicates the maximum number of access profiles supported by the device.
     * 
     */
    @XmlAttribute(name = "MaxAccessProfiles", required = true)
    protected long maxAccessProfiles;
    /**
     * Indicates the maximum number of access policies per access profile supported by the
     *               device.
     * 
     */
    @XmlAttribute(name = "MaxAccessPoliciesPerAccessProfile", required = true)
    protected long maxAccessPoliciesPerAccessProfile;
    /**
     * Indicates whether or not several access policies can refer to the same access point in
     *               an
     *               access profile.
     * 
     */
    @XmlAttribute(name = "MultipleSchedulesPerAccessPointSupported", required = true)
    protected boolean multipleSchedulesPerAccessPointSupported;
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
     * The maximum number of entries returned by a single Get<Entity>List or Get<Entity>
     *               request. The device shall never return more than this number of entities in a single
     *               response.
     * 
     */
    public long getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     */
    public void setMaxLimit(long value) {
        this.maxLimit = value;
    }

    /**
     * Indicates the maximum number of access profiles supported by the device.
     * 
     */
    public long getMaxAccessProfiles() {
        return maxAccessProfiles;
    }

    /**
     * Sets the value of the maxAccessProfiles property.
     * 
     */
    public void setMaxAccessProfiles(long value) {
        this.maxAccessProfiles = value;
    }

    /**
     * Indicates the maximum number of access policies per access profile supported by the
     *               device.
     * 
     */
    public long getMaxAccessPoliciesPerAccessProfile() {
        return maxAccessPoliciesPerAccessProfile;
    }

    /**
     * Sets the value of the maxAccessPoliciesPerAccessProfile property.
     * 
     */
    public void setMaxAccessPoliciesPerAccessProfile(long value) {
        this.maxAccessPoliciesPerAccessProfile = value;
    }

    /**
     * Indicates whether or not several access policies can refer to the same access point in
     *               an
     *               access profile.
     * 
     */
    public boolean isMultipleSchedulesPerAccessPointSupported() {
        return multipleSchedulesPerAccessPointSupported;
    }

    /**
     * Sets the value of the multipleSchedulesPerAccessPointSupported property.
     * 
     */
    public void setMultipleSchedulesPerAccessPointSupported(boolean value) {
        this.multipleSchedulesPerAccessPointSupported = value;
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
