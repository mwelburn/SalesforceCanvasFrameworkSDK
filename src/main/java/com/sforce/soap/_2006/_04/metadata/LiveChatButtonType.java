
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButtonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveChatButtonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Invite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveChatButtonType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LiveChatButtonType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Invite")
    INVITE("Invite");
    private final String value;

    LiveChatButtonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiveChatButtonType fromValue(String v) {
        for (LiveChatButtonType c: LiveChatButtonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
