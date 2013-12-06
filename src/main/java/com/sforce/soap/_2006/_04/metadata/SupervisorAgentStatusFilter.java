
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupervisorAgentStatusFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupervisorAgentStatusFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="Away"/>
 *     &lt;enumeration value="Offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupervisorAgentStatusFilter", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SupervisorAgentStatusFilter {

    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Away")
    AWAY("Away"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline");
    private final String value;

    SupervisorAgentStatusFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupervisorAgentStatusFilter fromValue(String v) {
        for (SupervisorAgentStatusFilter c: SupervisorAgentStatusFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
