
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextOwnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NextOwnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adhoc"/>
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="userHierarchyField"/>
 *     &lt;enumeration value="relatedUserField"/>
 *     &lt;enumeration value="queue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NextOwnerType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum NextOwnerType {

    @XmlEnumValue("adhoc")
    ADHOC("adhoc"),
    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("userHierarchyField")
    USER_HIERARCHY_FIELD("userHierarchyField"),
    @XmlEnumValue("relatedUserField")
    RELATED_USER_FIELD("relatedUserField"),
    @XmlEnumValue("queue")
    QUEUE("queue");
    private final String value;

    NextOwnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NextOwnerType fromValue(String v) {
        for (NextOwnerType c: NextOwnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
