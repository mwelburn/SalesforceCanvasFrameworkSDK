
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MilestoneTypeRecurrenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MilestoneTypeRecurrenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="recursIndependently"/>
 *     &lt;enumeration value="recursChained"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MilestoneTypeRecurrenceType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum MilestoneTypeRecurrenceType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("recursIndependently")
    RECURS_INDEPENDENTLY("recursIndependently"),
    @XmlEnumValue("recursChained")
    RECURS_CHAINED("recursChained");
    private final String value;

    MilestoneTypeRecurrenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MilestoneTypeRecurrenceType fromValue(String v) {
        for (MilestoneTypeRecurrenceType c: MilestoneTypeRecurrenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
