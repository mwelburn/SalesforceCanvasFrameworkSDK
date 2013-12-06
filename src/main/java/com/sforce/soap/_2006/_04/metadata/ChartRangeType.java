
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartRangeType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartRangeType {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    ChartRangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartRangeType fromValue(String v) {
        for (ChartRangeType c: ChartRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
