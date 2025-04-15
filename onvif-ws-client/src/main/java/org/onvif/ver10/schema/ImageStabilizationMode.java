
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ImageStabilizationMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ImageStabilizationMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="OFF"/&amp;gt;
 *     &amp;lt;enumeration value="ON"/&amp;gt;
 *     &amp;lt;enumeration value="AUTO"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ImageStabilizationMode")
@XmlEnum
public enum ImageStabilizationMode {

    OFF("OFF"),
    ON("ON"),
    AUTO("AUTO"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ImageStabilizationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageStabilizationMode fromValue(String v) {
        for (ImageStabilizationMode c: ImageStabilizationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
