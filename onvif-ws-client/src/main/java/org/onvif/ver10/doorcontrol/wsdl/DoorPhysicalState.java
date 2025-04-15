
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;DoorPhysicalState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DoorPhysicalState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="Open"/&amp;gt;
 *     &amp;lt;enumeration value="Closed"/&amp;gt;
 *     &amp;lt;enumeration value="Fault"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DoorPhysicalState")
@XmlEnum
public enum DoorPhysicalState {


    /**
     * Value is currently unknown (possibly due to initialization or
     *                 monitors not giving a conclusive result).
     *               
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Door is open.
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Door is closed.
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * Door monitor fault is detected.
     * 
     */
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    DoorPhysicalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorPhysicalState fromValue(String v) {
        for (DoorPhysicalState c: DoorPhysicalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
