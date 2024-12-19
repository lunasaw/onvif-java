
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The status of a key in the keystore.
 * 
 * <p>Java class for KeyStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KeyStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ok"/>
 *     <enumeration value="generating"/>
 *     <enumeration value="corrupt"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KeyStatus")
@XmlEnum
public enum KeyStatus {


    /**
     * Key is ready for use
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * Key is being generated
     * 
     */
    @XmlEnumValue("generating")
    GENERATING("generating"),

    /**
     * Key has not been successfully generated and cannot be used.
     * 
     */
    @XmlEnumValue("corrupt")
    CORRUPT("corrupt");
    private final String value;

    KeyStatus(String v) {
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
    public static KeyStatus fromValue(String v) {
        for (KeyStatus c: KeyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
