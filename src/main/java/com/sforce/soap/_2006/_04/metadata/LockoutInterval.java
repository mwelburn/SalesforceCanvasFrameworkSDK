
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockoutInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockoutInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FifteenMinutes"/>
 *     &lt;enumeration value="ThirtyMinutes"/>
 *     &lt;enumeration value="SixtyMinutes"/>
 *     &lt;enumeration value="Forever"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockoutInterval", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LockoutInterval {

    @XmlEnumValue("FifteenMinutes")
    FIFTEEN_MINUTES("FifteenMinutes"),
    @XmlEnumValue("ThirtyMinutes")
    THIRTY_MINUTES("ThirtyMinutes"),
    @XmlEnumValue("SixtyMinutes")
    SIXTY_MINUTES("SixtyMinutes"),
    @XmlEnumValue("Forever")
    FOREVER("Forever");
    private final String value;

    LockoutInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LockoutInterval fromValue(String v) {
        for (LockoutInterval c: LockoutInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
