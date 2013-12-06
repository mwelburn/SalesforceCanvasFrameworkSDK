
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailToCaseOnFailureActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailToCaseOnFailureActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bounce"/>
 *     &lt;enumeration value="Discard"/>
 *     &lt;enumeration value="Requeue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailToCaseOnFailureActionType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum EmailToCaseOnFailureActionType {

    @XmlEnumValue("Bounce")
    BOUNCE("Bounce"),
    @XmlEnumValue("Discard")
    DISCARD("Discard"),
    @XmlEnumValue("Requeue")
    REQUEUE("Requeue");
    private final String value;

    EmailToCaseOnFailureActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailToCaseOnFailureActionType fromValue(String v) {
        for (EmailToCaseOnFailureActionType c: EmailToCaseOnFailureActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
