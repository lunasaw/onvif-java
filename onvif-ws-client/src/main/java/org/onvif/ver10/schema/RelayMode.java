
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;RelayMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RelayMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Monostable"/&amp;gt;
 *     &amp;lt;enumeration value="Bistable"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RelayMode")
@XmlEnum
public enum RelayMode {

    @XmlEnumValue("Monostable")
    MONOSTABLE("Monostable"),
    @XmlEnumValue("Bistable")
    BISTABLE("Bistable");
    private final String value;

    RelayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayMode fromValue(String v) {
        for (RelayMode c: RelayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
