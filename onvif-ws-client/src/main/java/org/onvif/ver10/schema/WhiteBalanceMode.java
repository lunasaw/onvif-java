
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;WhiteBalanceMode的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="WhiteBalanceMode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="AUTO"/&amp;gt;
 *     &amp;lt;enumeration value="MANUAL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "WhiteBalanceMode")
@XmlEnum
public enum WhiteBalanceMode {

    AUTO,
    MANUAL;

    public String value() {
        return name();
    }

    public static WhiteBalanceMode fromValue(String v) {
        return valueOf(v);
    }

}
