
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareAccessLevelReadEdit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareAccessLevelReadEdit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Edit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareAccessLevelReadEdit", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ShareAccessLevelReadEdit {

    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Edit")
    EDIT("Edit");
    private final String value;

    ShareAccessLevelReadEdit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareAccessLevelReadEdit fromValue(String v) {
        for (ShareAccessLevelReadEdit c: ShareAccessLevelReadEdit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
