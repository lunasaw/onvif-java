
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The physical state of a Door.
 * 
 * <p>Java class for DoorPhysicalState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DoorPhysicalState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Open"/>
 *     <enumeration value="Closed"/>
 *     <enumeration value="Fault"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DoorPhysicalState")
@XmlEnum
public enum DoorPhysicalState {


    /**
     * Value is currently unknown (possibly due to initialization or
     *                 monitors not giving a conclusive result).
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
    public static DoorPhysicalState fromValue(String v) {
        for (DoorPhysicalState c: DoorPhysicalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
