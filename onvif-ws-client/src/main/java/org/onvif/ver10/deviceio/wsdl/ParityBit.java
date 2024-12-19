
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The parity for the data error detection.
 * 
 * <p>Java class for ParityBit</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ParityBit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Even"/>
 *     <enumeration value="Odd"/>
 *     <enumeration value="Mark"/>
 *     <enumeration value="Space"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParityBit")
@XmlEnum
public enum ParityBit {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Even")
    EVEN("Even"),
    @XmlEnumValue("Odd")
    ODD("Odd"),
    @XmlEnumValue("Mark")
    MARK("Mark"),
    @XmlEnumValue("Space")
    SPACE("Space"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ParityBit(String v) {
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
    public static ParityBit fromValue(String v) {
        for (ParityBit c: ParityBit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
