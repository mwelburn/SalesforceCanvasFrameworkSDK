
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHART_TOP"/>
 *     &lt;enumeration value="CHART_BOTTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartPosition", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartPosition {

    CHART_TOP,
    CHART_BOTTOM;

    public String value() {
        return name();
    }

    public static ChartPosition fromValue(String v) {
        return valueOf(v);
    }

}
