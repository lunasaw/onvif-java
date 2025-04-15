
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;VideoEncodingProfiles的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="VideoEncodingProfiles"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Simple"/&amp;gt;
 *     &amp;lt;enumeration value="AdvancedSimple"/&amp;gt;
 *     &amp;lt;enumeration value="Baseline"/&amp;gt;
 *     &amp;lt;enumeration value="Main"/&amp;gt;
 *     &amp;lt;enumeration value="Main10"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *     &amp;lt;enumeration value="High"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "VideoEncodingProfiles")
@XmlEnum
public enum VideoEncodingProfiles {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("AdvancedSimple")
    ADVANCED_SIMPLE("AdvancedSimple"),
    @XmlEnumValue("Baseline")
    BASELINE("Baseline"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Main10")
    MAIN_10("Main10"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    VideoEncodingProfiles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingProfiles fromValue(String v) {
        for (VideoEncodingProfiles c: VideoEncodingProfiles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
