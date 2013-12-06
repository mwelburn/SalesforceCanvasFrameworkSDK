
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaxLoginAttempts.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaxLoginAttempts">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ThreeAttempts"/>
 *     &lt;enumeration value="FiveAttempts"/>
 *     &lt;enumeration value="TenAttempts"/>
 *     &lt;enumeration value="NoLimit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaxLoginAttempts", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum MaxLoginAttempts {

    @XmlEnumValue("ThreeAttempts")
    THREE_ATTEMPTS("ThreeAttempts"),
    @XmlEnumValue("FiveAttempts")
    FIVE_ATTEMPTS("FiveAttempts"),
    @XmlEnumValue("TenAttempts")
    TEN_ATTEMPTS("TenAttempts"),
    @XmlEnumValue("NoLimit")
    NO_LIMIT("NoLimit");
    private final String value;

    MaxLoginAttempts(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaxLoginAttempts fromValue(String v) {
        for (MaxLoginAttempts c: MaxLoginAttempts.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
