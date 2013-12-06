
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreatBlanksAs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TreatBlanksAs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BlankAsBlank"/>
 *     &lt;enumeration value="BlankAsZero"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TreatBlanksAs", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum TreatBlanksAs {

    @XmlEnumValue("BlankAsBlank")
    BLANK_AS_BLANK("BlankAsBlank"),
    @XmlEnumValue("BlankAsZero")
    BLANK_AS_ZERO("BlankAsZero");
    private final String value;

    TreatBlanksAs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreatBlanksAs fromValue(String v) {
        for (TreatBlanksAs c: TreatBlanksAs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
