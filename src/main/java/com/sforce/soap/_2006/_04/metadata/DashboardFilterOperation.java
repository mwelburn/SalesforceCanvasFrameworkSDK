
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardFilterOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DashboardFilterOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="notEqual"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessOrEqual"/>
 *     &lt;enumeration value="greaterOrEqual"/>
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="notContain"/>
 *     &lt;enumeration value="startsWith"/>
 *     &lt;enumeration value="includes"/>
 *     &lt;enumeration value="excludes"/>
 *     &lt;enumeration value="between"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DashboardFilterOperation", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DashboardFilterOperation {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("notEqual")
    NOT_EQUAL("notEqual"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("lessOrEqual")
    LESS_OR_EQUAL("lessOrEqual"),
    @XmlEnumValue("greaterOrEqual")
    GREATER_OR_EQUAL("greaterOrEqual"),
    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("notContain")
    NOT_CONTAIN("notContain"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith"),
    @XmlEnumValue("includes")
    INCLUDES("includes"),
    @XmlEnumValue("excludes")
    EXCLUDES("excludes"),
    @XmlEnumValue("between")
    BETWEEN("between");
    private final String value;

    DashboardFilterOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardFilterOperation fromValue(String v) {
        for (DashboardFilterOperation c: DashboardFilterOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
