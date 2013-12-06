
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlNameIdFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamlNameIdFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="Persistent"/>
 *     &lt;enumeration value="Transient"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamlNameIdFormatType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SamlNameIdFormatType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("Persistent")
    PERSISTENT("Persistent"),
    @XmlEnumValue("Transient")
    TRANSIENT("Transient");
    private final String value;

    SamlNameIdFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamlNameIdFormatType fromValue(String v) {
        for (SamlNameIdFormatType c: SamlNameIdFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
