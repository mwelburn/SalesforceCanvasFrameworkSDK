
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportSummaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportSummaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sum"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportSummaryType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportSummaryType {

    @XmlEnumValue("Sum")
    SUM("Sum"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    ReportSummaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportSummaryType fromValue(String v) {
        for (ReportSummaryType c: ReportSummaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
