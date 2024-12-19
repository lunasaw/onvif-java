
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes the state of a Door fault.
 * 
 * <p>Java class for DoorFaultState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DoorFaultState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="NotInFault"/>
 *     <enumeration value="FaultDetected"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    public static DoorFaultState fromValue(String v) {
        for (DoorFaultState c: DoorFaultState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
