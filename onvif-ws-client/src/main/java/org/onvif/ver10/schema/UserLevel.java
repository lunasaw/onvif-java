
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UserLevel的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="UserLevel"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Administrator"/&amp;gt;
 *     &amp;lt;enumeration value="Operator"/&amp;gt;
 *     &amp;lt;enumeration value="User"/&amp;gt;
 *     &amp;lt;enumeration value="Anonymous"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "UserLevel")
@XmlEnum
public enum UserLevel {

    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    UserLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserLevel fromValue(String v) {
        for (UserLevel c: UserLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
