
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionSetTabVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionSetTabVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Visible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissionSetTabVisibility", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum PermissionSetTabVisibility {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Visible")
    VISIBLE("Visible");
    private final String value;

    PermissionSetTabVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionSetTabVisibility fromValue(String v) {
        for (PermissionSetTabVisibility c: PermissionSetTabVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
