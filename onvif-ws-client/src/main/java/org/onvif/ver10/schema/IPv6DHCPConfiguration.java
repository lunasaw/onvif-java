
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;IPv6DHCPConfiguration的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="IPv6DHCPConfiguration"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Auto"/&amp;gt;
 *     &amp;lt;enumeration value="Stateful"/&amp;gt;
 *     &amp;lt;enumeration value="Stateless"/&amp;gt;
 *     &amp;lt;enumeration value="Off"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "IPv6DHCPConfiguration")
@XmlEnum
public enum IPv6DHCPConfiguration {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Stateful")
    STATEFUL("Stateful"),
    @XmlEnumValue("Stateless")
    STATELESS("Stateless"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    IPv6DHCPConfiguration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPv6DHCPConfiguration fromValue(String v) {
        for (IPv6DHCPConfiguration c: IPv6DHCPConfiguration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
