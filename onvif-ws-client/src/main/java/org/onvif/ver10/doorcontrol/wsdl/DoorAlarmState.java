
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes the state of a Door with regard to alarms.
 * 
 * <p>Java class for DoorAlarmState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DoorAlarmState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Normal"/>
 *     <enumeration value="DoorForcedOpen"/>
 *     <enumeration value="DoorOpenTooLong"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DoorAlarmState")
@XmlEnum
public enum DoorAlarmState {


    /**
     * No alarm.
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * Door is forced open.
     * 
     */
    @XmlEnumValue("DoorForcedOpen")
    DOOR_FORCED_OPEN("DoorForcedOpen"),

    /**
     * Door is held open too long.
     * 
     */
    @XmlEnumValue("DoorOpenTooLong")
    DOOR_OPEN_TOO_LONG("DoorOpenTooLong");
    private final String value;

    DoorAlarmState(String v) {
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
    public static DoorAlarmState fromValue(String v) {
        for (DoorAlarmState c: DoorAlarmState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
