
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DoesNotContainPassword"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuestionRestriction", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum QuestionRestriction {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DoesNotContainPassword")
    DOES_NOT_CONTAIN_PASSWORD("DoesNotContainPassword");
    private final String value;

    QuestionRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionRestriction fromValue(String v) {
        for (QuestionRestriction c: QuestionRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
