
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailToCaseRoutingAddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailToCaseRoutingAddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EmailToCase"/>
 *     &lt;enumeration value="Outlook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailToCaseRoutingAddressType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum EmailToCaseRoutingAddressType {

    @XmlEnumValue("EmailToCase")
    EMAIL_TO_CASE("EmailToCase"),
    @XmlEnumValue("Outlook")
    OUTLOOK("Outlook");
    private final String value;

    EmailToCaseRoutingAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailToCaseRoutingAddressType fromValue(String v) {
        for (EmailToCaseRoutingAddressType c: EmailToCaseRoutingAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
