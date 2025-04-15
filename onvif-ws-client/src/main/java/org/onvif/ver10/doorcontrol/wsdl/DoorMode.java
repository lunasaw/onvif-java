
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;DoorMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DoorMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="Locked"/&amp;gt;
 *     &amp;lt;enumeration value="Unlocked"/&amp;gt;
 *     &amp;lt;enumeration value="Accessed"/&amp;gt;
 *     &amp;lt;enumeration value="Blocked"/&amp;gt;
 *     &amp;lt;enumeration value="LockedDown"/&amp;gt;
 *     &amp;lt;enumeration value="LockedOpen"/&amp;gt;
 *     &amp;lt;enumeration value="DoubleLocked"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DoorMode")
@XmlEnum
public enum DoorMode {


    /**
     * The Door is in an Unknown state.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The Door is in a Locked state. In this mode the device shall provide
     *                 momentary access using the AccessDoor method if supported by the Door instance.
     *               
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * The Door is in an Unlocked (Permanent Access) state. Alarms related
     *                 to door timing operations such as open too long or forced are masked in this mode.
     *               
     * 
     */
    @XmlEnumValue("Unlocked")
    UNLOCKED("Unlocked"),

    /**
     * The Door is in an Accessed state (momentary/temporary access).
     *                 Alarms related to timing operations such as "door forced" are masked in this mode.
     *               
     * 
     */
    @XmlEnumValue("Accessed")
    ACCESSED("Accessed"),

    /**
     * The Door is in a Blocked state (Door is locked, and AccessDoor
     *                 requests are ignored, i.e., it is not possible for door to go to Accessed state).
     *               
     * 
     */
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),

    /**
     * The Door is in a LockedDown state (Door is locked) until released
     *                 using the LockDownReleaseDoor command. AccessDoor, LockDoor, UnlockDoor, BlockDoor
     *                 and LockOpenDoor requests are ignored, i.e., it is not possible for door to go to
     *                 Accessed, Locked, Unlocked, Blocked or LockedOpen state.
     *               
     * 
     */
    @XmlEnumValue("LockedDown")
    LOCKED_DOWN("LockedDown"),

    /**
     * The Door is in a LockedOpen state (Door is unlocked) until released
     *                 using the LockOpenReleaseDoor command. AccessDoor, LockDoor, UnlockDoor, BlockDoor
     *                 and LockDownDoor requests are ignored, i.e., it is not possible for door to go to
     *                 Accessed, Locked, Unlocked, Blocked or LockedDown state.
     *               
     * 
     */
    @XmlEnumValue("LockedOpen")
    LOCKED_OPEN("LockedOpen"),

    /**
     * The Door is in a Double Locked state - for doors with multiple
     *                 locks. If the door does not have any DoubleLock, this shall be treated as a normal
     *                 Locked mode. When changing to an Unlocked mode from the DoubleLocked mode, the door
     *                 may first go to Locked state before unlocking.
     *               
     * 
     */
    @XmlEnumValue("DoubleLocked")
    DOUBLE_LOCKED("DoubleLocked");
    private final String value;

    DoorMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorMode fromValue(String v) {
        for (DoorMode c: DoorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
