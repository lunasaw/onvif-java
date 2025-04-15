
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;TrackType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TrackType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Video"/&amp;gt;
 *     &amp;lt;enumeration value="Audio"/&amp;gt;
 *     &amp;lt;enumeration value="Metadata"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TrackType")
@XmlEnum
public enum TrackType {

    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),

    /**
     * Placeholder for future extension.
     * 
     */
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    TrackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackType fromValue(String v) {
        for (TrackType c: TrackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
