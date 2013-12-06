
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalPrincipalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalPrincipalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anonymous"/>
 *     &lt;enumeration value="PerUser"/>
 *     &lt;enumeration value="NamedUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExternalPrincipalType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ExternalPrincipalType {

    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("PerUser")
    PER_USER("PerUser"),
    @XmlEnumValue("NamedUser")
    NAMED_USER("NamedUser");
    private final String value;

    ExternalPrincipalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalPrincipalType fromValue(String v) {
        for (ExternalPrincipalType c: ExternalPrincipalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
