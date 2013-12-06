
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthProviderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthProviderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="Janrain"/>
 *     &lt;enumeration value="Salesforce"/>
 *     &lt;enumeration value="OpenIdConnect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthProviderType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum AuthProviderType {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Janrain")
    JANRAIN("Janrain"),
    @XmlEnumValue("Salesforce")
    SALESFORCE("Salesforce"),
    @XmlEnumValue("OpenIdConnect")
    OPEN_ID_CONNECT("OpenIdConnect");
    private final String value;

    AuthProviderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthProviderType fromValue(String v) {
        for (AuthProviderType c: AuthProviderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
