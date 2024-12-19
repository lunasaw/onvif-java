
package org.onvif.ver10.receiver.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Receiver;


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
 *         <element name="Receivers" type="{http://www.onvif.org/ver10/schema}Receiver" maxOccurs="unbounded" minOccurs="0"/>
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
    "receivers"
})
@XmlRootElement(name = "GetReceiversResponse")
public class GetReceiversResponse {

    /**
     * A list of all receivers that currently exist on the device.
     * 
     */
    @XmlElement(name = "Receivers")
    protected List<Receiver> receivers;

    /**
     * A list of all receivers that currently exist on the device.
     * 
     * Gets the value of the receivers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReceivers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Receiver }
     * </p>
     * 
     * 
     * @return
     *     The value of the receivers property.
     */
    public List<Receiver> getReceivers() {
        if (receivers == null) {
            receivers = new ArrayList<>();
        }
        return this.receivers;
    }

}
