
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Dot11Cipher的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Dot11Cipher"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CCMP"/&amp;gt;
 *     &amp;lt;enumeration value="TKIP"/&amp;gt;
 *     &amp;lt;enumeration value="Any"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Dot11Cipher")
@XmlEnum
public enum Dot11Cipher {

    CCMP("CCMP"),
    TKIP("TKIP"),
    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11Cipher(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11Cipher fromValue(String v) {
        for (Dot11Cipher c: Dot11Cipher.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
