
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDateGranularity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDateGranularity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="FiscalQuarter"/>
 *     &lt;enumeration value="FiscalYear"/>
 *     &lt;enumeration value="MonthInYear"/>
 *     &lt;enumeration value="DayInMonth"/>
 *     &lt;enumeration value="FiscalPeriod"/>
 *     &lt;enumeration value="FiscalWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDateGranularity", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum UserDateGranularity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("FiscalQuarter")
    FISCAL_QUARTER("FiscalQuarter"),
    @XmlEnumValue("FiscalYear")
    FISCAL_YEAR("FiscalYear"),
    @XmlEnumValue("MonthInYear")
    MONTH_IN_YEAR("MonthInYear"),
    @XmlEnumValue("DayInMonth")
    DAY_IN_MONTH("DayInMonth"),
    @XmlEnumValue("FiscalPeriod")
    FISCAL_PERIOD("FiscalPeriod"),
    @XmlEnumValue("FiscalWeek")
    FISCAL_WEEK("FiscalWeek");
    private final String value;

    UserDateGranularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDateGranularity fromValue(String v) {
        for (UserDateGranularity c: UserDateGranularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
