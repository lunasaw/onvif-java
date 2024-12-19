
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZNode;


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
 *         <element name="PTZNode" type="{http://www.onvif.org/ver10/schema}PTZNode"/>
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
    "ptzNode"
})
@XmlRootElement(name = "GetNodeResponse")
public class GetNodeResponse {

    /**
     * A requested PTZNode.
     * 
     */
    @XmlElement(name = "PTZNode", required = true)
    protected PTZNode ptzNode;

    /**
     * A requested PTZNode.
     * 
     * @return
     *     possible object is
     *     {@link PTZNode }
     *     
     */
    public PTZNode getPTZNode() {
        return ptzNode;
    }

    /**
     * Sets the value of the ptzNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNode }
     *     
     * @see #getPTZNode()
     */
    public void setPTZNode(PTZNode value) {
        this.ptzNode = value;
    }

}
