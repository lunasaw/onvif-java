
package org.onvif.ver20.ptz.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZPreset;


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
 *         <element name="Preset" type="{http://www.onvif.org/ver10/schema}PTZPreset" maxOccurs="unbounded" minOccurs="0"/>
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
    "preset"
})
@XmlRootElement(name = "GetPresetsResponse")
public class GetPresetsResponse {

    /**
     * A list of presets which are available for the requested
     *                   MediaProfile.
     * 
     */
    @XmlElement(name = "Preset")
    protected List<PTZPreset> preset;

    /**
     * A list of presets which are available for the requested
     *                   MediaProfile.
     * 
     * Gets the value of the preset property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preset property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPreset }
     * </p>
     * 
     * 
     * @return
     *     The value of the preset property.
     */
    public List<PTZPreset> getPreset() {
        if (preset == null) {
            preset = new ArrayList<>();
        }
        return this.preset;
    }

}
