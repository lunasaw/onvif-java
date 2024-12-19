
package org.onvif.ver10.accesscontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Non-normative enum that describes the various reasons for denying access.
 *             The following strings shall be used for the reason field:
 * 
 * <p>Java class for DenyReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DenyReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CredentialNotEnabled"/>
 *     <enumeration value="CredentialNotActive"/>
 *     <enumeration value="CredentialExpired"/>
 *     <enumeration value="InvalidPIN"/>
 *     <enumeration value="NotPermittedAtThisTime"/>
 *     <enumeration value="Unauthorized"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DenyReason")
@XmlEnum
public enum DenyReason {


    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is not enabled or has been disabled (e.g., due to credential being lost
     *                 etc.) to prevent unauthorized entry.
     * 
     */
    @XmlEnumValue("CredentialNotEnabled")
    CREDENTIAL_NOT_ENABLED("CredentialNotEnabled"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is presented though it is not active yet;: e.g, the credential was
     *                 presented before the start date.
     * 
     */
    @XmlEnumValue("CredentialNotActive")
    CREDENTIAL_NOT_ACTIVE("CredentialNotActive"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential was presented after its expiry date.
     * 
     */
    @XmlEnumValue("CredentialExpired")
    CREDENTIAL_EXPIRED("CredentialExpired"),

    /**
     * The device shall provide the following event, whenever an entered
     *                 PIN code does not match the credential.
     * 
     */
    @XmlEnumValue("InvalidPIN")
    INVALID_PIN("InvalidPIN"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is denied access to the requested AccessPoint because the credential is
     *                 not permitted at the moment.
     * 
     */
    @XmlEnumValue("NotPermittedAtThisTime")
    NOT_PERMITTED_AT_THIS_TIME("NotPermittedAtThisTime"),

    /**
     * The device shall provide the following event, whenever the presented
     *                 credential is not authorized.
     * 
     */
    @XmlEnumValue("Unauthorized")
    UNAUTHORIZED("Unauthorized"),

    /**
     * The device shall provide the following event, whenever the request
     *                 is denied and no other specific event matches it or is supported by the service.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DenyReason(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static DenyReason fromValue(String v) {
        for (DenyReason c: DenyReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
