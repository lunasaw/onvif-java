
package org.onvif.ver10.accesscontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Decision的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Decision"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Granted"/&amp;gt;
 *     &amp;lt;enumeration value="Denied"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Decision")
@XmlEnum
public enum Decision {


    /**
     * The decision is to grant access.
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * The decision is to deny access.
     * 
     */
    @XmlEnumValue("Denied")
    DENIED("Denied");
    private final String value;

    Decision(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Decision fromValue(String v) {
        for (Decision c: Decision.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
