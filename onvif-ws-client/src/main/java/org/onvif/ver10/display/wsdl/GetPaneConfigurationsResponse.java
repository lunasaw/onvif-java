
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PaneConfiguration;


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
 *         <element name="PaneConfiguration" type="{http://www.onvif.org/ver10/schema}PaneConfiguration" maxOccurs="unbounded"/>
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
    "paneConfiguration"
})
@XmlRootElement(name = "GetPaneConfigurationsResponse")
public class GetPaneConfigurationsResponse {

    /**
     * Contains a list of defined Panes of the specified VideoOutput.
     *                   Each VideoOutput has at least one PaneConfiguration.
     * 
     */
    @XmlElement(name = "PaneConfiguration", required = true)
    protected List<PaneConfiguration> paneConfiguration;

    /**
     * Contains a list of defined Panes of the specified VideoOutput.
     *                   Each VideoOutput has at least one PaneConfiguration.
     * 
     * Gets the value of the paneConfiguration property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paneConfiguration property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaneConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaneConfiguration }
     * </p>
     * 
     * 
     * @return
     *     The value of the paneConfiguration property.
     */
    public List<PaneConfiguration> getPaneConfiguration() {
        if (paneConfiguration == null) {
            paneConfiguration = new ArrayList<>();
        }
        return this.paneConfiguration;
    }

}
