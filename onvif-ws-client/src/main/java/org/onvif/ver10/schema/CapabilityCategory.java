
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;CapabilityCategory的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="CapabilityCategory"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="All"/&amp;gt;
 *     &amp;lt;enumeration value="Analytics"/&amp;gt;
 *     &amp;lt;enumeration value="Device"/&amp;gt;
 *     &amp;lt;enumeration value="Events"/&amp;gt;
 *     &amp;lt;enumeration value="Imaging"/&amp;gt;
 *     &amp;lt;enumeration value="Media"/&amp;gt;
 *     &amp;lt;enumeration value="PTZ"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "CapabilityCategory")
@XmlEnum
public enum CapabilityCategory {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Events")
    EVENTS("Events"),
    @XmlEnumValue("Imaging")
    IMAGING("Imaging"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    PTZ("PTZ");
    private final String value;

    CapabilityCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapabilityCategory fromValue(String v) {
        for (CapabilityCategory c: CapabilityCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
