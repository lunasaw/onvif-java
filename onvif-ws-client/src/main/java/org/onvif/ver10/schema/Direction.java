
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Direction的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="Direction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Left"/&gt;
 *     &lt;enumeration value="Right"/&gt;
 *     &lt;enumeration value="Any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Direction")
@XmlEnum
public enum Direction {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    Direction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Direction fromValue(String v) {
        for (Direction c: Direction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
