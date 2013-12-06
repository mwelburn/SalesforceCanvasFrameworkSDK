
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinPasswordLength.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinPasswordLength">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FiveCharacters"/>
 *     &lt;enumeration value="EightCharacters"/>
 *     &lt;enumeration value="TenCharacters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinPasswordLength", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum MinPasswordLength {

    @XmlEnumValue("FiveCharacters")
    FIVE_CHARACTERS("FiveCharacters"),
    @XmlEnumValue("EightCharacters")
    EIGHT_CHARACTERS("EightCharacters"),
    @XmlEnumValue("TenCharacters")
    TEN_CHARACTERS("TenCharacters");
    private final String value;

    MinPasswordLength(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MinPasswordLength fromValue(String v) {
        for (MinPasswordLength c: MinPasswordLength.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
