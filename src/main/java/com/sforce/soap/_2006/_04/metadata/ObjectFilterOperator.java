
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectFilterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectFilterOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="with"/>
 *     &lt;enumeration value="without"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectFilterOperator", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ObjectFilterOperator {

    @XmlEnumValue("with")
    WITH("with"),
    @XmlEnumValue("without")
    WITHOUT("without");
    private final String value;

    ObjectFilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectFilterOperator fromValue(String v) {
        for (ObjectFilterOperator c: ObjectFilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
