
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaticResourceCacheControl.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StaticResourceCacheControl">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Public"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaticResourceCacheControl", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum StaticResourceCacheControl {

    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    StaticResourceCacheControl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StaticResourceCacheControl fromValue(String v) {
        for (StaticResourceCacheControl c: StaticResourceCacheControl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
