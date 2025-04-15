
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;IPAddressFilterType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="IPAddressFilterType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Allow"/&amp;gt;
 *     &amp;lt;enumeration value="Deny"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "IPAddressFilterType")
@XmlEnum
public enum IPAddressFilterType {

    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Deny")
    DENY("Deny");
    private final String value;

    IPAddressFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPAddressFilterType fromValue(String v) {
        for (IPAddressFilterType c: IPAddressFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
