
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlIdentityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamlIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Username"/>
 *     &lt;enumeration value="FederationId"/>
 *     &lt;enumeration value="UserId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamlIdentityType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SamlIdentityType {

    @XmlEnumValue("Username")
    USERNAME("Username"),
    @XmlEnumValue("FederationId")
    FEDERATION_ID("FederationId"),
    @XmlEnumValue("UserId")
    USER_ID("UserId");
    private final String value;

    SamlIdentityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamlIdentityType fromValue(String v) {
        for (SamlIdentityType c: SamlIdentityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
