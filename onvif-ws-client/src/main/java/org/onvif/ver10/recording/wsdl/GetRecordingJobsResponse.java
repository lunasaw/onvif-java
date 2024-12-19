
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.GetRecordingJobsResponseItem;


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
 *         <element name="JobItem" type="{http://www.onvif.org/ver10/schema}GetRecordingJobsResponseItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "jobItem"
})
@XmlRootElement(name = "GetRecordingJobsResponse")
public class GetRecordingJobsResponse {

    /**
     * List of recording jobs.
     * 
     */
    @XmlElement(name = "JobItem")
    protected List<GetRecordingJobsResponseItem> jobItem;

    /**
     * List of recording jobs.
     * 
     * Gets the value of the jobItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJobItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRecordingJobsResponseItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the jobItem property.
     */
    public List<GetRecordingJobsResponseItem> getJobItem() {
        if (jobItem == null) {
            jobItem = new ArrayList<>();
        }
        return this.jobItem;
    }

}
