
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemLogType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SystemLogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="Access"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemLogType")
@XmlEnum
public enum SystemLogType {


    /**
     * Indicates that a system log is requested.
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System"),

    /**
     * Indicates that a access log is requested.
     * 
     */
    @XmlEnumValue("Access")
    ACCESS("Access");
    private final String value;

    SystemLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemLogType fromValue(String v) {
        for (SystemLogType c: SystemLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
