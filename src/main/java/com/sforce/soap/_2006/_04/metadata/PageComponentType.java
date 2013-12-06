
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="links"/>
 *     &lt;enumeration value="htmlArea"/>
 *     &lt;enumeration value="imageOrNote"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageComponentType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum PageComponentType {

    @XmlEnumValue("links")
    LINKS("links"),
    @XmlEnumValue("htmlArea")
    HTML_AREA("htmlArea"),
    @XmlEnumValue("imageOrNote")
    IMAGE_OR_NOTE("imageOrNote");
    private final String value;

    PageComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageComponentType fromValue(String v) {
        for (PageComponentType c: PageComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
