
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;NetworkHostType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="NetworkHostType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="IPv4"/&amp;gt;
 *     &amp;lt;enumeration value="IPv6"/&amp;gt;
 *     &amp;lt;enumeration value="DNS"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "NetworkHostType")
@XmlEnum
public enum NetworkHostType {

    @XmlEnumValue("IPv4")
    I_PV_4("IPv4"),
    @XmlEnumValue("IPv6")
    I_PV_6("IPv6"),
    DNS("DNS");
    private final String value;

    NetworkHostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkHostType fromValue(String v) {
        for (NetworkHostType c: NetworkHostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
