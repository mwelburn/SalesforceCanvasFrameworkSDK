
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SControlContentSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SControlContentSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="Snippet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SControlContentSource", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum SControlContentSource {

    HTML("HTML"),
    URL("URL"),
    @XmlEnumValue("Snippet")
    SNIPPET("Snippet");
    private final String value;

    SControlContentSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SControlContentSource fromValue(String v) {
        for (SControlContentSource c: SControlContentSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
