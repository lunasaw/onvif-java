
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ExposurePriority的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExposurePriority"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LowNoise"/&amp;gt;
 *     &amp;lt;enumeration value="FrameRate"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExposurePriority")
@XmlEnum
public enum ExposurePriority {

    @XmlEnumValue("LowNoise")
    LOW_NOISE("LowNoise"),
    @XmlEnumValue("FrameRate")
    FRAME_RATE("FrameRate");
    private final String value;

    ExposurePriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposurePriority fromValue(String v) {
        for (ExposurePriority c: ExposurePriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
