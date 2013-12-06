
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButtonRoutingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveChatButtonRoutingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Choice"/>
 *     &lt;enumeration value="LeastActive"/>
 *     &lt;enumeration value="MostAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveChatButtonRoutingType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LiveChatButtonRoutingType {

    @XmlEnumValue("Choice")
    CHOICE("Choice"),
    @XmlEnumValue("LeastActive")
    LEAST_ACTIVE("LeastActive"),
    @XmlEnumValue("MostAvailable")
    MOST_AVAILABLE("MostAvailable");
    private final String value;

    LiveChatButtonRoutingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiveChatButtonRoutingType fromValue(String v) {
        for (LiveChatButtonRoutingType c: LiveChatButtonRoutingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
