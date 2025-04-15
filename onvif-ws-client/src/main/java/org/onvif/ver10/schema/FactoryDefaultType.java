
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;FactoryDefaultType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="FactoryDefaultType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Hard"/&amp;gt;
 *     &amp;lt;enumeration value="Soft"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "FactoryDefaultType")
@XmlEnum
public enum FactoryDefaultType {


    /**
     * Indicates that a hard factory default is requested.
     * 
     */
    @XmlEnumValue("Hard")
    HARD("Hard"),

    /**
     * Indicates that a soft factory default is requested.
     * 
     */
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    FactoryDefaultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FactoryDefaultType fromValue(String v) {
        for (FactoryDefaultType c: FactoryDefaultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
