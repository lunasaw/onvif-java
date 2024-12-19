
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.GetRecordingsResponseItem;


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
 *         <element name="RecordingItem" type="{http://www.onvif.org/ver10/schema}GetRecordingsResponseItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "recordingItem"
})
@XmlRootElement(name = "GetRecordingsResponse")
public class GetRecordingsResponse {

    /**
     * List of recording items.
     * 
     */
    @XmlElement(name = "RecordingItem")
    protected List<GetRecordingsResponseItem> recordingItem;

    /**
     * List of recording items.
     * 
     * Gets the value of the recordingItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordingItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecordingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRecordingsResponseItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the recordingItem property.
     */
    public List<GetRecordingsResponseItem> getRecordingItem() {
        if (recordingItem == null) {
            recordingItem = new ArrayList<>();
        }
        return this.recordingItem;
    }

}
