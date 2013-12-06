
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DashboardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SpecifiedUser"/>
 *     &lt;enumeration value="LoggedInUser"/>
 *     &lt;enumeration value="MyTeamUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DashboardType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DashboardType {

    @XmlEnumValue("SpecifiedUser")
    SPECIFIED_USER("SpecifiedUser"),
    @XmlEnumValue("LoggedInUser")
    LOGGED_IN_USER("LoggedInUser"),
    @XmlEnumValue("MyTeamUser")
    MY_TEAM_USER("MyTeamUser");
    private final String value;

    DashboardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardType fromValue(String v) {
        for (DashboardType c: DashboardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
