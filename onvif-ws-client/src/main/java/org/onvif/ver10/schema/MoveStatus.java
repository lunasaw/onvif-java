
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for MoveStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MoveStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IDLE"/>
 *     <enumeration value="MOVING"/>
 *     <enumeration value="UNKNOWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MoveStatus")
@XmlEnum
public enum MoveStatus {

    IDLE,
    MOVING,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static MoveStatus fromValue(String v) {
        return valueOf(v);
    }

}
