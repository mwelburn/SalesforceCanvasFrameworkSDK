
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookupValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LookupValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Queue"/>
 *     &lt;enumeration value="RecordType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LookupValueType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LookupValueType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Queue")
    QUEUE("Queue"),
    @XmlEnumValue("RecordType")
    RECORD_TYPE("RecordType");
    private final String value;

    LookupValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LookupValueType fromValue(String v) {
        for (LookupValueType c: LookupValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
