
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportBucketFieldNullTreatment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportBucketFieldNullTreatment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportBucketFieldNullTreatment", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportBucketFieldNullTreatment {

    @XmlEnumValue("n")
    N("n"),
    @XmlEnumValue("z")
    Z("z");
    private final String value;

    ReportBucketFieldNullTreatment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportBucketFieldNullTreatment fromValue(String v) {
        for (ReportBucketFieldNullTreatment c: ReportBucketFieldNullTreatment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
