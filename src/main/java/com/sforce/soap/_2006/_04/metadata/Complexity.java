
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Complexity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Complexity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoRestriction"/>
 *     &lt;enumeration value="AlphaNumeric"/>
 *     &lt;enumeration value="SpecialCharacters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Complexity", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum Complexity {

    @XmlEnumValue("NoRestriction")
    NO_RESTRICTION("NoRestriction"),
    @XmlEnumValue("AlphaNumeric")
    ALPHA_NUMERIC("AlphaNumeric"),
    @XmlEnumValue("SpecialCharacters")
    SPECIAL_CHARACTERS("SpecialCharacters");
    private final String value;

    Complexity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Complexity fromValue(String v) {
        for (Complexity c: Complexity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
