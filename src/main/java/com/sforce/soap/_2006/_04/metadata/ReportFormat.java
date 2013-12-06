
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MultiBlock"/>
 *     &lt;enumeration value="Matrix"/>
 *     &lt;enumeration value="Summary"/>
 *     &lt;enumeration value="Tabular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportFormat", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportFormat {

    @XmlEnumValue("MultiBlock")
    MULTI_BLOCK("MultiBlock"),
    @XmlEnumValue("Matrix")
    MATRIX("Matrix"),
    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Tabular")
    TABULAR("Tabular");
    private final String value;

    ReportFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportFormat fromValue(String v) {
        for (ReportFormat c: ReportFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
