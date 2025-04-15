
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ParityBit的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ParityBit"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="Even"/&amp;gt;
 *     &amp;lt;enumeration value="Odd"/&amp;gt;
 *     &amp;lt;enumeration value="Mark"/&amp;gt;
 *     &amp;lt;enumeration value="Space"/&amp;gt;
 *     &amp;lt;enumeration value="Extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ParityBit")
@XmlEnum
public enum ParityBit {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Even")
    EVEN("Even"),
    @XmlEnumValue("Odd")
    ODD("Odd"),
    @XmlEnumValue("Mark")
    MARK("Mark"),
    @XmlEnumValue("Space")
    SPACE("Space"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ParityBit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParityBit fromValue(String v) {
        for (ParityBit c: ParityBit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
