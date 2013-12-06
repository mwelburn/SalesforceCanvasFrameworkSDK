
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Article.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Article">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Indefinite"/>
 *     &lt;enumeration value="Definite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Article", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum Article {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite"),
    @XmlEnumValue("Definite")
    DEFINITE("Definite");
    private final String value;

    Article(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Article fromValue(String v) {
        for (Article c: Article.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
