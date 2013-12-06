
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteRedirect.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRedirect">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="Temporary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteRedirect", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SiteRedirect {

    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary");
    private final String value;

    SiteRedirect(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteRedirect fromValue(String v) {
        for (SiteRedirect c: SiteRedirect.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
