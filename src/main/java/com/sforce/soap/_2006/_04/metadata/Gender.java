
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Neuter"/>
 *     &lt;enumeration value="Masculine"/>
 *     &lt;enumeration value="Feminine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum Gender {

    @XmlEnumValue("Neuter")
    NEUTER("Neuter"),
    @XmlEnumValue("Masculine")
    MASCULINE("Masculine"),
    @XmlEnumValue("Feminine")
    FEMININE("Feminine");
    private final String value;

    Gender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Gender fromValue(String v) {
        for (Gender c: Gender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
