
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoAuthentication"/>
 *     &lt;enumeration value="Oauth"/>
 *     &lt;enumeration value="Password"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationProtocol", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum AuthenticationProtocol {

    @XmlEnumValue("NoAuthentication")
    NO_AUTHENTICATION("NoAuthentication"),
    @XmlEnumValue("Oauth")
    OAUTH("Oauth"),
    @XmlEnumValue("Password")
    PASSWORD("Password");
    private final String value;

    AuthenticationProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationProtocol fromValue(String v) {
        for (AuthenticationProtocol c: AuthenticationProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
