
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes the state of a Tamper detector.
 * 
 * <p>Java class for DoorTamperState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DoorTamperState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="NotInTamper"/>
 *     <enumeration value="TamperDetected"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    public static DoorTamperState fromValue(String v) {
        for (DoorTamperState c: DoorTamperState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
