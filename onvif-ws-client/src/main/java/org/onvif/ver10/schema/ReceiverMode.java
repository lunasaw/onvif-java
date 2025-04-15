
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ReceiverMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ReceiverMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="AutoConnect"/&amp;gt;
 *     &amp;lt;enumeration value="AlwaysConnect"/&amp;gt;
 *     &amp;lt;enumeration value="NeverConnect"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ReceiverMode")
@XmlEnum
public enum ReceiverMode {


    /**
     * The receiver connects on demand, as required by consumers of the media
     *             streams.
     *           
     * 
     */
    @XmlEnumValue("AutoConnect")
    AUTO_CONNECT("AutoConnect"),

    /**
     * The receiver attempts to maintain a persistent connection to the
     *             configured endpoint.
     *           
     * 
     */
    @XmlEnumValue("AlwaysConnect")
    ALWAYS_CONNECT("AlwaysConnect"),

    /**
     * The receiver does not attempt to connect.
     * 
     */
    @XmlEnumValue("NeverConnect")
    NEVER_CONNECT("NeverConnect"),

    /**
     * This case should never happen.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverMode fromValue(String v) {
        for (ReceiverMode c: ReceiverMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
