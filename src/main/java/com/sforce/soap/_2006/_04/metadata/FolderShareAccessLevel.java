
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderShareAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FolderShareAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="View"/>
 *     &lt;enumeration value="EditAllContents"/>
 *     &lt;enumeration value="Manage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FolderShareAccessLevel", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum FolderShareAccessLevel {

    @XmlEnumValue("View")
    VIEW("View"),
    @XmlEnumValue("EditAllContents")
    EDIT_ALL_CONTENTS("EditAllContents"),
    @XmlEnumValue("Manage")
    MANAGE("Manage");
    private final String value;

    FolderShareAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FolderShareAccessLevel fromValue(String v) {
        for (FolderShareAccessLevel c: FolderShareAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
