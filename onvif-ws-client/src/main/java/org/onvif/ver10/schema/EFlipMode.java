
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;EFlipMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EFlipMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="OFF"/&amp;gt;
 *     &amp;lt;enumeration value="ON"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EFlipMode")
@XmlEnum
public enum EFlipMode {

    OFF("OFF"),
    ON("ON"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    EFlipMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EFlipMode fromValue(String v) {
        for (EFlipMode c: EFlipMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
