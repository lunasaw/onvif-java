
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;SerialPortType的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SerialPortType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="RS232"/&amp;gt;
 *     &amp;lt;enumeration value="RS422HalfDuplex"/&amp;gt;
 *     &amp;lt;enumeration value="RS422FullDuplex"/&amp;gt;
 *     &amp;lt;enumeration value="RS485HalfDuplex"/&amp;gt;
 *     &amp;lt;enumeration value="RS485FullDuplex"/&amp;gt;
 *     &amp;lt;enumeration value="Generic"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SerialPortType")
@XmlEnum
public enum SerialPortType {

    @XmlEnumValue("RS232")
    RS_232("RS232"),
    @XmlEnumValue("RS422HalfDuplex")
    RS_422_HALF_DUPLEX("RS422HalfDuplex"),
    @XmlEnumValue("RS422FullDuplex")
    RS_422_FULL_DUPLEX("RS422FullDuplex"),
    @XmlEnumValue("RS485HalfDuplex")
    RS_485_HALF_DUPLEX("RS485HalfDuplex"),
    @XmlEnumValue("RS485FullDuplex")
    RS_485_FULL_DUPLEX("RS485FullDuplex"),
    @XmlEnumValue("Generic")
    GENERIC("Generic");
    private final String value;

    SerialPortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerialPortType fromValue(String v) {
        for (SerialPortType c: SerialPortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
