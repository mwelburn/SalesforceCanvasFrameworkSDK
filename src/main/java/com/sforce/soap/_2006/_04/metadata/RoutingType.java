
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unanimous"/>
 *     &lt;enumeration value="FirstResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoutingType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum RoutingType {

    @XmlEnumValue("Unanimous")
    UNANIMOUS("Unanimous"),
    @XmlEnumValue("FirstResponse")
    FIRST_RESPONSE("FirstResponse");
    private final String value;

    RoutingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingType fromValue(String v) {
        for (RoutingType c: RoutingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
