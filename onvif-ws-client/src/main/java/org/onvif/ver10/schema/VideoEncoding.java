
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;VideoEncoding的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="VideoEncoding"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="JPEG"/&amp;gt;
 *     &amp;lt;enumeration value="MPEG4"/&amp;gt;
 *     &amp;lt;enumeration value="H264"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {

    JPEG("JPEG"),
    @XmlEnumValue("MPEG4")
    MPEG_4("MPEG4"),
    @XmlEnumValue("H264")
    H_264("H264");
    private final String value;

    VideoEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncoding fromValue(String v) {
        for (VideoEncoding c: VideoEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
