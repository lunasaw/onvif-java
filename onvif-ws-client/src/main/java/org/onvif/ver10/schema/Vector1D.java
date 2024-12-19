
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vector1D complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Vector1D">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="space" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector1D")
public class Vector1D {

    @XmlAttribute(name = "x", required = true)
    protected float x;
    /**
     * Pan/tilt coordinate space selector. The following options are defined:
     *           
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" style=""&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "space")
    @XmlSchemaType(name = "anyURI")
    protected String space;

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Pan/tilt coordinate space selector. The following options are defined:
     *           
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" style=""&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSpace()
     */
    public void setSpace(String value) {
        this.space = value;
    }

}
