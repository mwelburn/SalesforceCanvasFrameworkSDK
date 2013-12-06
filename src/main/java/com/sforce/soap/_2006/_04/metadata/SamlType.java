
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAML1_1"/>
 *     &lt;enumeration value="SAML2_0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamlType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SamlType {

    @XmlEnumValue("SAML1_1")
    SAML_1_1("SAML1_1"),
    @XmlEnumValue("SAML2_0")
    SAML_2_0("SAML2_0");
    private final String value;

    SamlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamlType fromValue(String v) {
        for (SamlType c: SamlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
