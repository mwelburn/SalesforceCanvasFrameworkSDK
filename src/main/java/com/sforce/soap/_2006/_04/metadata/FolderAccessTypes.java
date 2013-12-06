
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderAccessTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FolderAccessTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Shared"/>
 *     &lt;enumeration value="Public"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="PublicInternal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FolderAccessTypes", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum FolderAccessTypes {

    @XmlEnumValue("Shared")
    SHARED("Shared"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("PublicInternal")
    PUBLIC_INTERNAL("PublicInternal");
    private final String value;

    FolderAccessTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FolderAccessTypes fromValue(String v) {
        for (FolderAccessTypes c: FolderAccessTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
