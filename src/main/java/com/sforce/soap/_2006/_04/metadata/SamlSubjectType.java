
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlSubjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamlSubjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Username"/>
 *     &lt;enumeration value="FederationId"/>
 *     &lt;enumeration value="UserId"/>
 *     &lt;enumeration value="SpokeId"/>
 *     &lt;enumeration value="CustomAttribute"/>
 *     &lt;enumeration value="PersistentId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamlSubjectType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SamlSubjectType {

    @XmlEnumValue("Username")
    USERNAME("Username"),
    @XmlEnumValue("FederationId")
    FEDERATION_ID("FederationId"),
    @XmlEnumValue("UserId")
    USER_ID("UserId"),
    @XmlEnumValue("SpokeId")
    SPOKE_ID("SpokeId"),
    @XmlEnumValue("CustomAttribute")
    CUSTOM_ATTRIBUTE("CustomAttribute"),
    @XmlEnumValue("PersistentId")
    PERSISTENT_ID("PersistentId");
    private final String value;

    SamlSubjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamlSubjectType fromValue(String v) {
        for (SamlSubjectType c: SamlSubjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
