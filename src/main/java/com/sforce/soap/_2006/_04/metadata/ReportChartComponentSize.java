
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChartComponentSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportChartComponentSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMALL"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="LARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportChartComponentSize", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportChartComponentSize {

    SMALL,
    MEDIUM,
    LARGE;

    public String value() {
        return name();
    }

    public static ReportChartComponentSize fromValue(String v) {
        return valueOf(v);
    }

}
