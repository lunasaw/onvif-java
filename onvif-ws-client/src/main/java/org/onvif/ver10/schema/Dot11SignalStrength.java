
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Dot11SignalStrength的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Dot11SignalStrength"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="Very Bad"/&amp;gt;
 *     &amp;lt;enumeration value="Bad"/&amp;gt;
 *     &amp;lt;enumeration value="Good"/&amp;gt;
 *     &amp;lt;enumeration value="Very Good"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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

    public String value() {
        return value;
    }

    public static Dot11SignalStrength fromValue(String v) {
        for (Dot11SignalStrength c: Dot11SignalStrength.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
