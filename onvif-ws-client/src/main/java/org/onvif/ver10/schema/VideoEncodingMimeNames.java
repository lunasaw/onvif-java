
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;VideoEncodingMimeNames的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="VideoEncodingMimeNames"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="JPEG"/&amp;gt;
 *     &amp;lt;enumeration value="MPV4-ES"/&amp;gt;
 *     &amp;lt;enumeration value="H264"/&amp;gt;
 *     &amp;lt;enumeration value="H265"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "VideoEncodingMimeNames")
@XmlEnum
public enum VideoEncodingMimeNames {

    JPEG("JPEG"),
    @XmlEnumValue("MPV4-ES")
    MPV_4_ES("MPV4-ES"),
    @XmlEnumValue("H264")
    H_264("H264"),
    @XmlEnumValue("H265")
    H_265("H265");
    private final String value;

    VideoEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingMimeNames fromValue(String v) {
        for (VideoEncodingMimeNames c: VideoEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
