
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareAccessLevelNoNone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareAccessLevelNoNone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Edit"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareAccessLevelNoNone", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ShareAccessLevelNoNone {

    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ShareAccessLevelNoNone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareAccessLevelNoNone fromValue(String v) {
        for (ShareAccessLevelNoNone c: ShareAccessLevelNoNone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
