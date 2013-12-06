
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedAppOauthAccessScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectedAppOauthAccessScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Api"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Chatter"/>
 *     &lt;enumeration value="CustomApplications"/>
 *     &lt;enumeration value="RefreshToken"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectedAppOauthAccessScope", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ConnectedAppOauthAccessScope {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Api")
    API("Api"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Chatter")
    CHATTER("Chatter"),
    @XmlEnumValue("CustomApplications")
    CUSTOM_APPLICATIONS("CustomApplications"),
    @XmlEnumValue("RefreshToken")
    REFRESH_TOKEN("RefreshToken");
    private final String value;

    ConnectedAppOauthAccessScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectedAppOauthAccessScope fromValue(String v) {
        for (ConnectedAppOauthAccessScope c: ConnectedAppOauthAccessScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
