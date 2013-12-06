
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeLanguageLookupValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KnowledgeLanguageLookupValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Queue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KnowledgeLanguageLookupValueType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum KnowledgeLanguageLookupValueType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Queue")
    QUEUE("Queue");
    private final String value;

    KnowledgeLanguageLookupValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KnowledgeLanguageLookupValueType fromValue(String v) {
        for (KnowledgeLanguageLookupValueType c: KnowledgeLanguageLookupValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
