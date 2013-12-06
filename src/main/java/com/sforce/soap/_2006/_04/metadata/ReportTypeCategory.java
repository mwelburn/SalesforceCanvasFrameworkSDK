
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTypeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportTypeCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accounts"/>
 *     &lt;enumeration value="opportunities"/>
 *     &lt;enumeration value="forecasts"/>
 *     &lt;enumeration value="cases"/>
 *     &lt;enumeration value="leads"/>
 *     &lt;enumeration value="campaigns"/>
 *     &lt;enumeration value="activities"/>
 *     &lt;enumeration value="busop"/>
 *     &lt;enumeration value="products"/>
 *     &lt;enumeration value="admin"/>
 *     &lt;enumeration value="territory"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="content"/>
 *     &lt;enumeration value="usage_entitlement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportTypeCategory", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ReportTypeCategory {

    @XmlEnumValue("accounts")
    ACCOUNTS("accounts"),
    @XmlEnumValue("opportunities")
    OPPORTUNITIES("opportunities"),
    @XmlEnumValue("forecasts")
    FORECASTS("forecasts"),
    @XmlEnumValue("cases")
    CASES("cases"),
    @XmlEnumValue("leads")
    LEADS("leads"),
    @XmlEnumValue("campaigns")
    CAMPAIGNS("campaigns"),
    @XmlEnumValue("activities")
    ACTIVITIES("activities"),
    @XmlEnumValue("busop")
    BUSOP("busop"),
    @XmlEnumValue("products")
    PRODUCTS("products"),
    @XmlEnumValue("admin")
    ADMIN("admin"),
    @XmlEnumValue("territory")
    TERRITORY("territory"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("content")
    CONTENT("content"),
    @XmlEnumValue("usage_entitlement")
    USAGE_ENTITLEMENT("usage_entitlement");
    private final String value;

    ReportTypeCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportTypeCategory fromValue(String v) {
        for (ReportTypeCategory c: ReportTypeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
