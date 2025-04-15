
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ReceiverState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ReceiverState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NotConnected"/&amp;gt;
 *     &amp;lt;enumeration value="Connecting"/&amp;gt;
 *     &amp;lt;enumeration value="Connected"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ReceiverState")
@XmlEnum
public enum ReceiverState {


    /**
     * The receiver is not connected.
     * 
     */
    @XmlEnumValue("NotConnected")
    NOT_CONNECTED("NotConnected"),

    /**
     * The receiver is attempting to connect.
     * 
     */
    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),

    /**
     * The receiver is connected.
     * 
     */
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),

    /**
     * This case should never happen.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverState fromValue(String v) {
        for (ReceiverState c: ReceiverState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
