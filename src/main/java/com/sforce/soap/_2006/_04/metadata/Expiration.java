
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Expiration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Expiration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ThirtyDays"/>
 *     &lt;enumeration value="SixtyDays"/>
 *     &lt;enumeration value="NinetyDays"/>
 *     &lt;enumeration value="SixMonths"/>
 *     &lt;enumeration value="OneYear"/>
 *     &lt;enumeration value="Never"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Expiration", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum Expiration {

    @XmlEnumValue("ThirtyDays")
    THIRTY_DAYS("ThirtyDays"),
    @XmlEnumValue("SixtyDays")
    SIXTY_DAYS("SixtyDays"),
    @XmlEnumValue("NinetyDays")
    NINETY_DAYS("NinetyDays"),
    @XmlEnumValue("SixMonths")
    SIX_MONTHS("SixMonths"),
    @XmlEnumValue("OneYear")
    ONE_YEAR("OneYear"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    Expiration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Expiration fromValue(String v) {
        for (Expiration c: Expiration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
