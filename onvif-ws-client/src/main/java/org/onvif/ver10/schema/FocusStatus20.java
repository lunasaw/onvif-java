
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>FocusStatus20 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FocusStatus20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MoveStatus" type="{http://www.onvif.org/ver10/schema}MoveStatus"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusStatus20Extension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusStatus20", propOrder = {
    "position",
    "moveStatus",
    "error",
    "extension"
})
public class FocusStatus20 {

    @XmlElement(name = "Position")
    protected float position;
    @XmlElement(name = "MoveStatus", required = true)
    @XmlSchemaType(name = "string")
    protected MoveStatus moveStatus;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Extension")
    protected FocusStatus20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取position属性的值。
     * 
     */
    public float getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     */
    public void setPosition(float value) {
        this.position = value;
    }

    /**
     * 获取moveStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MoveStatus }
     *     
     */
    public MoveStatus getMoveStatus() {
        return moveStatus;
    }

    /**
     * 设置moveStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MoveStatus }
     *     
     */
    public void setMoveStatus(MoveStatus value) {
        this.moveStatus = value;
    }

    /**
     * 获取error属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * 设置error属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public FocusStatus20Extension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public void setExtension(FocusStatus20Extension value) {
        this.extension = value;
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
