
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JobOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Spare" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="CompatibleSources" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobOptions")
public class JobOptions {

    /**
     * Number of spare jobs that can be created for the recording.
     * 
     */
    @XmlAttribute(name = "Spare")
    protected Integer spare;
    /**
     * A device that supports recording of a restricted set of Media Service
     *               Profiles returns the list of profiles that can be recorded on the given Recording.
     * 
     */
    @XmlAttribute(name = "CompatibleSources")
    protected List<String> compatibleSources;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Number of spare jobs that can be created for the recording.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpare() {
        return spare;
    }

    /**
     * Sets the value of the spare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSpare()
     */
    public void setSpare(Integer value) {
        this.spare = value;
    }

    /**
     * A device that supports recording of a restricted set of Media Service
     *               Profiles returns the list of profiles that can be recorded on the given Recording.
     * 
     * Gets the value of the compatibleSources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleSources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCompatibleSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the compatibleSources property.
     */
    public List<String> getCompatibleSources() {
        if (compatibleSources == null) {
            compatibleSources = new ArrayList<>();
        }
        return this.compatibleSources;
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
