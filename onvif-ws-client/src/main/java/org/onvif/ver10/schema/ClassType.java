
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ClassType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ClassType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Animal"/&amp;gt;
 *     &amp;lt;enumeration value="Face"/&amp;gt;
 *     &amp;lt;enumeration value="Human"/&amp;gt;
 *     &amp;lt;enumeration value="Vehical"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ClassType")
@XmlEnum
public enum ClassType {

    @XmlEnumValue("Animal")
    ANIMAL("Animal"),
    @XmlEnumValue("Face")
    FACE("Face"),
    @XmlEnumValue("Human")
    HUMAN("Human"),
    @XmlEnumValue("Vehical")
    VEHICAL("Vehical"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassType fromValue(String v) {
        for (ClassType c: ClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
