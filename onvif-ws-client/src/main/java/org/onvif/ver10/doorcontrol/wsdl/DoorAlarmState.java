
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;DoorAlarmState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DoorAlarmState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Normal"/&amp;gt;
 *     &amp;lt;enumeration value="DoorForcedOpen"/&amp;gt;
 *     &amp;lt;enumeration value="DoorOpenTooLong"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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

    public String value() {
        return value;
    }

    public static DoorAlarmState fromValue(String v) {
        for (DoorAlarmState c: DoorAlarmState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
