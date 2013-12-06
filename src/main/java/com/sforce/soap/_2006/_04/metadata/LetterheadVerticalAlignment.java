
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterheadVerticalAlignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LetterheadVerticalAlignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Top"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Bottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LetterheadVerticalAlignment", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LetterheadVerticalAlignment {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Top")
    TOP("Top"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom");
    private final String value;

    LetterheadVerticalAlignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LetterheadVerticalAlignment fromValue(String v) {
        for (LetterheadVerticalAlignment c: LetterheadVerticalAlignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
