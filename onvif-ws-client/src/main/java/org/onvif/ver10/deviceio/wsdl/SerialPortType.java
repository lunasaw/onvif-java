
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of serial port.Generic can be signaled as a vendor specific
 *             serial port type.
 * 
 * <p>Java class for SerialPortType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SerialPortType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RS232"/>
 *     <enumeration value="RS422HalfDuplex"/>
 *     <enumeration value="RS422FullDuplex"/>
 *     <enumeration value="RS485HalfDuplex"/>
 *     <enumeration value="RS485FullDuplex"/>
 *     <enumeration value="Generic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SerialPortType")
@XmlEnum
public enum SerialPortType {

    @XmlEnumValue("RS232")
    RS_232("RS232"),
    @XmlEnumValue("RS422HalfDuplex")
    RS_422_HALF_DUPLEX("RS422HalfDuplex"),
    @XmlEnumValue("RS422FullDuplex")
    RS_422_FULL_DUPLEX("RS422FullDuplex"),
    @XmlEnumValue("RS485HalfDuplex")
    RS_485_HALF_DUPLEX("RS485HalfDuplex"),
    @XmlEnumValue("RS485FullDuplex")
    RS_485_FULL_DUPLEX("RS485FullDuplex"),
    @XmlEnumValue("Generic")
    GENERIC("Generic");
    private final String value;

    SerialPortType(String v) {
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
    public static SerialPortType fromValue(String v) {
        for (SerialPortType c: SerialPortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
