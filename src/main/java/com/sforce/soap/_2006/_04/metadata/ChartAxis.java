
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartAxis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartAxis">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="x"/>
 *     &lt;enumeration value="y"/>
 *     &lt;enumeration value="y2"/>
 *     &lt;enumeration value="r"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartAxis", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartAxis {

    @XmlEnumValue("x")
    X("x"),
    @XmlEnumValue("y")
    Y("y"),
    @XmlEnumValue("y2")
    Y_2("y2"),
    @XmlEnumValue("r")
    R("r");
    private final String value;

    ChartAxis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartAxis fromValue(String v) {
        for (ChartAxis c: ChartAxis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
