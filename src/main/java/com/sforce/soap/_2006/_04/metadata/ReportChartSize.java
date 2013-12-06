
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChartSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportChartSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Tiny"/>
 *     &lt;enumeration value="Small"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Large"/>
 *     &lt;enumeration value="Huge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportChartSize", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportChartSize {

    @XmlEnumValue("Tiny")
    TINY("Tiny"),
    @XmlEnumValue("Small")
    SMALL("Small"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Large")
    LARGE("Large"),
    @XmlEnumValue("Huge")
    HUGE("Huge");
    private final String value;

    ReportChartSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportChartSize fromValue(String v) {
        for (ReportChartSize c: ReportChartSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
