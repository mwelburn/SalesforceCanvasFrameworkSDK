
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderSharedToType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FolderSharedToType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Role"/>
 *     &lt;enumeration value="RoleAndSubordinates"/>
 *     &lt;enumeration value="RoleAndSubordinatesInternal"/>
 *     &lt;enumeration value="Manager"/>
 *     &lt;enumeration value="ManagerAndSubordinatesInternal"/>
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Territory"/>
 *     &lt;enumeration value="TerritoryAndSubordinates"/>
 *     &lt;enumeration value="AllPrmUsers"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="PartnerUser"/>
 *     &lt;enumeration value="AllCspUsers"/>
 *     &lt;enumeration value="CustomerPortalUser"/>
 *     &lt;enumeration value="PortalRole"/>
 *     &lt;enumeration value="PortalRoleAndSubordinates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FolderSharedToType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum FolderSharedToType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("RoleAndSubordinates")
    ROLE_AND_SUBORDINATES("RoleAndSubordinates"),
    @XmlEnumValue("RoleAndSubordinatesInternal")
    ROLE_AND_SUBORDINATES_INTERNAL("RoleAndSubordinatesInternal"),
    @XmlEnumValue("Manager")
    MANAGER("Manager"),
    @XmlEnumValue("ManagerAndSubordinatesInternal")
    MANAGER_AND_SUBORDINATES_INTERNAL("ManagerAndSubordinatesInternal"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Territory")
    TERRITORY("Territory"),
    @XmlEnumValue("TerritoryAndSubordinates")
    TERRITORY_AND_SUBORDINATES("TerritoryAndSubordinates"),
    @XmlEnumValue("AllPrmUsers")
    ALL_PRM_USERS("AllPrmUsers"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("PartnerUser")
    PARTNER_USER("PartnerUser"),
    @XmlEnumValue("AllCspUsers")
    ALL_CSP_USERS("AllCspUsers"),
    @XmlEnumValue("CustomerPortalUser")
    CUSTOMER_PORTAL_USER("CustomerPortalUser"),
    @XmlEnumValue("PortalRole")
    PORTAL_ROLE("PortalRole"),
    @XmlEnumValue("PortalRoleAndSubordinates")
    PORTAL_ROLE_AND_SUBORDINATES("PortalRoleAndSubordinates");
    private final String value;

    FolderSharedToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FolderSharedToType fromValue(String v) {
        for (FolderSharedToType c: FolderSharedToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
