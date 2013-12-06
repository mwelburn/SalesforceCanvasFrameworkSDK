
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportJobSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportJobSourceTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tabular"/>
 *     &lt;enumeration value="summary"/>
 *     &lt;enumeration value="snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportJobSourceTypes", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportJobSourceTypes {

    @XmlEnumValue("tabular")
    TABULAR("tabular"),
    @XmlEnumValue("summary")
    SUMMARY("summary"),
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot");
    private final String value;

    ReportJobSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportJobSourceTypes fromValue(String v) {
        for (ReportJobSourceTypes c: ReportJobSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
