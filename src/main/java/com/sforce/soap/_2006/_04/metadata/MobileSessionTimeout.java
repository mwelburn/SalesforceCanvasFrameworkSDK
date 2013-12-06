
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileSessionTimeout.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileSessionTimeout">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="OneMinute"/>
 *     &lt;enumeration value="FiveMinutes"/>
 *     &lt;enumeration value="TenMinutes"/>
 *     &lt;enumeration value="ThirtyMinutes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileSessionTimeout", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum MobileSessionTimeout {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("OneMinute")
    ONE_MINUTE("OneMinute"),
    @XmlEnumValue("FiveMinutes")
    FIVE_MINUTES("FiveMinutes"),
    @XmlEnumValue("TenMinutes")
    TEN_MINUTES("TenMinutes"),
    @XmlEnumValue("ThirtyMinutes")
    THIRTY_MINUTES("ThirtyMinutes");
    private final String value;

    MobileSessionTimeout(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileSessionTimeout fromValue(String v) {
        for (MobileSessionTimeout c: MobileSessionTimeout.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
