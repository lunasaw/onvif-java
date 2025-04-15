
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;KeyStatus的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="KeyStatus"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ok"/&amp;gt;
 *     &amp;lt;enumeration value="generating"/&amp;gt;
 *     &amp;lt;enumeration value="corrupt"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "KeyStatus")
@XmlEnum
public enum KeyStatus {


    /**
     * Key is ready for use
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * Key is being generated
     * 
     */
    @XmlEnumValue("generating")
    GENERATING("generating"),

    /**
     * Key has not been successfully generated and cannot be used.
     *               
     * 
     */
    @XmlEnumValue("corrupt")
    CORRUPT("corrupt");
    private final String value;

    KeyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyStatus fromValue(String v) {
        for (KeyStatus c: KeyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
