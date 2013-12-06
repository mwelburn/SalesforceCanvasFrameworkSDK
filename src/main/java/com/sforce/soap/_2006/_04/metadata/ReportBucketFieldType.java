
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportBucketFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportBucketFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="picklist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportBucketFieldType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportBucketFieldType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("number")
    NUMBER("number"),
    @XmlEnumValue("picklist")
    PICKLIST("picklist");
    private final String value;

    ReportBucketFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportBucketFieldType fromValue(String v) {
        for (ReportBucketFieldType c: ReportBucketFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
