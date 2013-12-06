
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageComponentWidth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageComponentWidth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="narrow"/>
 *     &lt;enumeration value="wide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageComponentWidth", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum PageComponentWidth {

    @XmlEnumValue("narrow")
    NARROW("narrow"),
    @XmlEnumValue("wide")
    WIDE("wide");
    private final String value;

    PageComponentWidth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageComponentWidth fromValue(String v) {
        for (PageComponentWidth c: PageComponentWidth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
