
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortalRoles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortalRoles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Executive"/>
 *     &lt;enumeration value="Manager"/>
 *     &lt;enumeration value="Worker"/>
 *     &lt;enumeration value="PersonAccount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortalRoles", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum PortalRoles {

    @XmlEnumValue("Executive")
    EXECUTIVE("Executive"),
    @XmlEnumValue("Manager")
    MANAGER("Manager"),
    @XmlEnumValue("Worker")
    WORKER("Worker"),
    @XmlEnumValue("PersonAccount")
    PERSON_ACCOUNT("PersonAccount");
    private final String value;

    PortalRoles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortalRoles fromValue(String v) {
        for (PortalRoles c: PortalRoles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
