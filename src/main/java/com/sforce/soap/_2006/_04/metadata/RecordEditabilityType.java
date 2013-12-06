
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordEditabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordEditabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdminOnly"/>
 *     &lt;enumeration value="AdminOrCurrentApprover"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordEditabilityType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum RecordEditabilityType {

    @XmlEnumValue("AdminOnly")
    ADMIN_ONLY("AdminOnly"),
    @XmlEnumValue("AdminOrCurrentApprover")
    ADMIN_OR_CURRENT_APPROVER("AdminOrCurrentApprover");
    private final String value;

    RecordEditabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordEditabilityType fromValue(String v) {
        for (RecordEditabilityType c: RecordEditabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
