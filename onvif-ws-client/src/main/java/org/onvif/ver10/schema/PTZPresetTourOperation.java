
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;PTZPresetTourOperation的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PTZPresetTourOperation"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Start"/&amp;gt;
 *     &amp;lt;enumeration value="Stop"/&amp;gt;
 *     &amp;lt;enumeration value="Pause"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PTZPresetTourOperation")
@XmlEnum
public enum PTZPresetTourOperation {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Pause")
    PAUSE("Pause"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    PTZPresetTourOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PTZPresetTourOperation fromValue(String v) {
        for (PTZPresetTourOperation c: PTZPresetTourOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
