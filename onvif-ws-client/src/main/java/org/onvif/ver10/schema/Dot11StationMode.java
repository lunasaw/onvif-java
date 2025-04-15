
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Dot11StationMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Dot11StationMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Ad-hoc"/&amp;gt;
 *     &amp;lt;enumeration value="Infrastructure"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Dot11StationMode")
@XmlEnum
public enum Dot11StationMode {

    @XmlEnumValue("Ad-hoc")
    AD_HOC("Ad-hoc"),
    @XmlEnumValue("Infrastructure")
    INFRASTRUCTURE("Infrastructure"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11StationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11StationMode fromValue(String v) {
        for (Dot11StationMode c: Dot11StationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
