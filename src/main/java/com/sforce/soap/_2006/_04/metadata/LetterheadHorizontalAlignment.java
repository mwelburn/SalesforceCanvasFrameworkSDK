
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterheadHorizontalAlignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LetterheadHorizontalAlignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Right"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LetterheadHorizontalAlignment", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LetterheadHorizontalAlignment {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right");
    private final String value;

    LetterheadHorizontalAlignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LetterheadHorizontalAlignment fromValue(String v) {
        for (LetterheadHorizontalAlignment c: LetterheadHorizontalAlignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
