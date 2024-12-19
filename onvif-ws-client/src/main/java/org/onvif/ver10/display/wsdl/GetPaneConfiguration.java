
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         <element name="VideoOutput" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Pane" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
    "videoOutput",
    "pane",
    "any"
})
@XmlRootElement(name = "GetPaneConfiguration")
public class GetPaneConfiguration {

    /**
     * Reference Token of the Video Output the requested pane belongs
     *                   to
     * 
     */
    @XmlElement(name = "VideoOutput", required = true)
    protected String videoOutput;
    /**
     * Reference Token of the Pane whose Configuration is requested
     * 
     */
    @XmlElement(name = "Pane", required = true)
    protected String pane;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Reference Token of the Video Output the requested pane belongs
     *                   to
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutput() {
        return videoOutput;
    }

    /**
     * Sets the value of the videoOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVideoOutput()
     */
    public void setVideoOutput(String value) {
        this.videoOutput = value;
    }

    /**
     * Reference Token of the Pane whose Configuration is requested
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPane() {
        return pane;
    }

    /**
     * Sets the value of the pane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPane()
     */
    public void setPane(String value) {
        this.pane = value;
    }

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

}
