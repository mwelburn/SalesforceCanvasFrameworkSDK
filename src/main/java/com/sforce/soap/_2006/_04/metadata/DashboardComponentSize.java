
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardComponentSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DashboardComponentSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Narrow"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Wide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DashboardComponentSize", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DashboardComponentSize {

    @XmlEnumValue("Narrow")
    NARROW("Narrow"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Wide")
    WIDE("Wide");
    private final String value;

    DashboardComponentSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardComponentSize fromValue(String v) {
        for (DashboardComponentSize c: DashboardComponentSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
