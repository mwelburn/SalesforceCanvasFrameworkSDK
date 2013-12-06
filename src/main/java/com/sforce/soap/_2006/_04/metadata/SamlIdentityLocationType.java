
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlIdentityLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamlIdentityLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SubjectNameId"/>
 *     &lt;enumeration value="Attribute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamlIdentityLocationType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SamlIdentityLocationType {

    @XmlEnumValue("SubjectNameId")
    SUBJECT_NAME_ID("SubjectNameId"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute");
    private final String value;

    SamlIdentityLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamlIdentityLocationType fromValue(String v) {
        for (SamlIdentityLocationType c: SamlIdentityLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
