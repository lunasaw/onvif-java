
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;DoorTamperState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DoorTamperState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="NotInTamper"/&amp;gt;
 *     &amp;lt;enumeration value="TamperDetected"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DoorTamperState")
@XmlEnum
public enum DoorTamperState {


    /**
     * Value is currently not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * No tampering is detected.
     * 
     */
    @XmlEnumValue("NotInTamper")
    NOT_IN_TAMPER("NotInTamper"),

    /**
     * Tampering is detected.
     * 
     */
    @XmlEnumValue("TamperDetected")
    TAMPER_DETECTED("TamperDetected");
    private final String value;

    DoorTamperState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorTamperState fromValue(String v) {
        for (DoorTamperState c: DoorTamperState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
