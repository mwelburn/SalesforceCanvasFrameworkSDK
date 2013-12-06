
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Everything"/>
 *     &lt;enumeration value="Mine"/>
 *     &lt;enumeration value="Queue"/>
 *     &lt;enumeration value="Delegated"/>
 *     &lt;enumeration value="MyTerritory"/>
 *     &lt;enumeration value="MyTeamTerritory"/>
 *     &lt;enumeration value="Team"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterScope", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum FilterScope {

    @XmlEnumValue("Everything")
    EVERYTHING("Everything"),
    @XmlEnumValue("Mine")
    MINE("Mine"),
    @XmlEnumValue("Queue")
    QUEUE("Queue"),
    @XmlEnumValue("Delegated")
    DELEGATED("Delegated"),
    @XmlEnumValue("MyTerritory")
    MY_TERRITORY("MyTerritory"),
    @XmlEnumValue("MyTeamTerritory")
    MY_TEAM_TERRITORY("MyTeamTerritory"),
    @XmlEnumValue("Team")
    TEAM("Team");
    private final String value;

    FilterScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterScope fromValue(String v) {
        for (FilterScope c: FilterScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
