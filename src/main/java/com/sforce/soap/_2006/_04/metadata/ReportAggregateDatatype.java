
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportAggregateDatatype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportAggregateDatatype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="currency"/>
 *     &lt;enumeration value="percent"/>
 *     &lt;enumeration value="number"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportAggregateDatatype", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportAggregateDatatype {

    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("percent")
    PERCENT("percent"),
    @XmlEnumValue("number")
    NUMBER("number");
    private final String value;

    ReportAggregateDatatype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportAggregateDatatype fromValue(String v) {
        for (ReportAggregateDatatype c: ReportAggregateDatatype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
