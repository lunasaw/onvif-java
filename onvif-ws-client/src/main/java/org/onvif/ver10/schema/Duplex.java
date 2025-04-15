
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Duplex的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Duplex"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Full"/&amp;gt;
 *     &amp;lt;enumeration value="Half"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Duplex")
@XmlEnum
public enum Duplex {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Half")
    HALF("Half");
    private final String value;

    Duplex(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Duplex fromValue(String v) {
        for (Duplex c: Duplex.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
