
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionTimeout.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionTimeout">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TwelveHours"/>
 *     &lt;enumeration value="EightHours"/>
 *     &lt;enumeration value="FourHours"/>
 *     &lt;enumeration value="TwoHours"/>
 *     &lt;enumeration value="SixtyMinutes"/>
 *     &lt;enumeration value="ThirtyMinutes"/>
 *     &lt;enumeration value="FifteenMinutes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionTimeout", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SessionTimeout {

    @XmlEnumValue("TwelveHours")
    TWELVE_HOURS("TwelveHours"),
    @XmlEnumValue("EightHours")
    EIGHT_HOURS("EightHours"),
    @XmlEnumValue("FourHours")
    FOUR_HOURS("FourHours"),
    @XmlEnumValue("TwoHours")
    TWO_HOURS("TwoHours"),
    @XmlEnumValue("SixtyMinutes")
    SIXTY_MINUTES("SixtyMinutes"),
    @XmlEnumValue("ThirtyMinutes")
    THIRTY_MINUTES("ThirtyMinutes"),
    @XmlEnumValue("FifteenMinutes")
    FIFTEEN_MINUTES("FifteenMinutes");
    private final String value;

    SessionTimeout(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionTimeout fromValue(String v) {
        for (SessionTimeout c: SessionTimeout.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
