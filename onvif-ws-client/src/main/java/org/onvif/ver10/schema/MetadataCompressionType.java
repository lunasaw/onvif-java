
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;MetadataCompressionType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MetadataCompressionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="GZIP"/&amp;gt;
 *     &amp;lt;enumeration value="EXI"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MetadataCompressionType")
@XmlEnum
public enum MetadataCompressionType {

    @XmlEnumValue("None")
    NONE("None"),
    GZIP("GZIP"),
    EXI("EXI");
    private final String value;

    MetadataCompressionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataCompressionType fromValue(String v) {
        for (MetadataCompressionType c: MetadataCompressionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
