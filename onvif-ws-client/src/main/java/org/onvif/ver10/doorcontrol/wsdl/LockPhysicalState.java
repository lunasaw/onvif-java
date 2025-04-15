
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;LockPhysicalState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="LockPhysicalState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="Locked"/&amp;gt;
 *     &amp;lt;enumeration value="Unlocked"/&amp;gt;
 *     &amp;lt;enumeration value="Fault"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
