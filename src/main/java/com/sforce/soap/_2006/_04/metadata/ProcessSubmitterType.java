
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessSubmitterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessSubmitterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="role"/>
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="roleSubordinates"/>
 *     &lt;enumeration value="roleSubordinatesInternal"/>
 *     &lt;enumeration value="owner"/>
 *     &lt;enumeration value="creator"/>
 *     &lt;enumeration value="partnerUser"/>
 *     &lt;enumeration value="customerPortalUser"/>
 *     &lt;enumeration value="portalRole"/>
 *     &lt;enumeration value="portalRoleSubordinates"/>
 *     &lt;enumeration value="allInternalUsers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessSubmitterType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ProcessSubmitterType {

    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("role")
    ROLE("role"),
    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("roleSubordinates")
    ROLE_SUBORDINATES("roleSubordinates"),
    @XmlEnumValue("roleSubordinatesInternal")
    ROLE_SUBORDINATES_INTERNAL("roleSubordinatesInternal"),
    @XmlEnumValue("owner")
    OWNER("owner"),
    @XmlEnumValue("creator")
    CREATOR("creator"),
    @XmlEnumValue("partnerUser")
    PARTNER_USER("partnerUser"),
    @XmlEnumValue("customerPortalUser")
    CUSTOMER_PORTAL_USER("customerPortalUser"),
    @XmlEnumValue("portalRole")
    PORTAL_ROLE("portalRole"),
    @XmlEnumValue("portalRoleSubordinates")
    PORTAL_ROLE_SUBORDINATES("portalRoleSubordinates"),
    @XmlEnumValue("allInternalUsers")
    ALL_INTERNAL_USERS("allInternalUsers");
    private final String value;

    ProcessSubmitterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessSubmitterType fromValue(String v) {
        for (ProcessSubmitterType c: ProcessSubmitterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
