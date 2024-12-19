
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MoveOptions20;


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
 *         <element name="MoveOptions" type="{http://www.onvif.org/ver10/schema}MoveOptions20"/>
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
    "moveOptions"
})
@XmlRootElement(name = "GetMoveOptionsResponse")
public class GetMoveOptionsResponse {

    /**
     * Valid ranges for the focus lens move options.
     * 
     */
    @XmlElement(name = "MoveOptions", required = true)
    protected MoveOptions20 moveOptions;

    /**
     * Valid ranges for the focus lens move options.
     * 
     * @return
     *     possible object is
     *     {@link MoveOptions20 }
     *     
     */
    public MoveOptions20 getMoveOptions() {
        return moveOptions;
    }

    /**
     * Sets the value of the moveOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveOptions20 }
     *     
     * @see #getMoveOptions()
     */
    public void setMoveOptions(MoveOptions20 value) {
        this.moveOptions = value;
    }

}
