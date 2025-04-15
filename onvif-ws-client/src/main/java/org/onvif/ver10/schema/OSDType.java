
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;OSDType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OSDType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Text"/&amp;gt;
 *     &amp;lt;enumeration value="Image"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "OSDType")
@XmlEnum
public enum OSDType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    OSDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OSDType fromValue(String v) {
        for (OSDType c: OSDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
