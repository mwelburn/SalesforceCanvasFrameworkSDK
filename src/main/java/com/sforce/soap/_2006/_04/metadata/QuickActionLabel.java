
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionLabel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuickActionLabel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LogACall"/>
 *     &lt;enumeration value="LogANote"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="NewRecordType"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="NewChild"/>
 *     &lt;enumeration value="NewChildRecordType"/>
 *     &lt;enumeration value="CreateNew"/>
 *     &lt;enumeration value="CreateNewRecordType"/>
 *     &lt;enumeration value="QuickRecordType"/>
 *     &lt;enumeration value="Quick"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuickActionLabel", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum QuickActionLabel {

    @XmlEnumValue("LogACall")
    LOG_A_CALL("LogACall"),
    @XmlEnumValue("LogANote")
    LOG_A_NOTE("LogANote"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("NewRecordType")
    NEW_RECORD_TYPE("NewRecordType"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("NewChild")
    NEW_CHILD("NewChild"),
    @XmlEnumValue("NewChildRecordType")
    NEW_CHILD_RECORD_TYPE("NewChildRecordType"),
    @XmlEnumValue("CreateNew")
    CREATE_NEW("CreateNew"),
    @XmlEnumValue("CreateNewRecordType")
    CREATE_NEW_RECORD_TYPE("CreateNewRecordType"),
    @XmlEnumValue("QuickRecordType")
    QUICK_RECORD_TYPE("QuickRecordType"),
    @XmlEnumValue("Quick")
    QUICK("Quick");
    private final String value;

    QuickActionLabel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuickActionLabel fromValue(String v) {
        for (QuickActionLabel c: QuickActionLabel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
