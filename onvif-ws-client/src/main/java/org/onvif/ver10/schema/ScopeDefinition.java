
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ScopeDefinition的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ScopeDefinition"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Fixed"/&amp;gt;
 *     &amp;lt;enumeration value="Configurable"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ScopeDefinition")
@XmlEnum
public enum ScopeDefinition {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Configurable")
    CONFIGURABLE("Configurable");
    private final String value;

    ScopeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeDefinition fromValue(String v) {
        for (ScopeDefinition c: ScopeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
