
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartLegendPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartLegendPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="OnChart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartLegendPosition", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartLegendPosition {

    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("OnChart")
    ON_CHART("OnChart");
    private final String value;

    ChartLegendPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartLegendPosition fromValue(String v) {
        for (ChartLegendPosition c: ChartLegendPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
