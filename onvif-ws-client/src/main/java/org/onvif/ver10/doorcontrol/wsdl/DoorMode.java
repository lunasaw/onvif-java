
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DoorMode parameters describe current Door mode from a logical perspective.
 * 
 * <p>Java class for DoorMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DoorMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Locked"/>
 *     <enumeration value="Unlocked"/>
 *     <enumeration value="Accessed"/>
 *     <enumeration value="Blocked"/>
 *     <enumeration value="LockedDown"/>
 *     <enumeration value="LockedOpen"/>
 *     <enumeration value="DoubleLocked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * The Door is in an Unlocked (Permanent Access) state. Alarms related
     *                 to door timing operations such as open too long or forced are masked in this mode.
     * 
     */
    @XmlEnumValue("Unlocked")
    UNLOCKED("Unlocked"),

    /**
     * The Door is in an Accessed state (momentary/temporary access).
     *                 Alarms related to timing operations such as "door forced" are masked in this mode.
     * 
     */
    @XmlEnumValue("Accessed")
    ACCESSED("Accessed"),

    /**
     * The Door is in a Blocked state (Door is locked, and AccessDoor
     *                 requests are ignored, i.e., it is not possible for door to go to Accessed state).
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
     */
    @XmlEnumValue("LockedDown")
    LOCKED_DOWN("LockedDown"),

    /**
     * The Door is in a LockedOpen state (Door is unlocked) until released
     *                 using the LockOpenReleaseDoor command. AccessDoor, LockDoor, UnlockDoor, BlockDoor
     *                 and LockDownDoor requests are ignored, i.e., it is not possible for door to go to
     *                 Accessed, Locked, Unlocked, Blocked or LockedDown state.
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
     */
    @XmlEnumValue("DoubleLocked")
    DOUBLE_LOCKED("DoubleLocked");
    private final String value;

    DoorMode(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static DoorMode fromValue(String v) {
        for (DoorMode c: DoorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
