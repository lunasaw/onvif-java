
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>LockPhysicalState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="LockPhysicalState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *     &lt;enumeration value="Unlocked"/&gt;
 *     &lt;enumeration value="Fault"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LockPhysicalState")
@XmlEnum
public enum LockPhysicalState {


    /**
     * Value is currently not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Lock is activated.
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * Lock is not activated.
     * 
     */
    @XmlEnumValue("Unlocked")
    UNLOCKED("Unlocked"),

    /**
     * Lock fault is detected.
     * 
     */
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    LockPhysicalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LockPhysicalState fromValue(String v) {
        for (LockPhysicalState c: LockPhysicalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
