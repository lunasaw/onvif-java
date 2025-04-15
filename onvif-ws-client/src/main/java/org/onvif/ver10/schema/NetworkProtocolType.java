
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;NetworkProtocolType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="NetworkProtocolType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="HTTP"/&amp;gt;
 *     &amp;lt;enumeration value="HTTPS"/&amp;gt;
 *     &amp;lt;enumeration value="RTSP"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "NetworkProtocolType")
@XmlEnum
public enum NetworkProtocolType {

    HTTP,
    HTTPS,
    RTSP;

    public String value() {
        return name();
    }

    public static NetworkProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
