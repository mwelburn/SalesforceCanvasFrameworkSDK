
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Siteforce"/>
 *     &lt;enumeration value="Visualforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SiteType {

    @XmlEnumValue("Siteforce")
    SITEFORCE("Siteforce"),
    @XmlEnumValue("Visualforce")
    VISUALFORCE("Visualforce");
    private final String value;

    SiteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteType fromValue(String v) {
        for (SiteType c: SiteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
