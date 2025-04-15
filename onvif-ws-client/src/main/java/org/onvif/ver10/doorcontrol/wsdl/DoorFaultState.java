
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;DoorFaultState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DoorFaultState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="NotInFault"/&amp;gt;
 *     &amp;lt;enumeration value="FaultDetected"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DoorFaultState")
@XmlEnum
public enum DoorFaultState {


    /**
     * Fault state is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * No fault is detected.
     * 
     */
    @XmlEnumValue("NotInFault")
    NOT_IN_FAULT("NotInFault"),

    /**
     * Fault is detected.
     * 
     */
    @XmlEnumValue("FaultDetected")
    FAULT_DETECTED("FaultDetected");
    private final String value;

    DoorFaultState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorFaultState fromValue(String v) {
        for (DoorFaultState c: DoorFaultState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
