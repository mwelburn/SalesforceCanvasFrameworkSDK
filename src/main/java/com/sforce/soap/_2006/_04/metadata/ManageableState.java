
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageableState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManageableState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="released"/>
 *     &lt;enumeration value="deleted"/>
 *     &lt;enumeration value="deprecated"/>
 *     &lt;enumeration value="installed"/>
 *     &lt;enumeration value="beta"/>
 *     &lt;enumeration value="unmanaged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManageableState", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ManageableState {

    @XmlEnumValue("released")
    RELEASED("released"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("deprecated")
    DEPRECATED("deprecated"),
    @XmlEnumValue("installed")
    INSTALLED("installed"),
    @XmlEnumValue("beta")
    BETA("beta"),
    @XmlEnumValue("unmanaged")
    UNMANAGED("unmanaged");
    private final String value;

    ManageableState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManageableState fromValue(String v) {
        for (ManageableState c: ManageableState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
