
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareAccessLevelNoAll.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareAccessLevelNoAll">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Edit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareAccessLevelNoAll", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ShareAccessLevelNoAll {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Edit")
    EDIT("Edit");
    private final String value;

    ShareAccessLevelNoAll(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareAccessLevelNoAll fromValue(String v) {
        for (ShareAccessLevelNoAll c: ShareAccessLevelNoAll.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
