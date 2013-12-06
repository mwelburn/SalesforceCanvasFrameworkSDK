
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Get"/>
 *     &lt;enumeration value="Post"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessMethod", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum AccessMethod {

    @XmlEnumValue("Get")
    GET("Get"),
    @XmlEnumValue("Post")
    POST("Post");
    private final String value;

    AccessMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessMethod fromValue(String v) {
        for (AccessMethod c: AccessMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
