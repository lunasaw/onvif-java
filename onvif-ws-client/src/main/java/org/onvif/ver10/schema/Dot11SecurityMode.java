
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Dot11SecurityMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Dot11SecurityMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="WEP"/&amp;gt;
 *     &amp;lt;enumeration value="PSK"/&amp;gt;
 *     &amp;lt;enumeration value="Dot1X"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Dot11SecurityMode")
@XmlEnum
public enum Dot11SecurityMode {

    @XmlEnumValue("None")
    NONE("None"),
    WEP("WEP"),
    PSK("PSK"),
    @XmlEnumValue("Dot1X")
    DOT_1_X("Dot1X"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11SecurityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11SecurityMode fromValue(String v) {
        for (Dot11SecurityMode c: Dot11SecurityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
