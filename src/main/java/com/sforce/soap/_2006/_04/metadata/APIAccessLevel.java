
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APIAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unrestricted"/>
 *     &lt;enumeration value="Restricted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIAccessLevel", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum APIAccessLevel {

    @XmlEnumValue("Unrestricted")
    UNRESTRICTED("Unrestricted"),
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted");
    private final String value;

    APIAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APIAccessLevel fromValue(String v) {
        for (APIAccessLevel c: APIAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
