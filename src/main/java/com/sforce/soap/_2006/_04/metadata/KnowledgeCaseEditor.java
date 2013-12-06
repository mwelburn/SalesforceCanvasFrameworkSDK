
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeCaseEditor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KnowledgeCaseEditor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KnowledgeCaseEditor", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum KnowledgeCaseEditor {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("standard")
    STANDARD("standard");
    private final String value;

    KnowledgeCaseEditor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KnowledgeCaseEditor fromValue(String v) {
        for (KnowledgeCaseEditor c: KnowledgeCaseEditor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
