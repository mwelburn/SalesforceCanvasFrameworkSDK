
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustomerSuccess"/>
 *     &lt;enumeration value="Partner"/>
 *     &lt;enumeration value="Network"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortalType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum PortalType {

    @XmlEnumValue("CustomerSuccess")
    CUSTOMER_SUCCESS("CustomerSuccess"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("Network")
    NETWORK("Network");
    private final String value;

    PortalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortalType fromValue(String v) {
        for (PortalType c: PortalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
