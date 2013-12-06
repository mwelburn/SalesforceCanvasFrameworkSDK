
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Template.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Template">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Page"/>
 *     &lt;enumeration value="Tab"/>
 *     &lt;enumeration value="Toc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Template", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum Template {

    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Tab")
    TAB("Tab"),
    @XmlEnumValue("Toc")
    TOC("Toc");
    private final String value;

    Template(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Template fromValue(String v) {
        for (Template c: Template.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
