
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Hundreds"/>
 *     &lt;enumeration value="Thousands"/>
 *     &lt;enumeration value="Millions"/>
 *     &lt;enumeration value="Billions"/>
 *     &lt;enumeration value="Trillions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartUnits", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartUnits {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Hundreds")
    HUNDREDS("Hundreds"),
    @XmlEnumValue("Thousands")
    THOUSANDS("Thousands"),
    @XmlEnumValue("Millions")
    MILLIONS("Millions"),
    @XmlEnumValue("Billions")
    BILLIONS("Billions"),
    @XmlEnumValue("Trillions")
    TRILLIONS("Trillions");
    private final String value;

    ChartUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartUnits fromValue(String v) {
        for (ChartUnits c: ChartUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
