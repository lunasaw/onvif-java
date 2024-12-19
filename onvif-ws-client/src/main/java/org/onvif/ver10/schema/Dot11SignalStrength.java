
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for Dot11SignalStrength</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Dot11SignalStrength">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Very Bad"/>
 *     <enumeration value="Bad"/>
 *     <enumeration value="Good"/>
 *     <enumeration value="Very Good"/>
 *     <enumeration value="Extended"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Dot11SignalStrength")
@XmlEnum
public enum Dot11SignalStrength {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Very Bad")
    VERY_BAD("Very Bad"),
    @XmlEnumValue("Bad")
    BAD("Bad"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("Very Good")
    VERY_GOOD("Very Good"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11SignalStrength(String v) {
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
    public static Dot11SignalStrength fromValue(String v) {
        for (Dot11SignalStrength c: Dot11SignalStrength.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
