
package org.onvif.ver10.deviceio.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoOutput;


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
 *         <element name="VideoOutputs" type="{http://www.onvif.org/ver10/schema}VideoOutput" maxOccurs="unbounded" minOccurs="0"/>
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
    "videoOutputs"
})
@XmlRootElement(name = "GetVideoOutputsResponse")
public class GetVideoOutputsResponse {

    /**
     * List containing all physical Video output connections of a
     *                   device.
     * 
     */
    @XmlElement(name = "VideoOutputs")
    protected List<VideoOutput> videoOutputs;

    /**
     * List containing all physical Video output connections of a
     *                   device.
     * 
     * Gets the value of the videoOutputs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoOutputs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVideoOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoOutput }
     * </p>
     * 
     * 
     * @return
     *     The value of the videoOutputs property.
     */
    public List<VideoOutput> getVideoOutputs() {
        if (videoOutputs == null) {
            videoOutputs = new ArrayList<>();
        }
        return this.videoOutputs;
    }

}
